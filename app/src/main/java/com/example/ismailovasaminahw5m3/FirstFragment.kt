package com.example.ismailovasaminahw5m3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ismailovasaminahw5m3.databinding.FragmentFirstBinding
import com.example.ismailovasaminahw5m3.databinding.FragmentSecondBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener {
            if (counter < 10 && binding.btn.text == "+1") {
                counter++
                binding.tv.text = counter.toString()
            }else if(counter<=10 && counter>0){
                binding.btn.text="-1"
                counter--
                binding.tv.text = counter.toString()
            }else if (counter==0){
                requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,SecondFragment()).commit()
            }
        }
    }
}
