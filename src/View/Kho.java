package View;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.text.StyledEditorKit.StyledTextAction;

import com.sun.glass.events.KeyEvent;

import Source.BookV;
import Source.database;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class Kho extends JFrame implements ActionListener,TableModelListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton_1;
	database data = new database();
	private String[][] tblsach; 
	private int tongsoluongsach=0;
	private JScrollPane scrollPane;
	private JTable table;
	private String[] tencot = {"ID", "Ten", "TacGia","So Luong","Gia"}; 
	private JButton btnXacNhanChinh;
	private JButton btnXoa;
	private boolean thtype=true;
	private boolean cntype=true;
	
	public Kho() {
		setTitle("KHO");
		Toolkit tk =Toolkit.getDefaultToolkit();
		short h=(short)tk.getScreenSize().height;
		short w=(short)tk.getScreenSize().width;
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(30, 10));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		btnNewButton = new JButton("Change");
		
		panel.add(btnNewButton);
		
		panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnNewButton_1 = new JButton("Them");
		
		btnXoa = new JButton("Xoa");
		
		panel_1.add(btnXoa);
		
		
		btnXacNhanChinh = new JButton("Cap nhat");
		
		panel_1.add(btnXacNhanChinh);
		panel_1.add(btnNewButton_1);
		
		tongsoluongsach=data.gettongsosach();
		/// chinh sua bang sach 
		tblsach = new String[100][5];
		data.laytatca(tblsach);
		
		
		
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		
		table = new JTable(tblsach,tencot);
		
	
		TableColumn cot = table.getColumnModel().getColumn(0);
		cot.setMaxWidth(50);
		
		scrollPane.setViewportView(table);
		
		
////////////////////////////////////action listener
		btnXacNhanChinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				boolean err=false;
				
				for(int i=0;i<tongsoluongsach;i++) {
					for(int u =0;u<5;u++) {
						if(((String)table.getValueAt(i,u)).equals("")) {
							switch (u) {
							case 0:
								JOptionPane.showMessageDialog(null,"Loi ID sach", "Khong the cap nhat sach: ", JOptionPane.INFORMATION_MESSAGE);
								err=true;
								break;
							case 1:
								JOptionPane.showMessageDialog(null,"Loi ten sach", "Khong the cap nhat sach: ", JOptionPane.INFORMATION_MESSAGE);
								err=true;
								break;
							case 2:
								JOptionPane.showMessageDialog(null,"Loi ten tac gia", "Khong the cap nhat sach: ", JOptionPane.INFORMATION_MESSAGE);
								err=true;
								break;
							case 3:
								JOptionPane.showMessageDialog(null,"Loi so luong sach", "Khong the cap nhat sach: ", JOptionPane.INFORMATION_MESSAGE);
								err=true;
								break;
							case 4:
								JOptionPane.showMessageDialog(null,"Loi gia sach", "Khong the cap nhat sach: ", JOptionPane.INFORMATION_MESSAGE);
								err=true;
								break;
							default:
								break;
							}
						}
					}
				}
				if(err) {
				}
				else {
					try {
						for(int i =0;i<tongsoluongsach;i++) {
							Integer.parseInt(tblsach[i][0]);
							Integer.parseInt(tblsach[i][3]);
							Double.parseDouble(tblsach[i][4]);
						}
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null,"Sai kieu du lieu", "loi", JOptionPane.OK_OPTION);
						cntype=false;
					}
					if(cntype)
					data.suasach(tblsach,tongsoluongsach);
					else
						cntype=true;
				}	
			}	
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btchangekho();
				new Shop();
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Popup pop = new Popup();
				
				if(	pop.getid().equals("")||
					pop.getten().equals("")||
					pop.gettacgia().equals("")||
					pop.getsoluong().equals("")||
					pop.getgia().equals("")) {
					JOptionPane.showMessageDialog(null,"thong tin sach bi de trong", "loi", JOptionPane.OK_OPTION);
				}
				else {
					try {
						Integer.parseInt(pop.getid());
						Integer.parseInt(pop.getsoluong());
						Double.parseDouble(pop.getgia());
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null,"Sai kieu du lieu", "loi", JOptionPane.OK_OPTION);
						thtype=false;
					}
					if(thtype) {
						tblsach[tongsoluongsach][0]=pop.getid();
						tblsach[tongsoluongsach][1]=pop.getten();
						tblsach[tongsoluongsach][2]=pop.gettacgia();
						tblsach[tongsoluongsach][3]=pop.getsoluong();
						tblsach[tongsoluongsach][4]=pop.getgia();
						table.repaint();
						data.themsach(Integer.parseInt(tblsach[tongsoluongsach][0]),
						tblsach[tongsoluongsach][1],
						tblsach[tongsoluongsach][2],
						Integer.parseInt(tblsach[tongsoluongsach][3]),
						Double.parseDouble(tblsach[tongsoluongsach][4]));
						tongsoluongsach++;
					}
				}
				thtype=true;
				
			}
		});
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int t=table.getSelectedRow();
				String temp=(String) table.getValueAt(t,0);
				if(t>-1 && t<tongsoluongsach-1) {
					data.xoasach(Integer.parseInt(temp));
					tongsoluongsach--;
					for(int i=t;i<tongsoluongsach;i++) {
						tblsach[i][0]=tblsach[i+1][0];
						tblsach[i][1]=tblsach[i+1][1];
						tblsach[i][2]=tblsach[i+1][2];
						tblsach[i][3]=tblsach[i+1][3];
						tblsach[i][4]=tblsach[i+1][4];
					}
					tblsach[tongsoluongsach][0]="";
					tblsach[tongsoluongsach][1]="";
					tblsach[tongsoluongsach][2]="";
					tblsach[tongsoluongsach][3]="";
					tblsach[tongsoluongsach][4]="";
					table.repaint();
					
					
				}
			}
		});
///////////////////////////////////////////		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(0, 0, w,h-40);
		setBounds(0,0,500,500);
		
	}
	public void btchangekho () {
		this.dispose();
	}
	
	public void actionPerformed(ActionEvent arg0) {
	}
	public void tableChanged(TableModelEvent arg0) {
		
	}

}
