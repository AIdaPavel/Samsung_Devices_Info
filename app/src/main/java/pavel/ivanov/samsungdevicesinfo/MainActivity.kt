package pavel.ivanov.samsungdevicesinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import pavel.ivanov.samsungdevicesinfo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingActivityMain: ActivityMainBinding //Обращение к элементам View через Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Инициализация viewBinding
        bindingActivityMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingActivityMain.root)

        //Удаление строки состояния
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        if (savedInstanceState == null) {
            //Подключение главного фрагмента
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.containerActivityMain, MobileFragment.newInstance())
                .commit()
        }

        bindingActivityMain.viewPagerActivityMain.adapter = ViewPagerMainActivityAdapter(this)

        bindingActivityMain.bottomNavigationMobile.selectedItemId = R.id.smartphones
        bindingActivityMain.bottomNavigationMobile.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.accessories -> {
                    //TODO ("объединить с viewPager")
                    Toast.makeText(baseContext, "Accessories", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.tablets -> {
                    //TODO ("объединить с viewPager")
                    Toast.makeText(baseContext, "Tablets", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.smartphones -> {
                    //TODO ("объединить с viewPager")
                    Toast.makeText(baseContext, "Smartphone", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.laptops -> {
                    //TODO ("объединить с viewPager")
                    Toast.makeText(baseContext, "Laptops", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }

        }
    }
}