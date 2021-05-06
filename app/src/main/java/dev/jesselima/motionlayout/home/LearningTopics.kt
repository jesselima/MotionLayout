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
	LearningTopics(
		title = "Basic Animation",
		name = "Animations with Motion Layout",
		caption = "Learn how to build a basic animation with Motion Layout that respond to click events.",
		navigationId = R.id.basicAnimationFragment
	),
	LearningTopics(
		title = "Drag Events",
		name = "Animating based on drag events",
		caption = "Learn how to control animations with drag events.",
		navigationId = R.id.dragAnimationFragment
	),
	LearningTopics(
		title = "Modifying a path",
		name = "Adding path to animation",
		caption = "Learn how to use KeyFrames to modify a path between start and end.",
		navigationId = R.id.pathAnimationFragment
	),
	LearningTopics(
		title = "Complex Paths",
		name = "Adding multiple paths to animation",
		caption = "Learn how to use KeyFrames to build complex paths through multiple KeyFrames.",
		navigationId = R.id.complexPathAnimationFragment
	),
	LearningTopics(
		title = "Complex Paths - The crazy moon",
		name = "Another example of adding multiple paths to animation",
		caption = "The moon has drunk some (many) beers.",
		navigationId = R.id.complexPathCrazyMoonAnimationFragment
	),
)