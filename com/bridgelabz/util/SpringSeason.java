/***************************************************************************
* Purpose : Spring Season
*
*@author : Tauqueer ansari
*@version : 1.0
*@since : 09-08-2017
****************************************************************************/


class SpringSeason {
	
	public static void main(String args[]) { 

		//Taking Input at the time of runtime	
	
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		
		//display true if condition is true otherwise false

		boolean IsSpringSeason = ( m == 3 && d>=20 && d<=31 ) || ( m == 4 && d>=1 && d<=30 )||( m == 5 && d>=1 && d<=31 ) || ( m == 6 && d>=1 && d<=20 );

		System.out.println(IsSpringSeason);
	}
}
