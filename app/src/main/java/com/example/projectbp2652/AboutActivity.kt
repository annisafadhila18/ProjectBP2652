package com.example.projectbp2652

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //intent expLicit
        //instance
        val btnLogin:Button = findViewById(R.id.button2)
        val txtUsername: EditText = findViewById(R.id.editTextUsername)
        val txtpassword: EditText = findViewById(R.id.editTextPassword)
        val loginModel = LoginModel()
        //event btn login clik
        btnLogin.setOnClickListener {
            //input
            loginModel.username = txtUsername.text.toString()
            loginModel.password = txtpassword.text.toString()
            //validate
            if (loginModel.loginCheck()==true){
            //call home activity
            val intentHome = Intent(this, HomeActivity::class.java)
            startActivity(intentHome)
        }else{
            Toast.makeText(this,"Uername/Password salah!!!",Toast.LENGTH_SHORT).show()
            }
    }
}
}