package com.example.firebasepushnotifications
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Set a delay for the splash screen
        Handler().postDelayed({
            // Start the main activity
            startActivity(Intent(this, MainActivity::class.java))
            // Close the splash activity
            finish()
        }, 2000) // 2000 milliseconds delay
    }
}