import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;

public class CalculatorInterface {
    private JPanel CalculatorInterface;
    private JTextField Output;
    private JButton btnResult;
    private JButton btnDivide;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnZero;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnPoint;
    private JButton btnRoot;
    private JButton btnSin;
    private JButton btnCos;
    private JButton btnTan;
    private JButton power;
    private JButton parcent;
    private JButton btnPrev;

    private double num1;
    private double num2;
    private String op=null;
    private ArrayList<Double> results;  //ArrayList<data type> name just variable created here. Results will be added each time = button has been pressed



    public  CalculatorInterface(){

        results=new ArrayList<Double>(); //object will be created here

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = Output.getText() + btnOne.getText();
                Output.setText(btnOneText);

            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = Output.getText() + btnTwo.getText();
                Output.setText(btnOneText);

            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = Output.getText() + btnThree.getText();
                Output.setText(btnOneText);

            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = Output.getText() + btnFour.getText();
                Output.setText(btnOneText);

            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = Output.getText() + btnFive.getText();
                Output.setText(btnOneText);

            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = Output.getText() + btnSix.getText();
                Output.setText(btnOneText);

            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = Output.getText() + btnSeven.getText();
                Output.setText(btnOneText);

            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = Output.getText() + btnEight.getText();
                Output.setText(btnOneText);

            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = Output.getText() + btnNine.getText();
                Output.setText(btnOneText);

            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = Output.getText() + btnZero.getText();
                Output.setText(btnOneText);

            }
        });

        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double get=getResult();
                Output.setText(String.valueOf(get));
            }
        });


        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2=0.0;
                Output.setText("");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Output.getText().equals("")){
                    Output.setText("0.");
                }
                else if (Output.getText().contains(".")){
                    btnPoint.setEnabled(false);
                }
                else{
                    String btnOneText = Output.getText() + btnPoint.getText();
                    Output.setText(btnOneText);
                }
                btnPoint.setEnabled(true);
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 op=btnPlus.getText().toString();
                num1=Double.parseDouble(Output.getText().toString());
                Output.setText("");
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=btnMinus.getText().toString();
                num1=Double.parseDouble(Output.getText().toString());
                Output.setText("");
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=btnMultiply.getText().toString();
                num1=Double.parseDouble(Output.getText().toString());
                Output.setText("");                                     //clearing screen
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=btnDivide.getText().toString();
                num1=Double.parseDouble(Output.getText().toString());
                Output.setText("");
            }
        });


        //one operator

        btnSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=btnDivide.getText().toString();
                num1=Double.parseDouble(Output.getText().toString());  //double parse double converts string to double
                double re=Math.toRadians(num1);                        //re= converting to radian
                num2=Math.sin(re);

                Output.setText(String.valueOf(num2));
            }
        });
        btnCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=btnDivide.getText().toString();
                num1=Double.parseDouble(Output.getText().toString());
                double re=Math.toRadians(num1);
                num2=Math.cos(re);

                Output.setText(String.valueOf(num2));
            }
        });
        btnTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=btnDivide.getText().toString();
                num1=Double.parseDouble(Output.getText().toString());
                double re=Math.toRadians(num1);
                num2=Math.tan(re);

                Output.setText(String.valueOf(num2));
            }
        });

        btnRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=btnDivide.getText().toString();
                num1=Double.parseDouble(Output.getText().toString());

                num2=Math.sqrt(num1);

                Output.setText(String.valueOf(num2));   //string value of convert double to string
            }
        });

        //power has two operands num1 and num2
        power.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=power.getText().toString();
                num1=Double.parseDouble(Output.getText().toString());
                Output.setText("");
            }
        });

        parcent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=btnDivide.getText().toString();
                num1=Double.parseDouble(Output.getText().toString());
                num2=(num1/100.0);
                Output.setText(String.valueOf(num2));            //double ke string kore output
            }
        });
        btnPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  try {
                      int n = results.size();   //n diye detect kortesi array list e kisu ase naki n>-1 hole elements ase aar jodi -1 hoi tahole array empty
                      double temp;

                      if (n > -1) {
                          temp = results.get(n - 1);
                          Output.setText(String.valueOf(temp));
                          results.remove(n - 1);  //record dekhay last ans ta remove kore dicci

                      } else {

                      }
                  }catch (IndexOutOfBoundsException exception){
                      JOptionPane.showMessageDialog(null,"No records found");
                  }
            }

        });
    }

    //calculation function for two numbers
    public double getResult(){
        double res=0.0;
        try {
            if (op.equals("+")) {
                //System.out.println("power +");

                num2 = num1 + Double.parseDouble(Output.getText());

                results.add(num2);
                return num2;

            } else if (op.equals("-")) {
                //System.out.println("power -");

                num2 = num1 - Double.parseDouble(Output.getText());

                results.add(num2);
                return num2;

            } else if (op.equals("X")) {
                //System.out.println("power *");
                num2 = num1 * Double.parseDouble(Output.getText());
                results.add(num2);
                return num2;
            } else if (op.equals("/")) {
                //System.out.println("power /");

                try {
                    num2 = num1 / Double.parseDouble(Output.getText());
                } catch (ArithmeticException e) {
                    return 0.0;
                }

                results.add(num2);
                return num2;

            } else if (op.equals(null)) {
                //System.out.println("power null");
                return 0.0;
            } else if (op.equals("^")) {
                //System.out.println("power 88");

                num2 = Math.pow(num1, Double.parseDouble(Output.getText()));

                results.add(num2);
                return num2;
            }
        }catch (NullPointerException exception){
            JOptionPane.showMessageDialog(null,"Operands missing");

        }


        return res;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorInterface");
        frame.setContentPane(new CalculatorInterface().CalculatorInterface);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
