package org.example.structural_design_pattern.Adapter;

// Concrete class to play MP4 files
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }
}
