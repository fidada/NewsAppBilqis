package com.bilqismufida.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bilqismufida.newsapp.adapter.NewsAdapter
import com.bilqismufida.newsapp.data.NewsData
import com.bilqismufida.newsapp.model.NewsModel
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        initRecyclerViewNews()
    }

    private fun initRecyclerViewNews() {
        val list : ArrayList<NewsModel> = arrayListOf()
        rv_news.setHasFixedSize(true)
        list.addAll(NewsData.listNewsData)
        rv_news.layoutManager = LinearLayoutManager(this)
        rv_news.adapter = NewsAdapter(list)
    }
}