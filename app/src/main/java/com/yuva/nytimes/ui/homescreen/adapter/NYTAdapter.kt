package com.yuva.nytimes.ui.homescreen.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yuva.nytimes.R
import com.yuva.nytimes.model.homescreen.Result
import com.yuva.nytimes.ui.detailscreen.NYTDetailPage

class NYTAdapter(private val mCtx: Context, private val result: List<Result>) :
    RecyclerView.Adapter<NYTAdapter.TasksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val view = LayoutInflater.from(mCtx).inflate(R.layout.nyt_list_item, parent, false)
        return TasksViewHolder(view)
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        val t = result[position]
        holder.title.text = t.getTitle()?.trim()
        holder.subtitle.text = t.getAdxKeywords()?.trim()
        holder.txtdate.text = t.getPublishedDate()?.trim()

        val picasso = Picasso.get()
        picasso.load(t.getMedia()?.get(0)?.getMediaMetadata()?.get(0)?.getUrl())
            .into(holder.poster)

    }

    override fun getItemCount(): Int {
        return result.size
    }

    inner class TasksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        var poster: ImageView
        var title: TextView
        var subtitle: TextView
        var txtdate: TextView

        init {

            poster = itemView.findViewById(R.id.poster)
            title = itemView.findViewById(R.id.title)
            subtitle = itemView.findViewById(R.id.subtitle)
            txtdate = itemView.findViewById(R.id.txtdate)
            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            val intent = Intent(mCtx, NYTDetailPage::class.java)
            intent.putExtra("IMG",result.get(adapterPosition).getMedia()?.get(0)?.getMediaMetadata()?.get(0)?.getUrl())
            intent.putExtra("TIT",result.get(adapterPosition).getTitle())
            intent.putExtra("ADX",result.get(adapterPosition).getAdxKeywords())
            intent.putExtra("DT",result.get(adapterPosition).getPublishedDate())
            mCtx.startActivity(intent)

        }
    }

}

