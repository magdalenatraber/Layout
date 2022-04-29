package at.campus02.mob.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import at.campus02.mob.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onStart() {
        super.onStart()

        val clickMeButton: TextView = findViewById(R.id.clickMeButton)
        val displayView: TextView = findViewById(R.id.displayView)
        clickMeButton.setOnClickListener{
                    displayView.text = "I have been clicked!"
        }
        binding.clickMeButton.setOnClickListener {
            binding.displayView.text = "I have been clicked!"
        }
    }


}