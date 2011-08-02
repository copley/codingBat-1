package javalearning;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import utility.Arr;

public class Array1Tests {

	private static Array1 array1;
	
	
	
	int[] nums = {1,2,6};
	int[] nums2 = {6,2,1};
	int[] nums3 = {3,2,1};
	int[] nums4 = {};
	int[] nums5 = {6,2,6};
	int[] nums6 = {1};
	int[] nums7 = {7,7};
	
	int[] myPi = {3, 1, 4};
	
	int[] numA = {7, 3};
	int[] numB = {7, 3, 2};
	int[] num0 = {1,2,3};
	int[] f119 = {5, 11, 9};
	
	
	
	@Before
	public void setUp(){
		array1 = Array1.INSTANCE;
	}
	
	@Test
	public void unlucky1(){
		
		assertEquals(false, array1.unlucky1(Arr.integer()));
		assertEquals(false, array1.unlucky1(Arr.integer(1)));
		assertEquals(true, array1.unlucky1(Arr.integer(1,3)));
		assertEquals(false, array1.unlucky1(Arr.integer(7,7)));
		
		assertEquals(true, array1.unlucky1(Arr.integer(1,3,2)));
		assertEquals(true, array1.unlucky1(Arr.integer(1, 1, 3)));
		assertEquals(false, array1.unlucky1(Arr.integer(1, 1, 1)));
		
		assertEquals(false, array1.unlucky1(Arr.integer(1, 1, 1, 3, 1)));
	}
	
	@Test
	public void front11(){
		assertTrue(Arrays.equals(Arr.integer(1,2), array1.front11(Arr.integer(1), Arr.integer(2))));
		assertTrue(Arrays.equals(Arr.integer(1), array1.front11(Arr.integer(1,7), Arr.integer())));
		assertTrue(Arrays.equals(Arr.integer(1,7), array1.front11(Arr.integer(1,2,3), Arr.integer(7,8,9))));
	}
	
	
	
	@Test
	public void make2(){
		assertTrue(Arrays.equals(Arr.integer(), array1.make2(Arr.integer(), Arr.integer())));
		assertTrue(Arrays.equals(Arr.integer(1,2), array1.make2(Arr.integer(), Arr.integer(1,2))));
		assertTrue(Arrays.equals(Arr.integer(4,5), array1.make2(Arr.integer(4,5), Arr.integer(1,2,3))));
		assertTrue(Arrays.equals(Arr.integer(4,5), array1.make2(Arr.integer(4,5), Arr.integer(1,2,3))));
	}
	
	
	
	@Test
	public void fix23(){
		assertTrue(Arrays.equals(Arr.integer(1,2,0), array1.fix23(Arr.integer(1,2,3))));
		assertTrue(Arrays.equals(Arr.integer(2,0,5), array1.fix23(Arr.integer(2,3,5))));
		assertTrue(Arrays.equals(Arr.integer(1,2,1), array1.fix23(Arr.integer(1,2,1))));
		
	}
	
	@Test
	public void plusTwo(){
		
		int[] a= {9, 2};
		int[] b ={3, 4};
		int[] c = {9, 2, 3, 4};
		
		assertTrue(Arrays.equals(c, array1.plusTwo(a, b)));
	}
	
	
	@Test
	public void makeMiddle(){
		
		int[] a= {7,1,2,3,4,9};
		int[] b ={2, 3};
		
		assertTrue(Arrays.equals(b, array1.makeMiddle(a)));
	}
	
	@Test
	public void swapEnds(){
		assertTrue(Arrays.equals(Arr.integer(1), array1.swapEnds(Arr.integer(1))));
		assertTrue(Arrays.equals(Arr.integer(4,2,3,1), array1.swapEnds(Arr.integer(1,2,3,4))));
		assertTrue(Arrays.equals(Arr.integer(1,2,3), array1.swapEnds(Arr.integer(3,2,1))));
	}
	
	
	@Test
	public void frontPiece(){
		assertTrue(Arrays.equals(Arr.integer(1,2), array1.frontPiece(Arr.integer(1,2))));
		assertTrue(Arrays.equals(Arr.integer(1), array1.frontPiece(Arr.integer(1))));
		assertTrue(Arrays.equals(Arr.integer(1,2), array1.frontPiece(Arr.integer(1,2,3))));
	}
	
	@Test
	public void maxTriple(){
		assertEquals(3, array1.maxTriple(Arr.integer(1,2,3)));
		assertEquals(5, array1.maxTriple(Arr.integer(1,5,3)));
		assertEquals(6, array1.maxTriple(Arr.integer(6,6,6)));
	}
	
	
	@Test
	public void midThree(){
		assertTrue(Arrays.equals(Arr.integer(1,2,3), array1.midThree(Arr.integer(1,2,3))));
		assertTrue(Arrays.equals(Arr.integer(2,3,4), array1.midThree(Arr.integer(1,2,3,4,5))));
		assertTrue(Arrays.equals(Arr.integer(7,5,3), array1.midThree(Arr.integer(8,6,7,5,3,0,9))));
	}
	
