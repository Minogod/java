
public class Array_test {

	public static void main(String[] args) {
		int[] intArray = {1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1011,1012,1013,1014,1015,1016,1017,1018,1019,1020,1021,1022,1023,1024,1025,1026,1027,1028,1029,1030};
		String[] remainders = {"Zero","One","Two","Three"};
		for (int i:intArray) {
			System.out.println(remainders[i%4]);
		}
	}

}
