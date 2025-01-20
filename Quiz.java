import javax.swing.*;
import java.awt.event.*;
class Quiz{
    static int count=0;
    public static void main(String[] args){
        JFrame jf=new JFrame("Quiz Game");
        jf.setSize(400,200);
        jf.setVisible(true);
        JLabel m=new JLabel("Play Game to Check your General Knowledge");
        JButton start=new JButton("Start");
        jf.setLayout(null);
        m.setBounds(50,50,300,40);
        start.setBounds(130,100,80,25);
        start.addActionListener(new One(jf));
        jf.add(m);
        jf.add(start);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    /* Question - 1 */
    static class One implements ActionListener{
        JFrame jf;
        One(JFrame jf){
            this.jf=jf;
        }

        public void actionPerformed(ActionEvent e){
            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l=new JLabel("Question: 1");
            JLabel Question=new JLabel("When did India gain independence?");
            JRadioButton rb11=new JRadioButton("15 August 1947");
            JRadioButton rb12=new JRadioButton("26 January 1950");
            JRadioButton rb13=new JRadioButton("2 October 1947");
            JRadioButton rb14=new JRadioButton("1 April 1947");
            ButtonGroup bg=new ButtonGroup();
            bg.add(rb11);
            bg.add(rb12);
            bg.add(rb13);
            bg.add(rb14);
            JButton b=new JButton("Submit");
            jf.setLayout(null);
            l.setBounds(50,20,300,40);
            Question.setBounds(50,40,300,40);
            rb11.setBounds(50,70,300,20);
            rb12.setBounds(50,90,300,20);
            rb13.setBounds(50,110,300,20);
            rb14.setBounds(50,130,300,20);
            b.setBounds(50,160,80,20);
            b.addActionListener(new two(jf,rb11,rb12,rb13,rb14));
            jf.add(l);
            jf.add(Question);
            jf.add(rb11);
            jf.add(rb12);
            jf.add(rb13);
            jf.add(rb14);
            jf.add(b);
        }
    }

    /* Question - 2 */
    static class two implements ActionListener{
        JFrame jf;
        JRadioButton rb21,rb22,rb23,rb24;
        two(JFrame jf, JRadioButton rb21, JRadioButton rb22, JRadioButton rb23, JRadioButton rb24){
            this.jf=jf;
            this.rb21=rb21;
            this.rb22=rb22;
            this.rb23=rb23;
            this.rb24=rb24;
        }

        public void actionPerformed(ActionEvent e){
            if(rb21.isSelected()){
                count++;
            }

            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l=new JLabel("Question: 2");
            JLabel Question=new JLabel("Who was the first Prime Minister of India?");
            JRadioButton rb21=new JRadioButton("Sardar Vallabhbhai Patel");
            JRadioButton rb22=new JRadioButton("Mahatma Gandhi");
            JRadioButton rb23=new JRadioButton("Jawaharlal Nehru");
            JRadioButton rb24=new JRadioButton("Dr. B.R. Ambedkar");
            ButtonGroup bg=new ButtonGroup();
            bg.add(rb21);
            bg.add(rb22);
            bg.add(rb23);
            bg.add(rb24);
            JButton b=new JButton("Submit");
            jf.setLayout(null);
            l.setBounds(50,20,300,40);
            Question.setBounds(50,40,300,40);
            rb21.setBounds(50,70,300,20);
            rb22.setBounds(50,90,300,20);
            rb23.setBounds(50,110,300,20);
            rb24.setBounds(50,130,300,20);
            b.setBounds(50,160,80,20);
            b.addActionListener(new three(jf,rb21,rb22,rb23,rb24));
            jf.add(l);
            jf.add(Question);
            jf.add(rb21);
            jf.add(rb22);
            jf.add(rb23);
            jf.add(rb24);
            jf.add(b);
        }
    }

    /* Question - 3 */
    static class three implements ActionListener{
        JFrame jf;
        JRadioButton rb31,rb32,rb33,rb34;
        three(JFrame jf, JRadioButton rb31, JRadioButton rb32, JRadioButton rb33, JRadioButton rb34){
            this.jf=jf;
            this.rb31=rb31;
            this.rb32=rb32;
            this.rb33=rb33;
            this.rb34=rb34;
        }

        public void actionPerformed(ActionEvent e){
            if(rb33.isSelected()){
                count++;
            }

            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l=new JLabel("Question: 3");
            JLabel Question=new JLabel("What is the capital of India?");
            JRadioButton rb31=new JRadioButton("Mumbai");
            JRadioButton rb32=new JRadioButton("Kolkata");
            JRadioButton rb33=new JRadioButton("Delhi");
            JRadioButton rb34=new JRadioButton("Bengaluru");
            ButtonGroup bg=new ButtonGroup();
            bg.add(rb31);
            bg.add(rb32);
            bg.add(rb33);
            bg.add(rb34);
            JButton b=new JButton("Submit");
            jf.setLayout(null);
            l.setBounds(50,20,300,40);
            Question.setBounds(50,40,300,40);
            rb31.setBounds(50,70,300,20);
            rb32.setBounds(50,90,300,20);
            rb33.setBounds(50,110,300,20);
            rb34.setBounds(50,130,300,20);
            b.setBounds(50,160,80,20);
            b.addActionListener(new four(jf,rb31,rb32,rb33,rb34));
            jf.add(l);
            jf.add(Question);
            jf.add(rb31);
            jf.add(rb32);
            jf.add(rb33);
            jf.add(rb34);
            jf.add(b);
        }
    }

    /* Question - 4 */
    static class four implements ActionListener{
        JFrame jf;
        JRadioButton rb41,rb42,rb43,rb44;
        four(JFrame jf, JRadioButton rb41, JRadioButton rb42, JRadioButton rb43, JRadioButton rb44){
            this.jf=jf;
            this.rb41=rb41;
            this.rb42=rb42;
            this.rb43=rb43;
            this.rb44=rb44;
        }

        public void actionPerformed(ActionEvent e){
            if(rb43.isSelected()){
                count++;
            }

            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l=new JLabel("Question: 4");
            JLabel Question=new JLabel("What is the national sport of India?");
            JRadioButton rb41=new JRadioButton("Cricket");
            JRadioButton rb42=new JRadioButton("Hockey");
            JRadioButton rb43=new JRadioButton("Kabaddi");
            JRadioButton rb44=new JRadioButton("Football");
            ButtonGroup bg=new ButtonGroup();
            bg.add(rb41);
            bg.add(rb42);
            bg.add(rb43);
            bg.add(rb44);
            JButton b=new JButton("Submit");
            jf.setLayout(null);
            l.setBounds(50,20,300,40);
            Question.setBounds(50,40,300,40);
            rb41.setBounds(50,70,300,20);
            rb42.setBounds(50,90,300,20);
            rb43.setBounds(50,110,300,20);
            rb44.setBounds(50,130,300,20);
            b.setBounds(50,160,80,20);
            b.addActionListener(new five(jf,rb41,rb42,rb43,rb44));
            jf.add(l);
            jf.add(Question);
            jf.add(rb41);
            jf.add(rb42);
            jf.add(rb43);
            jf.add(rb44);
            jf.add(b);
        }
    }

    /* Question - 5 */
    static class five implements ActionListener{
        JFrame jf;
        JRadioButton rb51,rb52,rb53,rb54;
        five(JFrame jf, JRadioButton rb51, JRadioButton rb52, JRadioButton rb53, JRadioButton rb54){
            this.jf=jf;
            this.rb51=rb51;
            this.rb52=rb52;
            this.rb53=rb53;
            this.rb54=rb54;
        }

        public void actionPerformed(ActionEvent e){
            if(rb52.isSelected()){
                count++;
            }

            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l=new JLabel("Question: 5");
            JLabel Question=new JLabel("Which state is known as the Fruit Bowl of India?");
            JRadioButton rb51=new JRadioButton("Himachal Pradesh");
            JRadioButton rb52=new JRadioButton("Maharashtra");
            JRadioButton rb53=new JRadioButton("Uttar Pradesh");
            JRadioButton rb54=new JRadioButton("Kerala");
            ButtonGroup bg=new ButtonGroup();
            bg.add(rb51);
            bg.add(rb52);
            bg.add(rb53);
            bg.add(rb54);
            JButton b=new JButton("Submit");
            jf.setLayout(null);
            l.setBounds(50,20,300,40);
            Question.setBounds(50,40,300,40);
            rb51.setBounds(50,70,300,20);
            rb52.setBounds(50,90,300,20);
            rb53.setBounds(50,110,300,20);
            rb54.setBounds(50,130,300,20);
            b.setBounds(50,160,80,20);
            b.addActionListener(new six(jf,rb51,rb52,rb53,rb54));
            jf.add(l);
            jf.add(Question);
            jf.add(rb51);
            jf.add(rb52);
            jf.add(rb53);
            jf.add(rb54);
            jf.add(b);
        }
    }

    static class six implements ActionListener{
        JFrame jf;
        JRadioButton rb61,rb62,rb63,rb64;
        six(JFrame jf, JRadioButton rb61, JRadioButton rb62, JRadioButton rb63, JRadioButton rb64){
            this.jf=jf;
            this.rb61=rb61;
            this.rb62=rb62;
            this.rb63=rb63;
            this.rb64=rb64;
        }

        public void actionPerformed(ActionEvent e){
            if(rb61.isSelected()){
                count++;
            }

            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l=new JLabel("Question: 6");
            JLabel Question=new JLabel("What is the name of India's national anthem?");
            JRadioButton rb61=new JRadioButton("Vande Mataram");
            JRadioButton rb62=new JRadioButton("Jana Gana Mana");
            JRadioButton rb63=new JRadioButton("Sare Jahan Se Achha");
            JRadioButton rb64=new JRadioButton("Jai Hind");
            ButtonGroup bg=new ButtonGroup();
            bg.add(rb61);
            bg.add(rb62);
            bg.add(rb63);
            bg.add(rb64);
            JButton b=new JButton("Submit");
            jf.setLayout(null);
            l.setBounds(50,20,300,40);
            Question.setBounds(50,40,300,40);
            rb61.setBounds(50,70,300,20);
            rb62.setBounds(50,90,300,20);
            rb63.setBounds(50,110,300,20);
            rb64.setBounds(50,130,300,20);
            b.setBounds(50,160,80,20);
            b.addActionListener(new seven(jf,rb61,rb62,rb63,rb64));
            jf.add(l);
            jf.add(Question);
            jf.add(rb61);
            jf.add(rb62);
            jf.add(rb63);
            jf.add(rb64);
            jf.add(b);
        }
    }

    static class seven implements ActionListener{
        JFrame jf;
        JRadioButton rb71,rb72,rb73,rb74;
        seven(JFrame jf, JRadioButton rb71, JRadioButton rb72, JRadioButton rb73, JRadioButton rb74){
            this.jf=jf;
            this.rb71=rb71;
            this.rb72=rb72;
            this.rb73=rb73;
            this.rb74=rb74;
        }

        public void actionPerformed(ActionEvent e){
            if(rb72.isSelected()){
                count++;
            }

            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l=new JLabel("Question: 7");
            JLabel Question=new JLabel("Who built the Taj Mahal?");
            JRadioButton rb71=new JRadioButton("Akbar");
            JRadioButton rb72=new JRadioButton("Shah Jahan");
            JRadioButton rb73=new JRadioButton("Jahangir");
            JRadioButton rb74=new JRadioButton("Babur");
            ButtonGroup bg=new ButtonGroup();
            bg.add(rb71);
            bg.add(rb72);
            bg.add(rb73);
            bg.add(rb74);
            JButton b=new JButton("Submit");
            jf.setLayout(null);
            l.setBounds(50,20,300,40);
            Question.setBounds(50,40,300,40);
            rb71.setBounds(50,70,300,20);
            rb72.setBounds(50,90,300,20);
            rb73.setBounds(50,110,300,20);
            rb74.setBounds(50,130,300,20);
            b.setBounds(50,160,80,20);
            b.addActionListener(new eight(jf,rb71,rb72,rb73,rb74));
            jf.add(l);
            jf.add(Question);
            jf.add(rb71);
            jf.add(rb72);
            jf.add(rb73);
            jf.add(rb74);
            jf.add(b);
        }
    }

    static class eight implements ActionListener{
        JFrame jf;
        JRadioButton rb81,rb82,rb83,rb84;
        eight(JFrame jf, JRadioButton rb81, JRadioButton rb82, JRadioButton rb83, JRadioButton rb84){
            this.jf=jf;
            this.rb81=rb81;
            this.rb82=rb82;
            this.rb83=rb83;
            this.rb84=rb84;
        }

        public void actionPerformed(ActionEvent e){
            if(rb82.isSelected()){
                count++;
            }

            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l=new JLabel("Question: 8");
            JLabel Question=new JLabel("What are the main features of India's geography?");
            JRadioButton rb81=new JRadioButton("Vast mountains and forests, plains, and deserts");
            JRadioButton rb82=new JRadioButton("Only desert regions");
            JRadioButton rb83=new JRadioButton("Primarily coastal areas");
            JRadioButton rb84=new JRadioButton("Exclusively flat plains");
            ButtonGroup bg=new ButtonGroup();
            bg.add(rb81);
            bg.add(rb82);
            bg.add(rb83);
            bg.add(rb84);
            JButton b=new JButton("Submit");
            jf.setLayout(null);
            l.setBounds(50,20,300,40);
            Question.setBounds(50,40,300,40);
            rb81.setBounds(50,70,300,20);
            rb82.setBounds(50,90,300,20);
            rb83.setBounds(50,110,300,20);
            rb84.setBounds(50,130,300,20);
            b.setBounds(50,160,80,20);
            b.addActionListener(new nine(jf,rb81,rb82,rb83,rb84));
            jf.add(l);
            jf.add(Question);
            jf.add(rb81);
            jf.add(rb82);
            jf.add(rb83);
            jf.add(rb84);
            jf.add(b);
        }
    }

    static class nine implements ActionListener{
        JFrame jf;
        JRadioButton rb91,rb92,rb93,rb94;
        nine(JFrame jf, JRadioButton rb91, JRadioButton rb92, JRadioButton rb93, JRadioButton rb94){
            this.jf=jf;
            this.rb91=rb91;
            this.rb92=rb92;
            this.rb93=rb93;
            this.rb94=rb94;
        }

        public void actionPerformed(ActionEvent e){
            if(rb91.isSelected()){
                count++;
            }

            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l=new JLabel("Question: 9");
            JLabel Question=new JLabel("What are the main features of India's culture?");
            JRadioButton rb91=new JRadioButton("Only music and dance");
            JRadioButton rb92=new JRadioButton("Languages, religions, art, and traditions");
            JRadioButton rb93=new JRadioButton("Focused only on festivals");
            JRadioButton rb94=new JRadioButton("Uniform traditions across all states");
            ButtonGroup bg=new ButtonGroup();
            bg.add(rb91);
            bg.add(rb92);
            bg.add(rb93);
            bg.add(rb94);
            JButton b=new JButton("Submit");
            jf.setLayout(null);
            l.setBounds(50,20,300,40);
            Question.setBounds(50,40,300,40);
            rb91.setBounds(50,70,300,20);
            rb92.setBounds(50,90,300,20);
            rb93.setBounds(50,110,300,20);
            rb94.setBounds(50,130,300,20);
            b.setBounds(50,160,80,20);
            b.addActionListener(new ten(jf,rb91,rb92,rb93,rb94));
            jf.add(l);
            jf.add(Question);
            jf.add(rb91);
            jf.add(rb92);
            jf.add(rb93);
            jf.add(rb94);
            jf.add(b);
        }
    }

    static class ten implements ActionListener{
        JFrame jf;
        JRadioButton rb101,rb102,rb103,rb104;
        ten(JFrame jf, JRadioButton rb101, JRadioButton rb102, JRadioButton rb103, JRadioButton rb104){
            this.jf=jf;
            this.rb101=rb101;
            this.rb102=rb102;
            this.rb103=rb103;
            this.rb104=rb104;
        }

        public void actionPerformed(ActionEvent e){
            if(rb102.isSelected()){
                count++;
            }

            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l=new JLabel("Question: 10");
            JLabel Question=new JLabel("What are the main features of India's politics?");
            JRadioButton rb101=new JRadioButton("One-party system");
            JRadioButton rb102=new JRadioButton("Federal parliamentary democratic republic");
            JRadioButton rb103=new JRadioButton("Absolute monarchy");
            JRadioButton rb104=new JRadioButton("Dictatorship");
            ButtonGroup bg=new ButtonGroup();
            bg.add(rb101);
            bg.add(rb102);
            bg.add(rb103);
            bg.add(rb104);
            JButton b=new JButton("Submit");
            jf.setLayout(null);
            l.setBounds(50,20,300,40);
            Question.setBounds(50,40,300,40);
            rb101.setBounds(50,70,300,20);
            rb102.setBounds(50,90,300,20);
            rb103.setBounds(50,110,300,20);
            rb104.setBounds(50,130,300,20);
            b.setBounds(50,160,80,20);
            b.addActionListener(new result(jf,rb101,rb102,rb103,rb104));
            jf.add(l);
            jf.add(Question);
            jf.add(rb101);
            jf.add(rb102);
            jf.add(rb103);
            jf.add(rb104);
            jf.add(b);
        }
    }

    static class result implements ActionListener{
        JFrame jf;
        JRadioButton rb101,rb102,rb103,rb104;
        result(JFrame jf, JRadioButton rb101, JRadioButton rb102, JRadioButton rb103, JRadioButton rb104){
            this.jf=jf;
            this.rb101=rb101;
            this.rb102=rb102;
            this.rb103=rb103;
            this.rb104=rb104;
        }

        public void actionPerformed(ActionEvent e){
            if(rb102.isSelected()){
                count++;
            }

            jf.getContentPane().removeAll();
            jf.setSize(400,300);
            jf.setVisible(true);
            JLabel l1=new JLabel("You completed your quiz game");
            JLabel l2=new JLabel("Your score:");
            JLabel l3=new JLabel(String.valueOf(count));
            JLabel l4=new JLabel();
            if(count<5){
                l4=new JLabel("Good");
            }else if(count>=5 && count<8){
                l4=new JLabel("Very Good");
            }else if(count>=8 && count<=10){
                l4=new JLabel("Excellent");
            }
            jf.setLayout(null);
            l1.setBounds(50,20,300,40);
            l2.setBounds(50,40,300,40);
            l3.setBounds(120,40,300,40);
            l4.setBounds(120,60,300,40);
            jf.add(l1);
            jf.add(l2);
            jf.add(l3);
            jf.add(l4);
        }
    }
}