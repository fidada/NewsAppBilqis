package com.bilqismufida.newsapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.createBitmap
import androidx.recyclerview.widget.RecyclerView
import com.bilqismufida.newsapp.DashboardActivity
import com.bilqismufida.newsapp.R
import com.bilqismufida.newsapp.model.NewsModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import jp.wasabeef.glide.transformations.BlurTransformation

class NewsAdapter (private val listNews:ArrayList<NewsModel>) :
        RecyclerView.Adapter<NewsAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto : ImageView = itemView.findViewById(R.id.iv_item_photo)
        var tvTitle : TextView = itemView.findViewById(R.id.tv_title)
        var tvDesc : TextView = itemView.findViewById(R.id.tv_desc)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): NewsAdapter.ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_news, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsAdapter.ListViewHolder, position: Int) {
        val News = listNews[position]
        holder.tvTitle.text = News.NewsTitleModel
        holder.tvDesc.text = News.NewsDescModel

        Glide.with(holder.itemView.context)
            .load(News.NewsImageModel)
            .into(holder.imgPhoto)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }
}







