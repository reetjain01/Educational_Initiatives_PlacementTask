package org.example.structural_design_pattern.Adapter;

// Audio player that can use MediaAdapter to play MP4 files
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Play MP3 files directly
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        }
        // Use MediaAdapter to play MP4 files
        else if (audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        // Unsupported format
        else {
            System.out.println("Invalid media format. " + audioType + " not supported.");
        }
    }
}

