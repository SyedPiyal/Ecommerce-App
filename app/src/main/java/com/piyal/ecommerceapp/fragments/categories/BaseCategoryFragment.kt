package com.piyal.ecommerceapp.fragments.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.piyal.ecommerceapp.R
import com.piyal.ecommerceapp.databinding.FragmentAccountOptionBinding
import com.piyal.ecommerceapp.databinding.FragmentBaseCategoryBinding


open class BaseCategoryFragment : Fragment() {

    private var _binding: FragmentBaseCategoryBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBaseCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }


}