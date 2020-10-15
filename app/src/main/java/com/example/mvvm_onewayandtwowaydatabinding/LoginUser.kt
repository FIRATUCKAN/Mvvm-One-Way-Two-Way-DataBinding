package com.example.mvvm_onewayandtwowaydatabinding

import android.util.Patterns


class LoginUser(val strEmailAddress: String, val strPassword: String) {

    val isEmailValid: Boolean
        get() = strEmailAddress.length > 5

    val isPasswordLengthGreaterThan5: Boolean
        get() = strPassword.length > 5

}