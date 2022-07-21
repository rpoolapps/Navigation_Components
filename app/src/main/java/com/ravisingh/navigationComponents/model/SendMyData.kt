package com.ravisingh.navigationComponents.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SendMyData(
    val firstName: String,
    val secondName: String,
    val lastname: String
) : Parcelable
