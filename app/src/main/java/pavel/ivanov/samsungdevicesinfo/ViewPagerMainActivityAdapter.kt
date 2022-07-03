package pavel.ivanov.samsungdevicesinfo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerMainActivityAdapter(
    private val fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    private val mobileList =
        arrayOf(MobileFragment(), MobileFragment(), MobileFragment(), MobileFragment())

    override fun getItemCount(): Int = mobileList.size

    override fun createFragment(position: Int): Fragment = mobileList[position]
}

