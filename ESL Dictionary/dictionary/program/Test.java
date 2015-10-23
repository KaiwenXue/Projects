/*    */ package dictionary.program;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Test
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 27 */     DataStructure[] array = new DataStructure[30];
/* 28 */     int wordcount = 0;
/* 29 */     DictionaryFunctions functions = new DictionaryFunctions();
/* 30 */     wordcount = functions.ReadFromDictionary(array);
/*    */     
/* 32 */     for (int counter = 0; counter < wordcount; counter++) {
/* 33 */       System.out.println(array[counter].displayRecord() + "\n");
/*    */     }
/* 35 */     if (functions.addWord(array, "Accept", "Consent to receive (a thing offered)", "", "", wordcount)) {}
/*    */     
/*    */ 
/* 38 */     wordcount++;
/* 39 */     System.out.println("Record Added!!");
/*    */     
/* 41 */     if (functions.addWord(array, "Back", "Of or at the back of something", "", "", wordcount)) {}
/*    */     
/*    */ 
/* 44 */     wordcount++;
/* 45 */     System.out.println("Record Added!!");
/*    */     
/* 47 */     if (functions.addWord(array, "Cafeteria", "A restaurant or dining room in a school or a business", "", "", wordcount)) {}
/*    */     
/*    */ 
/* 50 */     wordcount++;
/* 51 */     System.out.println("Record Added!!");
/*    */     
/* 53 */     if (functions.addWord(array, "Date", "The day of the month or year as specified by a number", "", "", wordcount)) {}
/*    */     
/*    */ 
/* 56 */     wordcount++;
/* 57 */     System.out.println("Record Added!!");
/*    */     
/* 59 */     if (functions.addWord(array, "Early", "Happening or done before the usual or expected time", "", "", wordcount)) {}
/*    */     
/*    */ 
/* 62 */     wordcount++;
/* 63 */     System.out.println("Record Added!!");
/*    */     
/* 65 */     if (functions.addWord(array, "Factory", "A building or buildings where goods are manufactured or assembled", "", "", wordcount)) {}
/*    */     
/*    */ 
/* 68 */     wordcount++;
/* 69 */     System.out.println("Record Added!!");
/*    */     
/* 71 */     if (functions.addWord(array, "Game", "A form of play or sport", "", "", wordcount)) {}
/*    */     
/*    */ 
/* 74 */     wordcount++;
/* 75 */     System.out.println("Record Added!!");
/*    */     
/*    */ 
/*    */ 
/* 79 */     int foundIndex = functions.WordBinarySearch(array, "Zoo", wordcount);
/*    */     
/* 81 */     if (foundIndex != -1)
/*    */     {
/* 83 */       System.out.println(array[foundIndex].displayRecord());
/*    */     }
/*    */     else
/*    */     {
/* 87 */       System.out.println("Error");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Kaiwen\Desktop\Dictionary\Dictionary_Program.jar!\dictionary\program\Test.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */