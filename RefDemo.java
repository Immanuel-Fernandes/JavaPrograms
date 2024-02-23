class RefDemo 
{
	public static void main (String args[]) 
	{
		BoxWeight weightbox = new BoxWeight (3, 5, 7,8.37);
		Box plainbox = new Box ();
		double vol;

		vol = weightbox.volume ();
		System.out.println("Volume of weightbox is " + vol) ;
		System.out.println("Weight of weightbox is " + weightbox.weight) ;
		System.out.println ();

		plainbox = weightbox;

		vol = plainbox.volume(); 
		System.out.println("Volume of plainbox is " + vol);

		System.out.println("Weight of plainbox is " + plainbox.weight); // Error: Does not define a weight member
	}
}




/*
Output:

RefDemo.java:19: error: cannot find symbol
                System.out.println("Weight of plainbox is " + plainbox.weight);
                                                                      ^
  symbol:   variable weight
  location: variable plainbox of type Box
1 error

*/