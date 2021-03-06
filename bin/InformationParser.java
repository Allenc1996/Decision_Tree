Êþº¾   4 ¸  InformationParser  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LInformationParser; main ([Ljava/lang/String;)V  gender1
     	checkFile (Ljava/lang/String;)V  education.txt  work.txt  
health.txt	    java/lang/System   ! out Ljava/io/PrintStream; # ----------------------
 % ' & java/io/PrintStream (  println * edu_work.txt , edu_gen.txt . edu_health.txt 0 -------------------------- 2 edu_health_gen.txt 4 edu_health_work.txt 6 edu_health_work_gen args [Ljava/lang/String; 
fileReader (Ljava/lang/String;)[[I 
Exceptions = java/io/IOException ? java/io/File
 > A   C java/util/Scanner
 B E  F (Ljava/io/File;)V
 B H I J nextLine ()Ljava/lang/String;
 B L M N hasNextLine ()Z
 P R Q java/lang/String S J trim U \s+
 P W X Y split '(Ljava/lang/String;)[Ljava/lang/String;
 [ ] \ java/lang/reflect/Array ^ _ 	getLength (Ljava/lang/Object;)I
 B a b c nextInt ()I
 B e f N hasNext
 B h i  close k [[I inFile Ljava/lang/String; 	inputFile Ljava/io/File; iFS Ljava/util/Scanner; iFS2 iFS3 row I column numbers splitN count allVal [I 
pivotTable c i j StackMapTable 8 { expectantCalculator ([[I)D
     log2 (D)D info D 	expectant freq entry col temp1 temp2 frac
    java/lang/Math   log@        d
   9 :
      java/lang/StringBuilder ¡ Expectant for 
  A
  ¤ ¥ ¦ append -(Ljava/lang/String;)Ljava/lang/StringBuilder; ¨ : 
  ª ¥ « (D)Ljava/lang/StringBuilder;
  ­ ® J toString ° Error reading file ' ² '  file e Ljava/io/IOException; 
SourceFile InformationParser.java !               /     *· ±    
                    	       ©     K¸ ¸ ¸ ¸ ² "¶ $)¸ +¸ -¸ ² /¶ $1¸ 3¸ ² /¶ $5¸ ±    
   :      	 
 
       !  &  +  3  8  =  E  J         K 7 8   	 9 :  ;     <   @     Ç» >Y*· @L» BY+· DM» BY+· DN» BY+· D:6§ ,¶ GW,¶ Kÿô6-¶ G:¶ OT¶ V:¸ Z66	h¼
:
§ 
		¶ `O¶ dÿî,¶ g-¶ g¶ gÅ j:66§ &6§ 2
.O¡ÿé¡ÿÙ°    
   v     	       % " ( # + $ . % 3 # : ( = ) C * O + V - Y . b / e 0 r / z 3 ~ 4  5  7  8  9  :   ; ° : º 9 Ä @        Ç l m   	 ¾ n o   µ p q   ¬ r q  % ¢ s q  (  t u  =  v u  C  w m  O x x 8  Y n y u 	 b e z { 
  6 | k   3 } u   - ~ u     u     M ÿ +  P > B B B  ÿ 1  P > B B B P    þ ' jü ú 	 	      ®     HJ*¾6	*2¾6
6§ rH6§ 6*2*2¾d.9*2.9 'oo¸ kcH
d¡ÿÇ*2
d.9*	d2
d.9o9)'kcJ	d¡ÿ)¯    
   F    C  F  G  J  K  L  M * N 4 P ; Q L L X V d W r Y y [  J  _    z     | k             * %    4       t u 	    u 
  { ~ u   ?  u  d     r     y        B ÿ  
 j      ü ÿ / 	 j  ÿ   j      ú 3 
       6     &¸  ¸ o¯    
       c             	       º     I*¸ L+¸ I² » Y · ¢*¶ £§¶ £(¶ ©¶ ¬¶ $§ L² » Y¯· ¢*¶ £±¶ £¶ ¬¶ $±    ) , <  
       h  i 
 j ) k - l H n    *    I l m    $ ³ k  
     -  ´ µ      l <  ¶    ·