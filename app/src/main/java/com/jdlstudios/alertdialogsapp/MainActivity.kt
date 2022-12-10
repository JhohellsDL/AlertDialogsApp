package com.jdlstudios.alertdialogsapp

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.jdlstudios.alertdialogsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlert.setOnClickListener {
            val alertDialog  = layoutInflater.inflate(R.layout.my_custom_dialog, null)
            val myDialog = Dialog(this)
            myDialog.setContentView(alertDialog)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            val btn = alertDialog?.findViewById<Button>(R.id.btnTest)
            btn?.setOnClickListener {
                binding.txtTest.text= "asdf"
                Toast.makeText(this@MainActivity,"hola!",Toast.LENGTH_SHORT).show()
                myDialog.dismiss()
            }
        }

    }
}
