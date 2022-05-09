package com.example.listaconvidados.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.listaconvidados.ViewModel.FormularioConvidadoViewModel
import com.example.listaconvidados.R
import com.example.listaconvidados.databinding.ActivityFormConvidadoBinding

class FormConvidadoActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityFormConvidadoBinding
    private lateinit var mViewModel: FormularioConvidadoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormConvidadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mViewModel = ViewModelProvider(this).get(FormularioConvidadoViewModel::class.java)

        setListeners()
    }

    private fun setListeners(){
        binding.buttonSave.setOnClickListener((this))
    }

    override fun onClick(v: View) {
        val id = v.id
        if(id == R.id.button_save){

        }
    }
}