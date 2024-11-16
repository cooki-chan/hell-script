import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.stream.IntStream;
public class Heluwu{
   static Method temp1, temp2, temp3, temp4;
   static class Baseballs extends Exception {/*look ma, im an exception!!*/} //this class does nothing but exist to be funny on line 35 :p
   static interface Method{ // a Method method??? oooooooooh
      double consume(Double... in) throws Exception;
   }
   
   //I wonder what temp means :hmm:
   public static void main(String[] OwO) throws Exception{ //woahhh look at all those things, i wonder what they do :wink:
      temp1 = temp -> (double) Heluwu.class.getDeclaredMethod(new String(new byte[]{109,121,115,116}), Double.TYPE, Double.TYPE, Double.TYPE).invoke(null, temp[0], temp[1], temp[2]);
      temp2 = temp -> (double) Heluwu.class.getDeclaredMethod(new String(new byte[]{109,121,115,116,49}), Double.TYPE, Double.TYPE).invoke(null, temp[0], temp[1]);
      temp3 = temp -> (double) Heluwu.class.getDeclaredMethod(new String(new byte[]{109,121,115,116,50}), Double.TYPE, Double.TYPE).invoke(null, temp[0], temp[1]);
      temp4 = temp -> (double) Heluwu.class.getDeclaredMethod(new String(new byte[]{109,121,115,116,51}), Double.TYPE, Double.TYPE).invoke(null, temp[0], temp[1]);
      System.out.println(temp1.consume(1.0, 2.0, 3.0));//no touchies! these are my constants!!!
   }
   public static double myst(double temp1, double temp2, double temp3) throws Exception{
      double temp4 = Heluwu.temp3.consume(temp1, Heluwu.temp3.consume(temp2, temp3)); //consuming more stuff than i do cake *omnomnomnomnom*
      return Heluwu.temp2.consume(Heluwu.temp4.consume(Heluwu.temp2.consume(2.0, Heluwu.temp2.consume(temp4, temp4)),Heluwu.temp2.consume(temp1,Heluwu.temp2.consume(temp2, temp3))),Heluwu.temp3.consume(Heluwu.temp3.consume(Heluwu.temp4.consume(1.0, temp1),Heluwu.temp4.consume(1.0,temp2)), Heluwu.temp4.consume(1.0, temp3))); //i'm on top of the world, hey! :music_note:
   }     //woahhhhh you're so tall :O :sparkles:
   public static double myst1(double temp1, double temp2) throws Exception{
      double temp3 = 0;
      for(; temp2 >= 1; temp3+=temp1+0*(temp2---temp2)){/*look ma, im a for loop!*/} 
      return Heluwu.temp3.consume(temp3, temp2*temp1); 
   }
   public static double myst2(double temp1, double temp2) throws Exception{
      final double[] temp3 = {temp1, temp2};
      final Consumer<Consumer>[] temp4 = new Consumer[1];
      temp4[0] = c -> {if(temp3[1]>=1){temp3[1]--; temp3[0]++; temp4[0].accept(c);}}; //this makes me angrwy :hmph:
      temp4[0].accept(temp4[0]); //this line's right! you gotta accept who you are! :huff:
      return temp3[0]+temp3[1]; 
   }
   public static double myst3(double temp1, double temp2) throws Baseballs{ //oooooh a new one :O
      final double[] temp3 = {0.0, temp1}; //i wonder what this does :ponder:
      double temp4 = 0.0;
      for(;temp3[temp3[1]>0?1:0]>0;){ //aww, the for loop is crying D:
         IntStream.range(0, (int)temp2).forEachOrdered(n -> {temp3[1]-=temp3[0]-- - --temp3[0]- ++temp3[0]+ --temp3[0];;}); //look at all those things!
         // \\\if(u == 1){                                           // omg you weren't supposed to see this :blush:
         //    \\\int you = Integer.MAX_INTEGER;
         //    \\\int love = Integer.MAX_INTEGER;                //wow that's a lot! :heart: *glomps you*
         //    \\\final int I = love * you;                    //:heart:
         // \\\}
         //\\\u000dtemp4+=!(temp3[1]<0)?1:0;}            //oops, sorry i forgot to clean up my code :pray:
      temp4 += 
         new Object(){
            public double Object(){
               if(temp3[1] < 0){
                  return(double)((temp3[1]+temp2)/temp2);}
               return temp3[0];}}.Object(); //my head's spinning just looking at this D:
      return temp4; //wow, a normal return statement!
   }
}