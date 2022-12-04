package com.example.timeline

import TimelinePost

class GetPost {

    fun getTimelinePost(): ArrayList<TimelinePost> {
        val name = arrayOf(
            "Movie","Game","Album","Book","Face","Sports","Book","Face","Sports"
        )

        val location = arrayOf(
            "GT","Strange","Curtis","Richard", "House","Bangalore","Richard", "House","Bangalore"
        )

        val time = arrayOf(
            "04/11/2022 12:00 pm",
            "04/11/2022 03:00 pm",
            "05/11/2022 04:00 pm",
            "06/11/2022 06:00 pm",
            "10/11/2022 09:00 pm",
            "10/11/2022 09:00 pm",
            "04/11/2022 12:00 pm",
            "04/11/2022 03:00 pm",
            "05/11/2022 04:00 pm"
        )

        val image = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img4,
            R.drawable.img1,
            R.drawable.img3,
            R.drawable.img2
        )

        val timelinePostList = ArrayList<TimelinePost>()
        for(i in name.indices){
            var user = TimelinePost(name[i], location[i], time[i], image[i])
            timelinePostList.add(user)
        }

        return timelinePostList
    }
}