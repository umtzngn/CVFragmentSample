package com.umtzngn.cvfragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.umtzngn.cvfragmentsample.databinding.FragmentCvGirisBinding

class CvGirisFragment : Fragment() {

    private var _binding:FragmentCvGirisBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCvGirisBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.gonderButton.setOnClickListener {

            val ad = binding.isimEditText.text.toString()
            val soyad = binding.soyadEditText.text.toString()
            val yas = binding.yasEditText.text.toString()
            val email = binding.emailEditText.text.toString()
            val gecis =CvGirisFragmentDirections.girisToOzet(ad,soyad,yas,email)
            findNavController().navigate(gecis)
        }


    }


    override fun onDestroy() {
        super.onDestroy()

        _binding = null


    }

}