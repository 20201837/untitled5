package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Calendar;
public class MyFrameDate1 extends JFrame {
    JLabel dateLabel;

    public MyFrameDate1() {
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
    }

    public MyFrameDate1(String s) {
        super(s);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
    }

    public void showTime() {
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        layout.setAlignment(FlowLayout.LEFT);
        JButton b1 = new JButton("显示时间");
        this.add(b1);
        dateLabel = new JLabel("点击显示时间");
        add(dateLabel);
        ActionListener Listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDate();
            }
        };
        b1.addActionListener(Listener1);
    }
        public void showDate (){
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int hour = calendar.get(Calendar.HOUR);
            int min = calendar.get(Calendar.MINUTE);
            Date nowTime = new Date();
            String msg = "当前的时间是:" + year + "年" + (month + 1) + "月" + day + "日" + hour + "时" + min + "分";

            dateLabel.setText(nowTime.toString());
    }
    }
