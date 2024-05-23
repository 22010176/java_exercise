package Bai4_BT4_Bai3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test extends JFrame {
    public static void main(String[] args) {
        Test a = new Test();

    }

    private boolean isDisplayImage = true;
    private JButton changeSizeBtn, vietHoaBtn, thayDoiViTri, thayDoiIcon, themAnh, xoaAnh, thayAnh;
    private ImageIcon i1, i2, icon1, icon2, pic;
    private JLabel x;

    public Test() {
        super("Test");
        setLayout(new FlowLayout());

        i1 = new ImageIcon("img/bug1.GIF");
        i2 = new ImageIcon("img/bug2.GIF");
        icon1 = new ImageIcon(new ImageIcon("img\\a.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        icon2 = new ImageIcon(new ImageIcon("img\\a.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        x = new JLabel(
                new ImageIcon(icon1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));

        changeSizeBtn = new JButton("Change size");
        vietHoaBtn = new JButton("Change Vietnam");
        thayDoiViTri = new JButton("Change layout");
        thayDoiIcon = new JButton("Change title's icon");

        themAnh = new JButton("Insert Picture");
        xoaAnh = new JButton("Remove Picture");
        thayAnh = new JButton("Change Picture");

        changeSizeBtn.addActionListener(new ChangeWindowSize());
        vietHoaBtn.addActionListener(new VietHoa());
        thayDoiIcon.addActionListener(new ChangeProgramIcon());
        thayDoiViTri.addActionListener(new ChangePosition());
        thayAnh.addActionListener(new ThayAnh());
        xoaAnh.addActionListener(new XoaAnh());
        themAnh.addActionListener(new ThemAnh());
        add(xoaAnh);
        add(themAnh);
        add(thayAnh);

        add(changeSizeBtn);
        add(vietHoaBtn);
        add(thayDoiViTri);
        add(thayDoiIcon);

        add(x);

        setVisible(true);

        this.setIconImage(icon1.getImage());
        setSize(1000, 500);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ChangePosition implements ActionListener {
        private boolean test = true;

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            test = !test;
            if (test) {
                setLayout(new FlowLayout());

            } else {
                setLayout(new FlowLayout(FlowLayout.LEFT));
            }
            revalidate();
        }
    }

    private class ChangeWindowSize implements ActionListener {
        private boolean test = true;

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if (test)
                setSize(500, 255);
            else
                setSize(1000, 500);
            test = !test;
        }
    }

    private class ChangeProgramIcon implements ActionListener {
        private boolean test = true;

        @Override
        public void actionPerformed(ActionEvent e) {
            test = !test;
            if (test)
                setIconImage(icon1.getImage());
            else
                setIconImage(icon2.getImage());

        }
    }

    private class VietHoa implements ActionListener {
        private boolean test = true;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (test) {
                changeSizeBtn.setText("Thay doi kich co");
                vietHoaBtn.setText("Doi sang tieng viet");
                thayDoiViTri.setText("Doi vi tri");
                thayDoiIcon.setText("Doi icon chuong trinh");
                thayAnh.setText("Doi Anh");
                xoaAnh.setText("Xoa Anh");
                themAnh.setText("Them Anh");
            } else {
                changeSizeBtn.setText("Change Size");
                changeSizeBtn.setText("Change language");
                thayDoiViTri.setText("Change layout");
                thayDoiIcon.setText("Change program's icon");

                thayAnh.setText("Change Picture");
                xoaAnh.setText("Remove Picture");
                themAnh.setText("Insert Picture");
            }
            test = !test;
        }
    }

    private class XoaAnh implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!isDisplayImage)
                return;
            x.setVisible(false);
        }
    }

    private class ThemAnh implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!isDisplayImage)
                return;
            x.setVisible(true);
        }
    }

    private class ThayAnh implements ActionListener {
        private ImageIcon[] xf = { icon1, icon2 };
        private static int a = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            x.setIcon(xf[++a % 2]);

            // validate();
        }
    }
}
