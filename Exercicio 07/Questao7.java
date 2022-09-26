public class Questao7 {
    public static void main(String[] args) {
        YoutubeVideo youtubeVideo = new YoutubeVideo(); 
        FaceVideo faceVideo = new FaceVideo(); 
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.setVideo(youtubeVideo);
        videoPlayer.play();
        videoPlayer.setVideo(faceVideo);
        videoPlayer.play();
    }
}
