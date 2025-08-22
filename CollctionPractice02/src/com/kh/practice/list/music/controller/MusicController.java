package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	
	private List<Music> music = new ArrayList();
	
	
	public int addList(Music ms) {
		music.add(ms);
		return 1;
	}
	
	public int addAtZero(Music ms) {
		music.add(0,ms);
		return 1;
	}
	public List<Music> printAll() {
		return music;
	}
	
	public Music searchMusic(String title) {
		return null;
		
	}
}

