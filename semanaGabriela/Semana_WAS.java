import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.Object;
import javax.sound.midi.*;
import java.io.*;  
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import javax.imageio.ImageIO;


public class Semana{
  JFrame frame;
  JButton buttonStart, buttonInicio, buttonRank, buttonNext, buttonNext2;
  JLabel logoLabel, nameLabel, florLabel, musicaLabel, anagramaLabel, anaLabel, portasLabel, mulheresLabel, numerosLabel, numeros2Label, numeros3Label, palavrasLabel;
  JTextArea taRank, questionTA;
  JTextField login;
  JPanel panel1, panel2, panelRespostas, panelImgs;
  String[] Perguntas = new String[21];
  String[] Respostas = new String[81];  
  int perguntaAtual, respostaAtual, respUser, errou, respostasCertas = 0;
  JRadioButton answer1, answer2, answer3, answer4;
  String nomeDigitado;
  String[] Nomes = new String[10];
  int[] Ranking = new int[10];
  int[] Certas = {3, 3, 4, 3, 1, 4, 2, 1, 1, 4};
  BufferedImage imageNext;
  

  public static void main (String[] args) {
      Semana gui = new Semana ();
      gui.go();
  }
  
  public static void setUIFont (javax.swing.plaf.FontUIResource f){
    java.util.Enumeration keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get (key);
      if (value != null && value instanceof javax.swing.plaf.FontUIResource)
        UIManager.put (key, f);
      }
    } 
  
  public void cria_panel1(){
    panel1 = new JPanel();
    ImageIcon logo = new ImageIcon("enigma.jpg");
    logoLabel = new JLabel("", logo, JLabel.CENTER);
    panel1.add(logoLabel);
    
    nameLabel = new JLabel("Digite seu nome: ");
    nameLabel.setVerticalTextPosition(JLabel.CENTER);
    nameLabel.setHorizontalAlignment(JLabel.CENTER);
    nameLabel.setBackground(Color.BLACK);
    nameLabel.setForeground(Color.WHITE);
    nameLabel.setVisible(false);
    panel1.add(nameLabel);
    
    login = new javax.swing.JTextField(25);
    login.setVisible(false);
    panel1.add(login);

    questionTA = new JTextArea("Pergunta", 1, 2);
    questionTA.setBackground(Color.BLACK);
    questionTA.setForeground(Color.WHITE);
  questionTA.setLineWrap( true );
  questionTA.setSize(1000, 500);
    panel1.add(questionTA);
    questionTA.setVisible(false);

    panel1.setBackground(Color.black);
  
  }
  
  public void cria_panel2(){
  panel2 = new JPanel();
  BufferedImage imageStart;
  BufferedImage imageRestart;
  BufferedImage imageRank;
  
  try {                
        imageStart = ImageIO.read(new File("comecar.png"));
    imageRestart = ImageIO.read(new File("inicio.png"));
    imageRank = ImageIO.read(new File("ranking.png"));
    imageNext = ImageIO.read(new File("next.png"));
    buttonStart = new JButton(new ImageIcon(imageStart));
    buttonStart.setBorder(BorderFactory.createEmptyBorder());
    buttonStart.addActionListener(new StartButtonListener());
    panel2.add(buttonStart);
  buttonInicio = new JButton(new ImageIcon(imageRestart));
    buttonInicio.addActionListener(new RestartButtonListener());
    buttonInicio.setBorder(BorderFactory.createEmptyBorder());
    buttonInicio.setVisible(false);
    panel2.add(buttonInicio);
    buttonRank = new JButton(new ImageIcon(imageRank));
    buttonRank.setBorder(BorderFactory.createEmptyBorder());
    buttonRank.addActionListener(new RankButtonListener());
    panel2.add(buttonRank);
    buttonNext = new JButton(new ImageIcon(imageNext));
    buttonNext.setBorder(BorderFactory.createEmptyBorder());
    buttonNext.addActionListener(new NextButtonListener());
    buttonNext.setVisible(false);
    panel2.add(buttonNext);
  buttonNext2 = new JButton(new ImageIcon(imageNext));
    buttonNext2.addActionListener(new Next2ButtonListener());
    buttonNext2.setBorder(BorderFactory.createEmptyBorder());
    buttonNext2.setVisible(false);
    panelImgs.add(buttonNext2);
  
       } catch (IOException ex) {
       }
    
    
  
  panel2.setBackground(Color.black);
  } 
  
  public void cria_respostas(){
  panelRespostas = new JPanel();
  panelRespostas.setLayout(new BoxLayout(panelRespostas, BoxLayout.PAGE_AXIS));
  answer1 = new JRadioButton("resposta1");
    panelRespostas.add(answer1);
    answer1.addActionListener(new Answer1ButtonListener());
  answer1.setVisible(false);
    answer2 = new JRadioButton("resposta2");
    panelRespostas.add(answer2);
  answer2.addActionListener(new Answer2ButtonListener());
    answer2.setVisible(false);
    answer3 = new JRadioButton("resposta3");
    answer3.addActionListener(new Answer3ButtonListener());
  panelRespostas.add(answer3);
    answer3.setVisible(false);
    answer4 = new JRadioButton("resposta4");
    answer4.addActionListener(new Answer4ButtonListener());
  panelRespostas.add(answer4);
    answer4.setVisible(false);
  
  answer1.setBackground(Color.BLACK);
  answer1.setForeground(Color.WHITE);
  answer2.setBackground(Color.BLACK);
  answer2.setForeground(Color.WHITE);
  answer3.setBackground(Color.BLACK);
  answer3.setForeground(Color.WHITE);
  answer4.setBackground(Color.BLACK);
  answer4.setForeground(Color.WHITE);
  
  
  
  panelRespostas.setBackground(Color.black);
  }
  
  public void le_perguntas() {
    int i = 5; int j = 0; int k = 0;
        
    String fileName = "perguntas.txt";
    String line = null;
    try {
      InputStreamReader fileReader = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
      BufferedReader bufferedReader =  new BufferedReader(fileReader);
      while((line = bufferedReader.readLine()) != null) {
        if(i%5 == 0){
          Perguntas[j] = line;
          i++; j++;
        }
        else{
          Respostas[k] = line;
          i++; k++;
        }
      }
      bufferedReader.close();     
    }
    catch(FileNotFoundException ex) {
      System.out.println("Unable to open file '" +  fileName + "'");        
    }
    catch(IOException ex) {
                System.out.println("Error reading file '"  + fileName + "'");
    }
  }
  
 
  
  public void muda_pergunta(){
    answer1.setSelected(false);
    answer2.setSelected(false);
    answer3.setSelected(false);
    answer4.setSelected(false);
    
    questionTA.setText(Perguntas[perguntaAtual]);
    answer1.setText(Respostas[respostaAtual]);
    answer1.setVisible(true);
    answer2.setText(Respostas[respostaAtual + 1]);
    answer2.setVisible(true);
    answer3.setText(Respostas[respostaAtual + 2]);
    answer3.setVisible(true);
    answer4.setText(Respostas[respostaAtual + 3]);
    answer4.setVisible(true);
  }
  
   public void compara_pergunta(){
  if (respUser != Certas[perguntaAtual]){
    errou = 1;
    
  }
  else{
  respostasCertas++;
  }
  perguntaAtual++;
  respostaAtual = respostaAtual + 4;
}
  
  public void escreve_nomes(){
  try {
      File file = new File("jogadores.txt");
      Writer bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));    
      bw.append(nomeDigitado + "\n" + respostasCertas);
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

   public void escreve_pontos(){
  try {
      File file = new File("pontos.txt");
      Writer bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));    
      bw.append(String.valueOf(respostasCertas) + "\n");
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public void escreve_ranking(){
    try{
        File file = new File("ranking.txt");
        Writer bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));    
        bw.append(nomeDigitado + "           " + String.valueOf(respostasCertas) + "\n");
        bw.close();
    }
    catch(IOException e){
        e.printStackTrace();
    }
  }    
  public void printRanking() {
    String fileName = "ranking.txt";
    String line = null;
    try {
      InputStreamReader fileReader = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
      BufferedReader bufferedReader =  new BufferedReader(fileReader);
      while((line = bufferedReader.readLine()) != null) {
        taRank.append(line + "\n");
      }
      bufferedReader.close();     
    }
    catch(FileNotFoundException ex) {
      System.out.println("Unable to open file '" +  fileName + "'");        
    }
    catch(IOException ex) {
                System.out.println("Error reading file '"  + fileName + "'");
    }
  }
  
  public void end_game() {
    buttonNext2.setVisible(false);
    panelImgs.setVisible(false);
    answer1.setVisible(false);
    answer2.setVisible(false);
    answer3.setVisible(false);
    answer4.setVisible(false);
    questionTA.setText("Total de enigmas acertados: " + respostasCertas + ".");
    escreve_nomes();
    escreve_pontos();
    escreve_ranking();
    buttonInicio.setVisible(true);
    buttonRank.setVisible(true);
  }
  
  public void cria_imgs(){
    panelImgs = new JPanel();
    panelImgs.setLayout(new BoxLayout(panelImgs, BoxLayout.PAGE_AXIS));
    ImageIcon portasImg = new ImageIcon("portas.jpg");
      portasLabel = new JLabel("", portasImg, JLabel.CENTER);
      panelImgs.add(portasLabel);
    portasLabel.setVisible(false);
    ImageIcon numerosImg = new ImageIcon("numeros.jpg");
      numerosLabel = new JLabel("", numerosImg, JLabel.CENTER);
      panelImgs.add(numerosLabel);
    numerosLabel.setVisible(false);
    ImageIcon palavrasImg = new ImageIcon("palavras.jpg");
      palavrasLabel = new JLabel("", palavrasImg, JLabel.CENTER);
      panelImgs.add(palavrasLabel);
    palavrasLabel.setVisible(false);
    ImageIcon anagramaImg = new ImageIcon("anagrama.jpg");
      anagramaLabel = new JLabel("", anagramaImg, JLabel.CENTER);
      panelImgs.add(anagramaLabel);
    anagramaLabel.setVisible(false);
    ImageIcon florImg = new ImageIcon("flores.jpg");
      florLabel = new JLabel("", florImg, JLabel.CENTER);
      panelImgs.add(florLabel);
    florLabel.setVisible(false);
    ImageIcon numeros2Img = new ImageIcon("numeros2.jpg");
      numeros2Label = new JLabel("", numeros2Img, JLabel.CENTER);
      panelImgs.add(numeros2Label);
    numeros2Label.setVisible(false);
    ImageIcon mulheresImg = new ImageIcon("sara.jpg");
      mulheresLabel = new JLabel("", mulheresImg, JLabel.CENTER);
      panelImgs.add(mulheresLabel);
    mulheresLabel.setVisible(false);
    ImageIcon numeros3Img = new ImageIcon("numeros3.jpg");
      numeros3Label = new JLabel("", numeros3Img, JLabel.CENTER);
      panelImgs.add(numeros3Label);
    numeros3Label.setVisible(false);
    ImageIcon anaImg = new ImageIcon("ana.jpg");
      anaLabel = new JLabel("", anaImg, JLabel.CENTER);
      panelImgs.add(anaLabel);
    anaLabel.setVisible(false);
    ImageIcon musicaImg = new ImageIcon("violino.jpg");
      musicaLabel = new JLabel("", musicaImg, JLabel.CENTER);
      panelImgs.add(musicaLabel);
      musicaLabel.setVisible(false);
    
    panelImgs.setBackground(Color.black);
    
  }
  
  public void go() {
  setUIFont (new javax.swing.plaf.FontUIResource("Georgia",0, 20));
    le_perguntas();
    cria_panel1();
    cria_imgs();
    cria_panel2();
    cria_respostas();
  
    Toolkit tk = Toolkit.getDefaultToolkit();  
    int xSize = ((int) tk.getScreenSize().getWidth());  
    int ySize = ((int) tk.getScreenSize().getHeight());
  
    frame = new JFrame();
    frame.setSize(xSize,ySize);
    
    frame.setExtendedState(Frame.MAXIMIZED_BOTH);
  frame.setUndecorated(true); 
    frame.getContentPane().add(panel1, BorderLayout.NORTH);
    
    frame.getContentPane().add(panel2, BorderLayout.CENTER);
    frame.getContentPane().add(panelRespostas, BorderLayout.WEST);
    frame.getContentPane().add(panelImgs, BorderLayout.EAST);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  class StartButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
      logoLabel.setVisible(false); 
      buttonStart.setVisible(false);
      buttonRank.setVisible(false);
      nameLabel.setVisible(true); 
      login.setVisible(true); 
      buttonNext.setVisible(true);
    }
  }
  
  class RestartButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
      errou = 0; respostasCertas = 0; perguntaAtual = 0; respostaAtual = 0;
    nomeDigitado = "";
    login.setText(null);
    questionTA.setVisible(false);
    buttonInicio.setVisible(false); 
    logoLabel.setVisible(true); 
    buttonStart.setVisible(true);
    panelImgs.setVisible(false);
    }
  }
  
  class RankButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
      JFrame frameRank = new JFrame();
    taRank = new JTextArea();
    taRank.setBackground(Color.BLACK);
    taRank.setForeground(Color.WHITE);
    frameRank.setSize(800, 400);
    frameRank.getContentPane().add(taRank);
    frameRank.setVisible(true);
    printRanking();
    }
  }
  
  class NextButtonListener implements ActionListener {
   public void actionPerformed(ActionEvent event){
    nomeDigitado = login.getText();
    
      nameLabel.setVisible(false);
      login.setVisible(false);
      buttonNext.setVisible(false);
      buttonNext2.setVisible(true);
      questionTA.setVisible(true);
      muda_pergunta();
      portasLabel.setVisible(true);
    }
  }

  class Next2ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
      buttonNext.setVisible(false);
      questionTA.setVisible(true);
      compara_pergunta();
      if (errou == 0){
        muda_pergunta();
        if(perguntaAtual == 1){
          portasLabel.setVisible(false);
          numerosLabel.setVisible(true);
        }
        if(perguntaAtual == 2){
          numerosLabel.setVisible(false);
          anaLabel.setVisible(true);
        }
        if(perguntaAtual == 3){
          anaLabel.setVisible(false);
          anagramaLabel.setVisible(true);
        }
        if(perguntaAtual == 4){
          anagramaLabel.setVisible(false); 
          florLabel.setVisible(true);
        }
        if(perguntaAtual == 5){
          florLabel.setVisible(false);
          palavrasLabel.setVisible(true);
        }
        if(perguntaAtual == 6){
          palavrasLabel.setVisible(false);
          musicaLabel.setVisible(true);
        }
        if(perguntaAtual == 7){
          musicaLabel.setVisible(false);
          numeros2Label.setVisible(true);
        }
        if(perguntaAtual == 8){
          numeros2Label.setVisible(false);
          mulheresLabel.setVisible(true);
        }
        if(perguntaAtual == 9){
          mulheresLabel.setVisible(false);
          numeros3Label.setVisible(true);
        }
        if(perguntaAtual == 10){
          questionTA.setText("Parabéns! Você acertou todas as 10 perguntas!");
          answer1.setVisible(false);
          answer2.setVisible(false);
          answer3.setVisible(false);
          answer4.setVisible(false);
          questionTA.setVisible(false);
          numeros3Label.setVisible(false);
          buttonNext.setVisible(false);
          buttonNext2.setVisible(false);
          buttonInicio.setVisible(true);
          buttonRank.setVisible(true);
        }
      }
      else{
        end_game();
      }
    }
  }
  
  class Answer1ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
    respUser = 1;
  }
  }
  class Answer2ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
    respUser = 2;
  }
  }
  class Answer3ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
    respUser = 3;
  }
  }
  class Answer4ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
    respUser = 4;
  }
  }
}