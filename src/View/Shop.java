package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Source.BookV;
import Source.database;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;


public class Shop extends JFrame {
	private JPasswordField passwordField;
	private JTextField textField;
	private int 	id[]=new int[50];
	
	private byte sosach=0;
	private float tonggia =0;
	private JTextField textField_1;
	private int selecidx=-1;
	database data = new database();
	BookV b[] = new BookV[50];
	
	public Shop() {
		setTitle("SHOP");
		Toolkit tk =Toolkit.getDefaultToolkit();
		short h=(short)tk.getScreenSize().height;
		short w=(short)tk.getScreenSize().width;
		setBounds(0, 0, w, h-40);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		passwordField = new JPasswordField(15);
		panel.add(passwordField);
		
		JButton btnLogOut = new JButton("Change");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(data.chuyenkho(passwordField.getText())) {
				new Kho();
				btchangeshop();
				}
			}
		});
		panel.add(btnLogOut);
		
		
		final DefaultListModel listmodel = new DefaultListModel();
		final DefaultListModel listModelgia=new DefaultListModel();
		
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		JLabel lblThanhTien = new JLabel("Thanh Tien");
		panel_3.add(lblThanhTien);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
	
		
		JButton btnXuat = new JButton("Xuat");
		btnXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				data.sachdaban(b,sosach,tonggia);
				textField_1.setText("0");
				listmodel.removeAllElements();
				listModelgia.removeAllElements();
			}
		});
		panel_3.add(btnXuat);
		
		JButton btnXoa = new JButton("Xoa duoc chon");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(selecidx>-1) {
					sosach--;
					tonggia= tonggia-b[selecidx].getgia();
					for(int i = selecidx;i<sosach;i++) {
						b[i]=b[i+1];
					}
					listModelgia.remove(selecidx);
					listmodel.remove(selecidx);
					textField_1.setText(String.valueOf(tonggia));
					
				}
			}
		});
		panel_3.add(btnXoa);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setBorder(null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setAlignment(FlowLayout.RIGHT);
		panel_1.add(panel_2, BorderLayout.NORTH);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(20);
		
				JButton btnNewButton = new JButton("Nhap");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						try{
								id[sosach]=Integer.parseInt(textField.getText());
								if(textField.getText().equals("") ) {
									}
								else
								b[sosach]=data.laysach(id[sosach]);
								listmodel.addElement(b[sosach].getten());
								listModelgia.addElement(String.valueOf(b[sosach].getgia()));
								tonggia=tonggia + b[sosach].getgia();
								textField_1.setText(String.valueOf(tonggia));
								sosach++;
								textField.setText("");
							}
						catch (Exception e) {
							 textField.setText("");
							}
						
						
					}
				});
				panel_2.add(btnNewButton);
				
				JPanel panel_4 = new JPanel();
				panel_1.add(panel_4, BorderLayout.CENTER);
				panel_4.setLayout(null);
				
				final JList list = new JList(listmodel);
				list.setBounds(5, 5, w-200,h-200);
				panel_4.add(list);
				
				final JList list_1 = new JList(listModelgia);
				list_1.setEnabled(false);
				list_1.setBounds(w-180, 5, 140, h-200);
				panel_4.add(list_1);
				
				
				list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			    list.addListSelectionListener(new ListSelectionListener() {
			      public void valueChanged(ListSelectionEvent le) {
			        int idx = list.getSelectedIndex();
			        selecidx=idx;
			      }
			    });
			    
	}
	public void btchangeshop() {
		dispose();
	}
}
