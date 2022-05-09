package com.example.listaconvidados.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listaconvidados.Service.Model.ConvidadoModel
import com.example.listaconvidados.Service.Repository.ConvidadoRepository

class FormularioConvidadoViewModel : ViewModel() {
    private var mSaveGuest = MutableLiveData<Boolean>()
    val saveGuest:LiveData<Boolean> = mSaveGuest
    val mConvidadoRepository : ConvidadoRepository = ConvidadoRepository()

    fun save(name:String, presence:Boolean){
        val guest = ConvidadoModel(name,presence)
        mConvidadoRepository.save(guest)
    }
}