package com.training.collections;

	public class HashMapTest
 {
		
	private int num;
		private String data;

		public boolean equals(Object obj)
		{
			if(this == obj)
				return true;
			if((obj == null) || (obj.getClass() != this.getClass()))
				return false;
			// object must be Test at this point
			HashMapTest test = (HashMapTest)obj;
			return num == test.num &&
			(data == test.data || (data != null && data.equals(test.data)));
		}

		public int hashCode()
		{
			int hash = 7;
			hash = 31 * hash + num;
			hash = 31 * hash + (null == data ? 0 : data.hashCode());
			return hash;
		}
		public static void main(String[] args) {
			HashMapTest hmTest = new HashMapTest();
			hmTest.hashCode();
			
		}
		

	}