import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.mii.utils.Fungsi_Perhitungan;

class TugasTest {

	Fungsi_Perhitungan tes = new Fungsi_Perhitungan();

	@SuppressWarnings("static-access")
	 @Test
	public void getFaktorialTest() {
		double exp1 = 120;
		double act1 = tes.getFaktorial(5);
		assertEquals(exp1, act1);

		double exp2 = 0;
		double act2 = tes.getFaktorial(-5);
		assertEquals(exp2, act2);

		double exp3 = 720;
		double act3 = tes.getFaktorial(6);
		assertEquals(exp3, act3);
	}

	@SuppressWarnings("static-access")
	 @Test
	public void getPerkalianTest() {
		double expected1 = 30;
		double actual1 = tes.getPerkalian(5, 6);
		assertEquals(expected1, actual1);

		double expected2 = -30;
		double actual2 = tes.getPerkalian(-5, 6);
		assertEquals(expected2, actual2);

		double expected3 = 30;
		double actual3 = tes.getPerkalian(-5, -6);
		assertEquals(expected3, actual3);
	}

	@SuppressWarnings("static-access")
	 @Test
	public void getPerpangkatanTest() {
		assertEquals(27, tes.getPerpangkatan(3, 3));

		assertEquals(0.25, tes.getPerpangkatan(2, -2));

		assertEquals(4, tes.getPerpangkatan(-2, 2));

		assertEquals(-8, tes.getPerpangkatan(-2, 3));
	}

	@SuppressWarnings("static-access")
	 @Test
	public void getPermutasiTest() {
		double actual = tes.getPermutasi(5, 3);
		assertEquals(60, actual);

		double actual2 = tes.getPermutasi(5, -3);
		assertEquals(0, actual2);

		double actual3 = tes.getPermutasi(-5, 3);
		assertEquals(0, actual3);

		double actual4 = tes.getPermutasi(-5, -3);
		assertEquals(0, actual4);
	}

	@SuppressWarnings("static-access")
	 @Test
	public void getKombinasiTest() {
		int actual = tes.getKombinasi(4, 3);
		assertEquals(4, actual);

		int actual2 = tes.getKombinasi(3, 3);
		assertEquals(1, actual2);

		int actual3 = tes.getKombinasi(3, 4);
		assertEquals(0, actual3);
	}

	@SuppressWarnings("static-access")
	@Test
	public void getFibonacciTest() {
		ArrayList<Integer> exp = new ArrayList<Integer>();
		exp.add(0);
		exp.add(1);
		exp.add(1);
		exp.add(2);
		exp.add(3);
		exp.add(5);
		exp.add(8);
		ArrayList<?> act = tes.getFibonacci2(10);
		assertEquals(exp, act);
		
		

	}

	@SuppressWarnings("static-access")
	// @Test
	public void getRandomValueTest() {
		int exp1 = 7;
		int act1 = tes.getRandomValue(7).length;
		assertEquals(exp1, act1);

		int exp2 = 9;
		int act2 = tes.getRandomValue(8).length;
		assertEquals(exp2, act2);

		int exp3 = -7;
		int act3 = tes.getRandomValue(-7).length;
		assertEquals(exp3, act3);
	}

	@SuppressWarnings("static-access")
	 //@Test
	public void getRandomValueUniqTest() {
		int exp1 = 7;
		int act1 = tes.getRandomValueUniqe(7).size();
		assertEquals(exp1, act1);

		int exp2 = 8;
		int act2 = tes.getRandomValueUniqe(-9).size();
		assertEquals(exp2, act2);

		int exp3 = -7;
		int act3 = tes.getRandomValueUniqe(-7).size();
		assertEquals(exp3, act3);
	}

	@SuppressWarnings("static-access")
	@Test
	public void tesPrima() {
		ArrayList exp = new ArrayList();
		exp.add(2);
		exp.add(3);
		exp.add(5);
		exp.add(7);
		exp.add(11);
		ArrayList act = tes.getPrima(12);
		assertEquals(exp, act);
	}

	@SuppressWarnings("static-access")
	@Test
	public void tesPecahan() {
		int[][] exp = new int[10][2];
		exp[0][0] = (100000);
		exp[0][1] = (1);
		exp[1][0] = (50000);
		exp[1][1] = (1);
		exp[2][0] = (20000);
		exp[3][0] = (10000);
		exp[4][0] = (5000);
		exp[5][0] = (2000);
		exp[6][0] = (1000);
		exp[7][0] = (500);
		exp[8][0] = (200);
		exp[9][0] = (100);
		int[][] act = tes.getPecahanUang(150000);
		assertArrayEquals(exp, act);
	}
}
