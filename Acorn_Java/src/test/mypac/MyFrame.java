package test.mypac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{

//	생성자
	public MyFrame(){
//		레이아웃 설정
		this.setLayout(new BorderLayout());
		
//		버튼 객체 만들고
		JButton btn = new JButton("눌러보셈");
//		프레임에 버튼을 추가하기
		this.add(btn, BorderLayout.NORTH);
		btn.addActionListener(this);
		
//		프레임의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
//		프레임이 보이도록
		this.setVisible(true);
//		닫기 아이콘을 눌렀을 때 프로세스가 종료되도록
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

//	ActionListener 인터페이스에 정의된 추상 메소드 재정의
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "버튼을 눌렀네?");
	}
}