package ru.marsu.gasola.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ru.marsu.gasola.databinding.ActivityOrderPayBinding

class OrderPayActivity : AppCompatActivity() {

    lateinit var binding: ActivityOrderPayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderPayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickPayByQrCode(view: View) {
        // TODO: implement Pay by QR-code
    }

    fun onClickPayByCash(view: View) {
        // TODO: implement Pay by Cash
    }

}
