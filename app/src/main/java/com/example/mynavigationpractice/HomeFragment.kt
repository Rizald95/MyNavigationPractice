package com.example.mynavigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mynavigationpractice.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //membuat sebuah action yang berfungsi untuk berpindah antar fragment atau activity
        //kode program dibawah lebih simple tetapi  hanya digunakan ketika di klik saja
        binding.btnCategory.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_categoryFragment)
        )

        //jika ingin memanggil aksi navigasi pada aksi lainnya, gunakan kode program dibawah
        binding.btnProfile.setOnClickListener {
                 view -> view.findNavController().navigate(R.id.action_homeFragment_to_profileActivity)
        }
        
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}