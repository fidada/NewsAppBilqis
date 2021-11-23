package com.bilqismufida.newsapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NewsModel (
    var NewsImageModel : Int = 0,
    var NewsTitleModel : String = "",
    var NewsDescModel : String = ""
): Parcelable