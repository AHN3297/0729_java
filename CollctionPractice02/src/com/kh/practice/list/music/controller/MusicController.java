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
		List<Music> searchList = new ArrayList();
		for(int i = 0; i<music.size(); i++) {
			Music m = music.get(i);
			
			if(m.getTitle().equals(title)) {
				searchList.add(m);
				
			}else {
				return null;
			}
		}
		return null;
		
		
	}
}

