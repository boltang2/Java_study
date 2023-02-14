package ex2_button;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_CheckBox {
	public static void main(String[] args) {
		Frame f = new Frame("질문");
		f.setBounds(500, 200, 800, 250);
		f.setLayout(null);

		// 폰트와 관련된 클래스 // bold 두껍 italic 비스듬히
		Font font = new Font("궁서체", Font.ITALIC, 30);

		// 고정된 텍스트를 보여주기 위한 클래스
		Label q1 = new Label("1. 당신의 취미는 무엇입니까?");
		q1.setFont(font);
		q1.setBounds(50, 50, 400, 30);
		q1.setBackground(Color.magenta);
		// 성별을 묻니는 label 생설
		Label q2 = new Label("당신의 성별은 무엇입니까");
		q2.setBounds(10, 140, 410, 50);

		// 다중선택이 불가능한 radiobutton생성
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("남자", group, false);
		Checkbox female = new Checkbox("여자", group, false);
		male.setBounds(10, 200, 100, 50);
		female.setBounds(120, 200, 100, 50);

		// 라디오버튼의 이벤트 감지자
		ItemListener radio_check = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String str = e.getItem().toString();
				System.out.println(str);
			}
		};

		male.addItemListener(radio_check);
		female.addItemListener(radio_check);

		// 체크박스의 선택을 감지하는 감지자
		ItemListener check_click = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String str = e.getItem().toString();
				String res = "";

				switch (str) {
				case "영화":
					res = e.getStateChange() == 1 ? "영화 선택" : "영화 해제됨";
					break;
				case "독서":
					res = e.getStateChange() == 1 ? "독서 선택" : "독서 해제됨";
					break;

				default:
					break;
				}
				System.out.println(res);
			}
		};

		// 체크박스 생성
		Checkbox movie = new Checkbox("영화");
		movie.setBounds(10, 100, 100, 50);
		Checkbox book = new Checkbox("독서");
		book.setBounds(120, 100, 100, 50);
		Checkbox game = new Checkbox("게임");
		game.setBounds(230, 100, 100, 50);

		// 체크박스들에게 이벤트 감지자 등록
		movie.addItemListener(check_click);
		book.addItemListener(check_click);
		game.addItemListener(check_click);

		f.add(q1);
		f.add(movie);
		f.add(book);
		f.add(game);
		f.add(male);
		f.add(female);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
