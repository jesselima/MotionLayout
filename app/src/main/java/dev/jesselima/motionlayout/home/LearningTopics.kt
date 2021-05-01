package dev.jesselima.motionlayout.home

import dev.jesselima.motionlayout.R

data class LearningTopics(
	val title: String,
	val name: String,
	val caption: String,
	val navigationId: Int,
	val highlight: Boolean = false
)

val learningTopics = listOf(
	LearningTopics("Basic Animation",
		"Animations with Motion Layout",
		"Learn how to build a basic animation with Motion Layout.",
		R.id.basicAnimationFragment
	)
)