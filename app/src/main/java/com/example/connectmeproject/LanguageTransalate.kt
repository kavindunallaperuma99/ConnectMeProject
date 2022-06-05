package com.example.connectmeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions
import com.google.mlkit.nl.translate.Translator as Translator1

class LanguageTransalate : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_transalate)
        openHome();

        val originalLangText: EditText = findViewById(R.id.txtSearch)
        var resultText : TextView= findViewById(R.id.textResult)
        var btnTranslate : Button = findViewById(R.id.buttonTranslate)
        var progressBar : ProgressBar = findViewById(R.id.progressBar)

        var options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.ENGLISH)
            .setTargetLanguage(TranslateLanguage.FRENCH)
            .build()

        val englishFrenchTranslator = Translation.getClient(options)
        getLifecycle().addObserver(englishFrenchTranslator)

        btnTranslate.setOnClickListener({

            if (!originalLangText.text.isEmpty()) {

                progressBar.visibility = View.VISIBLE
                btnTranslate.visibility = View.GONE

                englishFrenchTranslator.downloadModelIfNeeded()
                    .addOnSuccessListener {
                        Log.e(TAG, "Download Successful")
                        progressBar.visibility = View.GONE
                        btnTranslate.visibility = View.VISIBLE

                        englishFrenchTranslator.translate(originalLangText.text.toString())
                            .addOnSuccessListener {
                                //Translation successful
                                resultText.setText(it)
                            }
                            .addOnFailureListener {
                                //Error
                                Log.e(TAG, "Error: " + it.localizedMessage)
                            }
                    }
                    .addOnFailureListener {
                        Log.e(TAG, "Download Error: " + it.localizedMessage)
                        progressBar.visibility = View.GONE
                        btnTranslate.visibility = View.VISIBLE

                    }
            }
        })
    }

    public fun openHome(){
        var Home = findViewById<TextView>(R.id.txtConnectME)

        Home.setOnClickListener{
            openHomeLayout()
        }
    }
    public fun openHomeLayout() {
        startActivity(Intent(this@LanguageTransalate, MainActivity::class.java))
    }


}