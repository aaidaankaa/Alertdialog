package com.example.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btn)
        button.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setMessage("Вы уверены, что хотите сохранить данные?")
                .setTitle("Dialog Title")
                .setPositiveButton("да"){dialogInterface, _ ->
                    run{
                    dialogInterface.dismiss()
                    Toast.makeText(this,"kfjkl", Toast.LENGTH_LONG).show()}}
                            .setNegativeButton("нет"){  dialogInterface, _-> dialogInterface.dismiss()
                                }.show()
                    }
        }
    }

