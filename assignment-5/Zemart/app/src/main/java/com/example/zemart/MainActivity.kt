package com.example.zemart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var userNameEditText: EditText
    private lateinit var passWordEditText: EditText
    private lateinit var signInButton: Button
    private lateinit var createAccountButton: Button

    var userList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        val user1 = User("Mugisha","joshua","josh@gmail.com","password")
        val user2 = User("Brian","Denis","denis@gmail.com","password")
        val user3 = User("Jeff","paul","paul@gmail.com","password")
        val user4 = User("Goerge","will","will@gmail.com","password")
        val user5 = User("Wille","Fred","fred@gmail.com","password")

        var userFlag = false

        userList.add(user1)
        userList.add(user2)
        userList.add(user3)
        userList.add(user4)
        userList.add(user5)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInButton = findViewById(R.id.signInButton)
        userNameEditText = findViewById(R.id.usernameEdt)
        passWordEditText = findViewById(R.id.passwordEdt)
        createAccountButton = findViewById(R.id.createAccButton)

        signInButton.setOnClickListener {
            userList.forEach {
                if (it.userName == userNameEditText.text.toString() && it.password==passWordEditText.text.toString()){
                    userFlag=true
                }
            }

            if (userFlag){
                intent = Intent(this, ShoppingActivity::class.java)
                intent.putExtra("userName", userNameEditText.text.toString())
                startActivity(intent)
            }else{
                Toast.makeText(this, "user not found", Toast.LENGTH_SHORT).show()
            }
        }

        createAccountButton.setOnClickListener {
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}