/*    */ package dictionary.program;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public class DataStructure
/*    */   implements Serializable
/*    */ {
/*    */   private String Word;
/*    */   private String Definition;
/*    */   private String Example;
/*    */   private String Pronunciation;
/*    */   
/*    */   public DataStructure()
/*    */   {
/* 31 */     this.Word = "";
/* 32 */     this.Definition = "";
/* 33 */     this.Example = "";
/* 34 */     this.Pronunciation = "";
/*    */   }
/*    */   
/*    */   public DataStructure(String WD, String DEF, String EG, String SFX)
/*    */   {
/* 39 */     this.Word = WD;
/* 40 */     this.Definition = DEF;
/* 41 */     this.Example = EG;
/* 42 */     this.Pronunciation = SFX;
/*    */   }
/*    */   
/*    */   public void setWD(String WD)
/*    */   {
/* 47 */     this.Word = WD;
/*    */   }
/*    */   
/*    */   public void setDEF(String DEF)
/*    */   {
/* 52 */     this.Definition = DEF;
/*    */   }
/*    */   
/*    */   public void setEG(String EG)
/*    */   {
/* 57 */     this.Example = EG;
/*    */   }
/*    */   
/*    */   public void setSFX(String SFX)
/*    */   {
/* 62 */     this.Pronunciation = SFX;
/*    */   }
/*    */   
/*    */   public String getWD()
/*    */   {
/* 67 */     return this.Word;
/*    */   }
/*    */   
/*    */   public String getDEF()
/*    */   {
/* 72 */     return this.Definition;
/*    */   }
/*    */   
/*    */   public String getEG()
/*    */   {
/* 77 */     return this.Example;
/*    */   }
/*    */   
/*    */   public String getSFX()
/*    */   {
/* 82 */     return this.Pronunciation;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public String displayRecord()
/*    */   {
/* 89 */     return this.Word + "\n" + this.Definition + "\n" + "Example: " + this.Example;
/*    */   }
/*    */ }


/* Location:              C:\Users\Kaiwen\Desktop\Dictionary\Dictionary_Program.jar!\dictionary\program\DataStructure.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */