package com.example.androidallactivities.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.androidallactivities.LoginActivity
import com.example.androidallactivities.NewActivity
import com.example.androidallactivities.QPICalculatorActivity
import com.example.androidallactivities.R
import com.example.androidallactivities.SignUpActivity
import com.example.androidallactivities.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputButton = view.findViewById<Button>(R.id.buttonInput)
        val qpiButton = view.findViewById<Button>(R.id.buttonQPICalculator)
        val newButton = view.findViewById<Button>(R.id.buttonActivityNew)
        val loginButton = view.findViewById<Button>(R.id.buttonPrelims)
        inputButton.setOnClickListener {
            activity?.let {
                val signupScreen = Intent(it, SignUpActivity::class.java)
                it.startActivity(signupScreen)
            }
        }

        qpiButton.setOnClickListener {
            activity?.let {
                val qpiScreen = Intent(it, QPICalculatorActivity::class.java)
                it.startActivity(qpiScreen)
            }
        }
        newButton.setOnClickListener{
            activity?.let{
                val newScreen = Intent(it, NewActivity::class.java)
                it.startActivity(newScreen)
            }
        }
        loginButton.setOnClickListener{
            activity?.let{
                val loginScreen = Intent(it, LoginActivity::class.java)
                it.startActivity(loginScreen)
            }
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}