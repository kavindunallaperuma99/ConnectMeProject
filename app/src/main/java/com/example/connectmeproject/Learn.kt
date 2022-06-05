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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.connectmeproject.databinding.ActivityLearnBinding

class Learn : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Learning>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var description : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)
        openHome();

        imageId = arrayOf(
            R.drawable.hello,
            R.drawable.good,
            R.drawable.goodbye,
            R.drawable.how,
            R.drawable.sorry,
            R.drawable.thanks,
            R.drawable.morning,
            R.drawable.afternoon,
            R.drawable.night

        )
        heading = arrayOf(
            "Hello",
            "Good",
            "GoodBye",
            "How",
            "Sorry",
            "Thanks",
            "Morning",
            "Afternoon",
            "Night"
        )

        description = arrayOf(
            "Wave hand near side of head.",
            "Make short forward movement using closed hand with thumb up (1 or 2 hands).",
            "Wave hand near side of head.",
            "Fingertips of flat hands run up chest and then hands move forwards with thumbs up.",
            "Closed hand makes a circular motion on chest.",
            "Flat hand starts with fingertips on chin. Hand moves down and away from signer.",
            "Right hand bent. Fingertips tap far side of chest then near side of chest.",
            "Tips of index & middle finger ('N' shape) touch chin then wrist twists so finger tips are facing forwards.",
            "Open hands with palms facing inwards move down in front of body to finish horizontal."
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Learning>()
        getUserdata()

    }

    private fun getUserdata() {
       for(i in imageId.indices){
           val learning = Learning(imageId[i],heading[i],description[i])
           newArrayList.add(learning)

       }

        newRecyclerView.adapter = LearnAdapter(newArrayList)
    }

    public fun openHome(){
        var Home = findViewById<TextView>(R.id.txtConnectME);

        Home.setOnClickListener{
            openSpeechLayout()
        }
    }
    public fun openSpeechLayout(){
        startActivity(Intent(this@Learn, MainActivity::class.java))
    }


}