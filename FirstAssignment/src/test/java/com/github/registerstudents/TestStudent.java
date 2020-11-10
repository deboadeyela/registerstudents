/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.registerstudents;

/**
 *
 * @author gbadebo
 */

import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestStudent {
	@Test
	public void TestUsername() {
		LocalDate birth = new LocalDate(1998, 05, 11);
		Student student = new Student("Mike Biggs", 22, birth, 13300821);
		assertEquals("Mike Biggs22", student.getUsername());
	}
}

