package com.example.rafit.footnow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.rafit.footnow.R.id.icon_profile
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcView.layoutManager = GridLayoutManager(this, 1)

        val itemsCanchas = (0..10).map {
            ItemLanding("Evento $it", "Hora $it", "Ubicacion $it", "Plaza $it")
        }

        val adapter = AdapterLanding(itemsCanchas)
        rcView.adapter = adapter




    }
}
