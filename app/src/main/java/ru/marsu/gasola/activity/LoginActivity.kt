package ru.marsu.gasola.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ru.marsu.gasola.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.clLoginSmsCode.visibility = View.GONE
        binding.clLoginPhone.visibility = View.VISIBLE
    }

    fun onClickGetSms(view: View) {
        // TODO: get SMS
        binding.clLoginPhone.visibility = View.GONE
        binding.clLoginSmsCode.visibility = View.VISIBLE
    }

    fun onClickGoRegistration(view: View) {
        val intent = Intent(this, RegistrationActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoOrderList(view: View) {
        // TODO: validate/check SMS-code

        val intent = Intent(this, OrderListActivity::class.java)
        startActivity(intent)
    }

}
