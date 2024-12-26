package ru.marsu.gasola

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.marsu.gasola.databinding.ActivityOrderPayBinding

class OrderPayActivity : AppCompatActivity() {

    lateinit var binding: ActivityOrderPayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderPayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}
