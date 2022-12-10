package com.jdlstudios.alertdialogsapp

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jdlstudios.alertdialogsapp.databinding.ActivityMainBinding
import com.jdlstudios.alertdialogsapp.databinding.MyCustomDialogBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var binding2: MyCustomDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlert.setOnClickListener {
            binding2 = MyCustomDialogBinding.inflate(layoutInflater)
            val myDialog = Dialog(this)
            myDialog.setContentView(binding2.root)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            binding2.btnTest.setOnClickListener {
                binding.txtTest.text= "asdf"
                myDialog.dismiss()
            }
        }

    }
}
