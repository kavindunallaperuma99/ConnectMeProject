package com.example.connectmeproject

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_speak_to_text.*
import java.lang.Exception
import java.util.*

class SpeakToText : AppCompatActivity() {

    private val SPEECH_REQ = 102


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speak_to_text)

        openHome()

        btnVoice.setOnClickListener {
            speakInput();
        }

    }
    public fun openHome(){
        var Home = findViewById<TextView>(R.id.txtConnectME);

        Home.setOnClickListener{
            openHomeLayout()
        }
    }
    public fun openHomeLayout() {
        startActivity(Intent(this@SpeakToText, MainActivity::class.java))
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == SPEECH_REQ && resultCode == Activity.RESULT_OK){
            val result = data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
          //  textSpeak.text = result?.get(0).toString()
        }
    }
    private fun speakInput() {
        if(!SpeechRecognizer.isRecognitionAvailable(this)) {
            Toast.makeText(this, "Speech Recogniztion isn't available now. Check your Internet and Try Again !",Toast.LENGTH_SHORT).show()
            } else {
                val voice = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
                voice.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
                voice.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.US)
                voice.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hey, Say Something !")
                startActivityForResult(voice,SPEECH_REQ)
        }
    }

}