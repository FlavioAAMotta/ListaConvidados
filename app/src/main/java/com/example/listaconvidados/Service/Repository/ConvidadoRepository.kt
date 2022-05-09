package com.example.listaconvidados.Service.Repository

import com.example.listaconvidados.Service.Model.ConvidadoModel

class ConvidadoRepository {
    fun save(convidado: ConvidadoModel){}
    fun update(convidado: ConvidadoModel){}
    fun delete(convidado: ConvidadoModel){}
    fun getAll():List<ConvidadoModel>{
        val list: MutableList<ConvidadoModel> = ArrayList()
        return list
    }
    fun getPresents():List<ConvidadoModel>{
        val list: MutableList<ConvidadoModel> = ArrayList()
        return list
    }
    fun getAbsents():List<ConvidadoModel>{
        val list: MutableList<ConvidadoModel> = ArrayList()
        return list
    }
}