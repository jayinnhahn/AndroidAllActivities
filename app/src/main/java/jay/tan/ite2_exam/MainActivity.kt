package jay.tan.ite2_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nextActivity: Intent
        nextActivity = Intent(this, MainActivity4::class.java)
        startActivity(nextActivity)
    }
    override fun onStart() {
        super.onStart()
        Log.d("zzztest", "Called On Start")
    }

    override fun onPause() {
        super.onPause()
        Log.d("zzztest", "Called On Pause")
    }

    override fun onResume() {
        super.onResume()
        Log.d("zzztest", "Called On Resume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("zzztest", "Called On Restart")
    }


    override fun onStop() {
        super.onStop()
        Log.d("zzztest", "Called On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("zzztest", "Called On Destroy")

    }
}