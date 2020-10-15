package com.example.mvvm_onewayandtwowaydatabinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField

class MainViewModel : BaseObservable() {

    var exampleText: ObservableField<String>? = null
    var password: ObservableField<String>? = null

    init {
        exampleText = ObservableField("")
        password = ObservableField("")
    }

    @Bindable("password")
    fun getPasswordQuality(): String {
       return if (this.password?.get().toString().isEmpty()) {
            "Enter a password"
        } else if (this.password?.get().toString().length <4) {
            "Too short"
        } else {
            "Good enough"
        }
    }

    fun getPassWord() {
        exampleText?.set("example one way binding")
    }
}