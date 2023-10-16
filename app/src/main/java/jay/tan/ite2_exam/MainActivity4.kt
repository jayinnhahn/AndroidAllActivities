package jay.tan.ite2_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity4 : AppCompatActivity() {
    lateinit var A_Button: Button
    lateinit var BplusButton: Button
    lateinit var B_Button: Button
    lateinit var CplusButton: Button
    lateinit var C_Button: Button
    lateinit var D_Button: Button
    lateinit var F_Button: Button

    lateinit var etEquation: EditText
    lateinit var etQPI: EditText

    lateinit var Button3: Button
    lateinit var Button5: Button
    lateinit var Button9: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        A_Button = findViewById(R.id.btnA)
        BplusButton = findViewById(R.id.btnBP)
        B_Button = findViewById(R.id.btnB)
        CplusButton = findViewById(R.id.btnCP)
        C_Button = findViewById(R.id.btnC)
        D_Button = findViewById(R.id.btnD)
        F_Button = findViewById(R.id.btnF)
        Button3 = findViewById(R.id.btnU3)
        Button5 = findViewById(R.id.btnU5)
        Button9 = findViewById(R.id.btnU9)
        etEquation = findViewById(R.id.etEquation)
        etQPI = findViewById(R.id.etEquation)
        }

        public fun Clearbutton(view: View){
            etEquation.setText("")
            etQPI.setText("")
        }

    }



