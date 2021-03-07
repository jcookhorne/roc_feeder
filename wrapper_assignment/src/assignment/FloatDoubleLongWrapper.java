package assignment;

public class FloatDoubleLongWrapper {
	// Assignment Wrapper classes -> Try the same above with Float, Double and Long
	// classes - aka just improvise and mess with float double and long

	public static void main(String[] args) {

			
			Float i1=10.6f;
			Float i2=10.4f;
			Float i3 = 10.6f;
			Double d1 = 15.64;
			Double d2 = 12.22;
			Double d3 = 88.16;
			Long l1 = -614L; 
			Long l2 = 14L;
			Long l3 = -614L;
			System.out.println("i1==i2 : "+(i1==i2));
			System.out.println("i1==i3 : "+(d1==d3)); // cannot use separate value types or classes
			
			System.out.println("(i1.equals(d2)) : "+(i1.equals(d2))); // can use separate types by they are unrelated
			System.out.println("(i1.equals(i3)) : "+(i1.equals(l3)));
			System.out.println("(i2.equals(i3)) : "+(i2.equals(i3)));
			
			System.out.println(System.identityHashCode(i1)); // Hashcodes useful for maps
			System.out.println(System.identityHashCode(d2));
			System.out.println(System.identityHashCode(l3));
			
			System.out.println("(l2.equals(l3)) : "+(l1.equals(l3)));
			System.out.println("(d2.equals(d3)) : "+(d2.equals(d3)));
			Long x=l2;   //auto boxing -> obj to primitive
			System.out.println("x = "+x);
			x=756L;
			l2=x; 
			System.out.println("i2 = "+i2);
			
			System.out.println(Float.MAX_VALUE);
			System.out.println(Double.MIN_VALUE);
			System.out.println(Long.MIN_VALUE);
			
			
			String s="ABC, 123, DO RE MI";
		//	Double d=Double.parseDouble(s);
			System.out.println(s);
			
			
			Float f=d2.floatValue();  //double long etc
			System.out.println("f = "+f);
			
			Long g =i2.longValue(); // will lose its decimal place
			System.out.println(g);
			
			Double D = i2.doubleValue(); 
			System.out.println(D);
			
			f=22.333f;
			float m=f.intValue(); // changes the float to a different value type
			System.out.println("m = "+m);
			D=87.33;
			double k=D.longValue();// changes to long value?
			System.out.print(k);
		/*	
			Integer x1=19;
			System.out.println(x1.compareTo(19)); //both are same so it will give 0
			System.out.println(x1.compareTo(22)); //2nd value is greater then the first so it will give -ve value here
			System.out.println(x1.compareTo(10)); //1st value is greater then the second so it will give +ve value here
			*/
			
		}

	

		
		
		
		
		
		
		
		
	}

