package com.company;

import javax.sql.rowset.JdbcRowSet;
import java.io.*;
import java.net.Inet4Address;
import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;

import static java.lang.Class.forName;

//import java.io.IOException;
public class Main {
    private static Object Connection;

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, IOException {
        //throws IOException {

		/*
	int count;
	for (count=20; count>=5;count= count-1)
	    System.out.println("znachenie count = "+count);
	System.out.println("kak to tak)");

---------------------------------------------------------------------------
	int a,b,c;
	a=18;
	b=2;
	if (b!= 0 ){
		System.out.println(" >>  b ne ravno 0 ");
		c= a/b;
		System.out.println(" >>  a delenoe na b ravno  "+c);
		for (c=c;c<=10;c++)

	     System.out.println(+c);

-------------------------------------------------------------------------
		int galon, counter=0;
		double liters;

		for (galon = 1; galon <= 100; galon++) {
			liters = galon * 3.7854;
			System.out.println(" " + galon + " galonam sootvetstvuet " + liters + " litrov");

         counter++;
         if (counter==10){
         	System.out.println();
         	counter=0;
		 }
		}
-----------------------------------------------------------------------------


int VesNaLune,VesNaZemle=75;
VesNaLune=VesNaZemle-((VesNaZemle*83)/100);
System.out.println("VesNaLune" +" = "+VesNaLune);           1fut = 12 inch


		int metr;
		int counter = 0;
		double inch;

		for (metr = 1; metr <= 24; metr++) {
			inch = metr / 39.37;
			System.out.println(" " + metr + " metram sootvetstvuet " + inch + " inch");

			counter++;
			if (counter == 10) {
				System.out.println();
				counter = 0;


			}
		}



long ci,im;
im= 5280*12;
ci= im*im*im;
System.out.println(" v odnoi kubichskoi mile soderchnsia "+ ci+" kubicheskih diuimov");


System.out.println("aethwet");
---------------------------------------------------------------------------------------



int f;
		for (f=10;f<=100;f=f+5) {
	System.out.println(f);
}
-----------------------------------------------------------------------------------
double x,y,z;
x = 3 ;
y = 4 ;
z = Math.sqrt(x*x+y*y) ;
System.out.println("Dlina gipotenuzi ravnyaetsa "+z);
-----------------------------------------------------------------------------------
Boolean b;
b=false;
System.out.println("Znachenie b = "+b);
		if (b) System.out.println("NE Vipolnyaetsa");
b=true;
System.out.println("Znachenie b= "+b);
if (b) System.out.println("Vipolnyaetsa");

System.out.println("10 bolshe 5  i eto "+ (10>5));

----------------------------------------------------------------------------------
double distance;
distance= 1100*7.2;
System.out.println("Rastoyanie sostovlyaet "+distance +" futov");

----------------------------------------------------------------------------------
		System.out.println("Pervaa stroka\nVtoraya stroka");
		System.out.println("A\tB\tC\nD\tE\tF");
----------------------------------------------------------------------------------

		double radius=4, heigh=5;
		double volume = 3.1416*radius*radius*heigh;
		System.out.println("volume = "+volume);
-----------------------------------------------------------------------------------

		int a,b;
		double c,d;
		a = 10 / 3;
		b = 10 % 3;
		c= 10.0 / 3.0;
		d= 10.0 % 3.0;
System.out.println(" "+a +" " +b +" " +c +" " +d);
------------------------------------------------------------------------------------


int i,j;
boolean b1 ,b2,b3;
i=10;
j=11;
if (i<j) {
	System.out.println(" i menshe j ");
    }
if ( i<=j) {
	System.out.println(" i menshe ily ravno j ");
    }
if (i != j ) {
	System.out.println(" i ne ravno j ");
    }
if (i==j) {
	System.out.println(" eto ne srabotaet ");
    }
if (i>=j) {
	System.out.println(" eto tozhe ne srabotaet ");
    }
if (i>j) {
	System.out.println(" eto tembolee ne srabotaet");
    }
b1=true;
b2=false;
b3= true;
if ( b1 & b2 ) {
	System.out.println(" eto ne srabotaet ");
}
if (!( b1 & b2 & b3 )) {
	System.out.println(" !(b1 & b2) = true "+ " tut est` b3");
}
	if (b1 | b2) {
		System.out.println(" b1 | b2 = true ");
	}
if (b1 ^ b2) {
	System.out.println(" b1 ^ b2 = true");
    }
-------------------------------------------------------------------------------------

int n,d,q;
n=10;
d=2;
if (d!=0 &&(n%d)==5)//% это то что после запятой, тут при делении n na d  остаток 0, поэтому все и работает
	System.out.println(d+" yavlyaetsa delitelem "+n);
//if (d!=0&(n%d)==0)
//	System.out.println(d+ " yavlyaetsa delitelem "+n);

--------------------------------------------------------------------------------------------------------------\--

long L;
double D;
L=100123258L;
D=L;
System.out.println(" D i L = " + L +" " + D);

---------------------------------------------------------------------------------------------
		double x,y;
		byte b;
		int i;
		char ch;
		x=10.0;
		y=3.0;
		i = (int) (x/y);
		System.out.println("\n\ttselochselenii\trezultat\tdelenia\t=\t"+i);
		i=100;
		b =(byte) i;
		System.out.println("\tznachenie b\t"+b);
        i= 257;
        b=(byte) i;
        System.out.println("\tznachenie b =\t"+b);
        b=88;
        ch= (char)b;
        System.out.println("\tznachenie ch =\t"+ch);


boolean p,q;
System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");
p=true; q=true;
System.out.print(p+"\t"+q+"\t");
System.out.print((p&q)+"\t"+(p|q)+"\t");
System.out.println((p^q)+"\t"+(!p));
p=true;
q=false;
System.out.print(p+"\t"+q+"\t");
System.out.print((p&q)+"\t"+(p|q)+"\t");
System.out.println((p^q)+"\t"+(!p));
p=false;
q = true;
System.out.print(p+"\t"+q+"\t");
System.out.print((p&q)+"\t"+(p|q)+"\t");
System.out.println((p^q)+"\t"+(!p));
p=false;
q=false;
System.out.print(p+"\t"+q+"\t");
System.out.print((p&q)+"\t"+(p|q)+"\t");
System.out.println((p^q)+"\t"+(!p));
------------------------------------------------------------------------

		int i;
		for(i=0;i<10;i++) {
            int sum = 10;
            sum = sum + i;

            System.out.println(" Summa =\t" + sum);
        }
-------------------------------------------------------------------------------------------------------


			throws java.io.IOException {
		char ch;
		System.out.print("Vevedita chtoniebut`i nazmite ENTER \n  ");
		ch = (char) System.in.read();
		System.out.println(" vi nazshali klavishu " + ch);
---------------------------------------------------------------------------------------------------------

			throws java.io.IOException {
				char answer, true_answer = 'c';
				System.out.println ("\t" +"Zadumana bukva ot A do Z" +"\n\t"+ "ugadai ee)");
				answer = (char) System.in.read();
				if (answer==true_answer) {
					System.out.println ("\n\t\t" +"--==KRASAVA==--");
				}
				else {
					if (answer < true_answer) {
						System.out.println("\n\t" +"blizshe k koncu");
					}
					else System.out.println("\n\t" +"blizshe k nachalu");

				}

switch (answer){
	case 'a': System.out.println("osvoil switch))");
	break;
}
		int i;
		for (i=0;i<10;i++) {
			switch (i) {
				case 0:
					System.out.println("I MENSH EDENICI");
					break;
				case 1:
					System.out.println("I MENSH DVUH");
					break;
				case 2:
					System.out.println("I MENSHE TREH");
					break;
				case 3:
					System.out.println("I MENSHE CHETEREH");
					break;
				case 4:
					System.out.println("I MENSHE PIATY");
					break;
			}


		}
_________________________________________________________________________________________________
char ch1 = 'A'; char ch2='A';
		switch (ch1) {
			case 'A':
				System.out.println(" razdel A vneshnego operatora ");
				switch (ch2) {
					case 'A':
						System.out.println(" razdel B vneshnego operatora");
						break;
				}
				break;
		}
________________________________________________________________________________________________

		System.out.println("\tSpravka\n\t1.if\n\t2.switch\n\tVibirite:");
		char choise;
		choise = (char) System.in.read();
switch (choise){
	case '1':System.out.println("\n\tOperator if:\n\tif_(condition)_operator;\n\telse_operator;");
	break;
	case '2' : System.out.println("\toperator switch:\n\tswitch(virazshenie){\n\tcase'constanta'" +
			"\n\tposledovatelnost operatorov\n\tbreak\n\t//...\n\t}");
	break;
	default:System.out.println("Zapros ne naiden");
}
______________________________________________________________________________________________
		int a;
		for (a=10;a<100;a=a+10){
			System.out.println(" a= "+a);
			switch (a){
				case 80:
					System.out.println("\t\tOPA...CHA "+a);
			}
		}
_____________________________________________________________________________________________________



double num;
		double sroot;
		double rerr;
for (num=1.0;num<100.0;num++){
	sroot=Math.sqrt(num);
	System.out.print("Koren kvadratnii iz "+num +" raven "+sroot);
rerr=num-(sroot*sroot);
System.out.print("\t\toshibka okruglenia " + rerr + "\n");
}
__________________________________________________________________________________

		int a,b,c,d,e,f,g;
		b=2; c=3; d=4; e=5; f=6; g=7;
		for (a=1;a<10;a++)
		{
			System.out.println( a+ " * " +b + " = " +a*b +"\t\t "+a+" * "+c +" = " +a*c+
					"\t\t"+a+" * "+d+ " = "+a*d+"\t\t"+a+" * "+e+" = "+a*e+"\t\t"+a+" * "+f+" = "+a*f+
					"\t\t"+a+" * "+g+" = "+a*g);
			}
______________________________________________________________________________________________________________

		int i;
		char S;
		System.out.println("dlya ostanovki nazshmite S");
		for (i=0;(char)System.in.read()!='S';i=i+1) {
			System.out.println("prohodite#"+i);

		}


		char ch;
		do{
			System.out.println("nazshmite nuzshnuyu klavish a zatem 'enter'");
			ch =(char)System.in.read();
		}
		while (ch!='q');

		char ch, ignore, answer = 's';
		do {
			System.out.println("Zadumana bukva ot a do z ugadai ee " + "\tpopitaites ee ugadat`");
			ch = (char) System.in.read();
		//	do {
		//		ignore = (char) System.in.read();
		//	} while (ignore != '\n');
			if (ch == answer) System.out.println("   pravilno!!!   ");
			else {
				System.out.println("izvinite, nuzshnaya bukva nahoditsa");
				if (ch < answer) {
					System.out.println("blizsh k koncu");
				} else {
					System.out.println("blizsh k nachalu alfavita" + "\npovtorite popitku");
				}

			}


		}
		while (answer != ch);


		char choise,ignore;
		do {
			System.out.println("\tSpravka\n\t1.if\n\t2.switch\n\t3.fore\n\t4.while\n\t5.do-while\n\tVibirite:");
			choise = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			}
			while (ignore != '\n');
		}
		while (choise<'1'|choise>'5');
			switch (choise){
			case '1' : System.out.println("\n\tOperator 'if':\n\tif_(condition)_operator;\n\telse_operator;");
				break;
			case '2' : System.out.println("\toperator 'switch':\n\tswitch(virazshenie){\n\tcase'constanta'" +
					"\n\tposledovatelnost operatorov\n\tbreak\n\t//...\n\t}");
				break;
				case '3' : System.out.println("\toperator 'for':\n\tfor(inicializacia;uslovie;interacia;)\n\t'operator'");
				break;
				case  '4': System.out.println("\toperator 'while'\n\twhile(uslovie) operator;");
				break;
				case '5' : System.out.println("operator 'do-while'\n\t'do{...'\n\t}while(uslovie);");
				break;
			//default:System.out.println("Zapros ne naiden");
			}

		char ch;
		for (; ; ) {
			ch = (char) System.in.read();
if (ch=='q')break;
		}
System.out.println("vi nazshali q");

//
//		 */
//	int i;
//	for (i=1;i<4;i++){
//		one:{
//		two:{
//			three:{
//			System.out.println(" ");
//			}
//		}
//		}
//	}
//
//		System.out.println(SIR.q);
//int t = SIR.q+1;
//		System.out.println(t);
//if (t>5){
//	SIR.q++;
//
//        String userName = "root";
//        String password = "12341234";
//        String connectionUrl = "jdbs:mysql://localhost:3306/test34";
//Class.forName("com.mysql.jdbc.Driver");
//        try {
//            Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
//			Statement statement = connection.createStatement();
//			statement.executeUpdate("create table SecondTestJava(id int)");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
//
//
        String FilePath = "D:\\Catalog";
        String fileName = "List.txt";
        File file = new File(FilePath, fileName);
//        file.createNewFile();
//        FileWriter writer = new FileWriter(file);
//        writer.write("qwerty");
//        writer.close();
//		FileReader reader = new FileReader(file);
//		char[] a = new char[200];
//		reader.read(a);
////		for (int i =0; i<a.length;i++){
//		System.out.println(a[3]);
//			reader.close();
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        ArrayList<String> List = new ArrayList<String>();
//        String line;
//        while ((line = bufferedReader.readLine()) != null)
////            List.add(bufferedReader.readLine());
//            System.out.println(bufferedReader.readLine());
//

        //   bufferedReader.close();

//        try {
//            // The newInstance() call is a work around for some
//            // broken Java implementations
//
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//        } catch (Exception ex) {
//
//        }

//        Connection conn = null;
//        try {
//            conn =
//                    DriverManager.getConnection("jdbc:mysql://localhost/test34"+"user=root&password=12341234");
//
//            // Do something with the Connection
//
//        } catch (SQLException ex) {
//            // handle any errors
//            System.out.println("SQLException: " + ex.getMessage());
//            System.out.println("SQLState: " + ex.getSQLState());
//            System.out.println("VendorError: " + ex.getErrorCode());
//        }
System.out.println(Inet4Address.getByName("www.google.com.ua").getHostAddress());
        System.out.printf("text");
    }
//
//    static Inet4Address getLocalHost() {
//        return null;
//    }
}








