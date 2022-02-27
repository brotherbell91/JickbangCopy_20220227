package com.hyeongjong.jickbangcopy_20220227.datas

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

}