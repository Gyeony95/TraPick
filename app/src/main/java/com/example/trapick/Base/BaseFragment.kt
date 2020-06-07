package com.example.trapick.Base

import android.view.View
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    //abstract val viewModel: R

    abstract fun initViewModel()

    abstract fun initStartView(view: View)

    abstract fun initAfterBinding(view: View)

}