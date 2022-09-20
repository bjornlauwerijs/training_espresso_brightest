package com.example.brghtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.makeText

class MainActivity : AppCompatActivity() {

    var loginButton: Button? = null
    var usernameEditText: EditText? = null
    var passwordTeEditText: EditText? = null

    var counter = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.loginButton)
        usernameEditText = findViewById(R.id.usernameTextField)
        passwordTeEditText = findViewById(R.id.passwordTextField)

        loginButton?.setOnClickListener {
            if (usernameEditText?.text.toString().contentEquals("admin") && passwordTeEditText?.text.toString().contentEquals("admin")){
                var intent = Intent(this,HomeActivity::class.java).apply {
                }
                startActivity(intent)
            } else {
                counter--
                makeText(this,"Wrong Credentials",Toast.LENGTH_LONG).show()
                if(counter==0){
                    finish()
                }
            }
        }
        loginButton?.setOnLongClickListener {
            makeText(this,"long press", Toast.LENGTH_LONG).show()
            true
        }
    }
}
