import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ex95_server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("127.0.0.1",5001));
            while (true){
                System.out.println("서버가 연결을 기다리는 중");
                Socket socket = serverSocket.accept();//Blocking 대기중...
                //요청받은 클라의 정보를 가져옴
                InetSocketAddress isa =
                        (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("서버가 연결을 수락함:" + isa.getHostName());

                //클라의 데이타를 수신한다.
                byte[] bytes = null;
                String message = null;
                InputStream is = socket.getInputStream();
                bytes = new byte[1024]; //1024바이트만큼 버퍼메모리 생성

                int readByteCount = is.read(bytes);
                message = new String(bytes);
                message = new String(bytes, 0, readByteCount,"UTF-8");
                System.out.println("서버가 데이타 수신 성공");
                System.out.println("받은 데이타:" + message);

                //서버가 클라에 데이타를 전송한다
                OutputStream os = socket.getOutputStream();
                message = "Hi~ This is Sever";
                bytes = message.getBytes("UTF-8");
                os.write(bytes);
                os.flush();//버퍼메모리에 데이타를 전송시키기
                System.out.println("서버가 클라에게 데이타를 전송 성공");

                is.close();
                os.close();
                socket.close();
                if (message.equals("exit")){//서버종료
                    break;
                }

                //서버가 클라에 데이타를 전송한다

            }

        }catch (Exception e){
            System.out.println("서버 초기화 오류!");
        }

    }
}
