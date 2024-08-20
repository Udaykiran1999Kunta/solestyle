package com.project.solestyle.data.SolestyleSignin

sealed class SigninUIEvent{

    data class EmailChanged(val email:String): SigninUIEvent()
    data class PasswordChanged(val password: String) : SigninUIEvent()

    object SigninButtonClicked : SigninUIEvent()
}
