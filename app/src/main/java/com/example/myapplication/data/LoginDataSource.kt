package com.example.myapplication.data

import com.example.myapplication.data.model.LoggedInUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    // Переменная для хранения текущего пользователя
    private var currentUser: LoggedInUser? = null

    // Метод для входа пользователя
    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // Здесь вы должны выполнить фактическую аутентификацию пользователя.
            // После успешной аутентификации, создайте объект LoggedInUser
            // и сохраните его в currentUser.

            if (username == "your_username" && password == "your_password") {
                val loggedInUser = LoggedInUser(username, "Full Name")
                currentUser = loggedInUser
                return Result.Success(loggedInUser)
            } else {
                return Result.Error(IOException("Incorrect username or password"))
            }
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    // Метод для выхода пользователя
    fun logout() {
        // Очищаем текущего пользователя при выходе
        currentUser = null
    }

    // Метод для получения текущего пользователя
    fun getCurrentUser(): LoggedInUser? {
        return currentUser
    }
}
