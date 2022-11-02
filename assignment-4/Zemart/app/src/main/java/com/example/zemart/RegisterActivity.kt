package com.example.zemart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    private lateinit var createAccountButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)


        createAccountButton = findViewById(R.id.createAccButton)

        createAccountButton.setOnClickListener {
            intent = Intent(this, ShoppingActivity::class.java)
            startActivity(intent)
        }
    }
}