	@Test
	public void biggerTwo(){
		assertTrue(Arrays.equals(Arr.integer(3,4), array1.biggerTwo(Arr.integer(1,2),Arr.integer(3,4))));
		assertTrue(Arrays.equals(Arr.integer(3,4), array1.biggerTwo(Arr.integer(3,4),Arr.integer(1,2))));
		assertTrue(Arrays.equals(Arr.integer(1,2), array1.biggerTwo(Arr.integer(1,1),Arr.integer(1,2))));
	}
	
	
	@Ignore
	@Test
	public void start1(){
		assertEquals(2, array1.start1(Arr.integer(1,2,3),Arr.integer(1,3)));
		assertEquals(1, array1.start1(Arr.integer(7,2,3),Arr.integer(1)));
		assertEquals(1, array1.start1(Arr.integer(1,2),Arr.integer()));
	}
	
	@Test
	public void double23(){
		int[] a= {2,2};
		int[] b= {2,3};
		
		assertEquals(true, array1.double23(a));
		assertEquals(false, array1.double23(b));
	}
	
	@Test
	public void makeLast(){
		int[] a = {0, 0, 0, 0, 0, 6};
		int[] b = {4, 5, 6};
		assertTrue(Arrays.equals(a, array1.makeLast(b)));
	}
	
	
	@Test
	public void no23(){
		int[] a = {2, 5};
		int[] b = {5, 2};
		assertEquals(false, array1.no23(a));
		assertEquals(false, array1.no23(b));
		assertEquals(true, array1.no23(nums7));
	}
	
	@Test
	public void has23(){
		int[] a = {2, 5};
		int[] b = {5, 2};
		assertEquals(true, array1.has23(a));
		assertEquals(true, array1.has23(b));
		assertEquals(false, array1.has23(nums7));
	}


	
	@Test
	public void makeEnds(){
		int[] a = {1, 3};
		assertTrue(Arrays.equals(a, array1.makeEnds(num0)));
	}
	
	
	
	@Test
	public void middleWay(){
		int[] answr = {2, 5};
		int[] b ={4, 5, 6};
		
		assertTrue(Arrays.equals(answr, array1.middleWay(num0, b)));
	}
	
	
	@Test
	public void sum2(){
		assertEquals(3, array1.sum2(num0));
		assertEquals(0, array1.sum2(nums4));
	}
	
	
	@Test
	public void maxEnd3(){
		int[] a = {3, 3, 3};
		assertTrue(Arrays.equals(a, array1.maxEnd3(num0)));
		
		int[] t113 = {2, 11, 3};
		int[] eee = {3, 3, 3};
		assertTrue(Arrays.equals(eee, array1.maxEnd3(t113)));
	}
	
	@Test
	public void reverse3(){
		int[] a = {3, 2, 1};
		int[] b = {9, 11, 5};
		
		assertTrue(Arrays.equals(a, array1.reverse3(num0)));
		assertTrue(Arrays.equals(b, array1.reverse3(f119)));
	}
	
	@Test
	public void rotateLeft3(){
		int[] t31 = {2, 3, 1};
		int[] e95 = {11, 9, 5};
		assertTrue(Arrays.equals(t31, array1.rotateLeft3(num0)));
		assertTrue(Arrays.equals(e95, array1.rotateLeft3(f119)));
		
	}
	
	@Test
	public void sum3(){
		int[] f12 = {5, 11, 12};
		int[] s00 = {7, 0, 0};
		assertEquals(6, array1.sum3(num0));
		assertEquals(28, array1.sum3(f12));
		assertEquals(7, array1.sum3(s00));
	}
	
	@Test
	public void commonEnd(){
		assertEquals(true, array1.commonEnd(num0, numA));
		assertEquals(false, array1.commonEnd(num0, numB));
		assertEquals(true, array1.commonEnd(num0, nums));
	}
	
	
	@Test
	public void makePi(){
		assertTrue(Arrays.equals(myPi, array1.makePi()));
	}
	
	@Test
	public void sameFirstLast(){
		
		assertEquals(false, array1.sameFirstLast(nums4));
		assertEquals(true, array1.sameFirstLast(nums6));
		
		assertEquals(true, array1.sameFirstLast(nums5));
		
		assertEquals(true, array1.sameFirstLast(nums7));
	}
	
	@Test
	public void firstLast6() {
		
		assertEquals(true, array1.firstLast6(nums));
		assertEquals(true, array1.firstLast6(nums2));
		assertEquals(false, array1.firstLast6(nums3));
		assertEquals(false, array1.firstLast6(nums4));
		assertEquals(true, array1.firstLast6(nums5));
	}

}
