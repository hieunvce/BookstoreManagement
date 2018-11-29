package View;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.BorderLayout;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Popup extends JPanel {
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblId;
	private JLabel lblTenSach;
	private JLabel lblTenTacGia;
	private JLabel lblSoLuong;
	private JLabel lblGia;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private String id,t,tg,sl,g;
	private String path="c:\\";
	
	public Popup() {
	      
	      JPanel myPanel = new JPanel();
	      
	      myPanel.setLayout(new BorderLayout(10, 10));
	      
	      panel = new JPanel();
	      myPanel.add(panel, BorderLayout.CENTER);
	      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	      
	      panel_1 = new JPanel();
	      panel.add(panel_1);
	      panel_1.setLayout(new BorderLayout(0, 0));
	      
	      lblId = new JLabel("ID");
	      panel_1.add(lblId, BorderLayout.WEST);
	      
	      textField = new JTextField();
	      panel_1.add(textField, BorderLayout.EAST);
	      textField.setColumns(10);
	      
	      panel_2 = new JPanel();
	      panel.add(panel_2);
	      panel_2.setLayout(new BorderLayout(0, 0));
	      
	      lblTenSach = new JLabel("Ten sach");
	      panel_2.add(lblTenSach, BorderLayout.WEST);
	      
	      textField_1 = new JTextField();
	      panel_2.add(textField_1, BorderLayout.EAST);
	      textField_1.setColumns(10);
	      
	      panel_3 = new JPanel();
	      panel.add(panel_3);
	      panel_3.setLayout(new BorderLayout(0, 0));
	      
	      lblTenTacGia = new JLabel("Ten tac gia");
	      panel_3.add(lblTenTacGia, BorderLayout.WEST);
	      
	      textField_2 = new JTextField();
	      panel_3.add(textField_2, BorderLayout.EAST);
	      textField_2.setColumns(10);
	      
	      panel_4 = new JPanel();
	      panel.add(panel_4);
	      panel_4.setLayout(new BorderLayout(0, 0));
	      
	      lblSoLuong = new JLabel("So luong");
	      panel_4.add(lblSoLuong, BorderLayout.WEST);
	      
	      textField_3 = new JTextField();
	      panel_4.add(textField_3, BorderLayout.EAST);
	      textField_3.setColumns(10);
	      
	      panel_5 = new JPanel();
	      panel.add(panel_5);
	      panel_5.setLayout(new BorderLayout(0, 0));
	      
	      lblGia = new JLabel("Gia");
	      panel_5.add(lblGia, BorderLayout.WEST);
	      
	      textField_4 = new JTextField();
	      panel_5.add(textField_4, BorderLayout.EAST);
	      textField_4.setColumns(10);
	      /*
	       * lable add image
	      lblNewLabel = new JLabel("        +        ");
	      
	      
	      lblNewLabel.addMouseListener(new MouseAdapter() {
	      	public void mouseClicked(MouseEvent arg0) {
	      		FileDialog fd = new FileDialog(new JFrame());
	      		fd.setVisible(true);
	      		File[] f = fd.getFiles();
	      		if(f.length > 0){
		      		  BufferedImage img = null;
		    	      try {
		    	          img = ImageIO.read(new File(fd.getFiles()[0].getAbsolutePath()));
		    	      } catch (IOException e) {
		    	          e.printStackTrace();
		    	      }
		    	      Image dimg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),
		    	    	        Image.SCALE_SMOOTH);
		    	      ImageIcon imageIcon = new ImageIcon(dimg);
		    	      lblNewLabel.setText("");
		    	      lblNewLabel.setIcon(imageIcon);
	      		}
	      	}
	      });
	      lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	      myPanel.add(lblNewLabel, BorderLayout.WEST);
	      */
	      int rs =JOptionPane.showConfirmDialog(null, myPanel,"Them sach", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
			if(rs==JOptionPane.OK_OPTION) {
				id=textField.getText();
				t=textField_1.getText();
				tg=textField_2.getText();
				sl=textField_3.getText();
				g=textField_4.getText();				
			}
			if(rs==JOptionPane.CLOSED_OPTION) {
				id="";
				t="";
				tg="";
				sl="";
				g="";
			}
	      }
	
	public String getid() {
		return id;
	}
	public String getten() {
		return t;
	}
	public String gettacgia() {
		return tg;
	}
	public String getsoluong() {
		return sl;
	}
	public String getgia() {
		return g;
	}
	
}
