class Room
{
	float length;
	float breadth;
	Room(float x, float y)	// Constructor1
	{
		length = x;
		breadth = y;
	}

	Room(float x)	// Constructor2
	{
		length = breadth = x;
	}

	int area( )
	{
		return (length * breadth); //error: incompatible types: possible lossy conversion from float to int
	}
}