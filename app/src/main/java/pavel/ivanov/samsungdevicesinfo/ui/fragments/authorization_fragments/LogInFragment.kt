package pavel.ivanov.samsungdevicesinfo.ui.fragments.authorization_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import pavel.ivanov.samsungdevicesinfo.R
import pavel.ivanov.samsungdevicesinfo.databinding.LoginMainFragmentBinding
import pavel.ivanov.samsungdevicesinfo.ui.main.adapters.nav_adapters.BottomNavigationAdapter
import pavel.ivanov.samsungdevicesinfo.ui.main.adapters.nav_adapters.ViewPagerMainActivityAdapter
import pavel.ivanov.samsungdevicesinfo.utils.viewBinding

class LogInFragment(private val fragmentActivity: FragmentActivity) : Fragment(R.layout.login_main_fragment) {
    private val binding by viewBinding(LoginMainFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Подключаем BottomNavigation
        val bottomNavigationAdapter =
            BottomNavigationAdapter(binding.bottomNavigationMobile,
                binding.viewPagerActivityMain)
        bottomNavigationAdapter.setFragment()

        //Подключаем ViewPager
        val viewPagerMainActivityAdapter = ViewPagerMainActivityAdapter(fragmentActivity)
        binding.viewPagerActivityMain.adapter = viewPagerMainActivityAdapter

        //Устанавливаем стартовую страницу со вкладки "Смартфоны"
//        binding.bottomNavigationMobile.selectedItemId = R.id.smartphones
        binding.viewPagerActivityMain.setCurrentItem(2, true)
    }
}