import java.io.File;

class FileByType{
    public static void main(String[] args){
      String targetPath="C:\\Users\\201011\\Desktop\\javaEx";
      System.out.println(targetPath);
      File targetFolder=new File(targetPath);


      String[] list=targetFolder.list();
      int  count=list.length;
      for (int i=0;i<count;i++){
          String list2=targetPath+"\\"+list[i];
          File targetFolder2=new File(list2);
          long size = targetFolder2.length();

          boolean isDir=targetFolder2.isDirectory();
          boolean isFile=targetFolder2.isFile();

          if(isFile==true){
             System.out.println("ファイル:"+list[i]+"("+size+")");
          }else if(isDir==true){
             System.out.println("フォルダ:"+list[i]+"("+size+")");
          }
      }
    }
}
