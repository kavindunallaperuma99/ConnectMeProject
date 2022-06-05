package com.example.connectmeproject

import android.content.Intent
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class SpeechLayoutActivity : AppCompatActivity() {
    lateinit var textToSpeach : TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.speech_layout)
        openHome();

        var speakButton = findViewById<Button>(R.id.btnSpeakToText)
        var editText = findViewById<EditText>(R.id.textEditor)

        speakButton.setOnClickListener {
            textToSpeach = TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
                if(it==TextToSpeech.SUCCESS){
                    textToSpeach.language = Locale.US
                    textToSpeach.setSpeechRate(1.0f)
                    textToSpeach.speak(editText.text.toString(),TextToSpeech.QUEUE_ADD,null)
                }
            })
        }
    }

    public fun openHome(){
        var Home = findViewById<TextView>(R.id.txtConnectME);

        Home.setOnClickListener{
            openSpeechLayout()
        }
    }
    public fun openSpeechLayout(){
        startActivity(Intent(this@SpeechLayoutActivity, MainActivity::class.java))
    }
}