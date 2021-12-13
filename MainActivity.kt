package com.example.examenpmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public override fun onResume() {

        super.onResume();

    }
    public fun cuentaDec(){
        for (num in 100 downTo 0){
            Log.i("Cuenta decreciente desde 100 a 0", num.toString())
        }
        val bToast: Button =findViewById(R.id.botonDecre)
        bToast.setOnClickListener{
            Toast.makeText(this.applicationContext, "Mensaje del Toast", Toast.LENGTH_SHORT).show()
        }
    }
}
