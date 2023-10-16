package jay.tan.ite2_exam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import jay.tan.ite2_exam.databinding.ActivityDashboardBinding
import jay.tan.ite2_exam.ui.dashboard.DashboardFragment
import jay.tan.ite2_exam.ui.home.HomeFragment
import jay.tan.ite2_exam.ui.home.HomeViewModel

class Dashboard : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_activity_dashboard)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        val Inputbutton = findViewById<Button>(R.id.buttonInput)
        val QPIbutton = findViewById<Button>(R.id.buttonQPICalculator)
        val ActivityButton = findViewById<Button>(R.id.buttonActivity8)
        val PrelimsButton = findViewById<Button>(R.id.buttonPrelims)
        val DashboardButton = findViewById<Button>(R.id.navigation_dashboard)
        val HomeButton = findViewById<Button>(R.id.navigation_home)
        Inputbutton.setOnClickListener {
            var InputActivity: Intent
            InputActivity = Intent(this, MainActivity2::class.java)
            startActivity(InputActivity)
        }

        QPIbutton.setOnClickListener {
            var QPIActivity: Intent
            QPIActivity = Intent(this, MainActivity4::class.java)
            startActivity(QPIActivity)
        }

        PrelimsButton.setOnClickListener {
            var PrelimActivity: Intent
            PrelimActivity = Intent(this, MainActivity::class.java)
            startActivity(PrelimActivity)
        }

        ActivityButton.setOnClickListener {
            var extraActivity: Intent
            extraActivity = Intent(this, MainActivity3::class.java)
            startActivity(extraActivity)
        }
        DashboardButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.nav_host_fragment_activity_dashboard, DashboardFragment)
                addToBackStack(null)
                commit()
            }    }

        HomeButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.nav_host_fragment_activity_dashboard, HomeFragment)
                addToBackStack(null)
                commit()
            }    }
    }
}