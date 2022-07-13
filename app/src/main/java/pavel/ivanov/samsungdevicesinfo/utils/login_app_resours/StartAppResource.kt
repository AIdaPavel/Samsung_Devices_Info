package pavel.ivanov.samsungdevicesinfo.utils.login_app_resours

data class StartAppResource<out T>(val status: StartAppStatus, val fragment: T?) {
    companion object {

        fun <T> logIn (fragment: T): StartAppResource<T> =
            StartAppResource(status = StartAppStatus.LOGIN_ON, fragment = fragment)

        fun <T> logOut (fragment: T): StartAppResource<T> =
            StartAppResource(status = StartAppStatus.LOGIN_OF, fragment = fragment)
    }
}
