package com.example.lab_week_02_c

import android.content.Intent // Make sure this line is present
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SingleTopActivity : AppCompatActivity() {
    companion object{
        private const val DEBUG = "DEBUG"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_top)
        Log.d(DEBUG, "onCreate")
        findViewById<Button>(R.id.button_single_top).setOnClickListener{
            startActivity(
                Intent(this, // This Intent should now be resolved
                    SingleTopActivity::class.java)
            )
        }
    }
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Log.d(DEBUG, "onNewIntent")
    }

}
