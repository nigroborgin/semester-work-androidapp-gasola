package ru.marsu.gasola

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.marsu.gasola.databinding.ActivityOrderCreateBinding

class OrderCreateActivity : AppCompatActivity() {

    lateinit var binding: ActivityOrderCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}
