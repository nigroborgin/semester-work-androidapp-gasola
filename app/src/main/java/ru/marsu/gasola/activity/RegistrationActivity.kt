package ru.marsu.gasola.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.marsu.gasola.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickRegistrateAndGoOrderList() {
        // TODO: implement registration

        val intent = Intent(this, OrderListActivity::class.java)
        startActivity(intent)
    }

}
