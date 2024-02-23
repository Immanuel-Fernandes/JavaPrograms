class Box 
{
	private double width;
	private double height;
	private double depth;

	// construct clone of an object
	Box(Box ob) 
	{ 
		// pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	Box(double w, double h, double d) 
	{
		width = w;
		height = h;
		depth = d;
	}

	Box() 
	{
		width = -1; 
		height = -1; 
		depth = -1; 
	}

	
	Box(double len) 
	{
		width = height = depth = len;
	}


	double volume() 
	{
		return width * height * depth;
	}
}

class BoxWeight extends Box 
{
	double weight; 

	BoxWeight (BoxWeight ob) 
	{ 
		super(ob);
		weight = ob.weight;
	}

	BoxWeight (double w, double h, double d, double m) 
	{
		super(w, h, d); // call superclass constructor
		weight = m;
	}

	// default constructor
	BoxWeight() 
	{
	super();
	weight = -1;
	}

	// constructor used when cube is created
	BoxWeight (double len, double m) 
	{
		super (len);
		weight = m;
	}
}

class DemoSuper 
{
	public static void main (String args []) 
	{
		BoxWeight mybox1 = new BoxWeight (10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight mybox3 = new BoxWeight (); // default
		BoxWeight mycube = new BoxWeight (3, 2);
		BoxWeight myclone = new BoxWeight (mybox1) ;
		double vol;

		vol = mybox1. volume ();
		System.out.println("Volume of mybox1 is " + vol) ;
		System.out.println("Weight of myboxl is " + mybox1.weight) ;
		System.out.println () ;

		vol = mybox2.volume ();
		System.out.println("Volume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight) ;
		System.out.println();

		vol = mybox3.volume ();
		System.out.println("Volume of mybox3 is " + vol) ;
		System.out.println("Weight of mybox3 is " + mybox3.weight) ;
		System.out.println();

		vol = myclone.volume ();
		System.out.println("Volume of myclone is " + vol) ;
		System.out.println ("Weight of myclone is " + myclone.weight) ;
		System.out.println();

		vol = mycube.volume ();
		System.out.println("Volume of mycube is " + vol) ;
		System.out.println("Weight of mycube is " + mycube.weight) ;
		System.out.println ();
	}
}




/*
Output:

Volume of mybox1 is 3000.0
Weight of myboxl is 34.3

Volume of mybox2 is 24.0
Weight of mybox2 is 0.076

Volume of mybox3 is -1.0
Weight of mybox3 is -1.0

Volume of myclone is 3000.0
Weight of myclone is 34.3

Volume of mycube is 27.0
Weight of mycube is 2.0

*/