import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UseCase3 extends JFrame{
public UseCase3(){
	setBounds(300,200,300,150);
	//setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("��¼����");
	Container cp=getContentPane();
	cp.setBackground(Color.green);
	cp.setLayout(null);
	JLabel jl=new JLabel("�û�����");
	jl.setBounds(10, 10, 200, 18);
	final JTextField name=new JTextField();
	name.setBounds(80, 10, 150, 18);
	JLabel jl2=new JLabel("���룺");
	jl2.setBounds(10, 50, 200, 18);
	JPasswordField password=new JPasswordField();
	password.setEchoChar('#');
	password.setBounds(80, 50, 150, 18);
	cp.add(jl);
	cp.add(name);
	cp.add(jl2);
	cp.add(password);
	JButton jb=new JButton("ȷ��");
	jb.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			if(name.getText().trim().length()==0||new String(password.getPassword()).trim().length()==0){
				JOptionPane.showMessageDialog(null, "�û������벻����Ϊ��");
				return;
			}
			if(name.getText().trim().equals("mr")&&new String(password.getPassword()).trim().equals("mrsoft")){
				JOptionPane.showMessageDialog(null, "��¼�ɹ�");
			}
			else{
				JOptionPane.showMessageDialog(null, "�û������������");
			}
		}
	});
	jb.setBounds(80, 80, 60, 18);
	jb.setBackground(Color.yellow);
	cp.add(jb);
	final JButton button = new JButton();
	button.setText("����");
	button.setBackground(Color.YELLOW);
	button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			// TODO �Զ����ɷ������
			name.setText("");
			password.setText("");
		}
	});
	button.setBounds(150, 80, 60, 18);
	//getContentPane().add(button);
	cp.add(button);
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new UseCase3();
	}

}
