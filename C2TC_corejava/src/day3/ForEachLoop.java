// Source code is decompiled from a .class file using FernFlower decompiler.
package day3;

public class ForEachLoop {
   public ForEachLoop() {
   }

   public static void main(String[] args) {
      int[] a = new int[]{10, 20, 30, 40, 50};
      int[] var5 = a;
      int var4 = a.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         int i = var5[var3];
         System.out.println(i);
      }

      char[] ch = new char[]{'j', 'a', 'v', 'a'};
      char[] var6 = ch;
      int var12 = ch.length;

      for(var4 = 0; var4 < var12; ++var4) {
         char c = var6[var4];
         System.out.print(c);
      }

      System.out.println(" ");
      String[] s1 = new String[]{"Java", "programming", "learning"};
      String[] var7 = s1;
      int var13 = s1.length;

      for(var12 = 0; var12 < var13; ++var12) {
         String s = var7[var12];
         System.out.print(s + " ");
      }

   }
}
