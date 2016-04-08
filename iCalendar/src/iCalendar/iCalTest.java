package iCalendar;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class iCalTest {

	@Test
	public void test() {
		File file = new File("ical_catorze.ics");
		assertTrue(file.exists());

		}
	@Test
	public void test2() throws FileNotFoundException {
		File file = new File("ical_catorze.ics");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		String content = "";
		try {
			while((line=br.readLine()) != null){
				content += line;
			}
			assertTrue(content.contains("VERSION:2.0"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	}
	

