package pavel.ivanov.samsungdevicesinfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pavel.ivanov.samsungdevicesinfo.databinding.MobileFragmentBinding

class MobileFragment : Fragment() {
    private var _bindingMobileFragment: MobileFragmentBinding? = null
    private val bindingMobileFragment get() = _bindingMobileFragment!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _bindingMobileFragment = MobileFragmentBinding.inflate(inflater, container, false)
        return bindingMobileFragment.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _bindingMobileFragment = null
    }

    companion object {
        fun newInstance() = MobileFragment()
    }
}