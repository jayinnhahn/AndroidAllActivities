package jay.tan.ite2_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val cancelButton = findViewById<Button>(R.id.cancel_button)
        loginButton.setOnClickListener {
            var dashboardActivity: Intent = Intent(this, Dashboard::class.java)
            startActivity(dashboardActivity)
        }
        cancelButton.setOnClickListener{
            var QPIActivity: Intent = Intent(this, MainActivity4::class.java)
            startActivity(QPIActivity)
        }
    }
}