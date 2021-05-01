package dev.jesselima.motionlayout.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import dev.jesselima.motionlayout.R

class LearningTopicsAdapter(private val data: List<LearningTopics>) : RecyclerView.Adapter<LearningTopicsViewHolder>() {
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearningTopicsViewHolder {
		val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
		return LearningTopicsViewHolder(view as CardView)
	}

	override fun getItemCount() = data.size

	override fun onBindViewHolder(holder: LearningTopicsViewHolder, position: Int) {
		holder.bind(data[position])
	}

}
