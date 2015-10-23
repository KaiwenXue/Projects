/*      */ package dictionary.program;
/*      */ 
/*      */ import javax.swing.JPanel;
/*      */ 
/*      */ public class DictionaryInterface extends javax.swing.JFrame {
/*      */   private javax.swing.JLabel AddDefLabel;
/*      */   private javax.swing.JTextArea AddDefinitionArea;
/*      */   private javax.swing.JTextArea AddExampleArea;
/*      */   private javax.swing.JLabel AddExampleLabel;
/*      */   private javax.swing.JTextArea AddWordArea;
/*      */   private javax.swing.JLabel AddWordLabel;
/*      */   private JPanel AddWordPanel;
/*      */   private javax.swing.JButton AddwordButton;
/*      */   private javax.swing.JButton BacktoStartPanel;
/*      */   private javax.swing.JButton BacktoWordList;
/*      */   private javax.swing.JButton BacktoWordlist;
/*      */   private javax.swing.JButton ChoosePronunButton;
/*      */   private javax.swing.JTextArea DefinitionArea;
/*      */   private javax.swing.JLabel DefinitionLabel;
/*      */   private javax.swing.JButton DeleteSearch;
/*      */   private javax.swing.JButton DeleteWordButton;
/*      */   private javax.swing.JTextArea ExampleArea;
/*      */   private javax.swing.JLabel ExampleLabel;
/*      */   private javax.swing.JButton ExitProgram;
/*      */   private javax.swing.JButton GotoDictionary;
/*      */   private javax.swing.JButton GotoInformation;
/*      */   private JPanel InfoPanel;
/*      */   private javax.swing.JButton PlayPronunciationButton;
/*      */   private javax.swing.JButton ResetFieldsButton;
/*      */   private javax.swing.JButton ResetUpdate;
/*      */   private javax.swing.JButton SFXButton;
/*      */   private javax.swing.JButton SearchBacktoWordslist;
/*      */   private javax.swing.JTextField SearchField;
/*      */   private javax.swing.JLabel SearchLabel;
/*      */   private JPanel SearchPanel;
/*      */   private javax.swing.JTextArea SearchResultArea;
/*      */   private javax.swing.JButton SearchWord;
/*      */   private javax.swing.JButton SearchWordSubmitButton;
/*      */   private javax.swing.JButton SearchtoDefinition;
/*      */   
/*      */   public DictionaryInterface() {
/*   42 */     initComponents();
/*      */     
/*      */ 
/*   45 */     this.StartPanel.setVisible(true);
/*   46 */     this.StartPanel.setEnabled(true);
/*   47 */     this.WordListPanel.setVisible(false);
/*   48 */     this.WordListPanel.setEnabled(false);
/*   49 */     this.InfoPanel.setVisible(false);
/*   50 */     this.InfoPanel.setEnabled(false);
/*   51 */     this.AddWordPanel.setVisible(false);
/*   52 */     this.AddWordPanel.setEnabled(false);
/*   53 */     this.UpdatePanel.setVisible(false);
/*   54 */     this.UpdatePanel.setEnabled(false);
/*   55 */     this.SearchPanel.setVisible(false);
/*   56 */     this.SearchPanel.setEnabled(false);
/*      */     
/*      */ 
/*   59 */     this.Dictionary = new DataStructure['Ǵ'];
/*   60 */     this.functions = new DictionaryFunctions();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*   65 */     this.wordcount = this.functions.ReadFromDictionary(this.Dictionary);
/*   66 */     this.sfxfilename = "";
/*      */   }
/*      */   
/*      */   private JPanel StartPanel;
/*      */   private javax.swing.JButton SubmitUpdateButton;
/*      */   private javax.swing.JButton SubmitWordButton;
/*      */   private javax.swing.JButton UpdateBacktoWords;
/*      */   private javax.swing.JTextArea UpdateDefArea;
/*      */   private javax.swing.JLabel UpdateDefLabel;
/*      */   private javax.swing.JTextArea UpdateExampleArea;
/*      */   private javax.swing.JLabel UpdateExampleLabel;
/*      */   
/*      */   private void initComponents()
/*      */   {
/*   80 */     this.WordListPanel = new JPanel();
/*   81 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*   82 */     this.WordsList = new javax.swing.JList();
/*   83 */     this.GotoInformation = new javax.swing.JButton();
/*   84 */     this.AddwordButton = new javax.swing.JButton();
/*   85 */     this.SearchWord = new javax.swing.JButton();
/*   86 */     this.DeleteWordButton = new javax.swing.JButton();
/*   87 */     this.UpdateWordButton = new javax.swing.JButton();
/*   88 */     this.BacktoStartPanel = new javax.swing.JButton();
/*   89 */     this.InfoPanel = new JPanel();
/*   90 */     this.WordLabel = new javax.swing.JLabel();
/*   91 */     this.DefinitionLabel = new javax.swing.JLabel();
/*   92 */     this.ExampleLabel = new javax.swing.JLabel();
/*   93 */     this.SFXButton = new javax.swing.JButton();
/*   94 */     this.BacktoWordList = new javax.swing.JButton();
/*   95 */     this.jScrollPane2 = new javax.swing.JScrollPane();
/*   96 */     this.WordArea = new javax.swing.JTextArea();
/*   97 */     this.jScrollPane3 = new javax.swing.JScrollPane();
/*   98 */     this.DefinitionArea = new javax.swing.JTextArea();
/*   99 */     this.jScrollPane4 = new javax.swing.JScrollPane();
/*  100 */     this.ExampleArea = new javax.swing.JTextArea();
/*  101 */     this.StartPanel = new JPanel();
/*  102 */     this.GotoDictionary = new javax.swing.JButton();
/*  103 */     this.ExitProgram = new javax.swing.JButton();
/*  104 */     this.AddWordPanel = new JPanel();
/*  105 */     this.AddWordLabel = new javax.swing.JLabel();
/*  106 */     this.AddDefLabel = new javax.swing.JLabel();
/*  107 */     this.AddExampleLabel = new javax.swing.JLabel();
/*  108 */     this.jScrollPane5 = new javax.swing.JScrollPane();
/*  109 */     this.AddWordArea = new javax.swing.JTextArea();
/*  110 */     this.jScrollPane6 = new javax.swing.JScrollPane();
/*  111 */     this.AddDefinitionArea = new javax.swing.JTextArea();
/*  112 */     this.jScrollPane7 = new javax.swing.JScrollPane();
/*  113 */     this.AddExampleArea = new javax.swing.JTextArea();
/*  114 */     this.SubmitWordButton = new javax.swing.JButton();
/*  115 */     this.ResetFieldsButton = new javax.swing.JButton();
/*  116 */     this.BacktoWordlist = new javax.swing.JButton();
/*  117 */     this.ChoosePronunButton = new javax.swing.JButton();
/*  118 */     this.PlayPronunciationButton = new javax.swing.JButton();
/*  119 */     this.UpdatePanel = new JPanel();
/*  120 */     this.UpdateWordLabel = new javax.swing.JLabel();
/*  121 */     this.UpdateDefLabel = new javax.swing.JLabel();
/*  122 */     this.UpdateExampleLabel = new javax.swing.JLabel();
/*  123 */     this.jScrollPane26 = new javax.swing.JScrollPane();
/*  124 */     this.UpdateWordArea = new javax.swing.JTextArea();
/*  125 */     this.jScrollPane27 = new javax.swing.JScrollPane();
/*  126 */     this.UpdateDefArea = new javax.swing.JTextArea();
/*  127 */     this.jScrollPane28 = new javax.swing.JScrollPane();
/*  128 */     this.UpdateExampleArea = new javax.swing.JTextArea();
/*  129 */     this.SubmitUpdateButton = new javax.swing.JButton();
/*  130 */     this.ResetUpdate = new javax.swing.JButton();
/*  131 */     this.UpdateBacktoWords = new javax.swing.JButton();
/*  132 */     this.UpdateSFXButton = new javax.swing.JButton();
/*  133 */     this.SearchPanel = new JPanel();
/*  134 */     this.SearchLabel = new javax.swing.JLabel();
/*  135 */     this.SearchField = new javax.swing.JTextField();
/*  136 */     this.UpdateSearch = new javax.swing.JButton();
/*  137 */     this.DeleteSearch = new javax.swing.JButton();
/*  138 */     this.SearchBacktoWordslist = new javax.swing.JButton();
/*  139 */     this.SearchWordSubmitButton = new javax.swing.JButton();
/*  140 */     this.jScrollPane9 = new javax.swing.JScrollPane();
/*  141 */     this.SearchResultArea = new javax.swing.JTextArea();
/*  142 */     this.SearchtoDefinition = new javax.swing.JButton();
/*      */     
/*  144 */     setDefaultCloseOperation(3);
/*  145 */     setTitle("ESL Dictionary");
/*  146 */     setResizable(false);
/*      */     
/*  148 */     this.WordListPanel.setPreferredSize(new java.awt.Dimension(750, 540));
/*      */     
/*  150 */     this.jScrollPane1.setViewportView(this.WordsList);
/*      */     
/*  152 */     this.GotoInformation.setFont(new java.awt.Font("Verdana", 1, 18));
/*  153 */     this.GotoInformation.setText("Definition and Example");
/*  154 */     this.GotoInformation.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  156 */         DictionaryInterface.this.GotoInformationActionPerformed(evt);
/*      */       }
/*      */       
/*  159 */     });
/*  160 */     this.AddwordButton.setText("Add Word");
/*  161 */     this.AddwordButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  163 */         DictionaryInterface.this.AddwordButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  166 */     });
/*  167 */     this.SearchWord.setText("Search Word");
/*  168 */     this.SearchWord.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  170 */         DictionaryInterface.this.SearchWordActionPerformed(evt);
/*      */       }
/*      */       
/*  173 */     });
/*  174 */     this.DeleteWordButton.setFont(new java.awt.Font("Tahoma", 1, 14));
/*  175 */     this.DeleteWordButton.setForeground(new java.awt.Color(255, 0, 0));
/*  176 */     this.DeleteWordButton.setText("Delete Word");
/*  177 */     this.DeleteWordButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  179 */         DictionaryInterface.this.DeleteWordButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  182 */     });
/*  183 */     this.UpdateWordButton.setText("Update Word");
/*  184 */     this.UpdateWordButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  186 */         DictionaryInterface.this.UpdateWordButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  189 */     });
/*  190 */     this.BacktoStartPanel.setFont(new java.awt.Font("Tahoma", 1, 11));
/*  191 */     this.BacktoStartPanel.setText("Back to Menu");
/*  192 */     this.BacktoStartPanel.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  194 */         DictionaryInterface.this.BacktoStartPanelActionPerformed(evt);
/*      */       }
/*      */       
/*  197 */     });
/*  198 */     javax.swing.GroupLayout WordListPanelLayout = new javax.swing.GroupLayout(this.WordListPanel);
/*  199 */     this.WordListPanel.setLayout(WordListPanelLayout);
/*  200 */     WordListPanelLayout.setHorizontalGroup(WordListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(WordListPanelLayout.createSequentialGroup().addGap(51, 51, 51).addComponent(this.jScrollPane1, -2, 293, -2).addGap(75, 75, 75).addGroup(WordListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(WordListPanelLayout.createSequentialGroup().addGroup(WordListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.SearchWord, -1, -1, 32767).addComponent(this.UpdateWordButton, -1, 133, 32767)).addGap(10, 10, 10).addGroup(WordListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(this.BacktoStartPanel, -1, -1, 32767).addComponent(this.AddwordButton, -1, -1, 32767).addComponent(this.DeleteWordButton, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767))).addComponent(this.GotoInformation)).addContainerGap(86, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  219 */     WordListPanelLayout.setVerticalGroup(WordListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(WordListPanelLayout.createSequentialGroup().addGap(56, 56, 56).addGroup(WordListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane1, -2, 441, -2).addGroup(WordListPanelLayout.createSequentialGroup().addComponent(this.GotoInformation, -2, 105, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(WordListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.DeleteWordButton, -2, 92, -2).addComponent(this.UpdateWordButton, -2, 93, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(WordListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.SearchWord, -1, 89, 32767).addComponent(this.AddwordButton, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.BacktoStartPanel, -2, 83, -2))).addContainerGap(422, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  240 */     this.WordLabel.setFont(new java.awt.Font("Verdana", 0, 18));
/*  241 */     this.WordLabel.setText("Word:");
/*      */     
/*  243 */     this.DefinitionLabel.setFont(new java.awt.Font("Verdana", 0, 18));
/*  244 */     this.DefinitionLabel.setText("Definition:");
/*      */     
/*  246 */     this.ExampleLabel.setFont(new java.awt.Font("Verdana", 0, 18));
/*  247 */     this.ExampleLabel.setText("Example Sentence: ");
/*      */     
/*  249 */     this.SFXButton.setFont(new java.awt.Font("Verdana", 0, 18));
/*  250 */     this.SFXButton.setText("Pronunciation");
/*  251 */     this.SFXButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  253 */         DictionaryInterface.this.SFXButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  256 */     });
/*  257 */     this.BacktoWordList.setText("Back to Wordlist");
/*  258 */     this.BacktoWordList.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  260 */         DictionaryInterface.this.BacktoWordListActionPerformed(evt);
/*      */       }
/*      */       
/*  263 */     });
/*  264 */     this.WordArea.setEditable(false);
/*  265 */     this.WordArea.setColumns(20);
/*  266 */     this.WordArea.setFont(new java.awt.Font("Verdana", 0, 16));
/*  267 */     this.WordArea.setLineWrap(true);
/*  268 */     this.WordArea.setRows(5);
/*  269 */     this.jScrollPane2.setViewportView(this.WordArea);
/*      */     
/*  271 */     this.DefinitionArea.setEditable(false);
/*  272 */     this.DefinitionArea.setColumns(20);
/*  273 */     this.DefinitionArea.setFont(new java.awt.Font("Verdana", 0, 16));
/*  274 */     this.DefinitionArea.setLineWrap(true);
/*  275 */     this.DefinitionArea.setRows(5);
/*  276 */     this.jScrollPane3.setViewportView(this.DefinitionArea);
/*      */     
/*  278 */     this.ExampleArea.setEditable(false);
/*  279 */     this.ExampleArea.setColumns(20);
/*  280 */     this.ExampleArea.setFont(new java.awt.Font("Verdana", 0, 16));
/*  281 */     this.ExampleArea.setLineWrap(true);
/*  282 */     this.ExampleArea.setRows(5);
/*  283 */     this.jScrollPane4.setViewportView(this.ExampleArea);
/*      */     
/*  285 */     javax.swing.GroupLayout InfoPanelLayout = new javax.swing.GroupLayout(this.InfoPanel);
/*  286 */     this.InfoPanel.setLayout(InfoPanelLayout);
/*  287 */     InfoPanelLayout.setHorizontalGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanelLayout.createSequentialGroup().addContainerGap(124, 32767).addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(InfoPanelLayout.createSequentialGroup().addComponent(this.DefinitionLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane3, -2, 398, -2)).addGroup(InfoPanelLayout.createSequentialGroup().addComponent(this.WordLabel, -2, 63, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane2, -2, 398, -2)).addGroup(InfoPanelLayout.createSequentialGroup().addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.SFXButton).addComponent(this.ExampleLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, -2, 398, -2).addComponent(this.BacktoWordList, javax.swing.GroupLayout.Alignment.TRAILING, -2, 125, -2)))).addGap(75, 75, 75)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  310 */     InfoPanelLayout.setVerticalGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(InfoPanelLayout.createSequentialGroup().addContainerGap(433, 32767).addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanelLayout.createSequentialGroup().addComponent(this.WordLabel, -2, 43, -2).addGap(37, 37, 37)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanelLayout.createSequentialGroup().addComponent(this.jScrollPane2, -2, 43, -2).addGap(26, 26, 26))).addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.DefinitionLabel, -2, 43, -2).addComponent(this.jScrollPane3, -2, 78, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.ExampleLabel, -2, 43, -2).addGroup(InfoPanelLayout.createSequentialGroup().addGap(13, 13, 13).addComponent(this.jScrollPane4, -2, 84, -2))).addGap(39, 39, 39).addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.SFXButton, -2, 96, -2).addComponent(this.BacktoWordList, -2, 96, -2)).addGap(87, 87, 87)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  337 */     this.GotoDictionary.setText("Dictionary");
/*  338 */     this.GotoDictionary.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  340 */         DictionaryInterface.this.GotoDictionaryActionPerformed(evt);
/*      */       }
/*      */       
/*  343 */     });
/*  344 */     this.ExitProgram.setText("Exit");
/*  345 */     this.ExitProgram.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  347 */         DictionaryInterface.this.ExitProgramActionPerformed(evt);
/*      */       }
/*      */       
/*  350 */     });
/*  351 */     javax.swing.GroupLayout StartPanelLayout = new javax.swing.GroupLayout(this.StartPanel);
/*  352 */     this.StartPanel.setLayout(StartPanelLayout);
/*  353 */     StartPanelLayout.setHorizontalGroup(StartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(StartPanelLayout.createSequentialGroup().addGap(193, 193, 193).addComponent(this.GotoDictionary, -2, 125, -2).addGap(103, 103, 103).addComponent(this.ExitProgram, -2, 129, -2).addContainerGap(234, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  362 */     StartPanelLayout.setVerticalGroup(StartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(StartPanelLayout.createSequentialGroup().addGap(186, 186, 186).addGroup(StartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.ExitProgram, -2, 109, -2).addComponent(this.GotoDictionary, -2, 109, -2)).addContainerGap(624, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  372 */     this.AddWordLabel.setText("Word:");
/*      */     
/*  374 */     this.AddDefLabel.setText("Definition:");
/*      */     
/*  376 */     this.AddExampleLabel.setText("Example Sentence:");
/*      */     
/*  378 */     this.AddWordArea.setColumns(20);
/*  379 */     this.AddWordArea.setRows(5);
/*  380 */     this.jScrollPane5.setViewportView(this.AddWordArea);
/*      */     
/*  382 */     this.AddDefinitionArea.setColumns(20);
/*  383 */     this.AddDefinitionArea.setRows(5);
/*  384 */     this.jScrollPane6.setViewportView(this.AddDefinitionArea);
/*      */     
/*  386 */     this.AddExampleArea.setColumns(20);
/*  387 */     this.AddExampleArea.setRows(5);
/*  388 */     this.jScrollPane7.setViewportView(this.AddExampleArea);
/*      */     
/*  390 */     this.SubmitWordButton.setFont(new java.awt.Font("Verdana", 1, 18));
/*  391 */     this.SubmitWordButton.setText("Add Word");
/*  392 */     this.SubmitWordButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  394 */         DictionaryInterface.this.SubmitWordButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  397 */     });
/*  398 */     this.ResetFieldsButton.setText("Reset Fields");
/*  399 */     this.ResetFieldsButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  401 */         DictionaryInterface.this.ResetFieldsButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  404 */     });
/*  405 */     this.BacktoWordlist.setText("Back to Wordlist");
/*  406 */     this.BacktoWordlist.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  408 */         DictionaryInterface.this.BacktoWordlistActionPerformed(evt);
/*      */       }
/*      */       
/*  411 */     });
/*  412 */     this.ChoosePronunButton.setText("Choose Pronunciation");
/*  413 */     this.ChoosePronunButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  415 */         DictionaryInterface.this.ChoosePronunButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  418 */     });
/*  419 */     this.PlayPronunciationButton.setText("Play Pronunciation");
/*  420 */     this.PlayPronunciationButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  422 */         DictionaryInterface.this.PlayPronunciationButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  425 */     });
/*  426 */     javax.swing.GroupLayout AddWordPanelLayout = new javax.swing.GroupLayout(this.AddWordPanel);
/*  427 */     this.AddWordPanel.setLayout(AddWordPanelLayout);
/*  428 */     AddWordPanelLayout.setHorizontalGroup(AddWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(AddWordPanelLayout.createSequentialGroup().addGap(122, 122, 122).addGroup(AddWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(AddWordPanelLayout.createSequentialGroup().addComponent(this.PlayPronunciationButton, -2, 137, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.ResetFieldsButton, -2, 122, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.BacktoWordlist, -2, 122, -2)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddWordPanelLayout.createSequentialGroup().addComponent(this.ChoosePronunButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.SubmitWordButton, -2, 249, -2)).addGroup(AddWordPanelLayout.createSequentialGroup().addGroup(AddWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.AddDefLabel).addComponent(this.AddExampleLabel).addComponent(this.AddWordLabel)).addGap(49, 49, 49).addGroup(AddWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane7).addComponent(this.jScrollPane5).addComponent(this.jScrollPane6, -2, 328, -2)))).addContainerGap(159, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  455 */     AddWordPanelLayout.setVerticalGroup(AddWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(AddWordPanelLayout.createSequentialGroup().addGroup(AddWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(AddWordPanelLayout.createSequentialGroup().addGap(54, 54, 54).addComponent(this.jScrollPane5, -2, 57, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddWordPanelLayout.createSequentialGroup().addContainerGap().addComponent(this.AddWordLabel).addGap(21, 21, 21))).addGroup(AddWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane6, -2, 62, -2).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddWordPanelLayout.createSequentialGroup().addComponent(this.AddDefLabel).addGap(30, 30, 30))).addGroup(AddWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(AddWordPanelLayout.createSequentialGroup().addGap(17, 17, 17).addComponent(this.AddExampleLabel).addGap(36, 36, 36)).addComponent(this.jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, -2, 56, -2)).addGap(18, 18, 18).addGroup(AddWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.SubmitWordButton, -2, 87, -2).addComponent(this.ChoosePronunButton, -2, 87, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(AddWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.BacktoWordlist, -2, 87, -2).addComponent(this.ResetFieldsButton, -2, 87, -2).addComponent(this.PlayPronunciationButton, -2, 82, -2)).addContainerGap(-1, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  490 */     this.UpdateWordLabel.setText("Word:");
/*      */     
/*  492 */     this.UpdateDefLabel.setText("Definition:");
/*      */     
/*  494 */     this.UpdateExampleLabel.setText("Example Sentence:");
/*      */     
/*  496 */     this.UpdateWordArea.setColumns(20);
/*  497 */     this.UpdateWordArea.setRows(5);
/*  498 */     this.jScrollPane26.setViewportView(this.UpdateWordArea);
/*      */     
/*  500 */     this.UpdateDefArea.setColumns(20);
/*  501 */     this.UpdateDefArea.setRows(5);
/*  502 */     this.jScrollPane27.setViewportView(this.UpdateDefArea);
/*      */     
/*  504 */     this.UpdateExampleArea.setColumns(20);
/*  505 */     this.UpdateExampleArea.setRows(5);
/*  506 */     this.jScrollPane28.setViewportView(this.UpdateExampleArea);
/*      */     
/*  508 */     this.SubmitUpdateButton.setFont(new java.awt.Font("Verdana", 1, 18));
/*  509 */     this.SubmitUpdateButton.setText("Update");
/*  510 */     this.SubmitUpdateButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  512 */         DictionaryInterface.this.SubmitUpdateButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  515 */     });
/*  516 */     this.ResetUpdate.setText("Reset Fields");
/*  517 */     this.ResetUpdate.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  519 */         DictionaryInterface.this.ResetUpdateActionPerformed(evt);
/*      */       }
/*      */       
/*  522 */     });
/*  523 */     this.UpdateBacktoWords.setText("Back to Words");
/*  524 */     this.UpdateBacktoWords.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  526 */         DictionaryInterface.this.UpdateBacktoWordsActionPerformed(evt);
/*      */       }
/*      */       
/*  529 */     });
/*  530 */     this.UpdateSFXButton.setText("Change Sound");
/*  531 */     this.UpdateSFXButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  533 */         DictionaryInterface.this.UpdateSFXButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  536 */     });
/*  537 */     javax.swing.GroupLayout UpdatePanelLayout = new javax.swing.GroupLayout(this.UpdatePanel);
/*  538 */     this.UpdatePanel.setLayout(UpdatePanelLayout);
/*  539 */     UpdatePanelLayout.setHorizontalGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(UpdatePanelLayout.createSequentialGroup().addGap(113, 113, 113).addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(UpdatePanelLayout.createSequentialGroup().addGap(23, 23, 23).addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.UpdateDefLabel).addComponent(this.UpdateExampleLabel).addComponent(this.UpdateWordLabel)).addGap(49, 49, 49).addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane28).addComponent(this.jScrollPane26, -2, 328, -2)).addComponent(this.jScrollPane27, -2, 328, -2))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatePanelLayout.createSequentialGroup().addComponent(this.UpdateSFXButton, -2, 146, -2).addGap(108, 108, 108).addComponent(this.SubmitUpdateButton, -2, 238, -2)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatePanelLayout.createSequentialGroup().addComponent(this.ResetUpdate, -2, 118, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.UpdateBacktoWords, -2, 114, -2))).addContainerGap(154, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  566 */     UpdatePanelLayout.setVerticalGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(UpdatePanelLayout.createSequentialGroup().addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(UpdatePanelLayout.createSequentialGroup().addGap(59, 59, 59).addComponent(this.jScrollPane26, -2, 57, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatePanelLayout.createSequentialGroup().addContainerGap().addComponent(this.UpdateWordLabel).addGap(27, 27, 27))).addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(UpdatePanelLayout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.UpdateDefLabel)).addComponent(this.jScrollPane27, -2, 57, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(UpdatePanelLayout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.UpdateExampleLabel)).addComponent(this.jScrollPane28, -2, 56, -2)).addGap(28, 28, 28).addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.SubmitUpdateButton, -1, -1, 32767).addComponent(this.UpdateSFXButton, -2, 87, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.ResetUpdate, -1, -1, 32767).addComponent(this.UpdateBacktoWords, -2, 87, -2)).addContainerGap(-1, 32767)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  600 */     this.SearchLabel.setFont(new java.awt.Font("Verdana", 0, 18));
/*  601 */     this.SearchLabel.setText("Word:");
/*      */     
/*  603 */     this.UpdateSearch.setText("Update Word");
/*  604 */     this.UpdateSearch.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  606 */         DictionaryInterface.this.UpdateSearchActionPerformed(evt);
/*      */       }
/*      */       
/*  609 */     });
/*  610 */     this.DeleteSearch.setText("Delete Word");
/*  611 */     this.DeleteSearch.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  613 */         DictionaryInterface.this.DeleteSearchActionPerformed(evt);
/*      */       }
/*      */       
/*  616 */     });
/*  617 */     this.SearchBacktoWordslist.setText("Back to Words");
/*  618 */     this.SearchBacktoWordslist.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  620 */         DictionaryInterface.this.SearchBacktoWordslistActionPerformed(evt);
/*      */       }
/*      */       
/*  623 */     });
/*  624 */     this.SearchWordSubmitButton.setFont(new java.awt.Font("Verdana", 1, 18));
/*  625 */     this.SearchWordSubmitButton.setText("SEARCH");
/*  626 */     this.SearchWordSubmitButton.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  628 */         DictionaryInterface.this.SearchWordSubmitButtonActionPerformed(evt);
/*      */       }
/*      */       
/*  631 */     });
/*  632 */     this.SearchResultArea.setEditable(false);
/*  633 */     this.SearchResultArea.setColumns(20);
/*  634 */     this.SearchResultArea.setRows(5);
/*  635 */     this.jScrollPane9.setViewportView(this.SearchResultArea);
/*      */     
/*  637 */     this.SearchtoDefinition.setText("DEFINITION");
/*  638 */     this.SearchtoDefinition.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  640 */         DictionaryInterface.this.SearchtoDefinitionActionPerformed(evt);
/*      */       }
/*      */       
/*  643 */     });
/*  644 */     javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(this.SearchPanel);
/*  645 */     this.SearchPanel.setLayout(SearchPanelLayout);
/*  646 */     SearchPanelLayout.setHorizontalGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(SearchPanelLayout.createSequentialGroup().addGap(88, 88, 88).addComponent(this.jScrollPane9, -2, 238, -2).addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(SearchPanelLayout.createSequentialGroup().addGap(147, 147, 147).addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.UpdateSearch, -1, 130, 32767).addComponent(this.SearchtoDefinition, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.SearchBacktoWordslist, -1, -1, 32767).addComponent(this.DeleteSearch, -1, -1, 32767))).addGroup(SearchPanelLayout.createSequentialGroup().addGap(73, 73, 73).addComponent(this.SearchLabel).addGap(18, 18, 18).addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.SearchWordSubmitButton, -1, -1, 32767).addComponent(this.SearchField)))).addGap(42, 42, 42)));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  670 */     SearchPanelLayout.setVerticalGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(SearchPanelLayout.createSequentialGroup().addGap(41, 41, 41).addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(SearchPanelLayout.createSequentialGroup().addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.SearchLabel, -2, 65, -2).addComponent(this.SearchField, -2, 65, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.SearchWordSubmitButton, -2, 77, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.SearchtoDefinition, -1, -1, 32767).addComponent(this.SearchBacktoWordslist, -1, 83, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.DeleteSearch, -2, 84, -2).addComponent(this.UpdateSearch, -2, 84, -2)).addGap(71, 71, 71)).addGroup(SearchPanelLayout.createSequentialGroup().addComponent(this.jScrollPane9, -2, 393, -2).addContainerGap(22, 32767)))));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  695 */     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
/*  696 */     getContentPane().setLayout(layout);
/*  697 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.WordListPanel, -1, 784, 32767).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.InfoPanel, -1, -1, 32767)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.StartPanel, javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.AddWordPanel, javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.UpdatePanel, javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.SearchPanel, -2, -1, -2).addGap(0, 0, 32767))));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  713 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.WordListPanel, -1, 919, 32767).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.InfoPanel, -1, -1, 32767)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.StartPanel, javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.AddWordPanel, -1, -1, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.UpdatePanel, -1, -1, 32767))).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 232, 32767).addComponent(this.SearchPanel, -2, -1, -2).addGap(0, 231, 32767))));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  732 */     setSize(new java.awt.Dimension(766, 578));
/*  733 */     setLocationRelativeTo(null);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private void GotoDictionaryActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/*  741 */     this.StartPanel.setVisible(false);
/*  742 */     this.StartPanel.setEnabled(false);
/*  743 */     this.WordListPanel.setVisible(true);
/*  744 */     this.WordListPanel.setEnabled(true);
/*  745 */     this.InfoPanel.setVisible(false);
/*  746 */     this.InfoPanel.setEnabled(false);
/*  747 */     this.AddWordPanel.setVisible(false);
/*  748 */     this.AddWordPanel.setEnabled(false);
/*  749 */     this.UpdatePanel.setVisible(false);
/*  750 */     this.UpdatePanel.setEnabled(false);
/*  751 */     this.SearchPanel.setVisible(false);
/*  752 */     this.SearchPanel.setEnabled(false);
/*      */     
/*      */ 
/*  755 */     this.functions.bubbleSortWord(this.Dictionary, this.wordcount);
/*  756 */     this.WordsList.setListData(this.functions.ListOfWords(this.Dictionary, this.wordcount).toArray());
/*      */   }
/*      */   
/*      */   private JPanel UpdatePanel;
/*      */   private javax.swing.JButton UpdateSFXButton;
/*      */   private javax.swing.JButton UpdateSearch;
/*      */   private javax.swing.JTextArea UpdateWordArea;
/*      */   private javax.swing.JButton UpdateWordButton;
/*      */   private javax.swing.JLabel UpdateWordLabel;
/*      */   private javax.swing.JTextArea WordArea;
/*      */   private javax.swing.JLabel WordLabel;
/*      */   private JPanel WordListPanel;
/*  768 */   private void GotoInformationActionPerformed(java.awt.event.ActionEvent evt) { if (this.WordsList.getSelectedIndex() == -1)
/*      */     {
/*  770 */       javax.swing.JOptionPane.showMessageDialog(this, "Please select a word.", "List Selection Error", 0);
/*      */ 
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/*      */ 
/*  777 */       this.StartPanel.setVisible(false);
/*  778 */       this.StartPanel.setEnabled(false);
/*  779 */       this.WordListPanel.setVisible(false);
/*  780 */       this.WordListPanel.setEnabled(false);
/*  781 */       this.InfoPanel.setVisible(true);
/*  782 */       this.InfoPanel.setEnabled(true);
/*  783 */       this.AddWordPanel.setVisible(false);
/*  784 */       this.AddWordPanel.setEnabled(false);
/*  785 */       this.UpdatePanel.setVisible(false);
/*  786 */       this.UpdatePanel.setEnabled(false);
/*  787 */       this.SearchPanel.setVisible(false);
/*  788 */       this.SearchPanel.setEnabled(false);
/*      */       
/*      */ 
/*  791 */       String searchKey = this.WordsList.getSelectedValue().toString();
/*      */       
/*  793 */       this.functions.bubbleSortWord(this.Dictionary, this.wordcount);
/*      */       
/*  795 */       this.searchResultIndex = this.functions.WordBinarySearch(this.Dictionary, searchKey, this.wordcount);
/*      */       
/*      */ 
/*  798 */       this.WordArea.setText(this.Dictionary[this.searchResultIndex].getWD());
/*  799 */       this.DefinitionArea.setText(this.Dictionary[this.searchResultIndex].getDEF());
/*  800 */       this.ExampleArea.setText(this.Dictionary[this.searchResultIndex].getEG());
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private void AddwordButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/*  810 */     this.StartPanel.setVisible(false);
/*  811 */     this.StartPanel.setEnabled(false);
/*  812 */     this.WordListPanel.setVisible(false);
/*  813 */     this.WordListPanel.setEnabled(false);
/*  814 */     this.InfoPanel.setVisible(false);
/*  815 */     this.InfoPanel.setEnabled(false);
/*  816 */     this.AddWordPanel.setVisible(true);
/*  817 */     this.AddWordPanel.setEnabled(true);
/*  818 */     this.UpdatePanel.setVisible(false);
/*  819 */     this.UpdatePanel.setEnabled(false);
/*  820 */     this.SearchPanel.setVisible(false);
/*  821 */     this.SearchPanel.setEnabled(false);
/*      */     
/*      */ 
/*  824 */     this.AddWordArea.setText("");
/*  825 */     this.AddDefinitionArea.setText("");
/*  826 */     this.AddExampleArea.setText("");
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private void BacktoWordListActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/*  834 */     this.StartPanel.setVisible(false);
/*  835 */     this.StartPanel.setEnabled(false);
/*  836 */     this.WordListPanel.setVisible(true);
/*  837 */     this.WordListPanel.setEnabled(true);
/*  838 */     this.InfoPanel.setVisible(false);
/*  839 */     this.InfoPanel.setEnabled(false);
/*  840 */     this.UpdatePanel.setVisible(false);
/*  841 */     this.UpdatePanel.setEnabled(false);
/*  842 */     this.AddWordPanel.setVisible(false);
/*  843 */     this.AddWordPanel.setEnabled(false);
/*  844 */     this.SearchPanel.setVisible(false);
/*  845 */     this.SearchPanel.setEnabled(false);
/*      */     
/*      */ 
/*  848 */     this.functions.bubbleSortWord(this.Dictionary, this.wordcount);
/*  849 */     this.WordsList.setListData(this.functions.ListOfWords(this.Dictionary, this.wordcount).toArray());
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private void SearchWordActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/*  856 */     this.StartPanel.setVisible(false);
/*  857 */     this.StartPanel.setEnabled(false);
/*  858 */     this.WordListPanel.setVisible(false);
/*  859 */     this.WordListPanel.setEnabled(false);
/*  860 */     this.InfoPanel.setVisible(false);
/*  861 */     this.InfoPanel.setEnabled(false);
/*  862 */     this.UpdatePanel.setVisible(false);
/*  863 */     this.UpdatePanel.setEnabled(false);
/*  864 */     this.AddWordPanel.setVisible(false);
/*  865 */     this.AddWordPanel.setEnabled(false);
/*  866 */     this.SearchPanel.setVisible(true);
/*  867 */     this.SearchPanel.setEnabled(true);
/*      */     
/*      */ 
/*  870 */     this.SearchField.setText("");
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private void SubmitWordButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/*  879 */     if (this.AddWordArea.getText().equals(""))
/*      */     {
/*  881 */       javax.swing.JOptionPane.showMessageDialog(this, "Please enter a word!", "Input Error", 0);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  886 */       this.AddWordArea.requestFocusInWindow();
/*  887 */     } else if (this.AddDefinitionArea.getText().equals(""))
/*      */     {
/*  889 */       javax.swing.JOptionPane.showMessageDialog(this, "Please enter a definition!.", "Input Error", 0);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  894 */       this.AddDefinitionArea.requestFocusInWindow();
/*  895 */     } else if (this.AddExampleArea.getText().equals(""))
/*      */     {
/*  897 */       javax.swing.JOptionPane.showMessageDialog(this, "Please enter an example sentence!", "Input Error", 0);
/*      */       
/*      */ 
/*      */ 
/*  901 */       this.AddExampleArea.requestFocusInWindow();
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/*      */ 
/*  907 */       if (this.functions.addWord(this.Dictionary, this.AddWordArea.getText(), this.AddDefinitionArea.getText(), this.AddExampleArea.getText(), this.sfxfilename, this.wordcount))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  915 */         this.wordcount += 1;
/*  916 */         javax.swing.JOptionPane.showMessageDialog(this, "Word Added!");
/*      */       }
/*      */       else {
/*  919 */         javax.swing.JOptionPane.showMessageDialog(null, "Word Not Added!!", "Dictionary Error Message", 0);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  926 */       this.functions.SaveToDictionary(this.Dictionary, this.wordcount);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private void BacktoWordlistActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/*  937 */     this.StartPanel.setVisible(false);
/*  938 */     this.StartPanel.setEnabled(false);
/*  939 */     this.WordListPanel.setVisible(true);
/*  940 */     this.WordListPanel.setEnabled(true);
/*  941 */     this.InfoPanel.setVisible(false);
/*  942 */     this.InfoPanel.setEnabled(false);
/*  943 */     this.UpdatePanel.setVisible(false);
/*  944 */     this.UpdatePanel.setEnabled(false);
/*  945 */     this.AddWordPanel.setVisible(false);
/*  946 */     this.AddWordPanel.setEnabled(false);
/*  947 */     this.SearchPanel.setVisible(false);
/*  948 */     this.SearchPanel.setEnabled(false);
/*      */     
/*  950 */     this.functions.bubbleSortWord(this.Dictionary, this.wordcount);
/*  951 */     this.WordsList.setListData(this.functions.ListOfWords(this.Dictionary, this.wordcount).toArray());
/*      */   }
/*      */   
/*      */   private void ResetFieldsButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/*  956 */     this.AddWordArea.setText("");
/*  957 */     this.AddDefinitionArea.setText("");
/*  958 */     this.AddExampleArea.setText("");
/*      */     
/*  960 */     this.AddWordArea.requestFocusInWindow();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private void DeleteWordButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/*  968 */     if (this.WordsList.getSelectedIndex() == -1)
/*      */     {
/*  970 */       javax.swing.JOptionPane.showMessageDialog(this, "Please select a word.", "List Selection Error", 0);
/*      */ 
/*      */ 
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/*      */ 
/*      */ 
/*  979 */       String WordToDelete = this.WordsList.getSelectedValue().toString();
/*      */       
/*  981 */       if (this.functions.DeleteWord(this.Dictionary, this.wordcount, WordToDelete))
/*      */       {
/*  983 */         this.wordcount -= 1;
/*      */         
/*  985 */         this.functions.bubbleSortWord(this.Dictionary, this.wordcount);
/*  986 */         this.WordsList.setListData(this.functions.ListOfWords(this.Dictionary, this.wordcount).toArray());
/*  987 */         this.functions.SaveToDictionary(this.Dictionary, this.wordcount);
/*      */         
/*  989 */         javax.swing.JOptionPane.showMessageDialog(this, "Word Deleted!");
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*  994 */         javax.swing.JOptionPane.showMessageDialog(this, "Delete Failed!", "Dictionary Error", 0);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private void UpdateWordButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1008 */     if (this.WordsList.getSelectedIndex() == -1)
/*      */     {
/* 1010 */       javax.swing.JOptionPane.showMessageDialog(this, "Please select a word.", "List Selection Error", 0);
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/*      */ 
/* 1016 */       this.StartPanel.setVisible(false);
/* 1017 */       this.StartPanel.setEnabled(false);
/* 1018 */       this.WordListPanel.setVisible(false);
/* 1019 */       this.WordListPanel.setEnabled(false);
/* 1020 */       this.InfoPanel.setVisible(false);
/* 1021 */       this.InfoPanel.setEnabled(false);
/* 1022 */       this.UpdatePanel.setVisible(true);
/* 1023 */       this.UpdatePanel.setEnabled(true);
/* 1024 */       this.AddWordPanel.setVisible(false);
/* 1025 */       this.AddWordPanel.setEnabled(false);
/* 1026 */       this.SearchPanel.setVisible(false);
/* 1027 */       this.SearchPanel.setEnabled(false);
/*      */       
/*      */ 
/* 1030 */       String searchValue = this.WordsList.getSelectedValue().toString();
/* 1031 */       this.searchResultIndex = this.functions.WordBinarySearch(this.Dictionary, searchValue, this.wordcount);
/*      */       
/*      */ 
/*      */ 
/* 1035 */       this.UpdateWordArea.setText(this.Dictionary[this.searchResultIndex].getWD());
/* 1036 */       this.UpdateDefArea.setText(this.Dictionary[this.searchResultIndex].getDEF());
/* 1037 */       this.UpdateExampleArea.setText(this.Dictionary[this.searchResultIndex].getEG());
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private void SubmitUpdateButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1047 */     if (this.UpdateWordArea.getText().equals(""))
/*      */     {
/* 1049 */       javax.swing.JOptionPane.showMessageDialog(this, "Please enter a word!", "Input Error", 0);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1054 */       this.UpdateWordArea.requestFocusInWindow();
/* 1055 */     } else if (this.UpdateDefArea.getText().equals(""))
/*      */     {
/* 1057 */       javax.swing.JOptionPane.showMessageDialog(this, "Please enter a definition!.", "Input Error", 0);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1062 */       this.UpdateDefArea.requestFocusInWindow();
/* 1063 */     } else if (this.UpdateExampleArea.getText().equals(""))
/*      */     {
/* 1065 */       javax.swing.JOptionPane.showMessageDialog(this, "Please enter an example sentence!", "Input Error", 0);
/*      */       
/*      */ 
/*      */ 
/* 1069 */       this.UpdateExampleArea.requestFocusInWindow();
/*      */ 
/*      */ 
/*      */ 
/*      */     }
/* 1074 */     else if (this.functions.UpdateWords(this.Dictionary, this.wordcount, this.WordsList.getSelectedValue().toString(), this.UpdateWordArea.getText(), this.UpdateDefArea.getText(), this.UpdateExampleArea.getText(), this.sfxfilename))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1080 */       this.functions.SaveToDictionary(this.Dictionary, this.wordcount);
/* 1081 */       javax.swing.JOptionPane.showMessageDialog(this, "Word Updated Successfully.", "Dictionary Information", 1);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private void ResetUpdateActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1092 */     this.UpdateWordArea.setText("");
/* 1093 */     this.UpdateDefArea.setText("");
/* 1094 */     this.UpdateExampleArea.setText("");
/*      */     
/*      */ 
/* 1097 */     this.UpdateWordArea.requestFocusInWindow();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private void UpdateBacktoWordsActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1105 */     this.StartPanel.setVisible(false);
/* 1106 */     this.StartPanel.setEnabled(false);
/* 1107 */     this.WordListPanel.setVisible(true);
/* 1108 */     this.WordListPanel.setEnabled(true);
/* 1109 */     this.InfoPanel.setVisible(false);
/* 1110 */     this.InfoPanel.setEnabled(false);
/* 1111 */     this.UpdatePanel.setVisible(false);
/* 1112 */     this.UpdatePanel.setEnabled(false);
/* 1113 */     this.AddWordPanel.setVisible(false);
/* 1114 */     this.AddWordPanel.setEnabled(false);
/* 1115 */     this.SearchPanel.setVisible(false);
/* 1116 */     this.SearchPanel.setEnabled(false);
/*      */     
/* 1118 */     this.functions.bubbleSortWord(this.Dictionary, this.wordcount);
/* 1119 */     this.WordsList.setListData(this.functions.ListOfWords(this.Dictionary, this.wordcount).toArray());
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private void BacktoStartPanelActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1129 */     this.StartPanel.setVisible(true);
/* 1130 */     this.StartPanel.setEnabled(true);
/* 1131 */     this.WordListPanel.setVisible(false);
/* 1132 */     this.WordListPanel.setEnabled(false);
/* 1133 */     this.InfoPanel.setVisible(false);
/* 1134 */     this.InfoPanel.setEnabled(false);
/* 1135 */     this.UpdatePanel.setVisible(false);
/* 1136 */     this.UpdatePanel.setEnabled(false);
/* 1137 */     this.AddWordPanel.setVisible(false);
/* 1138 */     this.AddWordPanel.setEnabled(false);
/* 1139 */     this.SearchPanel.setVisible(false);
/* 1140 */     this.SearchPanel.setEnabled(false);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private void UpdateSearchActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1147 */     this.StartPanel.setVisible(false);
/* 1148 */     this.StartPanel.setEnabled(false);
/* 1149 */     this.WordListPanel.setVisible(false);
/* 1150 */     this.WordListPanel.setEnabled(false);
/* 1151 */     this.InfoPanel.setVisible(false);
/* 1152 */     this.InfoPanel.setEnabled(false);
/* 1153 */     this.UpdatePanel.setVisible(true);
/* 1154 */     this.UpdatePanel.setEnabled(true);
/* 1155 */     this.AddWordPanel.setVisible(false);
/* 1156 */     this.AddWordPanel.setEnabled(false);
/* 1157 */     this.SearchPanel.setVisible(false);
/* 1158 */     this.SearchPanel.setEnabled(false);
/*      */     
/*      */ 
/* 1161 */     String searchValue = this.SearchResultArea.getText();
/* 1162 */     this.searchResultIndex = this.functions.WordBinarySearch(this.Dictionary, searchValue, this.wordcount);
/*      */     
/*      */ 
/*      */ 
/* 1166 */     this.UpdateWordArea.setText(this.Dictionary[this.searchResultIndex].getWD());
/* 1167 */     this.UpdateDefArea.setText(this.Dictionary[this.searchResultIndex].getDEF());
/* 1168 */     this.UpdateExampleArea.setText(this.Dictionary[this.searchResultIndex].getEG());
/*      */   }
/*      */   
/*      */ 
/*      */   private void DeleteSearchActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1174 */     String WordToDelete = this.SearchResultArea.getText();
/*      */     
/*      */ 
/* 1177 */     if (this.functions.DeleteWord(this.Dictionary, this.wordcount, WordToDelete))
/*      */     {
/* 1179 */       this.wordcount -= 1;
/* 1180 */       this.functions.bubbleSortWord(this.Dictionary, this.wordcount);
/* 1181 */       this.WordsList.setListData(this.functions.ListOfWords(this.Dictionary, this.wordcount).toArray());
/* 1182 */       this.functions.SaveToDictionary(this.Dictionary, this.wordcount);
/* 1183 */       this.SearchResultArea.setText("");
/* 1184 */       javax.swing.JOptionPane.showMessageDialog(this, "Word Deleted!");
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/* 1189 */       javax.swing.JOptionPane.showMessageDialog(this, "Delete Failed!", "Dictionary Error", 0);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private void SearchBacktoWordslistActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1201 */     this.StartPanel.setVisible(false);
/* 1202 */     this.StartPanel.setEnabled(false);
/* 1203 */     this.WordListPanel.setVisible(true);
/* 1204 */     this.WordListPanel.setEnabled(true);
/* 1205 */     this.InfoPanel.setVisible(false);
/* 1206 */     this.InfoPanel.setEnabled(false);
/* 1207 */     this.UpdatePanel.setVisible(false);
/* 1208 */     this.UpdatePanel.setEnabled(false);
/* 1209 */     this.AddWordPanel.setVisible(false);
/* 1210 */     this.AddWordPanel.setEnabled(false);
/* 1211 */     this.SearchPanel.setVisible(false);
/* 1212 */     this.SearchPanel.setEnabled(false);
/*      */     
/* 1214 */     this.functions.bubbleSortWord(this.Dictionary, this.wordcount);
/* 1215 */     this.WordsList.setListData(this.functions.ListOfWords(this.Dictionary, this.wordcount).toArray());
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private void SearchWordSubmitButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1223 */     if (this.SearchField.getText().equalsIgnoreCase(""))
/*      */     {
/* 1225 */       javax.swing.JOptionPane.showMessageDialog(this, "Please enter a word!", "Input Error", 0);
/*      */ 
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/*      */ 
/* 1232 */       this.searchResultIndex = this.functions.WordBinarySearch(this.Dictionary, this.SearchField.getText(), this.wordcount);
/*      */       
/* 1234 */       this.SearchResultArea.setText(this.Dictionary[this.searchResultIndex].getWD());
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private void SearchtoDefinitionActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1243 */     this.StartPanel.setVisible(false);
/* 1244 */     this.StartPanel.setEnabled(false);
/* 1245 */     this.WordListPanel.setVisible(false);
/* 1246 */     this.WordListPanel.setEnabled(false);
/* 1247 */     this.InfoPanel.setVisible(true);
/* 1248 */     this.InfoPanel.setEnabled(true);
/* 1249 */     this.AddWordPanel.setVisible(false);
/* 1250 */     this.AddWordPanel.setEnabled(false);
/* 1251 */     this.UpdatePanel.setVisible(false);
/* 1252 */     this.UpdatePanel.setEnabled(false);
/* 1253 */     this.SearchPanel.setVisible(false);
/* 1254 */     this.SearchPanel.setEnabled(false);
/*      */     
/*      */ 
/* 1257 */     String searchKey = this.SearchResultArea.getText();
/* 1258 */     this.searchResultIndex = this.functions.WordBinarySearch(this.Dictionary, searchKey, this.wordcount);
/*      */     
/* 1260 */     this.WordArea.setText(this.Dictionary[this.searchResultIndex].getWD());
/* 1261 */     this.DefinitionArea.setText(this.Dictionary[this.searchResultIndex].getDEF());
/* 1262 */     this.ExampleArea.setText(this.Dictionary[this.searchResultIndex].getEG());
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private void ChoosePronunButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1269 */     this.sfxfilename = OpenFile();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private void PlayPronunciationButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1276 */     playsound();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private void SFXButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1283 */     this.sfxfilename = this.Dictionary[this.searchResultIndex].getSFX();
/* 1284 */     if (this.sfxfilename.equalsIgnoreCase(""))
/*      */     {
/* 1286 */       javax.swing.JOptionPane.showMessageDialog(this, "There is no sound file!", "Dictionary Error", 0);
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/*      */ 
/* 1292 */       playsound();
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private void UpdateSFXButtonActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1301 */     this.sfxfilename = OpenFile();
/*      */   }
/*      */   
/*      */   private void ExitProgramActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/* 1306 */     System.exit(0);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void playsound()
/*      */   {
/* 1314 */     javax.media.Format input1 = new javax.media.format.AudioFormat("mpeglayer3");
/* 1315 */     javax.media.Format input2 = new javax.media.format.AudioFormat("mpegaudio");
/* 1316 */     javax.media.Format output = new javax.media.format.AudioFormat("LINEAR");
/*      */     
/* 1318 */     javax.media.PlugInManager.addPlugIn("com.sun.media.codec.audio.mp3.JavaDecoder", new javax.media.Format[] { input1, input2 }, new javax.media.Format[] { output }, 2);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/* 1331 */       javax.media.Player player = javax.media.Manager.createPlayer(new javax.media.MediaLocator(new java.io.File("Pronunciations/" + this.sfxfilename).toURI().toURL()));
/*      */       
/* 1333 */       player.start();
/*      */ 
/*      */     }
/*      */     catch (Exception ex)
/*      */     {
/* 1338 */       ex.printStackTrace();
/*      */     }
/*      */   }
/*      */   
/*      */   public String OpenFile()
/*      */   {
/* 1344 */     String returnName = "";
/*      */     
/* 1346 */     javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
/* 1347 */     fileChooser.setFileSelectionMode(0);
/*      */     
/*      */ 
/* 1350 */     int result = fileChooser.showOpenDialog(this);
/*      */     
/*      */ 
/* 1353 */     if (result == 1)
/*      */     {
/* 1355 */       return returnName;
/*      */     }
/*      */     
/*      */ 
/* 1359 */     java.io.File fileName = fileChooser.getSelectedFile();
/* 1360 */     System.out.println(fileName.getName());
/* 1361 */     copyfile(fileName.getAbsolutePath(), "Pronunciations/" + fileName.getName());
/*      */     
/*      */ 
/* 1364 */     if ((fileName == null) || (fileName.getName().equals("")))
/*      */     {
/* 1366 */       javax.swing.JOptionPane.showMessageDialog(this, "Invalid File Name", "Invalid File Name", 0);
/*      */     }
/*      */     else
/*      */     {
/* 1370 */       returnName = fileName.getName();
/*      */     }
/*      */     
/* 1373 */     return returnName;
/*      */   }
/*      */   
/*      */   private void copyfile(String srFile, String dtFile)
/*      */   {
/*      */     try
/*      */     {
/* 1380 */       java.io.File f1 = new java.io.File(srFile);
/* 1381 */       java.io.File f2 = new java.io.File(dtFile);
/* 1382 */       java.io.InputStream in = new java.io.FileInputStream(f1);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1388 */       java.io.OutputStream out = new java.io.FileOutputStream(f2);
/*      */       
/* 1390 */       byte[] buf = new byte['Ѐ'];
/*      */       int len;
/* 1392 */       while ((len = in.read(buf)) > 0)
/*      */       {
/* 1394 */         out.write(buf, 0, len);
/*      */       }
/* 1396 */       in.close();
/* 1397 */       out.close();
/* 1398 */       System.out.println("File copied.");
/*      */     }
/*      */     catch (java.io.FileNotFoundException ex) {
/* 1401 */       System.out.println(ex.getMessage() + " in the specified directory.");
/* 1402 */       System.exit(0);
/*      */     }
/*      */     catch (java.io.IOException e) {
/* 1405 */       System.out.println(e.getMessage());
/*      */     }
/*      */   }
/*      */   
/*      */   private javax.swing.JList WordsList;
/*      */   private javax.swing.JScrollPane jScrollPane1;
/*      */   private javax.swing.JScrollPane jScrollPane2;
/*      */   private javax.swing.JScrollPane jScrollPane26;
/*      */   private javax.swing.JScrollPane jScrollPane27;
/*      */   private javax.swing.JScrollPane jScrollPane28;
/*      */   private javax.swing.JScrollPane jScrollPane3;
/*      */   private javax.swing.JScrollPane jScrollPane4;
/*      */   
/*      */   public static void main(String[] args)
/*      */   {
/*      */     try {
/* 1421 */       for (javax.swing.UIManager.LookAndFeelInfo info : )
/*      */       {
/* 1423 */         if ("Nimbus".equals(info.getName()))
/*      */         {
/* 1425 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 1426 */           break;
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (ClassNotFoundException ex) {
/* 1431 */       java.util.logging.Logger.getLogger(DictionaryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     }
/*      */     catch (InstantiationException ex) {
/* 1434 */       java.util.logging.Logger.getLogger(DictionaryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     }
/*      */     catch (IllegalAccessException ex) {
/* 1437 */       java.util.logging.Logger.getLogger(DictionaryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     }
/*      */     catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 1440 */       java.util.logging.Logger.getLogger(DictionaryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1445 */     java.awt.EventQueue.invokeLater(new Runnable()
/*      */     {
/*      */       public void run()
/*      */       {
/* 1449 */         new DictionaryInterface().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */   
/*      */   private javax.swing.JScrollPane jScrollPane5;
/*      */   private javax.swing.JScrollPane jScrollPane6;
/*      */   private javax.swing.JScrollPane jScrollPane7;
/*      */   private javax.swing.JScrollPane jScrollPane9;
/*      */   DataStructure[] Dictionary;
/*      */   DictionaryFunctions functions;
/*      */   int wordcount;
/*      */   int searchResultIndex;
/*      */   String sfxfilename;
/*      */ }


/* Location:              C:\Users\Kaiwen\Desktop\Dictionary\Dictionary_Program.jar!\dictionary\program\DictionaryInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */