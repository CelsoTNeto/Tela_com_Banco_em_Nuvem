package com.example.aluno.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import org.jetbrains.anko.toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {



    var logTag: String = "info";
    lateinit var Sair: Button
    lateinit var RedefinirSenha: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        this.Sair.setOnClickListener(View.onClickListener{
            toast("this.Sair.setOnClickListener(View.OnClickListener{...")
            this.logoff()
        })


        private fun logoff(){
            this.fbAuth.sign.Out()
            updateUI (null)
        }






    }
}
