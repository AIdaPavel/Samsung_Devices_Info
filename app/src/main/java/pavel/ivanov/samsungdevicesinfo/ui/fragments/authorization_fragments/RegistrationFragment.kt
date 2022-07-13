package pavel.ivanov.samsungdevicesinfo.ui.fragments.authorization_fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import pavel.ivanov.samsungdevicesinfo.R
import pavel.ivanov.samsungdevicesinfo.databinding.RegistrationFragmentBinding
import pavel.ivanov.samsungdevicesinfo.utils.viewBinding

class RegistrationFragment(private val fragmentActivity: FragmentActivity) : Fragment(R.layout.registration_fragment) {
    private val binding by viewBinding(RegistrationFragmentBinding::bind)

    private var login: String? = null
    private var password: String? = null
    private var passwordRepeat: String? = null
    private var email: String? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Кнопка входа в аккаунт
        binding.pushRegistrationBtn.setOnClickListener {
            login = binding.loginRegistration.text.toString()
            password = binding.loginPassRegistration.text.toString()
            passwordRepeat = binding.loginPassRepeatRegistration.text.toString()
            email = binding.emailRegistration.text.toString()

            if (login.equals("") || password.equals("") || passwordRepeat.equals("") ) {
                Toast.makeText(context, "Заполните поля", Toast.LENGTH_SHORT).show()
            } else if (!password.equals(passwordRepeat)) {
                Toast.makeText(context, "Пароли не совпадают", Toast.LENGTH_SHORT).show()
            } else {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.container, AuthorizationFragment(fragmentActivity))
                    .commit()
            }
        }
    }
}