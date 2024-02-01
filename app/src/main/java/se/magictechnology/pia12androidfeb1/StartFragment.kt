package se.magictechnology.pia12androidfeb1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import se.magictechnology.pia12androidfeb1.databinding.FragmentReadmoreBinding
import se.magictechnology.pia12androidfeb1.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private var _binding : FragmentStartBinding? = null
    private val binding get() = _binding!!

    var letscount = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_start, container, false)

        _binding = FragmentStartBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.startText.text = "Hej banan"

        binding.startButton.setOnClickListener {

            letscount = letscount + 1

            binding.startText.text = letscount.toString()

        }

        binding.startGoButton.setOnClickListener {

            var gofrag = ReadmoreFragment()
            gofrag.mynumber = letscount

            requireActivity().supportFragmentManager
                .beginTransaction()
                .add(R.id.fragcon, gofrag)
                .addToBackStack(null)
                .commit()
        }
    }



}