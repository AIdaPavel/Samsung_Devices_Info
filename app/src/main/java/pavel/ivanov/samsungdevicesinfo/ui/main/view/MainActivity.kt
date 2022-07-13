package pavel.ivanov.samsungdevicesinfo.ui.main.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pavel.ivanov.samsungdevicesinfo.R
import pavel.ivanov.samsungdevicesinfo.databinding.ActivityMainBinding
import pavel.ivanov.samsungdevicesinfo.ui.fragments.authorization_fragments.AuthorizationFragment
import pavel.ivanov.samsungdevicesinfo.ui.fragments.authorization_fragments.LogInFragment

class MainActivity : AppCompatActivity() {
    private lateinit var bindingActivityMain: ActivityMainBinding //Обращение к элементам View через Binding

    private var isLogin = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Инициализация viewBinding
        bindingActivityMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingActivityMain.root)

        if (isLogin) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LogInFragment(this))
                .commit()
        } else {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, AuthorizationFragment(this))
                .commit()
        }
    }
}