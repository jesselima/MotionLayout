package dev.jesselima.motionlayout.home

import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import dev.jesselima.motionlayout.R
import kotlinx.android.synthetic.main.list_item.view.*

class LearningTopicsViewHolder(private val cardView: CardView) : RecyclerView.ViewHolder(cardView) {
	fun bind(learningTopics: LearningTopics) {
		cardView.header.text = learningTopics.title
		cardView.description.text = learningTopics.name
		cardView.caption.text = learningTopics.caption
		cardView.setOnClickListener {
			it.findNavController().navigate(learningTopics.navigationId)
		}
		val color = if (learningTopics.highlight) {
			ContextCompat.getColor(cardView.context, R.color.secondaryLightColor)
		} else {
			ContextCompat.getColor(cardView.context, R.color.secondaryTextColor)
		}
		cardView.header.setTextColor(color)
		cardView.description.setTextColor(color)
	}
}
