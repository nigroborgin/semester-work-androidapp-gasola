package ru.marsu.gasola

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.marsu.gasola.databinding.ActivityPayBinding

class PayActivity : AppCompatActivity() {

    lateinit var binding: ActivityPayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}
