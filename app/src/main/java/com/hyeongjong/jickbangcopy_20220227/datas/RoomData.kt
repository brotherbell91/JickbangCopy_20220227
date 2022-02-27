package com.hyeongjong.jickbangcopy_20220227.datas

import java.text.NumberFormat
import java.util.*

//하나의 방 -> 가격, 행정구역, 층수, 설명문구 멤버변수로.

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String,
) {

//    층수값 => 1층, 반지하, 지하1층 형태로 가공
    fun getFormattedFloor() : String {
        val floorStr : String

        if (floor > 0) {
            floorStr = "${floor}층"
        }
        else if (floor == 0) {
            floorStr = "반지하"
        }
        else{
            floorStr = "지하 ${ -floor}층"
        }
        return floorStr
    }

//    가격값 => "8,500", "2억3,500" 형태로 가공
    fun getFormattedPrice() : String {
        if (price < 10000) {
//            8000 => "8,500"
            val formattedPrice = NumberFormat.getNumberInstance(Locale.KOREA).format(price)
            return formattedPrice
        }
        else{
//            26500 / 10000 = 2 => "2억 6,500원"
            val uk = price / 10000
//            26500 / 10000 = 2 => "2억 6,500원"
            val rest = price % 10000
            val formattedRest = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)
            return "${uk}억 ${formattedRest}"
        }
    }

}