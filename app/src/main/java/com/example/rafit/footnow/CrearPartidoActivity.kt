package com.example.rafit.footnow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_crear_partido.*

class CrearPartidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_partido)

        // Create an ArrayAdapter
        val adapter = ArrayAdapter.createFromResource(this,
            R.array.posiciones, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        spinner.adapter = adapter
    }

    fun getValues(view: View){
        Toast.makeText(this,"Spinner 1 " + spinner.selectedItem.toString(),
            Toast.LENGTH_LONG).show()

    }
}
