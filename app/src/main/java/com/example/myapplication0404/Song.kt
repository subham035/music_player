package com.example.myapplication0404

data class Song(
    val title: String,
    val artist: String,
    val path: String,
    val albumArtUri: String,
    var isPlaying: Boolean = false // New property to indicate if the song is currently playing

)




