package task_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing_string_calculator {

	@Test
	public void Basetest() {
		String_calculator str_calc = new String_calculator();
		int result = str_calc.String_calc("1,2,3");
		assertEquals(6, result);
	}
	
	@Test
	public void Whenhavingemptystring() {
		String_calculator str_calc = new String_calculator();
		assertEquals(0, str_calc.String_calc(""));
	}
	
	@Test(expected = RuntimeException.class)
	public void Whenusingnonnumbervalue() {
		String_calculator str_calc = new String_calculator();
		str_calc.String_calc("1,a,2");
	}
	
	@Test(expected = RuntimeException.class)
	public void Whenusingnegativenumbervalue() {
		String_calculator str_calc = new String_calculator();
		str_calc.String_calc("1,-3,2");
	}
	
	@Test
	public void Whennewlineisusedbetweenstring() {
		String_calculator str_calc = new String_calculator();
		assertEquals(8, str_calc.String_calc("1,\n,5,2"));
	}
	
	@Test
	public void Whenusingdoubleslashasdeciderfordelimeter() {
		String_calculator str_calc = new String_calculator();
		assertEquals(7, str_calc.String_calc("//;\n1;2;3;1"));
	}
	
	
	
	

}
