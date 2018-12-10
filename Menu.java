import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldMasach;
	private JTextField textFieldMatheloai;
	private JTextField textFieldMaNXB;
	private JTextField textFieldTensach;
	private JTextField textFieldMatacgia;
	private JTextField textFieldSoluong;
	private JTextField textFieldDongia;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table_2;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTable table_3;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTable ThongtinSachTraCuu;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTable table_4;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTable table_5;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTable ThongTinSachTonKho;
	private JTable ThongTinNo;
	private JTable ThongTinTK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Quản lý bản sách");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 863, 553);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Trang chủ", null, panel_1, null);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 858, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 525, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Quản lý sách", null, panel, null);
		
		JLabel lblNewLabel = new JLabel("M\u00E3 s\u00E1ch");
		
		textFieldMasach = new JTextField();
		textFieldMasach.setColumns(10);
		
		JLabel lblMThLoi = new JLabel("M\u00E3 th\u1EC3 lo\u1EA1i");
		
		textFieldMatheloai = new JTextField();
		textFieldMatheloai.setColumns(10);
		
		JLabel lblMNhXut = new JLabel("M\u00E3 nh\u00E0 xu\u1EA5t b\u1EA3n");
		
		textFieldMaNXB = new JTextField();
		textFieldMaNXB.setColumns(10);
		
		JLabel lblTnSch = new JLabel("T\u00EAn s\u00E1ch");
		
		JLabel lblMTcGi = new JLabel("M\u00E3 t\u00E1c gi\u1EA3");
		
		JLabel lblSLng = new JLabel("S\u1ED1 l\u01B0\u1EE3ng");
		
		textFieldTensach = new JTextField();
		textFieldTensach.setColumns(10);
		
		textFieldMatacgia = new JTextField();
		textFieldMatacgia.setColumns(10);
		
		textFieldSoluong = new JTextField();
		textFieldSoluong.setColumns(10);
		
		JLabel lblnGi = new JLabel("\u0110\u01A1n gi\u00E1");
		
		textFieldDongia = new JTextField();
		textFieldDongia.setColumns(10);
		
		JButton btnThm = new JButton("Th\u00EAm");
		
		JButton btnXa = new JButton("X\u00F3a");
		
		JButton btnNewButton = new JButton("S\u1EEDa");
		
		JButton btnLu = new JButton("L\u01B0u");
		btnLu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnHyB = new JButton("H\u1EE7y b\u1ECF");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(lblMThLoi))
									.addGap(41)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(textFieldMasach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldMatheloai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblMNhXut)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldMaNXB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(63)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblTnSch)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(textFieldTensach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblMTcGi)
											.addGap(39)
											.addComponent(textFieldMatacgia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(74)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSLng)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(14)
											.addComponent(lblnGi))))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(btnThm)
									.addGap(121)
									.addComponent(btnXa)))
							.addGap(39)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldDongia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldSoluong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton))
									.addGap(100)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnLu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnHyB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textFieldMasach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTnSch)
						.addComponent(textFieldTensach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSLng)
						.addComponent(textFieldSoluong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLu))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMThLoi)
						.addComponent(textFieldMatheloai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMTcGi)
						.addComponent(textFieldMatacgia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblnGi)
						.addComponent(textFieldDongia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMNhXut)
						.addComponent(textFieldMaNXB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThm)
						.addComponent(btnXa)
						.addComponent(btnNewButton)
						.addComponent(btnHyB))
					.addGap(24)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"T\u00EAn s\u00E1ch", "M\u00E3 s\u00E1ch", "M\u00E3 NXB", "M\u00E3 t\u00E1c gi\u1EA3", "M\u00E3 th\u1EC3 lo\u1EA1i", "\u0110\u01A1n gi\u00E1", "S\u1ED1 l\u01B0\u1EE3ng"
			}
		));
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Tra cứu", null, tabbedPane_1, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("Tra cứu hóa đơn", null, panel_7, null);
		
		JRadioButton rdbtnSHan = new JRadioButton("Số hóa đơn");
		
		JRadioButton rdbtnMNhnVin = new JRadioButton("Mã nhân viên");
		
		JRadioButton rdbtnMKhchHng = new JRadioButton("Mã khách hàng");
		
		JRadioButton rdbtnNgyLp = new JRadioButton("Ngày lập");
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		
		JButton btnTmKim_1 = new JButton("Tìm kiếm");
		
		JButton btnXa_4 = new JButton("Xóa");
		
		JButton btnHy_4 = new JButton("Hủy");
		
		JLabel lblNewLabel_10 = new JLabel("Tìm kiếm CTHĐ theo số hóa đơn");
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		
		JButton btnXemCth = new JButton("Xem CTHĐ");
		
		JButton btnInHan_1 = new JButton("In Hóa đơn");
		
		JButton btnXaHan_1 = new JButton("Xóa hóa đơn");
		
		JScrollPane scrollPane_5 = new JScrollPane();
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnSHan)
								.addComponent(rdbtnMNhnVin)
								.addComponent(rdbtnMKhchHng)
								.addComponent(rdbtnNgyLp))
							.addGap(30)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_20, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addComponent(textField_21)
								.addComponent(textField_22)
								.addComponent(textField_23))
							.addGap(51)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(btnHy_4)
								.addGroup(gl_panel_7.createSequentialGroup()
									.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
										.addComponent(btnTmKim_1)
										.addComponent(btnXa_4))
									.addGap(94)
									.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_7.createSequentialGroup()
											.addComponent(btnXemCth)
											.addGap(18)
											.addComponent(btnInHan_1)
											.addGap(18)
											.addComponent(btnXaHan_1))
										.addGroup(gl_panel_7.createSequentialGroup()
											.addComponent(lblNewLabel_10)
											.addGap(18)
											.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))))))
						.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 829, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnSHan)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTmKim_1)
						.addComponent(lblNewLabel_10)
						.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnMNhnVin)
						.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnXa_4)
						.addComponent(btnXemCth)
						.addComponent(btnInHan_1)
						.addComponent(btnXaHan_1))
					.addGap(18)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnMKhchHng)
						.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnHy_4))
					.addGap(18)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNgyLp)
						.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"S\u1ED1 h\u00F3a \u0111\u01A1n", "Ng\u00E0y l\u1EADp", "T\u1ED5ng gi\u00E1 tr\u1ECB", "M\u00E3 nh\u00E2n vi\u00EAn", "M\u00E3 kh\u00E1ch h\u00E0ng"
			}
		));
		scrollPane_5.setViewportView(table_4);
		panel_7.setLayout(gl_panel_7);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Tra cứu sách", null, panel_6, null);
		panel_6.setLayout(null);
		
		JRadioButton lblTnSch_1 = new JRadioButton("Tên sách");
		lblTnSch_1.setBounds(10, 40, 102, 14);
		panel_6.add(lblTnSch_1);
		
		JRadioButton lblNewLabel_9 = new JRadioButton("Thể loại");
		lblNewLabel_9.setBounds(10, 95, 102, 14);
		panel_6.add(lblNewLabel_9);
		
		JRadioButton lblNxb = new JRadioButton("NXB");
		lblNxb.setBounds(10, 146, 46, 14);
		panel_6.add(lblNxb);
		
		JRadioButton lblTcGi = new JRadioButton("Tác giả");
		lblTcGi.setBounds(10, 196, 102, 14);
		panel_6.add(lblTcGi);
		
		textField_16 = new JTextField();
		textField_16.setBounds(118, 40, 201, 20);
		panel_6.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(118, 95, 201, 20);
		panel_6.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(118, 146, 201, 20);
		panel_6.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(118, 196, 201, 20);
		panel_6.add(textField_19);
		textField_19.setColumns(10);
		
		JButton btnTmKim = new JButton("Tìm kiếm");
		btnTmKim.setBounds(450, 36, 89, 23);
		panel_6.add(btnTmKim);
		
		JButton btnHy_3 = new JButton("Hủy");
		btnHy_3.setBounds(450, 91, 89, 23);
		panel_6.add(btnHy_3);
		
		JButton btnXa_3 = new JButton("Xóa");
		btnXa_3.setBounds(450, 142, 89, 23);
		panel_6.add(btnXa_3);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 250, 833, 236);
		panel_6.add(scrollPane_4);
		
		ThongtinSachTraCuu = new JTable();
		scrollPane_4.setViewportView(ThongtinSachTraCuu);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_1.addTab("Tra cứu phiếu nhập", null, panel_8, null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Số phiếu nhập");
		
		JRadioButton rdbtnMNhnVin_1 = new JRadioButton("Mã nhân viên");
		
		JRadioButton rdbtnMNhXut = new JRadioButton("Mã nhà xuất bản");
		
		JRadioButton rdbtnNgyLp_1 = new JRadioButton("Ngày lập");
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		
		JButton btnTmKim_2 = new JButton("Tìm kiếm");
		
		JButton btnXa_5 = new JButton("Xóa");
		
		JButton btnHy_5 = new JButton("Hủy");
		
		JLabel lblTmCtpnTheo = new JLabel("Tìm CTPN theo số phiếu nhập");
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Xem CTPN");
		
		JButton btnInPhiuNhp = new JButton("In phiếu nhập");
		
		JButton btnNewButton_2 = new JButton("Xóa CTPN");
		
		JScrollPane scrollPane_6 = new JScrollPane();
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_6, GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(rdbtnMNhnVin_1)
								.addComponent(rdbtnMNhXut)
								.addComponent(rdbtnNgyLp_1))
							.addGap(23)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_28)
								.addComponent(textField_27)
								.addComponent(textField_26)
								.addComponent(textField_25, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
							.addGap(35)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
								.addComponent(btnHy_5)
								.addGroup(gl_panel_8.createSequentialGroup()
									.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
										.addComponent(btnTmKim_2)
										.addComponent(btnXa_5))
									.addGap(64)
									.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel_8.createSequentialGroup()
											.addComponent(btnNewButton_1)
											.addGap(42)
											.addComponent(btnInPhiuNhp)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnNewButton_2))
										.addGroup(gl_panel_8.createSequentialGroup()
											.addComponent(lblTmCtpnTheo)
											.addGap(18)
											.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))))))
					.addContainerGap())
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTmKim_2)
						.addComponent(lblTmCtpnTheo)
						.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnMNhnVin_1)
						.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnXa_5)
						.addComponent(btnNewButton_1)
						.addComponent(btnInPhiuNhp)
						.addComponent(btnNewButton_2))
					.addGap(18)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnMNhXut)
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnHy_5))
					.addGap(18)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNgyLp_1)
						.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addComponent(scrollPane_6, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"S\u1ED1 phi\u1EBFu", "Ng\u00E0y l\u1EADp phi\u1EBFu", "T\u1ED5ng gi\u00E1 tr\u1ECB", "M\u00E3 nh\u00E2n vi\u00EAn", "M\u00E3 NXB"
			}
		));
		scrollPane_6.setViewportView(table_5);
		panel_8.setLayout(gl_panel_8);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Nghiệp vụ", null, tabbedPane_2, null);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_2.addTab("Lập phiếu chi", null, panel_9, null);
		
		JLabel lblNewLabel_5 = new JLabel("Số phiếu chi");
		
		JLabel lblNgyLp_1 = new JLabel("Ngày lập");
		
		JLabel lblLDoChi = new JLabel("Lý do chi");
		
		JLabel lblNewLabel_6 = new JLabel("Số tiền chi");
		
		JLabel lblNewLabel_7 = new JLabel("Số phiếu nhập");
		
		JLabel lblNewLabel_8 = new JLabel("Mã nhân viên");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		JButton btnLu_3 = new JButton("Lưu");
		
		JButton btnHy_2 = new JButton("Hủy");
		
		JButton btnLp_1 = new JButton("Lập");
		
		JButton btnIn_1 = new JButton("In");
		
		JButton btnXa_2 = new JButton("Xóa");
		
		JButton btnSa_2 = new JButton("Sửa");
		
		JScrollPane scrollPane_3 = new JScrollPane();
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNgyLp_1)
						.addComponent(lblLDoChi)
						.addComponent(btnLu_3))
					.addGap(18)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_12)
								.addComponent(textField_11)
								.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
							.addGap(82)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_8)
								.addComponent(lblNewLabel_6))
							.addGap(18)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_15)
								.addComponent(textField_14)
								.addComponent(textField_13, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
							.addGap(80)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
								.addComponent(btnLp_1)
								.addComponent(btnXa_2))
							.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
								.addComponent(btnIn_1)
								.addComponent(btnSa_2))
							.addContainerGap())
						.addGroup(gl_panel_9.createSequentialGroup()
							.addComponent(btnHy_2)
							.addContainerGap(717, Short.MAX_VALUE))))
				.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLp_1)
						.addComponent(btnIn_1))
					.addGap(27)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNgyLp_1)
						.addComponent(lblNewLabel_7)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnXa_2)
						.addComponent(btnSa_2))
					.addGap(29)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLDoChi)
						.addComponent(lblNewLabel_8)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLu_3)
						.addComponent(btnHy_2))
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
		);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"S\u1ED1 phi\u1EBFu chi", "Ng\u00E0y l\u1EADp", "L\u00FD do chi", "S\u1ED1 ti\u1EC1n chi", "S\u1ED1 phi\u1EBFu nh\u1EADp", "M\u00E3 nh\u00E2n vi\u00EAn"
			}
		));
		scrollPane_3.setViewportView(table_3);
		panel_9.setLayout(gl_panel_9);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_2.addTab("Lập hóa đơn", null, panel_2, null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblSHan = new JLabel("Số hóa đơn");
		
		JLabel lblNewLabel_1 = new JLabel("Ngày lập");
		
		JLabel lblNewLabel_2 = new JLabel("Mã nhân viên");
		
		JLabel lblMKhchHng = new JLabel("Mã khách hàng");
		
		JLabel lblTngGiTr = new JLabel("Tổng giá trị");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton btnLu_1 = new JButton("Lưu");
		
		JButton btnHy = new JButton("Hủy");
		
		JButton btnLpHan = new JButton("Lập hóa đơn");
		
		JButton btnSa = new JButton("Sửa");
		
		JButton btnXaHan = new JButton("Xóa hóa đơn");
		
		JButton btnInHan = new JButton("In hóa đơn");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 853, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblSHan)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblTngGiTr)
						.addComponent(lblMKhchHng, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnHy, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(48)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_4)
								.addComponent(textField_3)
								.addComponent(textField_2)
								.addComponent(textField_1)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
							.addGap(177)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnInHan, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnLpHan, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(42)
							.addComponent(btnSa)
							.addGap(45)
							.addComponent(btnXaHan))
						.addComponent(btnLu_1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSHan)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTngGiTr, Alignment.TRAILING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblMKhchHng)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(41)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnLpHan)
								.addComponent(btnSa)
								.addComponent(btnXaHan))
							.addGap(18)
							.addComponent(btnInHan)))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnHy)
						.addComponent(btnLu_1))
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
		);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"S\u1ED1 th\u1EE9 t\u1EF1", "M\u00E3 thi\u1EBFt b\u1ECB", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1", "Th\u00E0nh ti\u1EC1n"
			}
		));
		scrollPane_1.setViewportView(table_1);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_2.addTab("Lập phiếu nhập", null, panel_5, null);
		
		JLabel lblSPhiuNhp = new JLabel("Số phiếu nhập");
		
		JLabel lblNgyLp = new JLabel("Ngày lập");
		
		JLabel lblNewLabel_3 = new JLabel("Mã nhà cung cấp");
		
		JLabel lblNewLabel_4 = new JLabel("Mã nhân viên");
		
		JLabel lblTngGiTr_1 = new JLabel("Tổng giá trị");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JButton btnLu_2 = new JButton("Lưu");
		
		JButton btnHy_1 = new JButton("Hủy");
		
		JButton btnLp = new JButton("Lập");
		
		JButton btnSa_1 = new JButton("Sửa");
		
		JButton btnXa_1 = new JButton("Xóa");
		
		JButton btnIn = new JButton("In");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSPhiuNhp)
						.addComponent(lblNgyLp)
						.addComponent(lblNewLabel_3))
					.addGap(56)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_7)
								.addComponent(textField_6)
								.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblTngGiTr_1)
								.addComponent(btnLu_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(56)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
									.addComponent(textField_9)
									.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
								.addComponent(btnHy_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
							.addGap(59))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(btnSa_1)
							.addGap(94)
							.addComponent(btnLp)
							.addGap(93)
							.addComponent(btnXa_1)
							.addGap(94)
							.addComponent(btnIn))))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 855, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTngGiTr_1)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSPhiuNhp)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNgyLp)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLu_2)
								.addComponent(btnHy_1))))
					.addGap(36)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnLp)
							.addComponent(btnSa_1))
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnIn)
							.addComponent(btnXa_1)))
					.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
		);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"S\u1ED1 th\u1EE9 t\u1EF1", "M\u00E3 s\u00E1ch", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1", "Th\u00E0nh ti\u1EC1n"
			}
		));
		scrollPane_2.setViewportView(table_2);
		panel_5.setLayout(gl_panel_5);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Báo cáo", null, tabbedPane_3, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_3.addTab("Báo cáo tồn", null, panel_3, null);
		
		JLabel lblThng = new JLabel("Tháng");
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		
		JLabel lblNm = new JLabel("Năm");
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		
		JButton btnXem = new JButton("Xem");
		
		JScrollPane scrollPane_7 = new JScrollPane();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(37)
					.addComponent(lblThng)
					.addGap(18)
					.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(71)
					.addComponent(lblNm)
					.addGap(18)
					.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(72)
					.addComponent(btnXem)
					.addGap(14))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_7, GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblThng)
						.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNm)
						.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnXem))
					.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
					.addComponent(scrollPane_7, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		ThongTinSachTonKho = new JTable();
		scrollPane_7.setViewportView(ThongTinSachTonKho);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_3.addTab("Báo cáo nợ", null, panel_10, null);
		
		JButton button = new JButton("Xem");
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		
		JLabel label = new JLabel("Năm");
		
		JLabel label_1 = new JLabel("Tháng");
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(61)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(71)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(72)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_8, GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGap(4)
							.addComponent(label_1))
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGap(4)
							.addComponent(label))
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(button))
					.addPreferredGap(ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
					.addComponent(scrollPane_8, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		ThongTinNo = new JTable();
		scrollPane_8.setViewportView(ThongTinNo);
		panel_10.setLayout(gl_panel_10);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Thống kê", null, panel_4, null);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblTNgy = new JLabel("Từ ngày");
		
		JLabel lblnNgy = new JLabel("Đến ngày");
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblTheoNgy = new JLabel("Theo ngày :");
		
		JLabel lblTheoThng = new JLabel("Theo tháng :");
		
		JLabel lblTheoNm = new JLabel("Theo năm :");
		
		JComboBox comboBox_2 = new JComboBox();
		
		JComboBox comboBox_3 = new JComboBox();
		
		JButton btnThngKDoanh = new JButton("Thống kê doanh thu");
		
		JButton btnThngKKhch = new JButton("Thống kê khách hàng");
		
		JButton btnThngKSch = new JButton("Thống kê sách đã bán");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_9, GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTheoNgy)
								.addComponent(lblTheoThng)
								.addComponent(lblTheoNm))
							.addGap(79)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addComponent(lblTNgy)
									.addGap(18)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblnNgy)
									.addGap(18)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(82)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(btnThngKSch)
								.addComponent(btnThngKKhch)
								.addComponent(btnThngKDoanh))))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTNgy)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblnNgy)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTheoNgy)
						.addComponent(btnThngKSch))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTheoThng)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThngKDoanh))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTheoNm)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnThngKKhch)))
					.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
					.addComponent(scrollPane_9, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		ThongTinTK = new JTable();
		ThongTinTK.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane_9.setViewportView(ThongTinTK);
		panel_4.setLayout(gl_panel_4);
	}
}
