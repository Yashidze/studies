fun main(args: Array<String>?) {
        val videoPath = "path/video.mp4"
        val apiKey = "your_api_key"
        val videoUploaderFacade = VideoUploaderFacade()
        videoUploaderFacade.uploadVideo(videoPath, apiKey)
        println("Done!")
    }