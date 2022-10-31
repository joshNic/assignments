package com.example.tablayoutexercise

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.TableRow
import android.widget.TextView
import com.example.tablayoutexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.addButton.setOnClickListener {
            var codeNameTextView = TextView(applicationContext)
            codeNameTextView.setBackgroundResource(R.drawable.border)
            codeNameTextView.setTextColor(R.color.black)

            codeNameTextView.text = binding.codeNameText.text.toString()
            var versionTextView = TextView(applicationContext)
            versionTextView.setBackgroundResource(R.drawable.border)
            versionTextView.setTextColor(R.color.black)
            versionTextView.text = binding.versionText.text.toString()

            var tableRow = TableRow(applicationContext)

            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT).apply {
                setMargins(0,0,0,10)
            }
            tableRow.layoutParams = layoutParams

            tableRow.addView(versionTextView,0,layoutParams)
            tableRow.addView(codeNameTextView,1,layoutParams)

            binding.table.addView(tableRow, layoutParams)

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0);
        }

    }
}