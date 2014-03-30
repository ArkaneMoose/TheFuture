package com.rsjinc.thefuture;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioParser {

	@SuppressWarnings("unused")
	private File file;
	private AudioInputStream audioStream;
	@SuppressWarnings("unused")
	private AudioFormat audioFormat;
	
	public AudioParser() {

	}
	
	public AudioParser(String filename) throws UnsupportedAudioFileException, IOException {
		loadFile(new File(filename));
	}
	
	public AudioParser(URI uri) throws UnsupportedAudioFileException, IOException {
		loadFile(new File(uri));
	}
	
	public AudioParser(File file) throws UnsupportedAudioFileException, IOException {
		loadFile(file);
	}

	public void loadFile(File file) throws UnsupportedAudioFileException, IOException {
		audioStream = AudioSystem.getAudioInputStream(file);
		audioFormat = audioStream.getFormat();
		//audioStream.
	}
	
	public void loadFile(String filename) throws UnsupportedAudioFileException, IOException {
		loadFile(new File(filename));
	}
	
	public void loadFile(URI uri) throws UnsupportedAudioFileException, IOException {
		loadFile(new File(uri));
	}
}