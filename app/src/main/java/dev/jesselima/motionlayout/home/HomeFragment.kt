package dev.jesselima.motionlayout.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.jesselima.motionlayout.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_home, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		recyclerViewAnimationCases.adapter = LearningTopicsAdapter(learningTopics)
	}
}


