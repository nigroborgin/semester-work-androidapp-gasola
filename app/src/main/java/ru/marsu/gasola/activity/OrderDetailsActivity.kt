package ru.marsu.gasola.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ru.marsu.gasola.databinding.ActivityOrderDetailsBinding

class OrderDetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityOrderDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.clOrderExecution.visibility = View.GONE
        binding.clOrderFinish.visibility = View.GONE
        binding.clOrderStart.visibility = View.VISIBLE
    }

    fun onClickTakeOrder(view: View) {
        binding.clOrderStart.visibility = View.GONE
        binding.clOrderFinish.visibility = View.VISIBLE

        binding.clOrderExecution.visibility = View.VISIBLE
    }

    fun onClickCancel(view: View) {
        binding.clOrderFinish.visibility = View.GONE
        binding.clOrderStart.visibility = View.VISIBLE

        binding.clOrderExecution.visibility = View.GONE
    }

}
