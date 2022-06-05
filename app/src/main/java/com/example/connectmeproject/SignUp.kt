package com.example.connectmeproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.connectmeproject.databinding.SignupBinding
import com.google.firebase.auth.FirebaseAuth

class SignUp : AppCompatActivity() {

    private lateinit var binding : SignupBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.textView.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        binding.btnSignUp.setOnClickListener {
            val email = binding.emailID.text.toString()
            val password = binding.passID.text.toString()
            val passRetype = binding.passID.text.toString()

            if(email.isNotEmpty() && password.isNotEmpty() && passRetype.isNotEmpty()){
                if (password == passRetype) {
                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                        if(it.isSuccessful) {
                            val intent = Intent(this, SignIn::class.java)
                            startActivity(intent)
                        }else {
                            Toast.makeText(this, "Password doesn't match!", Toast.LENGTH_SHORT).show()
                        }
                    }

                } else {

                    Toast.makeText(this, "Password doesn't match!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please fill the blanks !", Toast.LENGTH_SHORT).show()
            }

        }
    }
}