import javax.swing.*;

class Main {
    public static void main(String[] args) {
        var F = new JFrame("Test Window");
        F.setSize(800, 500);

        var t = new JTextField("Hello");
        F.add("North",  t);

        var t2 = new JTextField();
        F.add("South", t2);

        var b = new JButton("To Upper Case");
        b.addActionListener(ae -> t2.setText(t.getText().toUpperCase()));
        F.add("Center", b);



        F.setVisible(true);
    }
}