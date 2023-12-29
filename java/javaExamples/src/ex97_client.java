import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
public class ex97_client {
    public static void main(String[] args) {
        Socket socket = null;
        socket = new Socket();

        Scanner sc = new Scanner(System.in);
        try {
            //"127.0.0.1"서버주소
            //5001 포트번호
            socket.connect(new InetSocketAddress("192.168.0.51", 5001));
            System.out.println("서버 접속 성공!");

            //서버에 문자열 데이타를 보낸다
            byte[] bytes = null;

            String cmd = null;


            OutputStream os = socket.getOutputStream();
            cmd = "c1,0,0,1";
            bytes = cmd.getBytes("UTF-8");
            os.write(bytes);
            os.flush();//버퍼메모리의 모든 데이타를 남김없이 전송
            System.out.println("데이타보내기 성공");

            //서버 -> 클라로 데이타 받기
            InputStream is = socket.getInputStream();
            bytes = new byte[1024];
            int readByteCount = is.read(bytes);
            cmd = new String(bytes,0,readByteCount,"UTF-8");




            System.out.println("데이타 받기 성공" + cmd);

            os.close();
            is.close();


        }catch (Exception e){
            System.out.println("서버 접속 오류!");
        }
    }
}
