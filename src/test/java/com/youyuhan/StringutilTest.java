package com.youyuhan;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.entity.Propety;

public class StringutilTest {

	@Test
	public void testSj() {
		for (int i = 0; i <10; i++) {
			System.out.println(Stringutil.sj(2, 5));
		}
		
	
	}

	@Test
	public void testSjj() {
		
		for (int i = 0; i <10 ; i++) {
			System.out.println(Stringutil.sjj(2, 6, 5));
		}
	}
	@Test
	public void testZf() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Stringutil.zf());
		}
	}
	
	@Test
	public void testZff() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Stringutil.zff(5));
		}
	}
	@Test
	public void testhaslan() {
		
		System.out.println(Stringutil.haslan("4"));
	}
	@Test
	public void testasla() {
		
		System.out.println(Stringutil.hasla(" "));
	}
	@Test
	public void testhz() {
		String hz = Stringutil.hz(4);
		
			System.out.println(hz);
	
	
	}
	@Test
	public void testhzz() {
		String hz = Stringutil.hzz();
		
			System.out.println(hz);
	
	
	}
	
	@Test
	public void testpropety() {
		for (int i = 0; i < 10000; i++) {
			Propety p=new Propety(Stringutil.hzz(), Stringutil.sj(0, 100), Stringutil.hz(10), new Date());
		System.out.println(p);
		}
	
	
	}

}
