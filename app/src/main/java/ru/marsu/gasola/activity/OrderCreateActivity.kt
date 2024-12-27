package ru.marsu.gasola.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ru.marsu.gasola.databinding.ActivityOrderCreateBinding

class OrderCreateActivity : AppCompatActivity() {

    lateinit var binding: ActivityOrderCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickGoOrderPay(view: View) {
        val intent = Intent(this, OrderPayActivity::class.java)
        startActivity(intent)
    }

    fun onClickBack(view: View) {
        onBackPressedDispatcher.onBackPressed()
    }

}
