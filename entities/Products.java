����   7 }  'com/firstProject/demo/entities/Products  java/lang/Object pId I RuntimeVisibleAnnotations Ljakarta/persistence/Id; $Ljakarta/persistence/GeneratedValue; strategy $Ljakarta/persistence/GenerationType; IDENTITY pName Ljava/lang/String; pDesc pPhoto pPrice 	pQuantity pType pPhoto1 pPhoto2 pPhoto3 feature Z mrp discount cart )Lcom/firstProject/demo/entities/UserCart; Ljakarta/persistence/ManyToOne; category )Lcom/firstProject/demo/entities/Category; review Ljava/util/List; 	Signature 9Ljava/util/List<Lcom/firstProject/demo/entities/Review;>; Ljakarta/persistence/OneToMany; cascade !Ljakarta/persistence/CascadeType; ALL <init> ()V Code
  , ( ) LineNumberTable LocalVariableTable this )Lcom/firstProject/demo/entities/Products; getpName ()Ljava/lang/String;	  4   setpName (Ljava/lang/String;)V MethodParameters getpDesc	  :   setpDesc getpType	  >   setpType 	getpPhoto	  B   getpId ()I	  F   	setpPhoto 	getpPrice	  J   	setpPrice (I)V getpQuantity	  O   setpQuantity 
getpPhoto1	  S   
setpPhoto1 
getpPhoto2	  W   
setpPhoto2 
getpPhoto3	  [   
setpPhoto3 	isFeature ()Z	  `   
setFeature (Z)V getMrp	  e   setMrp getDiscount	  i   setDiscount getCategory +()Lcom/firstProject/demo/entities/Category;	  n   setCategory ,(Lcom/firstProject/demo/entities/Category;)V 	getReview ()Ljava/util/List; ;()Ljava/util/List<Lcom/firstProject/demo/entities/Review;>;	  u   ! 	setReview (Ljava/util/List;)V <(Ljava/util/List<Lcom/firstProject/demo/entities/Review;>;)V LocalVariableTypeTable 
SourceFile Products.java Ljakarta/persistence/Entity; !                  	  
e                                                                                           !  "    #      $  %[ e & '   ( )  *   /     *� +�    -        .        / 0    1 2  *   /     *� 3�    -        .        / 0    5 6  *   >     *+� 3�    -   
        .        / 0         7        8 2  *   /     *� 9�    -       " .        / 0    ; 6  *   >     *+� 9�    -   
    %  & .        / 0         7        < 2  *   /     *� =�    -       ( .        / 0    ? 6  *   >     *+� =�    -   
    +  , .        / 0         7        @ 2  *   /     *� A�    -       . .        / 0    C D  *   /     *� E�    -       2 .        / 0    G 6  *   >     *+� A�    -   
    5  6 .        / 0         7        H D  *   /     *� I�    -       8 .        / 0    K L  *   >     *� I�    -   
    ;  < .        / 0         7        M D  *   /     *� N�    -       > .        / 0    P L  *   >     *� N�    -   
    A  B .        / 0         7        Q 2  *   /     *� R�    -       Y .        / 0    T 6  *   >     *+� R�    -   
    \  ] .        / 0         7        U 2  *   /     *� V�    -       _ .        / 0    X 6  *   >     *+� V�    -   
    b  c .        / 0         7        Y 2  *   /     *� Z�    -       e .        / 0    \ 6  *   >     *+� Z�    -   
    h  i .        / 0         7        ] ^  *   /     *� _�    -       m .        / 0    a b  *   >     *� _�    -   
    p  q .        / 0         7        c D  *   /     *� d�    -       s .        / 0    f L  *   >     *� d�    -   
    v  w .        / 0         7        g D  *   /     *� h�    -       y .        / 0    j L  *   >     *� h�    -   
    |  } .        / 0         7        k l  *   /     *� m�    -       � .        / 0    o p  *   >     *+� m�    -   
    �  � .        / 0         7        q r  "    s *   /     *� t�    -       � .        / 0    v w  "    x *   P     *+� t�    -   
    �  � .        / 0        !  y          #  7         z    {      |  