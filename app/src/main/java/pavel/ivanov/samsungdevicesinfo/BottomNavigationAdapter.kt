package pavel.ivanov.samsungdevicesinfo

import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationAdapter(
    private val bottomNavigationView: BottomNavigationView,
    private val viewPager: ViewPager2
) {

    fun setFragment() {

        //Устанавливаем слушатель на книпки навигации и по нажатию кнопки меняем фрагмент ViewPager
        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.accessories -> {
                    viewPager.currentItem = 0
                    true
                }
                R.id.tablets -> {
                    viewPager.currentItem = 1
                    true
                }
                R.id.smartphones -> {
                    viewPager.currentItem = 2
                    true
                }
                R.id.laptops -> {
                    viewPager.currentItem = 3
                    true
                }
                else -> false
            }
        }

        //Получаем обратную связь по позиции ViewPager и устанавливаем элемент навигации в соответствии с фрагментом
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> bottomNavigationView.menu.findItem(R.id.accessories).isChecked = true
                    1 -> bottomNavigationView.menu.findItem(R.id.tablets).isChecked = true
                    2 -> bottomNavigationView.menu.findItem(R.id.smartphones).isChecked = true
                    3 -> bottomNavigationView.menu.findItem(R.id.laptops).isChecked = true
                }
                super.onPageSelected(position)
            }
        })
    }
}