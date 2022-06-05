package com.example.connectmeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openActivity();
    }
    public fun openActivity(){
        var openSpeech = findViewById<ImageView>(R.id.btnSpeech);
        var openLearn = findViewById<ImageView>(R.id.LearnBtn);
        var openTranslate = findViewById<ImageView>(R.id.TranslateBtn);
        var openSearch = findViewById<ImageView>(R.id.btnSearch);
        var openLangTranslate = findViewById<ImageView>(R.id.btnLangTranslate);
        var openSpeakToText = findViewById<ImageView>(R.id.btnSpeakToText);


        openSpeech.setOnClickListener{
            openSpeechLayout()
        }

        openLearn.setOnClickListener{
            openLearnLayout()
        }

        openTranslate.setOnClickListener{
            openTranslateLayout()
        }

        openSearch.setOnClickListener{
            openSearchLayout()
        }

        openLangTranslate.setOnClickListener{
            openLanguageTranslateLayout()
        }

        openSpeakToText.setOnClickListener{
            openSpeakToTextLayout()
        }


    }
    public fun openSpeechLayout(){
        startActivity(Intent(this@MainActivity, SpeechLayoutActivity::class.java))
    }

    public fun openLearnLayout(){
        startActivity(Intent(this@MainActivity, Learn::class.java))
    }

    public fun openTranslateLayout(){
        startActivity(Intent(this@MainActivity, Translate::class.java))
    }

    public fun openSearchLayout(){
        startActivity(Intent(this@MainActivity, SearchActivity::class.java))
    }

    public fun openLanguageTranslateLayout(){
        startActivity(Intent(this@MainActivity, LanguageTransalate::class.java))
    }

    public fun openSpeakToTextLayout(){
        startActivity(Intent(this@MainActivity, SpeakToText::class.java))
    }

}