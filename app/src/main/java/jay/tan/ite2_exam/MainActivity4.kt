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
        var BooleanValue = false
        var value = etEquation.text.toString()
        if (value == "Equation"){
            etEquation.setText(" ")
        }
        if(value==""){
        A_Button.setOnClickListener {
            etEquation.append(value + " ( A * ")
            BooleanValue = true
            if (BooleanValue){
                Button3.setOnClickListener{
                    etEquation.append(value + "3")
                    BooleanValue = false
                }
                Button5.setOnClickListener{
                    etEquation.append(value + "5")
                    BooleanValue = false
                }
                Button9.setOnClickListener {
                    etEquation.append(value + "9")
                    BooleanValue = false
                }
            }
        }
        BplusButton.setOnClickListener {
            etEquation.append(value + " ( B+ * )")
            BooleanValue = true
            if (BooleanValue){
                Button3.setOnClickListener{
                    etEquation.append(value + "3")
                    BooleanValue = false
                }
                Button5.setOnClickListener{
                    etEquation.append(value + "5")
                    BooleanValue = false
                }
                Button9.setOnClickListener {
                    etEquation.append(value + "9")
                    BooleanValue = false
                }
            }
        }
        B_Button.setOnClickListener {
            etEquation.append(value + " ( B * )")
            BooleanValue = true
            if (BooleanValue){
                Button3.setOnClickListener{
                    etEquation.append(value + "3")
                    BooleanValue = false
                }
                Button5.setOnClickListener{
                    etEquation.append(value + "5")
                    BooleanValue = false
                }
                Button9.setOnClickListener {
                    etEquation.append(value + "9")
                    BooleanValue = false
                }
            }
        }
        CplusButton.setOnClickListener {
            etEquation.append(value + " ( C+ * )")
            BooleanValue = true
            if (BooleanValue){
                Button3.setOnClickListener{
                    etEquation.append(value + "3")
                    BooleanValue = false
                }
                Button5.setOnClickListener{
                    etEquation.append(value + "5")
                    BooleanValue = false
                }
                Button9.setOnClickListener {
                    etEquation.append(value + "9")
                    BooleanValue = false
                }
            }
        }
        C_Button.setOnClickListener {
            etEquation.append(value + " ( C * )")
            BooleanValue = true
            if (BooleanValue){
                Button3.setOnClickListener{
                    etEquation.append(value + "3")
                    BooleanValue = false
                }
                Button5.setOnClickListener{
                    etEquation.append(value + "5")
                    BooleanValue = false
                }
                Button9.setOnClickListener {
                    etEquation.append(value + "9")
                    BooleanValue = false
                }
            }
        }
        D_Button.setOnClickListener {
            etEquation.append(value + " ( D * )")
            BooleanValue = true
            if (BooleanValue){
                Button3.setOnClickListener{
                    etEquation.append(value + "3")
                    BooleanValue = false
                }
                Button5.setOnClickListener{
                    etEquation.append(value + "5")
                    BooleanValue = false
                }
                Button9.setOnClickListener {
                    etEquation.append(value + "9")
                    BooleanValue = false
                }
            }
        }
        F_Button.setOnClickListener {
            etEquation.append(value + " ( F * )")
            BooleanValue = true
            if (BooleanValue){
                Button3.setOnClickListener{
                    etEquation.append(value + "3")
                    BooleanValue = false
                }
                Button5.setOnClickListener{
                    etEquation.append(value + "5")
                    BooleanValue = false
                }
                Button9.setOnClickListener {
                    etEquation.append(value + "9")
                    BooleanValue = false
                }
            }
        }
        }
        else{
            A_Button.setOnClickListener {
                etEquation.append(value + "+ ( A * )")
                BooleanValue = true
                if (BooleanValue){
                    Button3.setOnClickListener{
                        etEquation.append(value + "3")
                        BooleanValue = false
                    }
                    Button5.setOnClickListener{
                        etEquation.append(value + "5")
                        BooleanValue = false
                    }
                    Button9.setOnClickListener {
                        etEquation.append(value + "9")
                        BooleanValue = false
                    }
                }
            }
            BplusButton.setOnClickListener {
                etEquation.append(value + "+ ( B+ * )")
                BooleanValue = true
                if (BooleanValue){
                    Button3.setOnClickListener{
                        etEquation.append(value + "3")
                        BooleanValue = false
                    }
                    Button5.setOnClickListener{
                        etEquation.append(value + "5")
                        BooleanValue = false
                    }
                    Button9.setOnClickListener {
                        etEquation.append(value + "9")
                        BooleanValue = false
                    }
                }
            }
            B_Button.setOnClickListener {
                etEquation.append(value + "+ ( B * )")
                BooleanValue = true
                if (BooleanValue){
                    Button3.setOnClickListener{
                        etEquation.append(value + "3")
                        BooleanValue = false
                    }
                    Button5.setOnClickListener{
                        etEquation.append(value + "5")
                        BooleanValue = false
                    }
                    Button9.setOnClickListener {
                        etEquation.append(value + "9")
                        BooleanValue = false
                    }
                }
            }
            CplusButton.setOnClickListener {
                etEquation.append(value + "+ ( C+ * )")
                BooleanValue = true
                if (BooleanValue){
                    Button3.setOnClickListener{
                        etEquation.append(value + "3")
                        BooleanValue = false
                    }
                    Button5.setOnClickListener{
                        etEquation.append(value + "5")
                        BooleanValue = false
                    }
                    Button9.setOnClickListener {
                        etEquation.append(value + "9")
                        BooleanValue = false
                    }
                }
            }
            C_Button.setOnClickListener {
                etEquation.append(value + "+ ( C * )")
                BooleanValue = true
                if (BooleanValue){
                    Button3.setOnClickListener{
                        etEquation.append(value + "3")
                        BooleanValue = false
                    }
                    Button5.setOnClickListener{
                        etEquation.append(value + "5")
                        BooleanValue = false
                    }
                    Button9.setOnClickListener {
                        etEquation.append(value + "9")
                        BooleanValue = false
                    }
                }
            }
            D_Button.setOnClickListener {
                etEquation.append(value + "+ ( D * )")
                BooleanValue = true
                if (BooleanValue){
                    Button3.setOnClickListener{
                        etEquation.append(value + "3")
                        BooleanValue = false
                    }
                    Button5.setOnClickListener{
                        etEquation.append(value + "5")
                        BooleanValue = false
                    }
                    Button9.setOnClickListener {
                        etEquation.append(value + "9")
                        BooleanValue = false
                    }
                }
            }
            F_Button.setOnClickListener {
                etEquation.append(value + "+ ( F * )")
                BooleanValue = true
                if (BooleanValue){
                    Button3.setOnClickListener{
                        etEquation.append(value + "3")
                        BooleanValue = false
                    }
                    Button5.setOnClickListener{
                        etEquation.append(value + "5")
                        BooleanValue = false
                    }
                    Button9.setOnClickListener {
                        etEquation.append(value + "9")
                        BooleanValue = false
                    }
                }
            }
        }

        }
    public fun Clearbutton(view: View){
        etEquation.setText("")
        etQPI.setText("")
    }

    }



