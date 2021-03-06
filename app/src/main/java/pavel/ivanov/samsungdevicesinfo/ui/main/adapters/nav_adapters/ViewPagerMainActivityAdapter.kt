package pavel.ivanov.samsungdevicesinfo.ui.main.adapters.nav_adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import pavel.ivanov.samsungdevicesinfo.ui.fragments.mobile_fragments.AccessoriesFragment
import pavel.ivanov.samsungdevicesinfo.ui.fragments.mobile_fragments.LaptopsFragment
import pavel.ivanov.samsungdevicesinfo.ui.fragments.mobile_fragments.MobilesFragment
import pavel.ivanov.samsungdevicesinfo.ui.fragments.mobile_fragments.TabletsFragment

class ViewPagerMainActivityAdapter(
    private val fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    private val mobileList =
        arrayOf(AccessoriesFragment(), TabletsFragment(), MobilesFragment(), LaptopsFragment())

    override fun getItemCount(): Int = mobileList.size

    override fun createFragment(position: Int): Fragment = mobileList[position]
}

