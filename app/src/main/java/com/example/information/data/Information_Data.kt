package com.example.information.data

import com.example.information.type.TypeofData

object Information_Data {


    fun getDataString() : MutableList<String?> {
        TypeofData.name = "Noor Ahmad "
        TypeofData.emil = "Noor99@gmail.com"
        TypeofData.phone = "+56054607909"
        return mutableListOf(TypeofData.name,TypeofData.emil,TypeofData.phone)

    }

}