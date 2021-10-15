package com.umtzngn.cvfragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.umtzngn.cvfragmentsample.databinding.FragmentCvOzetBinding

class CvOzetFragment : Fragment() {

    private var _binding:FragmentCvOzetBinding? = null
    private val binding get() = _binding!!

    private val args: CvOzetFragmentArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCvOzetBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val ad = args.ad.toString()
        val soyad = args.soyad.toString()
        val yas = args.yas.toString()
        val email = args.email.toString()

        binding.adTextView.text = ad
        binding.soyadTextView.text =soyad
        binding.yasTextView.text=yas
        binding.emailTextView.text=email


    }


    override fun onDestroy() {
        super.onDestroy()

        _binding =null
    }


}