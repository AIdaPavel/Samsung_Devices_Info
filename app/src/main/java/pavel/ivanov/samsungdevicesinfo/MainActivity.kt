package pavel.ivanov.samsungdevicesinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import pavel.ivanov.samsungdevicesinfo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingActivityMain: ActivityMainBinding //Обращение к элементам View через Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Инициализация viewBinding
        bindingActivityMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingActivityMain.root)

        //Удаление строки состояния
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        if (savedInstanceState == null) {
            //Подключение главного фрагмента
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.containerActivityMain, MobileFragment.newInstance())
                .commit()
        }
    }
}