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
	LearningTopics("Attributes change",
		name = "Changing attributes with motion",
		caption = "Learn how to resize and rotate views during animations.",
		navigationId =  R.id.changingAttributesAnimationFragment
	),
	LearningTopics(
		title = "Custom Attributes",
		name = "Changing custom attributes",
		caption = "Learn how to change custom attributes during motion.",
		R.id.customAttributesAnimationFragment
	),
	LearningTopics(
		title = "Drag with complex paths",
		name = "OnSwipe interactions with complex paths",
		caption = "Learn how to control motion through complex paths with OnSwipe.",
		navigationId = R.id.dragWithComplexPathsAnimationFragment
	),
	LearningTopics(
		title = "Animation and code",
		name = "Running motion with code",
		caption = "Learn how to use MotionLayout to build complex collapsing toolbar animations.",
		navigationId = R.id.motionAnimationWithCodeFragment
	),
)