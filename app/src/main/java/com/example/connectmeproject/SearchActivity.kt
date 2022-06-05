package com.example.connectmeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        openHome()
    }

    public fun openHome(){
        var Home = findViewById<TextView>(R.id.txtConnectME);

        Home.setOnClickListener{
            openHomeLayout()
        }
    }
    public fun openHomeLayout() {
        startActivity(Intent(this@SearchActivity, MainActivity::class.java))
    }
}