package ru.marsu.gasola

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ru.marsu.gasola.databinding.ActivityCreateOrderBinding
import ru.marsu.gasola.databinding.ActivityMainBinding

class CreateOrderActivity : AppCompatActivity() {

    lateinit var binding: ActivityCreateOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}
