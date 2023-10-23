package com.example.androidallactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class GameScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)

        val musicButton = findViewById<ImageButton>(R.id.volumeButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        var mutedBoolean = false
        musicButton.setOnClickListener{
            if(mutedBoolean){
                musicButton.setImageResource(R.drawable.iconmute)
                mutedBoolean=!mutedBoolean
            }
            else{
                musicButton.setImageResource(R.drawable.iconunmute)
                mutedBoolean=!mutedBoolean
            }

        }
        exitButton.setOnClickListener{
            finish()
        }
    }
}