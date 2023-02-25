import java.util.*;  
 public class Files{  
 public static void main(String args[]){  
  ArrayList<String> file=new ArrayList<String>();
  file.add("\tFile1");
  file.add("\t\tFile2");
  file.add("\t\tFile3");
  file.add("\t\t\tFile4");
  file.add("\t\tFile5");
  file.add("\tFile6");
  System.out.println(file);
 // HashMap<String,String>map=new HashMap<>();
 // String parentfile=null;
 System.out.println("\n");
 System.out.println("\tfile "+ "\t  " +"    \t\t\t\tParent class\n");
  for(int i=0;i<file.size();i++){
    if(file.get(i).lastIndexOf("\t")==0){
    System.out.println(file.get(i)+" \t \t\t\t\tnull");
    }
    else if(file.get(i).lastIndexOf("\t")==1){
        System.out.println(file.get(i)+"\t\t\t"+file.get(0));
    }
    else if(file.get(i).lastIndexOf("\t")==2){
        System.out.println(file.get(i)+"\t"+file.get(i-1));
    }

  }
}
 }