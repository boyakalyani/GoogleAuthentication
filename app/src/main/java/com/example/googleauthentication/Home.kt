package com.example.googleauthentication
//


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class Home : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        auth = FirebaseAuth.getInstance()

        val email = intent.getStringExtra("email")
        val displayName = intent.getStringExtra("name")

        findViewById<TextView>(R.id.txt_id).text = email + "\n" + displayName

        findViewById<Button>(R.id.signOut_id).setOnClickListener {
            auth.signOut()
            startActivity(Intent(this , MainActivity::class.java))
        }
    }
}



//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
//import com.google.firebase.auth.FirebaseAuth
//
//class Home : AppCompatActivity() {
//
//    lateinit var auth :FirebaseAuth
//lateinit var txt:TextView
//  private  lateinit var signOutBtn:Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
//
//auth=FirebaseAuth.getInstance()
//
//        val email=intent.getStringExtra("email")
//        val displayName=intent.getStringExtra("name")
//
//        txt=findViewById(R.id.txt_id)
//        txt.text=email + "\n" +displayName
//
//        signOutBtn=findViewById(R.id.signOut_id)
//
//signOutBtn.setOnClickListener() {
//    auth.signOut()
//    startActivity(Intent(this, MainActivity::class.java))
//       }
//    }
//}
