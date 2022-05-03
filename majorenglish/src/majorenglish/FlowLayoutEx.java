package majorenglish;

import javax.swing.*;
import java.awt.*;
import java.awt.Dialog.ModalExclusionType;

public class FlowLayoutEx extends JFrame{
	FlowLayoutEx(){
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		Container cP = getContentPane();
		cP.setBackground(Color.green);
		cP.setFont(new Font("Arial",Font.ITALIC,40));
		
		cP.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		cP.add(new JLabel(cP.getFont().toString()));
		cP.add(new JLabel(cP.toString()));
		cP.setLayout(new FlowLayout(0,30,40));
		cP.add(new JLabel(cP.toString()));
		cP.add(new JButton("0 : 좌측정렬"));
		cP.add(new JButton("1 : 중앙정렬"));
		cP.add(new JButton("2 : 우측정렬"));
		cP.add(new JButton("3 : 시작지점(좌)부터 정렬"));
		cP.add(new JButton("4 : 끝지점(우)부터 정렬"));
		cP.add(new JLabel("FlowLayout 실습"));
		cP.add(new JLabel(cP.getLayout().getClass().toString()));
		cP.add(new JLabel(cP.getLayout().toString()));
		setSize(1150,400);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
		

	}

}
