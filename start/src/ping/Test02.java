package ping;

import java.io.*;
import java.net.*;

public class Test02 {
	ServerSocket server;
	
	public Test02() {
		try {
			while(true) {
				System.out.println("서버 접속 대기");
				
				// 클라이언트에게 접속 허용
				Socket socket = server.accept();
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println("### " + ip + " ] 접속완료");
				
				// 데이터 입출력 준비
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				
				// 데이터 받기
				byte[] buff = new byte[10240];
				int len = in.read(buff);
				String msg = new String(buff, 0, len);
				
				System.out.println(ip + " : " + msg);
				
				// 응답 메세지
				// 데이터 만들기
				String remsg = msg + " - server";
				// 서버 메세지 전송
				byte[] buff1 = remsg.getBytes();
				out.write(buff1);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}