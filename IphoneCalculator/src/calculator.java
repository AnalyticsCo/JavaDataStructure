
import java.util.ArrayList;

public class calculator {
	

	public String islem(String input) {
		ArrayList<Character> islem = new ArrayList<Character>();
		islem.add('+');
		islem.add('-');
		islem.add('/');
		islem.add('*');

		int control = 0;

		if (input.indexOf(0) == '-' && Double.valueOf(input) < 0)
			return input;
		for (Character p : islem) {

			if (input.indexOf(p) != -1)
				control = 1;
		}

		if (control == 0)
			return input;

		String dummy = input;
		int indis = 0;
		String ilk = "";
		String ikinci = "";
		String dilk = "";
		String dikinci = "";
		int last = -1;
		int first = dummy.length();

		if (dummy.indexOf('*') != -1) {
			indis = dummy.indexOf('*');
			ilk = dummy.substring(0, indis);
			ikinci = dummy.substring(indis + 1);
			for (Character p : islem) {
				if (ilk.lastIndexOf(p) > last && ilk.lastIndexOf(p) != -1) {
					last = ilk.lastIndexOf(p);
				}
				if (ikinci.indexOf(p) < first && ikinci.indexOf(p) != -1) {
					first = ikinci.indexOf(p);

				}
			}
			if (last > 0) {
				dilk = ilk.substring(0, last + 1);
				ilk = ilk.substring(last + 1);
			}
			if (first < input.length()) {
				dikinci = ikinci.substring(first);
				ikinci = ikinci.substring(0, first);

			}
			double _mat1 = Double.valueOf(ilk);
			double _mat2 = Double.valueOf(ikinci);

			if (dilk.length() != 0 && dikinci.length() != 0)
				return islem(dilk + _mat1 * _mat2 + dikinci);
			else if (dilk.length() != 0 && dikinci.length() == 0)
				return islem(dilk + _mat1 * _mat2);
			else if (dilk.length() == 0 && dikinci.length() != 0)
				return islem(_mat1 * _mat2 + dikinci);
			else
				return islem(_mat1 * _mat2 + "");

		}

		else if (dummy.indexOf('/') != -1) {
			indis = dummy.indexOf('/');
			ilk = dummy.substring(0, indis);
			ikinci = dummy.substring(indis + 1);
			for (Character p : islem) {
				if (ilk.lastIndexOf(p) > last && ilk.lastIndexOf(p) != -1) {
					last = ilk.lastIndexOf(p);
				}
				if (ikinci.indexOf(p) < first && ikinci.indexOf(p) != -1) {
					first = ikinci.indexOf(p);

				}
			}
			if (last > 0) {
				dilk = ilk.substring(0, last + 1);
				ilk = ilk.substring(last + 1);
			}
			if (first < input.length()) {
				dikinci = ikinci.substring(first);
				ikinci = ikinci.substring(0, first);

			}
			double _mat1 = Double.valueOf(ilk);
			double _mat2 = Double.valueOf(ikinci);

			if (dilk.length() != 0 && dikinci.length() != 0)
				return islem(dilk + _mat1 / _mat2 + dikinci);
			else if (dilk.length() != 0 && dikinci.length() == 0)
				return islem(dilk + _mat1 / _mat2);
			else if (dilk.length() == 0 && dikinci.length() != 0)
				return islem(_mat1 / _mat2 + dikinci);
			else
				return islem(_mat1 / _mat2 + "");
		}

		else if (dummy.indexOf('-') != -1 && dummy.indexOf('-') != 0) {
			indis = dummy.indexOf('-');
			ilk = dummy.substring(0, indis);
			ikinci = dummy.substring(indis + 1);
			for (Character p : islem) {
				if (ilk.lastIndexOf(p) > last && ilk.lastIndexOf(p) != -1) {
					last = ilk.lastIndexOf(p);
				}
				if (ikinci.indexOf(p) < first && ikinci.indexOf(p) != -1) {
					first = ikinci.indexOf(p);

				}
			}
			if (last > 0) {
				dilk = ilk.substring(0, last + 1);
				ilk = ilk.substring(last + 1);
			}
			if (first < input.length()) {
				dikinci = ikinci.substring(first);
				ikinci = ikinci.substring(0, first);

			}
			double _mat1 = Double.valueOf(ilk);
			double _mat2 = Double.valueOf(ikinci);
			if (dilk.length() != 0 && dikinci.length() != 0)
				return islem(dilk + (_mat1 - _mat2) + dikinci);
			else if (dilk.length() != 0 && dikinci.length() == 0)
				return islem(dilk + (_mat1 - _mat2));
			else if (dilk.length() == 0 && dikinci.length() != 0)
				return islem(_mat1 - _mat2 + dikinci);
			else
				return islem(_mat1 - _mat2 + "");
		} else if (dummy.indexOf('+') != -1) {
			indis = dummy.indexOf('+');
			ilk = dummy.substring(0, indis);
			ikinci = dummy.substring(indis + 1);
			for (Character p : islem) {
				if (ilk.lastIndexOf(p) > last && ilk.lastIndexOf(p) != -1) {
					last = ilk.lastIndexOf(p);
				}
				if (ikinci.indexOf(p) < first && ikinci.indexOf(p) != -1) {
					first = ikinci.indexOf(p);

				}
			}
			if (last > 0) {
				dilk = ilk.substring(0, last + 1);
				ilk = ilk.substring(last + 1);
			}
			if (first < input.length()) {
				dikinci = ikinci.substring(first);
				ikinci = ikinci.substring(0, first);

			}
			double _mat1 = Double.valueOf(ilk);
			double _mat2 = Double.valueOf(ikinci);

			if (dilk.length() != 0 && dikinci.length() != 0)
				return islem(dilk + _mat1 + _mat2 + dikinci);
			else if (dilk.length() != 0 && dikinci.length() == 0)
				return islem(dilk + _mat1 + _mat2);
			else if (dilk.length() == 0 && dikinci.length() != 0)
				return islem(_mat1 + _mat2 + dikinci);
			else
				return islem(_mat1 + _mat2 + "");
		} else
			return input;
	}

