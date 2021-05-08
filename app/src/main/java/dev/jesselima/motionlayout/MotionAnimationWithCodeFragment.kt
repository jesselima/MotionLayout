package dev.jesselima.motionlayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.fragment_motion_animation_with_code.*

class MotionAnimationWithCodeFragment : Fragment() {

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_motion_animation_with_code, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		coordinateMotion()
	}

	private fun coordinateMotion() {
		val appBarLayoutListener = AppBarLayout.OnOffsetChangedListener { _, verticalOffset ->
			val seekPosition = -verticalOffset / mainAppBarLayout.totalScrollRange.toFloat()
			rootMotionLayout.progress = seekPosition
		}
		mainAppBarLayout.addOnOffsetChangedListener(appBarLayoutListener)
	}
}