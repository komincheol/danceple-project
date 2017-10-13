package kr.co.dbinv.eddy;

import java.io.*;

public class MyCalender {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year, mon, day, week, total;
		do {
			System.out.print("1. �⵵�� 4�ڸ��� �Է��ϼ��� <��:2016> =>");
			year = Integer.parseInt(br.readLine());
		} while (year < 1);
		do {
			System.out.print("2. ���� �Է��ϼ��� <��:12> =>");
			mon = Integer.parseInt(br.readLine());
		} while (mon < 1 || mon > 12);
		day = 31;
		if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			day = 30;
		}
		if (mon == 2) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) { // ����
																				// ���ϱ�
				day = 29;
			} else
				day = 28;
		}
		int n = 0;
		total = (year - 1) * 365 + ((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400); // ������
																								// ����
		for (int i = 1; i < mon; i++) {
			n = 31;
			if (i == 4 || i == 6 || i == 9 || i == 11)
				n = 30;
			if (i == 2) {
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					n = 29;
				} else {
					n = 28;
				}
			}

			total += n;

		}

		total += 1;

		week = total % 7;

		System.out.printf("\n\t\t%d�� %d��\n", year, mon);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("==================================================");
		for (int i = 0; i < week; i++)
			System.out.print("\t");

		week--;
		for (int i = 1; i <= day; i++) {
			if (++week % 7 == 0 && week != 0) {
				System.out.println();
			}
			System.out.print(i + "\t");

		}

	}
}