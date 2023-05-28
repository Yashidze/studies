class VideoUploaderFacade {
    private val videoConverter: VideoConverter
    private val youtubeAPI: YoutubeAPI

    init {
        videoConverter = VideoConverter()
        youtubeAPI = YoutubeAPI()
    }

    fun uploadVideo(videoPath: String?, apiKey: String?) {
        // Конвертувати відео в необхідний формат
        val convertedVideoPath: String? = videoConverter.convertVideo(videoPath)

        // Завантажити відео на YouTube за допомогою API та передати API-ключ
        youtubeAPI.uploadVideo(convertedVideoPath, apiKey)
    }
}