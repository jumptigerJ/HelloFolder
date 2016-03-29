import java.io.File;

public class HelloFolder {

	public static void main(String[] args) {
		
//		File folder = new File("my new folder/one/two/three/main");
//		if(folder.mkdirs()){
//			System.out.println("文件夹被创建");
//		}else{
//			if(folder.exists()){
//				System.out.println("文件夹已经存在");
//			}else{
//				System.out.println("文件夹创建失败");
//			}
//		}
		
//		File folder = new File("my new folder");
//		File newFolder = new File("my new folder-new");
//		if(folder.renameTo(newFolder)){
//			System.out.println("done");
//		}else{
//			System.out.println("fail");
//		}
		
		File folder = new File("my new folder-new/one/two/three/main");
		if(folder.delete()){
			System.out.println("文件夹已被删除");
		}else{
			System.out.println("文件夹删除失败");
		}
	}
}
