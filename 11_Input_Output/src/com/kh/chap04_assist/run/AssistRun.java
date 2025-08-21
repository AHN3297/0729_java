package com.kh.chap04_assist.run;

import com.kh.chap04_assist.model.dao.BufferedDao;
import com.kh.chap04_assist.model.dao.ObjectDao;

public class AssistRun {
	public static void main(String[] args) {
		BufferedDao bd = new BufferedDao();
		ObjectDao od = new ObjectDao();
		od.outputFile();
		od.inputFile();
	}

}
