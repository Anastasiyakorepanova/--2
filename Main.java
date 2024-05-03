����   ? �
      java/lang/Object <init> ()V  java/lang/String
 
     java/nio/file/Paths get ;(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
      java/nio/file/Files readAllBytes (Ljava/nio/file/Path;)[B
     ([B)V  \s+
     split '(Ljava/lang/String;)[Ljava/lang/String;
    ! " # java/util/Arrays stream .([Ljava/lang/Object;)Ljava/util/stream/Stream;   % & ' apply ()Ljava/util/function/Function; ) * + , - java/util/stream/Stream map 8(Ljava/util/function/Function;)Ljava/util/stream/Stream;  / & 0 "()Ljava/util/function/IntFunction; ) 2 3 4 toArray 5(Ljava/util/function/IntFunction;)[Ljava/lang/Object; 6 [Ljava/math/BigInteger;	 8 9 : ; 6 Main numbers  = > ? compare ()Ljava/util/Comparator; ) A B C min ,(Ljava/util/Comparator;)Ljava/util/Optional;
 E F G H I java/util/Optional orElseThrow ()Ljava/lang/Object; K java/math/BigInteger ) M N C max	 J P Q R ZERO Ljava/math/BigInteger;  T & U %()Ljava/util/function/BinaryOperator; ) W X Y reduce I(Ljava/lang/Object;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;	 J [ \ R ONE  T _ eC:\Users\Администратор\IdeaProjects\Bisre\out\production\Bisre\checking_correct_test.txt
 8 a  b (Ljava/lang/String;)V	 d e f g h java/lang/System out Ljava/io/PrintStream;
 8 j k l _min ()Ljava/math/BigInteger;
  n o p valueOf &(Ljava/lang/Object;)Ljava/lang/String;  r s t makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;
 v w x y b java/io/PrintStream println
 8 { | l _max  r
 8  � l _sum  r
 8 � � l _mult  r � java/io/IOException	 d � � h err
 � � � � 
getMessage ()Ljava/lang/String; 	 r Code LineNumberTable LocalVariableTable this LMain; filePath Ljava/lang/String; content 
Exceptions main ([Ljava/lang/String;)V e Ljava/io/IOException; args [Ljava/lang/String; StackMapTable lambda$new$0 (I)[Ljava/math/BigInteger; x$0 I 
SourceFile 	Main.java BootstrapMethods �
 � � � � � "java/lang/invoke/LambdaMetafactory metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; � &(Ljava/lang/Object;)Ljava/lang/Object; �
 J a � *(Ljava/lang/String;)Ljava/math/BigInteger; � (I)Ljava/lang/Object; �
 8 � � � � � '(Ljava/lang/Object;Ljava/lang/Object;)I �
 J � � � 	compareTo (Ljava/math/BigInteger;)I � /(Ljava/math/BigInteger;Ljava/math/BigInteger;)I � 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; �
 J � � � add .(Ljava/math/BigInteger;)Ljava/math/BigInteger; � D(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger; �
 J � � � multiply �
 � � � s � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; � Минимальное:  � Максимальное:  � Сумма:  � Произведение:  � Error reading file:  InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! 8      ; 6      b  �   �     <*� � Y+� � 	� � M*,� � � $  � ( � .  � 1 � 5� 7�    �       
     &  0  ;  �        < � �     < � �   % � �  �     �  k l  �   B     *� 7� � <  � @ � D� J�    �        �        � �    | l  �   B     *� 7� � <  � L � D� J�    �        �        � �    � l  �   B     *� 7� � O� S  � V � J�    �        �        � �    � l  �   B     *� 7� � Z� ]  � V � J�    �        �        � �   	 � �  �   �     f� 8Y^� `L� c+� i� m� q  � u� c+� z� m� }  � u� c+� ~� m� �  � u� c+� �� m� �  � u� L� �+� �� �  � u�    R U �  �   & 	   # 
 $  % . & @ ' R * U ( V ) e + �      
 H � �  V  � �    f � �   �   	 � U �
 � �  �   /     � J�    �        �        � �    �    � �   R 
 �  � � � �  � � � �  � � � �  � � � �  � � � �  � �  � �  � �  � �  � �   
  � � � 