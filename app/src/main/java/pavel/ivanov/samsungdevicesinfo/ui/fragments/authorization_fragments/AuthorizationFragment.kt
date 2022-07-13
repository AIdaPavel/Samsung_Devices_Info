package pavel.ivanov.samsungdevicesinfo.ui.fragments.authorization_fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import pavel.ivanov.samsungdevicesinfo.R
import pavel.ivanov.samsungdevicesinfo.databinding.AuthorizationFragmentBinding
import pavel.ivanov.samsungdevicesinfo.utils.viewBinding

class AuthorizationFragment(private val fragmentActivity: FragmentActivity) :
    Fragment(R.layout.authorization_fragment) {
    private val binding by viewBinding(AuthorizationFragmentBinding::bind)

    private var login: String? = null
    private var password: String? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Кнопка входа в аккаунт
        binding.loginToAccountBtn.setOnClickListener {
            login = binding.login.text.toString()
            password = binding.loginPass.text.toString()

            if (login.equals("") || password.equals("")) {
                Toast.makeText(context, "Заполните поля", Toast.LENGTH_SHORT).show()
            } else {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.container, LogInFragment(fragmentActivity))
                    .commit()
            }
        }

        // Кнопка регистрации навого пользователя
        binding.registrationBtn.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, RegistrationFragment(fragmentActivity))
                .commit()
        }
    }
}