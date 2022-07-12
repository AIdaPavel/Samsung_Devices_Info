package pavel.ivanov.samsungdevicesinfo.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pavel.ivanov.samsungdevicesinfo.R
import pavel.ivanov.samsungdevicesinfo.databinding.ActivityMainBinding
import pavel.ivanov.samsungdevicesinfo.ui.main.adapters.navadapters.BottomNavigationAdapter
import pavel.ivanov.samsungdevicesinfo.ui.main.adapters.navadapters.ViewPagerMainActivityAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var bindingActivityMain: ActivityMainBinding //Обращение к элементам View через Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Инициализация viewBinding
        bindingActivityMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingActivityMain.root)

        //Подключаем ViewPager
        val viewPagerMainActivityAdapter = ViewPagerMainActivityAdapter(this)
        bindingActivityMain.viewPagerActivityMain.adapter = viewPagerMainActivityAdapter

        //Подключаем BottomNavigation
        val bottomNavigationAdapter =
            BottomNavigationAdapter(bindingActivityMain.bottomNavigationMobile,
                bindingActivityMain.viewPagerActivityMain)
        bottomNavigationAdapter.setFragment()

        //Устанавливаем стартовую страницу со вкладки "Смартфоны"
        bindingActivityMain.bottomNavigationMobile.selectedItemId = R.id.smartphones
    }
}