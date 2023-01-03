package T_221201;

public class MainFrame {
	private Frame f;
	private TextField id, pwd, tfMsg;
	private Button btn;
	private LoginDAO dao;

	public MainFrame() {
		dao = new LoginDAO();
		f = new Frame("Login");
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		id = new TextField(10);
		pwd = new TextField(10);
		pwd.setEchoChar('*');

		btn = new Button("Login");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfMsg.setText("");
				if (id.getText().equals("")) {
					tfMsg.setText("ID를 입력하세요.");
				} else if (pwd.getText().equals("")) {
					tfMsg.setText("Password를 입력하세요.");
				} else {
					ArrayList<LoginVo> list = dao.list(id.getText());
					if (list.size() == 0) {
						tfMsg.setText("로그인에 실패하였습니다.");
					} else {
						LoginVo data = (LoginVo) list.get(0);
						String spwd = data.getPwd();
						if (pwd.getText().equals(spwd)) {
							tfMsg.setText("로그인 되었습니다.");
						} else {
							tfMsg.setText("패스워드가 틀렸습니다.");
						}
					}
				}
			}
		});
		tfMsg = new TextField(50);
		tfMsg.setEditable(false);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btn);
		f.add(tfMsg);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}

