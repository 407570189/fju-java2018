package com.fju;

public class Hello {

	public static void main(String[] args) {
		//Hello introduce myself
		int age= 18;
        String firstname ="Hung";
        String lastname = "Shang";
        String message = "hello";
        String aaa = "everybody";
        float weight =(float)58.5;
        float height = 1.765f;
        float bmi = weight / (height*height);
        System.out.println(message+aaa);
		System.out.println("my name is");
        System.out.println(firstname+lastname);
        System.out.println(age+"years old");
		System.out.println("tall"+height);
		System.out.println("weight"+weight);
		System.out.println(bmi);
		age = age+1;
		System.out.println(age);

	}

}
