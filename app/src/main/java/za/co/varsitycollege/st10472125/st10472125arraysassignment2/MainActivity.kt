package za.co.varsitycollege.st10472125.st10472125arraysassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Declaring variables
        val btnClick = findViewById<TextView>(R.id.btnClick)
        val txtPurpose = findViewById<TextView>(R.id.txtPurpose)
        val txtDescription = findViewById<TextView>(R.id.txtDescription)
        val txtWelcome = findViewById<TextView>(R.id.txtWelcome)

        btnClick.setOnClickListener{
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }





        }
    }
