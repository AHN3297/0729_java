package com.kh.last;

import java.util.Arrays;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person ("홍길동", "한양", 15),
				new Person("고길동", "서울", 40),
				new Person("춘향이", "남원", 20),
				new Person("콩쥐", "서울", 23)
				);
		for(Person person:people) {
			if("서울".equals(person.getAddress())){
				System.out.println(person);
			}
		}
		System.out.println("스트림 방식");
		people.stream().filter(person -> "서울".equals(person.getAddress()))
					   .forEach(System.out::println);
		
		// 이름과 주소 출력하기
		System.out.println("전통적인 방식");
		for(Person person : people) {
			System.out.println(person.getName() + "님은 " + person.getAddress() + "에 삽니다.");
		}
		System.out.println("스트림방식");
		people.stream().map(person -> person.getName() + "님은" + person.getAddress()+ "에 삽니다.")
					  .forEach(System.out::println);
	}

}
