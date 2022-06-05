package com.example.connectmeproject

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.connectmeproject.databinding.ActivityTranslateBinding

class Translate : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translate)
        openHome();
    }

    public fun openHome(){
        var Home = findViewById<TextView>(R.id.txtConnectME);

        Home.setOnClickListener{
            openSpeechLayout()
        }
    }
    public fun openSpeechLayout(){
        startActivity(Intent(this@Translate, MainActivity::class.java))
    }
}