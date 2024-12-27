package ru.marsu.gasola.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ru.marsu.gasola.databinding.ActivityOrderListBinding

class OrderListActivity : AppCompatActivity() {

    lateinit var binding: ActivityOrderListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickGoOrderCreate(view: View) {
        val intent = Intent(this, OrderCreateActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoOrderHistory(view: View) {
        // TODO: OrderHistory
    }

    fun onClickGoCurrentOrders(view: View) {
        // TODO: CurrentOrders
    }

    fun onClickUpdate(view: View) {
        // TODO: Updating List Orders (Table)
    }

}
