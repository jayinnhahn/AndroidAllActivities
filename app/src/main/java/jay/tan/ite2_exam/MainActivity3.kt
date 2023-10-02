package jay.tan.ite2_exam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val thisIntent: Intent = intent
//        val getFirstName2: String = thisIntent.getStringExtra( "FirstName").toString()
//        Log.d("ZZZ123", getFirstName2)
//
//        val tvName: TextView = findViewById(R.id.txtPassvalue)
//        tvName.setText(getFirstName2)

//        val btnBack: Button
//        btnBack = findViewById(R.id.signUpButton)
//        btnBack.setOnClickListener {
//            Log.d("ZZZ123", "hEELOO")
//        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
