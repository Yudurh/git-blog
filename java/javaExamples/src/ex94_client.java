import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ex94_client {
    public static void main(String[] args) {
        //인터넷 통신 2가지
        //1. TCP/IP 소켓 통신 : Peer to Peer(토렌트)
        //2. HTTP 통신

        //Socket 클래스 : 소켓통신을 지원해주는 클래스
        Socket socket = null;
        socket = new Socket();

        try {
            //"127.0.0.1"서버주소
            //5001 포트번호
            socket.connect(new InetSocketAddress("127.0.0.1", 5001));
            System.out.println("서버 접속 성공!");

            //서버에 문자열 데이타를 보낸다
            byte[] bytes = null;
            String message = null;

            OutputStream os = socket.getOutputStream();
            message = "Hi This is Client";
            bytes = message.getBytes("UTF-8");
            os.write(bytes);
            os.flush();//버퍼메모리의 모든 데이타를 남김없이 전송
            System.out.println("데이타보내기 성공");

            //서버 -> 클라로 데이타 받기
            InputStream is = socket.getInputStream();
            bytes = new byte[1024];
            int readByteCount = is.read(bytes);
            message = new String(bytes,0,readByteCount,"UTF-8");
            System.out.println("데이타 받기 성공" + message);

            os.close();
            is.close();


        }catch (Exception e){
            System.out.println("서버 접속 오류!");
        }

    }
}
