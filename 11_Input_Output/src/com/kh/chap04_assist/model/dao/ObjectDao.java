package com.kh.chap04_assist.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.model.vo.Plant;

public class ObjectDao {
	public void outputFile() {
		Plant plant = new Plant("홍콩야자", "관엽");
		//
		//
		//
		try(ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream("d_object.txt"))){
			oos.writeObject(plant);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public void inputFile() {
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("d_object.txt"))){
			
			Plant plant = (Plant)ois.readObject();
			System.out.println(plant);
		} catch(IOException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
