package com.example.listaconvidados.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.listaconvidados.Service.Constants.GuestConstants
import com.example.listaconvidados.Service.Model.GuestModel
import com.example.listaconvidados.service.repository.GuestRepository

class GuestsViewModel(application: Application) : AndroidViewModel(application) {

    private val mGuestRepository = GuestRepository.getInstance(application.applicationContext)

    private val mGuestList = MutableLiveData<List<GuestModel>>()
    val guestList: LiveData<List<GuestModel>> = mGuestList

    fun load(filter: Int) {

        if (filter == GuestConstants.FILTER.EMPTY) {
            mGuestList.value = mGuestRepository.getAll()
        } else if (filter == GuestConstants.FILTER.PRESENT) {
            mGuestList.value = mGuestRepository.getPresent()
        } else {
            mGuestList.value = mGuestRepository.getAbsent()
        }
    }

    fun delete(id: Int) {
        mGuestRepository.delete(id)
    }

}