	public String calculation(String input) {

		/// if the string is syntacticall acceptable

		int left_p = -1;
		int right_p = -1;
		int imlec = 0;
		String dummy = input;
		ArrayList<Character> islem = new ArrayList<Character>();
		islem.add('+');
		islem.add('-');
		islem.add('/');
		islem.add('*');

		if (input.indexOf(0) == '-' && Double.valueOf(input) < 0)
			return input;

		int control = 0;

		for (Character p : islem) {

			if (input.indexOf(p) != -1)
				control = 1;
		}

		if (control == 0)
			return input;

		if (input.indexOf(')') == -1)
			return islem(input);

		right_p = input.indexOf(')');
		if (input.indexOf("(-") != -1 && input.indexOf("(-") + 1 < right_p
				&& input.substring(input.indexOf("(-") + 2, right_p).indexOf('-') == -1
				&& input.substring(input.indexOf("(-") + 2, right_p).indexOf('+') == -1
				&& input.substring(input.indexOf("(-") + 2, right_p).indexOf('/') == -1
				&& input.substring(input.indexOf("(-") + 2, right_p).indexOf('*') == -1) {
			String oylesine = input.substring(input.indexOf("(-"), right_p);

		}

		for (int i = 0; i < input.length(); i++) {

			if (input.indexOf('(', i) > left_p && input.indexOf('(', i) < right_p) {
				left_p = input.indexOf("(", i);
				System.out.println(left_p + "***********");
			}

		}
		String sonuc = islem(input.substring(left_p + 1, right_p));
		return calculation(input.substring(0, left_p) + sonuc + input.substring(right_p + 1));
	}

	public boolean faildetection(String calculation) { // if the return
		// value equals true means error detected
		
		
		
		ArrayList<Character> islem = new ArrayList<Character>();
		islem.add('+');
		islem.add('-');
		islem.add('/');
		islem.add('*');

		int left_p = 0;
int		right_p = 0;
		String dummy = calculation;

		if (dummy.indexOf(')') != -1 && dummy.indexOf(')') == dummy.indexOf('(', dummy.indexOf(')')) - 1)
			return true;

		for (int i = 0; i < dummy.length(); i++) {
			char j = dummy.charAt(i);
			if (j == '(')
				left_p += 1;
			else if (j == ')')
				right_p += 1;
			if ( i + 1 < dummy.length() && j == '(' && dummy.charAt(i + 1) == ')' )
				return true;

		}
		if (left_p != right_p)
			return true;

		for (int i = 0; i < calculation.length(); i++) {
			if (calculation.charAt(i) == '+' || calculation.charAt(i) == '/' || calculation.charAt(i) == '*'
					|| calculation.charAt(i) == '-') {
				for (Character b : islem)
					if (i+1<calculation.length() &&calculation.charAt(i + 1) == b )
						return true;
			}

		}

		for (int i = 0; i < dummy.length(); i++) {
			char a = dummy.charAt(i);


			if (a == '+' || a == '/' || a == '*' || a == '-') {
				if (i+1<calculation.length() && dummy.charAt(i) == dummy.charAt(i + 1) - 1)
					return true;
				else if (dummy.charAt(dummy.length() - 1) == a || (dummy.charAt(0) == a && dummy.charAt(0) != '-'))
					return true;
				else if (i+1<calculation.length() &&(dummy.charAt(i + 1)) == ')') {
					return true;
				} else if (i - 1 > 0 && (dummy.charAt(i - 1) == '(') ) {
					return true;
				}
			}
			if (dummy.charAt(i) == ('/')) {
				if (i+1<calculation.length() && dummy.charAt(i + 1) == 0)
					return true;
			}
			if (dummy.charAt(i) == '.') {
				if (i+1<calculation.length() && dummy.charAt(i + 1) == '.')
					return true;
			}

		}

		return false;

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println(calculation("(12*3)*2+(5*2)"));
	 * 
	 * }
	 */
}
