package se.magictechnology.pia12androidfeb1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.startText).text = "Hej banan"

        view.findViewById<Button>(R.id.startButton).setOnClickListener {
            view.findViewById<TextView>(R.id.startText).text = "Hej apelsin"
        }

        view.findViewById<Button>(R.id.startGoButton).setOnClickListener {
            requireActivity().supportFragmentManager
                .beginTransaction()
                .add(R.id.fragcon, ReadmoreFragment())
                .addToBackStack(null)
                .commit()
        }
    }



}