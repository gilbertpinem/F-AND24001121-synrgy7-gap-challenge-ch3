package com.example.wordapp.model

import android.os.Parcel
import android.os.Parcelable

class Alphabet(val name:String, val member:List<String>) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.createStringArrayList()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeStringList(member)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Alphabet> {
        override fun createFromParcel(parcel: Parcel): Alphabet {
            return Alphabet(parcel)
        }

        override fun newArray(size: Int): Array<Alphabet?> {
            return arrayOfNulls(size)
        }
    }

}