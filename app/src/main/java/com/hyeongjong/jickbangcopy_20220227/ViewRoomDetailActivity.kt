package com.hyeongjong.jickbangcopy_20220227

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hyeongjong.jickbangcopy_20220227.datas.RoomData

class ViewRoomDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as RoomData



    }
}