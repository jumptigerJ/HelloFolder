import java.io.File;

public class HelloFolder {

	public static void main(String[] args) {
		
//		File folder = new File("my new folder/one/two/three/main");
//		if(folder.mkdirs()){
//			System.out.println("�ļ��б�����");
//		}else{
//			if(folder.exists()){
//				System.out.println("�ļ����Ѿ�����");
//			}else{
//				System.out.println("�ļ��д���ʧ��");
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
			System.out.println("�ļ����ѱ�ɾ��");
		}else{
			System.out.println("�ļ���ɾ��ʧ��");
		}
	}
}
