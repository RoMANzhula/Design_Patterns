package structural_patterns.adapter_pattern;

public class Main {

    public static void main(String[] args) {
        AudioPlayerWithAdapter player = new AudioPlayerWithAdapter();

        player.play("mp3", "song.mp3");         // output: Playing mp3 file: song.mp3
        player.play("mp4", "video.mp4");        // output: Playing mp4 file: video.mp4
        player.play("vlc", "movie.vlc");        // output: Playing vlc file: movie.vlc
        player.play("avi", "unsupported.avi");  // output: Invalid format: avi
    }

}
