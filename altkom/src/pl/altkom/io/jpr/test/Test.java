package pl.altkom.io.jpr.test;

import java.io.IOException;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import pl.altkom.io.jpr.test.animals.Animal;
import pl.altkom.io.jpr.test.animals.Bat;
import pl.altkom.io.jpr.test.animals.Bird;
import pl.altkom.io.jpr.test.animals.Duck;
import pl.altkom.io.jpr.test.animals.Eagle;
import pl.altkom.io.jpr.test.animals.Flayable;
import pl.altkom.io.jpr.test.animals.FlayingFish;
import pl.altkom.io.jpr.test.animals.Kiwi;
import pl.altkom.io.jpr.test.animals.mechanizmy.EngineFly;
import pl.altkom.io.jpr.test.animals.mechanizmy.NotFly;
import pl.altkom.io.jpr.test.math.Kalkulator;
import pl.altkom.io.jpr.test.persons.Car;
import pl.altkom.io.jpr.test.persons.Person;
import pl.altkom.io.jpr.test.shop.Klawiatura;
import pl.altkom.io.jpr.test.shop.Myszka;

public class Test {

	String name;

	public static void main(String[] args) throws IOException {

		int[] tab = new int[10];

		Object[] o = new Object[10];

		o[0] = new String("");
		o[1] = new Matrix(1, 2);
		o[2] = 1;
		o[3] = 1.3;

		for (Object tmp : o) {
			System.out.println(tmp != null ? tmp.getClass() : "null");
			
		}

	}
}
