import java.util.*;

/**
 * <p>Title: Java����������ʾ</p>
 * <p>Description: ��ʾJava�м��ֳ��õ����̿��Ʋ���</p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Filename: flowDome.java</p>
 * @author Musuc
 * @version 1.0
 */

 public class flowDemo{
   public static void main(String[] arges){
     int iPara1,iPara2,iEnd;
     if (arges.length!=3) {
       System.out.println("USE :java flowDome parameter1 parameter2 circle");
       System.out.println("parameter1 : �Ƚ�����1����������");
       System.out.println("parameter2 : �Ƚ�����2����������");
       System.out.println("circle ��ѭ������");
       System.out.println("ego:java flowDome 1 2 5");
       return;
     }else{
       iPara1 = Integer.parseInt(arges[0]);
       iPara2 = Integer.parseInt(arges[1]);
       iEnd = Integer.parseInt(arges[2]);
     }
     
     //if���
     if (iPara2>iPara1) {
      System.out.println("if �������㣡");
      System.out.println("��2�����ȵ�1������");
     } else {
      System.out.println("if ���������㣡");
      System.out.println("��2�����ȵ�1����С��");
     }

     
     
     //forѭ������
     for (int i=0;i<iEnd;i++) {
       System.out.println("����for ��"+i+"��ѭ��");
     }

     
     //whileѭ������
     int i=0;
     while (i<iEnd) {
      System.out.println("����while ��"+i+"��ѭ��");
      i++;
     }
     
     //do-whileѭ������
     int j=0;
     do {
      System.out.println("����do-while ��"+j+"��ѭ��");
      j++;
     }while(j<iEnd);
   }
 }
