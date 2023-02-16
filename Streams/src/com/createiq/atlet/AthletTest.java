package com.createiq.atlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class AthletTest {
	public static void main(String[] args) throws Exception {
		Chess c1 = new Chess("Babu", "india", 2, 1996, 157.1, 56);
		Chess c2 = new Chess("murali", "india", 2, 1995, 160, 54);
		Chess c3 = new Chess("madhu", "japan", 1, 1993, 150.2, 60);
		Chess c4 = new Chess("karthik", "ukrain", 2, 1995, 149.5, 58);

		Cricket k1 = new Cricket("mahesh", "india", 1, 1996, 156.2, 56);
		Cricket k2 = new Cricket("mohan", "japan", 1, 1899, 155.0, 60);
		Cricket k3 = new Cricket("hari", "ukrian", 2, 1990, 149.5, 50);

		File fc = new File("E:\\streams\\InputOutPutStreams\\chess9.txt");
		FileWriter fw = new FileWriter(fc);
		BufferedWriter rd = new BufferedWriter(fw);
		Chess[] ch = { c1, c2, c3, c4 };
		for (Chess c : ch) {
			rd.write(c.toString().toCharArray());
			System.out.println(" ");

			Cricket[] kh = { k1, k2, k3 };
			for (Cricket k : kh) {
				rd.write(k.toString().toCharArray());
			}
		}
		rd.close();

	}

}
