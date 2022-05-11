package com.example.demo.chapter03.used;
/**
* Greet implementation class<br>
* Greetings for evening
*/

//It is important to import the following otherwise the program will crush.
import org.springframework.stereotype.Component;

/*
 * @Component is an annotation that allows Spring to automatically detect our custom beans. 
 * In other words, without having to write any explicit code, 
 * Spring will: Scan our application for classes annotated with @Component. Instantiate them 
 * and inject any specified dependencies into them.  
 */

//@Component
public class EveningGreet implements Greet {
@Override
	public void greeting() {
		System.out.println("------------------");
		System.out.println("こんばんは。 ");
		System.out.println("------------------");
	}
}