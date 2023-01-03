package T_221201;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
	private Frame f;
	private TextField tfNameInp, tfIdInp, tfPwdInp, tfEmailInp;
	private TextField tfName, tfId, tfPwd, tfEmail;
	private Button btnRegister;
	private TextField tfMsg;

	public void startFrame() {
		f = new Frame("회원 가입");
		f.setSize(400, 350);
		f.setLocation(100, 100);
		f.setLayout(null);

		tfName = new TextField("이름");
		tfName.setFont(new Font("Agency FB", Font.BOLD, 20));
		tfName.setSize(150, 30);
		tfName.setLocation(40, 50);
		tfName.setEditable(false);
		tfName.setFocusable(false);

		tfNameInp = new TextField();
		tfNameInp.setSize(150, 30);
		tfNameInp.setLocation(200, 50);


		tfId.setSize(150, 30);
		tfId.setLocation(40, 90);
		tfId.setEditable(false);
		tfId.setFocusable(false);

		tfIdInp = new TextField();
		tfIdInp.setSize(150, 30);
		tfIdInp.setLocation(200, 90);

		tfPwd = new TextField("비밀번호");
		tfPwd.setSize(150, 30);
		tfPwd.setLocation(40, 130);
		tfPwd.setEditable(false);
		tfPwd.setFocusable(false);

tfPwdInp = new TextField();
		tfPwdInp.setSize(150, 30);
		tfPwdInp.setLocation(200, 130);

		tfEmail = new TextField("이메일");
		tfEmail.setSize(150, 30);
		tfEmail.setLocation(40, 170);
		tfEmail.setEditable(false);
		tfEmail.setFocusable(false);

		tfEmailInp = new TextField();
		tfEmailInp.setSize(150, 30);
		tfEmailInp.setLocation(200, 170);

		btnRegister = new Button("회원가입");
		btnRegister.setSize(310, 30);
		btnRegister.setLocation(40, 220);
		btnRegister.addActionListener(this);

tfMsg = new TextField();
		tfMsg.setSize(310, 30);
		tfMsg.setLocation(40, 270);
		tfMsg.setEditable(false);
		tfMsg.setFocusable(false);

		f.add(tfName);
		f.add(tfNameInp);
		f.add(tfId);
		f.add(tfIdInp);
		f.add(tfPwd);
		f.add(tfPwdInp);
		f.add(tfEmail);
		f.add(tfEmailInp);
		f.add(btnRegister);
		f.add(tfMsg);

		f.setVisible(true);
	}
public static void main(String[] args) {
		Main m = new Main();
		m.startFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("회원가입")) {
			tfMsg.setText("");
			if (tfNameInp.getText().equals("")) {
				tfMsg.setText("이름을 입력하세요.");
			} else if (tfIdInp.getText().isEmpty()) {
				tfMsg.setText("아이디를 입력하세요.");
			} else if (tfPwdInp.getText().isEmpty()) {
				tfMsg.setText("비밀번호를 입력하세요.");
			} else if (tfEmailInp.getText().isEmpty()) {
				tfMsg.setText("이메일을 입력하세요.");
			} else {
				tfMsg.setText("회원 가입이 완료되었습니다.");
			}
		}
	}
