package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tipcalculator.Bill;
import tipcalculator.TipCalculator;

public class PublicTests {

	@Test
	public void test1() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		bill = tip.calculate(2,100, 5);
		assertEquals(bill.amount,100,0.001);
		assertEquals(bill.amountPerPerson,62.5,0.001);
		assertEquals(bill.numberOfPeople,2);
		assertEquals(bill.stars,5);
		assertEquals(bill.tipPerPerson,12.5,0.001);
		assertEquals(bill.totalAmount,125,0.001);
		assertEquals(bill.totalTip, 25,0.001);
	}
	
	
	@Test
	public void test2() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		bill = tip.calculate(1,60, 3);
		assertEquals(bill.amount,60,0.001);
		assertEquals(bill.amountPerPerson,69,0.001);
		assertEquals(bill.numberOfPeople,1);
		assertEquals(bill.stars,3);
		assertEquals(bill.tipPerPerson,9,0.001);
		assertEquals(bill.totalAmount,69,0.001);
		assertEquals(bill.totalTip, 9, 0.001);
	}
	
	@Test
	public void test3() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		
		bill = tip.calculate(0,60, 3);
		
		assertEquals(bill.amount,0,0.001);
		assertEquals(bill.amountPerPerson,0,0.001);
		assertEquals(bill.numberOfPeople,0);
		assertEquals(bill.stars,0);
		assertEquals(bill.tipPerPerson,0,0.001);
		assertEquals(bill.totalAmount,0,0.001);
		assertEquals(bill.totalTip, 0, 0.001);
	}
	
	
	@Test
	public void test4() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		
		bill = tip.calculate(11,60, 3);
		
		assertEquals(bill.amount,0,0.001);
		assertEquals(bill.amountPerPerson,0,0.001);
		assertEquals(bill.numberOfPeople,0);
		assertEquals(bill.stars,0);
		assertEquals(bill.tipPerPerson,0,0.001);
		assertEquals(bill.totalAmount,0,0.001);
		assertEquals(bill.totalTip, 0, 0.001);
	}
	
	@Test
	public void test5() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		
		bill = tip.calculate(1,-60, 3);
		
		assertEquals(bill.amount,0,0.001);
		assertEquals(bill.amountPerPerson,0,0.001);
		assertEquals(bill.numberOfPeople,0);
		assertEquals(bill.stars,0);
		assertEquals(bill.tipPerPerson,0,0.001);
		assertEquals(bill.totalAmount,0,0.001);
		assertEquals(bill.totalTip, 0, 0.001);
	}

	@Test
	public void test6() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		
		bill = tip.calculate(1,0, 3);
		
		assertEquals(bill.amount,0,0.001);
		assertEquals(bill.amountPerPerson,0,0.001);
		assertEquals(bill.numberOfPeople,0);
		assertEquals(bill.stars,0);
		assertEquals(bill.tipPerPerson,0,0.001);
		assertEquals(bill.totalAmount,0,0.001);
		assertEquals(bill.totalTip, 0, 0.001);
	}
	
	@Test
	public void test7() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		
		bill = tip.calculate(1,100, 0);
		
		assertEquals(bill.amount,0,0.001);
		assertEquals(bill.amountPerPerson,0,0.001);
		assertEquals(bill.numberOfPeople,0);
		assertEquals(bill.stars,0);
		assertEquals(bill.tipPerPerson,0,0.001);
		assertEquals(bill.totalAmount,0,0.001);
		assertEquals(bill.totalTip, 0, 0.001);
	}
	
	
	@Test
	public void test8() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		
		bill = tip.calculate(1,100, 6);
		
		assertEquals(bill.amount,0,0.001);
		assertEquals(bill.amountPerPerson,0,0.001);
		assertEquals(bill.numberOfPeople,0);
		assertEquals(bill.stars,0);
		assertEquals(bill.tipPerPerson,0,0.001);
		assertEquals(bill.totalAmount,0,0.001);
		assertEquals(bill.totalTip, 0, 0.001);
	}
	
	@Test
	public void test9() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		
		bill = tip.calculate(1,100, -3);
		
		assertEquals(bill.amount,0,0.001);
		assertEquals(bill.amountPerPerson,0,0.001);
		assertEquals(bill.numberOfPeople,0);
		assertEquals(bill.stars,0);
		assertEquals(bill.tipPerPerson,0,0.001);
		assertEquals(bill.totalAmount,0,0.001);
		assertEquals(bill.totalTip, 0, 0.001);
	}
	
	@Test
	public void test10() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		bill = tip.calculate(4,100, 5);
		assertEquals(bill.amount,100,0.001);
		assertEquals(bill.amountPerPerson,31.25,0.001);
		assertEquals(bill.numberOfPeople,4);
		assertEquals(bill.stars,5);
		assertEquals(bill.tipPerPerson,6.25,0.001);
		assertEquals(bill.totalAmount,125,0.001);
		assertEquals(bill.totalTip, 25,0.001);
	}

	@Test
	public void test11() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		bill = tip.calculate(3,89, 1);
		assertEquals(bill.amount,89,0.01);
		assertEquals(bill.amountPerPerson,31.15,0.01);
		assertEquals(bill.numberOfPeople,3);
		assertEquals(bill.stars,1);
		assertEquals(bill.tipPerPerson,1.48,0.01);
		assertEquals(bill.totalAmount,93.45,0.01);
		assertEquals(bill.totalTip, 4.45,0.01);
	}
	
	
	@Test
	public void test12() {
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
		bill = tip.calculate(8,4567, 4);
		assertEquals(bill.amount,4567,0.01);
		assertEquals(bill.amountPerPerson,685.05,0.01);
		assertEquals(bill.numberOfPeople,8);
		assertEquals(bill.stars,4);
		assertEquals(bill.tipPerPerson,114.18,0.01);
		assertEquals(bill.totalAmount,5480.40,0.01);
		assertEquals(bill.totalTip, 913.4,0.01);
	}
}
