package ex4_memo_app;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Memo {
	static String msg = "";

	public static void main(String[] args) {
		Frame f = new Frame("메모장");
		f.setBounds(500, 200, 250, 330);
		f.setLayout(null);

		Font font = new Font("", Font.PLAIN, 20);

		// 상단에 자리잡을 컴포넌트들 --------------------
		TextField tf = new TextField();
		tf.setBounds(10, 50, 180, 20);
		Button btn = new Button("ok");
		btn.setBounds(195, 49, 40, 20);
		btn.setEnabled(false);

		// 중앙에 자리잡을 컴포턴트들 --------------------
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 90, 230, 180);
		ta.setFont(font);
		ta.setEditable(false); // ta에 직접적으로 값을 입력하는 것을 방지
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				msg += tf.getText() + "\n";
				ta.setText(msg);
				tf.setText("");
				tf.requestFocus(); // tf로 커서가 이동됨
			}
		});

		// 엔터 값으로 tf의 값을 ta에 추가 가끔 꼬일 때 있음
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					msg += tf.getText() + "\n";
					ta.setText(msg);
					tf.setText("");
					tf.requestFocus(); // tf로 커서가 이동됨
				}
			}
		});

		// 하단에 자리잡을 컴포턴트들 --------------------
		Button btnSave = new Button("저장");
		btnSave.setBounds(10, 280, 180, 30);
		Button btnClose = new Button("닫기");
		btnClose.setBounds(200, 280, 40, 30);

		// 저장버튼 클릭시 이벤트 감지자
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String msg = ta.getText();
				FileWriter fw = null;
				BufferedWriter bw = null;

				try {
					// 팝업창
					FileDialog fd = new FileDialog(f, "저장", FileDialog.SAVE);
					fd.setVisible(true);
					// 내가 선택한 파일 경로
					String path = fd.getDirectory() + fd.getFile();
					System.out.println(path);
					fw = new FileWriter(path, true);
					bw = new BufferedWriter(fw);
					bw.write(msg);
					bw.flush();
					System.out.println(fd.getFile());
					if (fd.getFile() != null) {
						// 팝업창
						JOptionPane.showMessageDialog(f, "저장완료");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				} finally {
					try {
						bw.close();
						fw.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}

			}
		});

		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
			}
		});
		// --------------------------------------

		// textField(tf)값이 있는 경우에만 ok버튼 활성화
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				// TODO Auto-generated method stub
				if (tf.getText().trim().equals("")) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}

			}
		});

		f.add(tf);
		f.add(btn);
		f.add(ta);
		f.add(btnSave);
		f.add(btnClose);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		f.setResizable(false); // 크기조정 막음
		f.setVisible(true);
	}
}
