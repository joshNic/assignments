package com.miu.cvbuilder.ui.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.miu.cvbuilder.data.CV
import com.miu.cvbuilder.data.local.LocalDataAccessApi
import com.miu.cvbuilder.data.local.dataLayer.entities.UserTable
import com.miu.cvbuilder.domain.states.AddItemState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CVBuilderViewModel @Inject constructor(
    private val localDataAccessApi: LocalDataAccessApi
): ViewModel() {

    private val _cv = MutableLiveData<CV>()
    val cv:LiveData<CV> = _cv


    private val _addItem = MutableLiveData<AddItemState>()
    val addItem:LiveData<AddItemState> = _addItem

    fun setCV(value: CV){
        _cv.postValue(value)
    }

    fun createUser(userName:String, password:String){
        viewModelScope.launch {
            localDataAccessApi.insertUser(UserTable(userName,password))
            _cv.value = _cv.value?.copy(name = userName, password = password)
        }
    }


    fun setAddItem(dialogTitle:String, titleHint:String, contentHint:String ){
        _addItem.value = AddItemState(
            dialogTitle = dialogTitle,
            addHint = titleHint,
            contentHint = contentHint
        )
    }
}