package com.hyeongjong.jickbangcopy_20220227.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.hyeongjong.jickbangcopy_20220227.datas.RoomData

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {
}