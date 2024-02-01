package se.magictechnology.pia12androidfeb1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ScrollView
import android.widget.TextView
import se.magictechnology.pia12androidfeb1.databinding.FragmentReadmoreBinding

class ReadmoreFragment : Fragment() {

    private var _binding : FragmentReadmoreBinding? = null
    private val binding get() = _binding!!

    var mynumber = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_readmore, container, false)

        _binding = FragmentReadmoreBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //view.findViewById<TextView>(R.id.readmoreText).text = "Tjena"

        binding.readmoreText.text = "Hallon"

        binding.bignumberText.text = mynumber.toString()
    }


}