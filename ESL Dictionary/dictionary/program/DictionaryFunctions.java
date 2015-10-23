/*     */ package dictionary.program;
/*     */ 
/*     */ import java.io.EOFException;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.io.ObjectOutputStream;
/*     */ import javax.swing.DefaultListModel;
/*     */ import javax.swing.JOptionPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DictionaryFunctions
/*     */ {
/*     */   public int WordBinarySearch(DataStructure[] array, String searchKey, int count)
/*     */   {
/*  44 */     int foundIndex = -1;
/*     */     
/*  46 */     int low = 0;
/*  47 */     int high = count - 1;
/*  48 */     int middle = (high + low) / 2;
/*     */     
/*     */     do
/*     */     {
/*  52 */       if (searchKey.equalsIgnoreCase(array[middle].getWD()))
/*     */       {
/*  54 */         foundIndex = middle;
/*  55 */       } else if (searchKey.compareToIgnoreCase(array[middle].getWD()) < 0)
/*     */       {
/*  57 */         high = middle - 1;
/*     */       }
/*     */       else {
/*  60 */         low = middle + 1;
/*     */       }
/*     */       
/*  63 */       middle = (high + low) / 2;
/*     */     }
/*  65 */     while ((low <= high) && (foundIndex == -1));
/*     */     
/*  67 */     return foundIndex;
/*     */   }
/*     */   
/*     */   public void bubbleSortWord(DataStructure[] array, int count)
/*     */   {
/*  72 */     int outer = count;
/*     */     boolean changeMade;
/*     */     do
/*     */     {
/*  76 */       changeMade = false;
/*  77 */       for (int inner = 1; inner < outer; inner++)
/*     */       {
/*  79 */         if ((array[(inner - 1)].getWD().compareToIgnoreCase(array[inner].getWD()) > 0) || ((array[(inner - 1)].getWD().equalsIgnoreCase(array[inner].getWD())) && (array[(inner - 1)].getWD().compareToIgnoreCase(array[inner].getWD()) > 0)))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */           swap(array, inner - 1, inner);
/*  86 */           changeMade = true;
/*     */         }
/*     */       }
/*  89 */       outer--;
/*  90 */     } while ((outer > 1) && (changeMade));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean addWord(DataStructure[] array, String WD, String DEF, String EG, String SFX, int count)
/*     */   {
/*  97 */     boolean result = false;
/*     */     
/*  99 */     bubbleSortWord(array, count);
/* 100 */     int searchResult = WordBinarySearch(array, WD, count);
/*     */     
/*     */ 
/*     */ 
/* 104 */     if (searchResult != -1)
/*     */     {
/* 106 */       JOptionPane.showMessageDialog(null, "This word is already in the dictionary!!", "Duplication Error", 0);
/*     */ 
/*     */ 
/*     */     }
/* 110 */     else if (count < array.length)
/*     */     {
/* 112 */       array[count] = new DataStructure(WD, DEF, EG, SFX);
/*     */       
/*     */ 
/* 115 */       result = true;
/*     */     }
/*     */     else {
/* 118 */       return false;
/*     */     }
/*     */     
/*     */ 
/* 122 */     return result;
/*     */   }
/*     */   
/*     */ 
/*     */   public void swap(DataStructure[] array, int first, int second)
/*     */   {
/* 128 */     DataStructure temp = array[first];
/* 129 */     array[first] = array[second];
/* 130 */     array[second] = temp;
/*     */   }
/*     */   
/*     */   public boolean SaveToDictionary(DataStructure[] array, int count)
/*     */   {
/* 135 */     boolean Complete = false;
/*     */     
/* 137 */     File fileName = new File("newwords.dat");
/*     */     
/*     */ 
/*     */     try
/*     */     {
/* 142 */       ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
/*     */       
/*     */ 
/* 145 */       for (int counter = 0; counter < count; counter++)
/*     */       {
/* 147 */         output.writeObject(array[counter]);
/* 148 */         output.flush();
/*     */       }
/*     */       
/* 151 */       Complete = true;
/*     */     }
/*     */     catch (IOException io) {
/* 154 */       JOptionPane.showMessageDialog(null, "Error Saving To File!");
/* 155 */       Complete = false;
/*     */     }
/*     */     
/* 158 */     return Complete;
/*     */   }
/*     */   
/*     */   public int ReadFromDictionary(DataStructure[] array)
/*     */   {
/* 163 */     int wordcount = 0;
/* 164 */     File fileName = new File("newwords.dat");
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 170 */       ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
/*     */       
/*     */ 
/* 173 */       for (int counter = 0; counter < array.length; counter++)
/*     */       {
/*     */         try
/*     */         {
/*     */ 
/* 178 */           array[counter] = ((DataStructure)input.readObject());
/*     */         }
/*     */         catch (EOFException eof) {
/* 181 */           wordcount = counter;
/*     */           
/* 183 */           break;
/*     */         }
/*     */         catch (ClassNotFoundException cnfe)
/*     */         {
/* 187 */           JOptionPane.showMessageDialog(null, "Data Type Error!");
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (IOException io) {
/* 192 */       JOptionPane.showMessageDialog(null, "Error Reading From File!");
/*     */     }
/*     */     
/* 195 */     return wordcount;
/*     */   }
/*     */   
/*     */   public DefaultListModel ListOfWords(DataStructure[] dictionary, int wordcount)
/*     */   {
/* 200 */     DefaultListModel list = new DefaultListModel();
/*     */     
/* 202 */     list.clear();
/*     */     
/* 204 */     for (int count = 0; count < wordcount; count++)
/*     */     {
/* 206 */       list.addElement(dictionary[count].getWD());
/*     */     }
/*     */     
/* 209 */     return list;
/*     */   }
/*     */   
/*     */   public boolean DeleteWord(DataStructure[] dictionary, int wordcount, String wordkey)
/*     */   {
/* 214 */     boolean result = false;
/*     */     
/* 216 */     for (int counter = 0; counter < wordcount; counter++)
/*     */     {
/* 218 */       if (dictionary[counter].getWD().equalsIgnoreCase(wordkey))
/*     */       {
/* 220 */         swap(dictionary, counter, wordcount - 1);
/* 221 */         result = true;
/*     */       }
/*     */     }
/*     */     
/* 225 */     return result;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean UpdateWords(DataStructure[] dictionary, int wordcount, String wordKey, String WD, String DEF, String EG, String SFX)
/*     */   {
/* 232 */     boolean result = false;
/*     */     
/* 234 */     for (int counter = 0; counter < wordcount; counter++)
/*     */     {
/* 236 */       if (dictionary[counter].getWD().equalsIgnoreCase(wordKey))
/*     */       {
/* 238 */         dictionary[counter] = new DataStructure(WD, DEF, EG, SFX);
/* 239 */         result = true;
/* 240 */         break;
/*     */       }
/*     */     }
/*     */     
/* 244 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\Kaiwen\Desktop\Dictionary\Dictionary_Program.jar!\dictionary\program\DictionaryFunctions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */