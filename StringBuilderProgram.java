class StringBuilderProgram{  
	public static void main(String args[]){  
	StringBuilder sb=new StringBuilder("Yashashvi ");  
	System.out.println("Present String - " +sb);
	System.out.println("Default String Capacity - "+sb.capacity());

	sb.append("Thakur");
	System.out.println("Appending i.e. adding last to the String - "+sb);
	
	sb.insert(0,"Mr. ");
	System.out.println("Adding Prefix into String - "+sb);
	
	sb.reverse();
	System.out.println("Reverse of String - "+sb);
	}  
	}  