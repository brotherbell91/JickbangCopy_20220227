package com.hyeongjong.jickbangcopy_20220227.datas

//하나의 방 -> 가격, 행정구역, 층수, 설명문구 멤버변수로.

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String,
) {

//    층수값 => 1층, 반지하, 지하1층 형태로 가공

//    가격값 => "8,500", "2억3,500" 형태로 가공

}