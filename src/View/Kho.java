package View;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.text.StyledEditorKit.StyledTextAction;
import com.sun.glass.events.KeyEvent;
import Source.BookV;
import Source.database;
import exe.TableCellListener;
import javax.imageio.ImageIO;
import javax.swing.CellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import java.awt.event.InputMethodListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EventObject;
import java.awt.event.InputMethodEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;

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
	private String[] tencot = {"ID", "Tên", "Tác giả","Số lượng","Giá"};
	private JButton btnXacNhanChinh;
	private JButton btnXoa;
	private boolean thtype=true;
	private boolean cntype=true;
	private ArrayList<BookV> bookVs = new ArrayList<BookV>();
	private JComboBox comboBox;
	private JButton button;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblXapXep;
	
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
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.WEST);
		
			btnNewButton = new JButton("Change");
			panel_3.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btchangekho();
					new Shop();
				}
			});
		
		panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.EAST);
		
		lblXapXep = new JLabel("Sắp xếp theo :");
		panel_2.add(lblXapXep);
		
		comboBox = new JComboBox();
		comboBox.addItem("ID");
		comboBox.addItem("Tên");
		comboBox.addItem("Tác giả");
		comboBox.addItem("Số lượng");
		comboBox.addItem("Giá");
		
		panel_2.add(comboBox);
		
		
		

		button = new JButton("↑");
		panel_2.add(button);
		
		panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		ImageIcon iconXoa = new ImageIcon(((new ImageIcon("res/icon/del.png")).getImage()).getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH));
		ImageIcon iconCN = new ImageIcon(((new ImageIcon("res/icon/update.png")).getImage()).getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH));
		ImageIcon iconThem =new ImageIcon(((new ImageIcon("res/icon/add.jpg")).getImage()).getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH));
		
		btnNewButton_1 = new JButton("Them",iconThem);
		btnXacNhanChinh = new JButton("Cap nhat",iconCN);
		btnXoa = new JButton("Xoa",iconXoa);
	
		panel_1.add(btnXoa);
		panel_1.add(btnXacNhanChinh);
		panel_1.add(btnNewButton_1);
		
		tongsoluongsach=data.gettongsosach();
		
		tblsach = new String[tongsoluongsach][5];
		data.laytatca(tblsach);
		
		
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.GREEN, 2, true));
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		
		table = new JTable(tblsach,tencot);
		table.getModel().addTableModelListener(new TableModelListener() {
			
			public void tableChanged(TableModelEvent e) {
				boolean err=false,repeat=false;
				int index=0;
				for(int u=0;u<5;u++) {
					if(tblsach[e.getFirstRow()][u].equals("")) {
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
					catch (Exception ee) {
						JOptionPane.showMessageDialog(null,"Sai kieu du lieu", "loi", JOptionPane.OK_OPTION);
						cntype=false;
					}
					if(cntype)
					{
						BookV tBookV=new BookV(Integer.parseInt(tblsach[e.getLastRow()][0]),
								tblsach[e.getLastRow()][1],
								tblsach[e.getLastRow()][2],
								Integer.parseInt(tblsach[e.getLastRow()][3]),
								Double.parseDouble(tblsach[e.getLastRow()][4]));
						for (BookV bookV : bookVs) {
							if(bookV.getid()==tBookV.getid()) {
								bookVs.set(index, tBookV);
								repeat=true;
							}
							index++;
						}
						if(!repeat)bookVs.add(tBookV);
						
					}
					else
						cntype=true;
				}
			}
		});

		
		
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
					if(cntype) {
						data.suasach(bookVs);
						bookVs.clear();
					}
					else
						cntype=true;
				}	
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
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		       if(comboBox.getSelectedIndex()==0) {
		    	   Arrays.sort(tblsach, new Comparator<String[]>(){
		    		    public int compare(final String[] first, final String[] second){
		    		        return Integer.valueOf(first[0]).compareTo(Integer.valueOf(second[0]));
		    		    }
		    		}); 
		       }
		       if(comboBox.getSelectedIndex()==1) {
		    	   Arrays.sort(tblsach, new Comparator<String[]>(){
		    		    public int compare(final String[] first, final String[] second){
		    		        return first[1].compareTo(second[1]);
		    		    }
		    		}); 
		       }
		       if(comboBox.getSelectedIndex()==2) {
		    	   Arrays.sort(tblsach, new Comparator<String[]>(){
		    		    public int compare(final String[] first, final String[] second){
		    		        return first[2].compareTo(second[2]);
		    		    }
		    		}); 
		       }
		       if(comboBox.getSelectedIndex()==3) {
		    	   Arrays.sort(tblsach, new Comparator<String[]>(){
		    		    public int compare(final String[] first, final String[] second){
		    		        return Integer.valueOf(first[3]).compareTo(Integer.valueOf(second[3]));
		    		    }
		    		}); 
		       }
		       if(comboBox.getSelectedIndex()==4) {
		    	   Arrays.sort(tblsach, new Comparator<String[]>(){
		    		    public int compare(final String[] first, final String[] second){
		    		        return Double.valueOf(first[4]).compareTo(Double.valueOf(second[4]));
		    		    }
		    		}); 
		       }
		       table.repaint();
		    }
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button.getText().toString().equals("↓")) {
					button.setText("↑");
					if(comboBox.getSelectedIndex()==0) {
				    	   Arrays.sort(tblsach, new Comparator<String[]>(){
				    		    public int compare(final String[] first, final String[] second){
				    		        return Integer.valueOf(first[0]).compareTo(Integer.valueOf(second[0]));
				    		    }
				    		}); 
				       }
				       if(comboBox.getSelectedIndex()==1) {
				    	   Arrays.sort(tblsach, new Comparator<String[]>(){
				    		    public int compare(final String[] first, final String[] second){
				    		        return first[1].compareTo(second[1]);
				    		    }
				    		}); 
				       }
				       if(comboBox.getSelectedIndex()==2) {
				    	   Arrays.sort(tblsach, new Comparator<String[]>(){
				    		    public int compare(final String[] first, final String[] second){
				    		        return first[2].compareTo(second[2]);
				    		    }
				    		}); 
				       }
				       if(comboBox.getSelectedIndex()==3) {
				    	   Arrays.sort(tblsach, new Comparator<String[]>(){
				    		    public int compare(final String[] first, final String[] second){
				    		        return Integer.valueOf(first[3]).compareTo(Integer.valueOf(second[3]));
				    		    }
				    		}); 
				       }
				       if(comboBox.getSelectedIndex()==4) {
				    	   Arrays.sort(tblsach, new Comparator<String[]>(){
				    		    public int compare(final String[] first, final String[] second){
				    		        return Double.valueOf(first[4]).compareTo(Double.valueOf(second[4]));
				    		    }
				    		}); 
				       }
				       table.repaint();
					
				}else if(button.getText().toString().equals("↑")) {
					button.setText("↓");
					if(comboBox.getSelectedIndex()==0) {
				    	   Arrays.sort(tblsach, new Comparator<String[]>(){
				    		    public int compare(final String[] first, final String[] second){
				    		        return Integer.valueOf(second[0]).compareTo(Integer.valueOf(first[0]));
				    		    }
				    		}); 
				       }
				       if(comboBox.getSelectedIndex()==1) {
				    	   Arrays.sort(tblsach, new Comparator<String[]>(){
				    		    public int compare(final String[] first, final String[] second){
				    		        return second[1].compareTo(first[1]);
				    		    }
				    		}); 
				       }
				       if(comboBox.getSelectedIndex()==2) {
				    	   Arrays.sort(tblsach, new Comparator<String[]>(){
				    		    public int compare(final String[] first, final String[] second){
				    		        return second[2].compareTo(first[2]);
				    		    }
				    		}); 
				       }
				       if(comboBox.getSelectedIndex()==3) {
				    	   Arrays.sort(tblsach, new Comparator<String[]>(){
				    		    public int compare(final String[] first, final String[] second){
				    		        return Integer.valueOf(second[3]).compareTo(Integer.valueOf(first[3]));
				    		    }
				    		}); 
				       }
				       if(comboBox.getSelectedIndex()==4) {
				    	   Arrays.sort(tblsach, new Comparator<String[]>(){
				    		    public int compare(final String[] first, final String[] second){
				    		        return Double.valueOf(second[4]).compareTo(Double.valueOf(first[4]));
				    		    }
				    		}); 
				       }
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
	public void tableChanged(TableModelEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
