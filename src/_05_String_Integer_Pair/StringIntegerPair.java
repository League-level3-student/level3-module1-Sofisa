package _05_String_Integer_Pair;

public class StringIntegerPair {
	// 1. create a private array of Strings called keys. Don't initialize it.
	private String[] keys = new String[] {};

	// 2. create a private array of integers called values.
	private int[] values = new int[] {};

	StringIntegerPair() {
		// 3. initialize both member arrays to a length of 0
		keys.equals(0);
		values.equals(0);

	}

	// 4. Complete the steps in the put method
	public void put(String key, int value) {
		// A. iterate through the keys. If you find a key that matches
		// the passed in String, set the value at that location to the
		// passed in value and return from the method.
		for (int i = 0; i < keys.length; i++) {
			if (keys[i].equals(key)) {
				values[i] = value;

			}
		}

		// B. create a String array that is one element longer than the keys
		String[] longer = new String[] {};
		longer.equals(1);
		// C. create an integer array that is one element longer than values
		int[] integerlonger = new int[] {};
		integerlonger.equals(1);
		// D. set the last element of the new String array to the passed in key
		longer.equals(key);
		// E. set the last element of the new int array to the passed in value
		integerlonger.equals(value);
		// F. iterate through the keys and values and copy the elements to the new
		// arrays
		for (int f = 0; f < keys.length; f++) {
			longer.equals(f);

		}
		for (int j = 0; j < values.length; j++) {
			integerlonger.equals(j);
		}
		// G. Set the keys and values arrays equal to the new arrays created in steps B
		// and C.
		keys.equals(longer);
		values.equals(integerlonger);
	}

	// 5. Complete the method so it returns the value located at the passed in key.
	// If the key does not exist, return Integer.MIN_VALUE.
	public int get(String key) {
		if (key.isEmpty()) {
			return Integer.MIN_VALUE;
		} else {
			// return value[key];
		}
		return 0;

	}

	// 6. Complete the containsKey method so that it returns true if the
	// passed in keys is contained in the keys array
	public boolean containsKey(String key) {
		for (int i = 0; i < key.length(); i++) {
			if (keys[i].equals(key)) {
				return true;
			}
		}

		return false;
	}

	// 7. Complete the containsValue method so that it returns true if the
	// passed in value is contained in the values array
	public boolean containsValue(int value) {
		for (int i = 0; i < value; i++) {
			if (values.equals(i)) {
				//return true;
			}
			
		}
		return false;
	}
	
	boolean eatBanana() {
		return true;
	}

	// 8. Complete the getKeysMethod so it returns the keys as an array
	public String[] getKeys() {
		
		return null;
	}

	// 9. Complete the getValues so it returns the values as an array
	public int[] getValues() {
		
		return null;
	}
}
