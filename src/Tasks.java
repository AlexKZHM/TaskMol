
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Tasks extends javax.swing.JFrame {

    int totalMan = 0;
    int totalWoman = 0;
    String fileName = "";
    //D://TestTextW/Task37_4.txt
    DefaultListModel grp301 = new DefaultListModel();
    DefaultListModel grp302 = new DefaultListModel();
    DefaultTableModel tm = new DefaultTableModel();
    DefaultTableModel tm1 = new DefaultTableModel();
    DefaultTableModel tm2 = new DefaultTableModel();
    DefaultTableModel tm3 = new DefaultTableModel();

    //Одномерный массив с рандомом от 1 до 100
    private double[] myList = {(int) (Math.random() * 100 + 1), (int) (Math.random() * 100 + 1), (int) (Math.random() * 100 + 1), (int) (Math.random() * 100 + 1)};

    public void Work1() {
        //Вывод всех элементов массива
        for (int i = 0; i < myList.length; i++) {
            lblAnswer1.setText(lblAnswer1.getText() + "  " + myList[i]);
        }
        //lblAnswer1.setText("Все элементы массива: " + myList[0] + "  " + myList[1] + "  " + myList[2] + "  " + myList[3]);
    }

    public void Work2() {
        //Находит сумму чисел массива
        //String Otvet2 = "";
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
            //Otvet2 = total + "";
            lblAnswer2.setText("Сумма чисел массива: " + total);
        }
        //lblAnswer2.setText(Otvet2);
    }

    public void Work3() {
        //Находит наибольший элемент из массива
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
            lblAnswer3.setText("Наибольший элемент: " + max);
        }

    }

    public void Task12() {
        int ii = 1;
        //Одномерный массив из 4 элементво с рандомными значениями.
        int[] ListTask12 = {(int) (Math.random() * 20 + 0), (int) (Math.random() * 20 + 0), (int) (Math.random() * 20 + 0), (int) (Math.random() * 20 + 0)};
        //Находит номер первого чётного числа, если чётного числа нету то выводит 0.
        for (int i = 0; i < ListTask12.length; i++, ii++) {
            if (ListTask12[i] % 2 == 0) {
                lblAnswer12.setText("Номер " + ii + " Значение " + ListTask12[i] + "");
                lblArrayT12.setText(Arrays.toString(ListTask12) + "  ");
                break;
            } else {
                lblAnswer12.setText("0");
            }
        }
    }

    public void Task37() {
        int sum = 0;
        int[] A = new int[6];
        //Создаётся одномерный массив
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 20 + 1);
            //Вывод одномерного массива.
            lblArrayT37.setText(Arrays.toString(A) + "  ");
            //Определение суммы нечетных индексов.
            if (i % 2 != 0) {
                sum = sum + A[i];
                lblAnswer37.setText("Сумма нечетных индексов: " + sum);
            }
            //Если чётный то ничего не происходит.
            if (i % 2 == 0) {
            }
        }
    }

    public void Task62() {
        int osadki = 0;
        //int dniOsadkov = 0;
        int dniOsadkovNet = 0;
        int[] September = new int[30];
        lblAnswer62l1.setText("");
        lblAnswer62l2.setText("");
        //Создаётся одномерный массив из 30 элементов где 1 нет осадков, 2 есть осадки ,и 3 наибольшие осадки.
        for (int i = 0; i < September.length; i++) {
            dniOsadkovNet = dniOsadkovNet + 1;
            //dniOsadkov = dniOsadkov + 1;
            September[i] = (int) (Math.random() * 3 + 1);
            //Вывод одномерного массива.
            lblArrayT62.setText(Arrays.toString(September) + "  ");
            //Выводит дни в которых небыло осадков.
            if (September[i] == 1) {
                lblAnswer62l1.setText(lblAnswer62l1.getText() + dniOsadkovNet + " День ");

            }
            //Нужен для общего вывода осадков за месяц.
            if (September[i] == 2) {
                osadki = osadki + 1;

            }
            //Выводит дни в которые было наибольшее количество осадков.
            if (September[i] == 3) {
                lblAnswer62l2.setText(lblAnswer62l2.getText() + (i + 1) + " День ");
                //Нужен для общего вывода осадков за месяц.
                osadki = osadki + 1;
                lblAnswer62l3.setText(osadki + "");

            }
        }
    }

    public void WorkPrimer1() {
        int[][] List = new int[5][5];
        for (int i = 0; i < List.length; i++) {
            for (int j = 0; j < List[0].length; j++) {
                List[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
        //String[] Listup = new String[]{"","","","","",""};
    }

    public void Task12_2() {
        tm = (DefaultTableModel) tblWork372.getModel();
        int total = 0;
        if (txtStolb.getText().isEmpty() || txtStroka.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Строка не должна быть пустой"); // Проверка на содержание текста
        } else {
            int row = Integer.parseInt(txtStolb.getText());
            int col = Integer.parseInt(txtStroka.getText());
            tm.setColumnCount(col);
            int[][] B = new int[row][col];
            //Создание матрицы и вывод её в таблицу с вводимыми данными.
            for (int i = 0; i < row; i++) {
                Vector vr = new Vector();
                for (int j = 0; j < col; j++) {
                    B[i][j] = (int) (Math.random() * 10 + 1);
                    //System.out.print(" " + B[i][j] + "");
                    vr.add(B[i][j]);
                }
                tm.addRow(vr);
                //System.out.println();
            }
            //Выводит сумму элементов главной диагонали.
            for (int i = 0; i < row; i++) {
                total += B[i][i];
            }
            //System.out.println("" + total);
            lblTotalW12_2.setText("" + total);
        }
    }

    public void Task37_2() {
        tm = (DefaultTableModel) tblMatrica.getModel();
        tm1 = (DefaultTableModel) tblMinEl.getModel();
        tm2 = (DefaultTableModel) tblMaxEl.getModel();
        tm3 = (DefaultTableModel) tblTotal.getModel();
        int min;
        int max;
        int s = 0;
        int Rmin;
        int Rmax;
        if (txtStolb1.getText().isEmpty() || txtStolb2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Строка не должна быть пустой"); // Проверка на содержание текста
        } else {
            int row = Integer.parseInt(txtStolb1.getText());//Берёт значения из текстФиелда.
            int col = Integer.parseInt(txtStolb2.getText());
            tm.setColumnCount(col);
            tm1.setColumnCount(col);
            tm2.setColumnCount(col);
            tm3.setColumnCount(col);
            int[][] B = new int[row][col];
            int[] Btotal = new int[col];
            int[] Bmax = new int[col];
            int[] Bmin = new int[col];
            //Создание матрицы и вывод её в таблицу с вводимыми данными, по заданию 8 на 5.
            for (int i = 0; i < row; i++) {
                Vector vr = new Vector();
                for (int j = 0; j < col; j++, s++) {
                    Rmax = 70;
                    Rmin = 30;
                    Rmax -= Rmin;
                    B[i][j] = (int) (Math.random() * ++Rmax) + Rmin;
                    System.out.print(" " + B[i][j] + " (" + s + ")");
                    vr.add(B[i][j]);
                }
                tm.addRow(vr);
                System.out.println();
            }
            //Определение минимального и максимального .
            max = -1000;
            min = 1000;
            for (int j = 0; j < col; j++) {
                Vector vr = new Vector();
                for (int i = 0; i < row; i++) {
                    if (max < B[i][j]) {
                        max = B[i][j];
                        Bmax[j] = max;
                        vr.add(Bmax[j]);
                    }
                    if (min > B[i][j]) {
                        min = B[i][j];
                        Bmin[j] = min;
                        vr.add(Bmin[j]);
                    }
                }
                max = -1000;
                min = 1000;
                //Вывод максимального и минимального в свои таблицы.
            }
            Vector vr1 = new Vector();
            Vector vr2 = new Vector();
            for (int i = 0; i < col; i++) {
                vr1.add(Bmax[i]);
                vr2.add(Bmin[i]);
            }
            tm2.addRow(vr2);
            tm1.addRow(vr1);
            //Определение среднего арифметического минимального и максимального.
            for (int j = 0; j < col; j++) {
                Vector vr = new Vector();
                Btotal[j] = Btotal[j] + Bmax[j];
                Btotal[j] = Btotal[j] + Bmin[j];
                Btotal[j] = Btotal[j] / 2;
                vr.add(Btotal[j]);
                //Вывод среднего арифметического.
            }
            Vector vr3 = new Vector();
            for (int i = 0; i < col; i++) {
                vr3.add(Btotal[i]);
            }
            tm3.addRow(vr3);
            System.out.print("max: ");
            System.out.println(Arrays.toString(Bmax));
            System.out.print("min:");
            System.out.println(Arrays.toString(Bmin));
            System.out.print("Total: " + Arrays.toString(Btotal));
        }
    }

    public void Task12_3() {
        String[] punctuationMarks = {".", ",", "/", "?", "?", "|", "\\", "\"", "\'", "[", "]", "{", "}", "+", "-", "*", "!", "@", "#", "$", "%", "^", "&", "(", ")", "=", "_", "~", ";", ":", "`", "<", ">"};
        if (txtFldText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Строка не должна быть пустой"); // Проверка на содержание текста
        } else {
            String result = txtFldText.getText();
            for (int i = 0; i < punctuationMarks.length; i++) {
                // С помощью цикла проверяет содержимое введенного текста на знаки пунктуации
                if (result.contains(punctuationMarks[i])) {
                    lblNotidication.setText("Присутствуют знаки пунктуации");
                    break;
                } else {
                    lblNotidication.setText("Отсутствуют знаки пунктуации");
                }
            }
        }
    }

    public void Task37_3() {
        String[] naturalNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int[] writeNumbers = new int[100];
        int total = 0;
        int resultN = 0;
        int count = 0;
        int word = 0;
        String result1;
        if (txtFldNaturalNumbres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Строка не должна быть пустой"); // Проверка на содержание текста
        } else {
            String result = txtFldNaturalNumbres.getText();
            // С помощью метода делит введенный текст на отдельные символы и закидывает их в массив
            char[] chrW = result.toCharArray(); //ЛУЧШИЙ КОД ЗА 1000 ЛЕТ !!! 
            word = txtFldNaturalNumbres.getText().length();
            System.out.println(word + "");
            for (int j = 0; j < word; j++) {
                // С помощью метода переводит массив типа чар в стринговый тип 
                result1 = Character.toString(chrW[j]);
                // Цикл находит сумму натуральных чисел
                for (int i = 0; i < naturalNumbers.length; i++) {
                    if (result1.contains(naturalNumbers[i])) {
                        total = total + Integer.parseInt(naturalNumbers[i]);
                    }
                }
            }
            lblConclusion.setText(total + "");
        }
    }

    public void Task62_3() {

        String result;
        String result1 = "";
        if (txtfTxtTask62_3.getText().isEmpty() || txtfNTask62_3.getText().isEmpty() || txtfKTask62_3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Строки не должны быть пустыми"); // Проверка на содержание текста
        } else {
            int n = Integer.parseInt(txtfNTask62_3.getText());
            int k = Integer.parseInt(txtfKTask62_3.getText());
            int dlina;
            int Nsssgul = n - 1;
            dlina = txtfTxtTask62_3.getText().length();
            String word = txtfTxtTask62_3.getText();
            // С помощью метода делит введенный текст на отдельные символы и закидывает их в массив
            char[] chrQ = word.toCharArray(); //ЛУЧШИЙ КОД ЗА 1000 ЛЕТ !!!
            for (int j = 0; j < dlina; j++) {
                // С помощью метода переводит массив типа чар в стринговый тип 
                result = Character.toString(chrQ[j]);
                result1 += result;
                // Условие необходимое для корректного вывода k пробелов каждые n символов
                if (Nsssgul == j) {
                    for (int i = 0; i < k; i++) {
                        result1 += " ";
                    }
                    Nsssgul = Nsssgul + n;
                }
            }
            lblOutput.setText(result1);
        }
    }

    public void Task37_4() {
        //String fileName = "D://TestTextW/Task37_4.txt";
        StudentW374[] group302 = new StudentW374[10];
        StudentW374[] group301 = new StudentW374[10];
        String[] surname = {"Иванов", "Васильевна", "Абрамова", "Белова", "Смирнов",
            "Демидова", "Попов", "Алексеев", "Степанов", "Григорьев"};
        String[] name = {"Александр", "Антонина", "Евгения", "Серафима", "Ярослав",
            "Жанетта", "Роберт", "Ульян", "Руслан", "Олег"};
        String[] patronymic = {"Авдеевич", "Альбертовна", "Викторовна", "Глебовна", "Димитриевич",
            "Евграфовна", "Захарович", "Изотович", "Капитонович", "Каллистратович"};
        String[] gender = {"Мужской", "Женский", "Женский", "Женский", "Мужской",
            "Женский", "Мужской", "Мужской", "Мужской", "Мужской"};
        int[] group = {301, 301, 301, 301, 301, 301, 301, 301, 301, 301};

        if (txtfGroup.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Строка c номером второй группы не должна быть пустой"); // Проверка на содержание текста
        } else {

            for (int i = 0; i < 10; i++) {
                // Конструктор заполняется заранее введенными массивами  
                StudentW374 humanGroup301 = new StudentW374(surname[i],
                        name[i],
                        patronymic[i],
                        gender[i],
                        group[i]);
                // Добавляет данные о студентах в лист
                group301[i] = humanGroup301;
                grp301.addElement(humanGroup301.getSurname() + " "
                        + humanGroup301.getName() + " "
                        + humanGroup301.getPatronymic() + " Пол: "
                        + humanGroup301.getGender() + " Группа: "
                        + humanGroup301.getGroup() + " ");
            }
            // Выводит в лист ранее добавленные данные
            lstGroup301.setModel(grp301);

            // Находит количество мальчиков и девочек
            for (int i = 0; i < 10; i++) {
                if (group301[i].getGender() == "Мужской") {
                    totalMan++;
                }
                if (group301[i].getGender() == "Женский") {
                    totalWoman++;
                }
            }
            lblTotalManWoman.setText("Всего мальчиков: " + totalMan + " Всего девочек: " + totalWoman);
            for (int i = 0; i < 10; i++) {
                // Конструктор берёт значения из 301 группы меняя только номер группы 
                StudentW374 humanGroup302 = new StudentW374(group301[i].getSurname(),
                        group301[i].getName(),
                        group301[i].getPatronymic(),
                        group301[i].getGender(),
                        Integer.parseInt(txtfGroup.getText()));
                group302[i] = humanGroup302;
                grp302.addElement(humanGroup302.getSurname() + " "
                        + humanGroup302.getName() + " "
                        + humanGroup302.getPatronymic() + " Пол: "
                        + humanGroup302.getGender() + " Группа: "
                        + humanGroup302.getGroup() + " ");
            }
            lstGroup302.setModel(grp302);
            btnSaveFile.setEnabled(true);
            // Вызываем метод из специального класса для сохранения ответа в текстовый файл 
        }
    }

    public Tasks() {
        initComponents();
        lstGroup301.setModel(grp301);
        lstGroup302.setModel(grp302);
        btnSaveFile.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlPage1 = new javax.swing.JPanel();
        btnPerform1 = new javax.swing.JButton();
        lblAnswer1 = new javax.swing.JLabel();
        lblAnswer2 = new javax.swing.JLabel();
        lblAnswer3 = new javax.swing.JLabel();
        pnlChapter1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        pnlTask12 = new javax.swing.JPanel();
        lblTask12 = new javax.swing.JLabel();
        lblAnswer12 = new javax.swing.JLabel();
        btnPerformT12 = new javax.swing.JButton();
        lblArrayT12 = new javax.swing.JLabel();
        pnlTask37 = new javax.swing.JPanel();
        lblTask37 = new javax.swing.JLabel();
        btnPerformT37 = new javax.swing.JButton();
        lblAnswer37 = new javax.swing.JLabel();
        lblArrayT37 = new javax.swing.JLabel();
        pnlTask62 = new javax.swing.JPanel();
        lblTask62 = new javax.swing.JLabel();
        lblText1 = new javax.swing.JLabel();
        lblArrayT62 = new javax.swing.JLabel();
        btnPerformT62 = new javax.swing.JButton();
        lblText3 = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();
        lblAnswer62l1 = new javax.swing.JLabel();
        lblAnswer62l2 = new javax.swing.JLabel();
        lblAnswer62l3 = new javax.swing.JLabel();
        pnlChapter2 = new javax.swing.JPanel();
        Задача_37 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWork372 = new javax.swing.JTable();
        txtStolb = new javax.swing.JTextField();
        txtStroka = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotalW12_2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMaxEl = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMatrica = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTotal = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblMinEl = new javax.swing.JTable();
        txtStolb1 = new javax.swing.JTextField();
        txtStolb2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        btnPerformT12_3 = new javax.swing.JButton();
        lblTask12_3 = new javax.swing.JLabel();
        txtFldText = new javax.swing.JTextField();
        lblNotidication = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnPerformT37_3 = new javax.swing.JButton();
        lblTask37_3 = new javax.swing.JLabel();
        lblConclusion = new javax.swing.JLabel();
        txtFldNaturalNumbres = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnPerformT62_3 = new javax.swing.JButton();
        lblTask62_3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtfTxtTask62_3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtfNTask62_3 = new javax.swing.JTextField();
        txtfKTask62_3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        lblTask37_4 = new javax.swing.JLabel();
        btnPerformT37_4 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstGroup302 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstGroup301 = new javax.swing.JList<>();
        lblTotalManWoman = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtfGroup = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtfAdres = new javax.swing.JTextField();
        btnSaveFile = new javax.swing.JButton();
        txtfFileName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        lblOp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnWorkPrimer1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrimer1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPerform1.setText("Выполнить");
        btnPerform1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPerform1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerform1ActionPerformed(evt);
            }
        });

        lblAnswer1.setText("Все элементы массива:");
        lblAnswer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAnswer2.setText("Задание 2");
        lblAnswer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAnswer3.setText("Задание 3");
        lblAnswer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlPage1Layout = new javax.swing.GroupLayout(pnlPage1);
        pnlPage1.setLayout(pnlPage1Layout);
        pnlPage1Layout.setHorizontalGroup(
            pnlPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPage1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPerform1))
                    .addGroup(pnlPage1Layout.createSequentialGroup()
                        .addComponent(lblAnswer1)
                        .addGap(110, 1049, Short.MAX_VALUE))
                    .addGroup(pnlPage1Layout.createSequentialGroup()
                        .addGroup(pnlPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnswer2)
                            .addComponent(lblAnswer3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPage1Layout.setVerticalGroup(
            pnlPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnswer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnswer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnswer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addComponent(btnPerform1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Практика", pnlPage1);

        lblTask12.setText("<html>12. В одномерном массиве целых чисел a1, а2, ..., an <p>найти номер первого четного числа. Если четных чисел нет, то ответом может быть число 0.</html>");

        lblAnswer12.setText("Ответ");

        btnPerformT12.setText("Выполнить");
        btnPerformT12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformT12ActionPerformed(evt);
            }
        });

        lblArrayT12.setText("Массив");
        lblArrayT12.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblArrayT12AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout pnlTask12Layout = new javax.swing.GroupLayout(pnlTask12);
        pnlTask12.setLayout(pnlTask12Layout);
        pnlTask12Layout.setHorizontalGroup(
            pnlTask12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTask12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTask12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTask12, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                    .addGroup(pnlTask12Layout.createSequentialGroup()
                        .addGroup(pnlTask12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnswer12)
                            .addComponent(lblArrayT12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTask12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPerformT12)))
                .addContainerGap())
        );
        pnlTask12Layout.setVerticalGroup(
            pnlTask12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTask12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAnswer12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrayT12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(btnPerformT12)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Задача 12", pnlTask12);

        pnlTask37.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pnlTask37AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblTask37.setText("<html>37. Заполнить массив А[1..6] числами, вводимыми с клавиатуры.<p> Найти сумму элементов с нечетными индексами.</html>");

        btnPerformT37.setText("Выполнить");
        btnPerformT37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformT37ActionPerformed(evt);
            }
        });

        lblAnswer37.setText("Ответ");

        lblArrayT37.setText("Массив");

        javax.swing.GroupLayout pnlTask37Layout = new javax.swing.GroupLayout(pnlTask37);
        pnlTask37.setLayout(pnlTask37Layout);
        pnlTask37Layout.setHorizontalGroup(
            pnlTask37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTask37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTask37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTask37, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnswer37)
                    .addComponent(lblArrayT37))
                .addContainerGap(536, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTask37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPerformT37)
                .addContainerGap())
        );
        pnlTask37Layout.setVerticalGroup(
            pnlTask37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTask37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAnswer37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrayT37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(btnPerformT37)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Задача 37", pnlTask37);

        pnlTask62.setAlignmentX(0.3F);
        pnlTask62.setAlignmentY(0.3F);

        lblTask62.setText("<html>62. В одномерном массиве хранится информация о количестве осадков, выпавших за каждый день сентября.<p> Определить: <p>а) в какие дни осадков не было; <p>б) дни, когда количество осадков превысило среднее значение; <p>в) общее количество осадков за месяц.</html>");
        lblTask62.setAlignmentY(0.3F);

        lblText1.setText("В какие дни не было осадков:");

        lblArrayT62.setText("Массив");

        btnPerformT62.setText("Выполнить");
        btnPerformT62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformT62ActionPerformed(evt);
            }
        });

        lblText3.setText("Общее количество осадков за месяц:");

        lblText2.setText("Дни с наибольшим количество осадков:");

        javax.swing.GroupLayout pnlTask62Layout = new javax.swing.GroupLayout(pnlTask62);
        pnlTask62.setLayout(pnlTask62Layout);
        pnlTask62Layout.setHorizontalGroup(
            pnlTask62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTask62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTask62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTask62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTask62Layout.createSequentialGroup()
                        .addComponent(lblText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAnswer62l1))
                    .addGroup(pnlTask62Layout.createSequentialGroup()
                        .addComponent(lblText2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAnswer62l2))
                    .addGroup(pnlTask62Layout.createSequentialGroup()
                        .addComponent(lblText3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAnswer62l3))
                    .addComponent(lblArrayT62))
                .addContainerGap(578, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTask62Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPerformT62)
                .addContainerGap())
        );
        pnlTask62Layout.setVerticalGroup(
            pnlTask62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTask62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlTask62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblText1)
                    .addComponent(lblAnswer62l1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTask62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblText2)
                    .addComponent(lblAnswer62l2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTask62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblText3)
                    .addComponent(lblAnswer62l3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArrayT62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(btnPerformT62)
                .addContainerGap())
        );

        lblTask62.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane2.addTab("Задача 62", pnlTask62);

        javax.swing.GroupLayout pnlChapter1Layout = new javax.swing.GroupLayout(pnlChapter1);
        pnlChapter1.setLayout(pnlChapter1Layout);
        pnlChapter1Layout.setHorizontalGroup(
            pnlChapter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        pnlChapter1Layout.setVerticalGroup(
            pnlChapter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Раздел 1", pnlChapter1);

        jButton1.setText("Выполнить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("12. В массиве В[1..4,1..4] найти сумму элементов главной диагонали.");

        tblWork372.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Столбец 1", "Столбец 2", "Столбец 3", "Столбец 4"
            }
        ));
        jScrollPane2.setViewportView(tblWork372);

        txtStolb.setText("1");
        txtStolb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStolbActionPerformed(evt);
            }
        });

        txtStroka.setText("1");
        txtStroka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStrokaActionPerformed(evt);
            }
        });

        jLabel3.setText("Количество строк");

        jLabel4.setText("Количество столбцов");

        jLabel5.setText("Сумма элементов главной диагонали:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTotalW12_2))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtStolb, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(txtStroka))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))))))
                        .addGap(460, 460, 460))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 1088, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(6, 6, 6))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStolb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStroka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblTotalW12_2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        Задача_37.addTab("Задача 12", jPanel3);

        jButton2.setText("Выполнить");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("<html>37. Вывести на экран матрицу 8х5, элементами которой являются целые случайные числа из интервала [30,70].<p> Определить среднее арифметическое минимального и максимального элемента в каждом столбце.</html>");

        tblMaxEl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblMaxEl);

        jLabel6.setText("Матрица:");

        jLabel7.setText("Максимальные элементы:");

        jLabel8.setText("Минимальные элементы:");

        jLabel9.setText("Арифметическая сумма:");

        tblMatrica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblMatrica);

        tblTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblTotal);

        tblMinEl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tblMinEl);

        txtStolb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStolb1ActionPerformed(evt);
            }
        });

        txtStolb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStolb2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Количество строк");

        jLabel11.setText("Количество столбцов");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 1088, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(277, 277, 277)
                                .addComponent(jLabel7))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStolb2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(txtStolb1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStolb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStolb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        Задача_37.addTab("Задача 37", jPanel4);

        javax.swing.GroupLayout pnlChapter2Layout = new javax.swing.GroupLayout(pnlChapter2);
        pnlChapter2.setLayout(pnlChapter2Layout);
        pnlChapter2Layout.setHorizontalGroup(
            pnlChapter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Задача_37)
        );
        pnlChapter2Layout.setVerticalGroup(
            pnlChapter2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Задача_37)
        );

        jTabbedPane1.addTab("Раздел 2", pnlChapter2);

        btnPerformT12_3.setText("Выполнить");
        btnPerformT12_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformT12_3ActionPerformed(evt);
            }
        });

        lblTask12_3.setText("12. Определить, содержит ли данный текст символы, отличные от букв и пробела.");

        txtFldText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldTextActionPerformed(evt);
            }
        });

        lblNotidication.setText("Вывод:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPerformT12_3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTask12_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNotidication)
                            .addComponent(txtFldText))
                        .addGap(0, 723, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask12_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNotidication)
                .addGap(18, 18, 18)
                .addComponent(txtFldText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(btnPerformT12_3)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Задача 12", jPanel6);

        btnPerformT37_3.setText("Выполнить");
        btnPerformT37_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformT37_3ActionPerformed(evt);
            }
        });

        lblTask37_3.setText("37. Найти сумму цифр введенного натурального числа.");

        lblConclusion.setText("Вывод:");

        txtFldNaturalNumbres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldNaturalNumbresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 1088, Short.MAX_VALUE)
                        .addComponent(btnPerformT37_3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTask37_3)
                            .addComponent(lblConclusion)
                            .addComponent(txtFldNaturalNumbres, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask37_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConclusion)
                .addGap(18, 18, 18)
                .addComponent(txtFldNaturalNumbres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(btnPerformT37_3)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Задача 37", jPanel7);

        btnPerformT62_3.setText("Выполнить");
        btnPerformT62_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformT62_3ActionPerformed(evt);
            }
        });

        lblTask62_3.setText("62. Создать процедуру, которая позволит во введенной строке через каждые n символов вставить k пробелов.");

        jLabel13.setText("Ваш текст:");

        txtfTxtTask62_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfTxtTask62_3ActionPerformed(evt);
            }
        });

        jLabel14.setText("Через сколько n символов вставлять пробелы");

        jLabel15.setText("Сколько k пробелов поставить");

        lblOutput.setText("Вывод:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 1088, Short.MAX_VALUE)
                        .addComponent(btnPerformT62_3))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTask62_3)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtfTxtTask62_3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfNTask62_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtfKTask62_3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOutput))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTask62_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfTxtTask62_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfNTask62_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfKTask62_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(btnPerformT62_3)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Задача 62", jPanel8);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        jTabbedPane1.addTab("Раздел 3", jPanel5);

        lblTask37_4.setText("<html>Создать файл, содержащий следующие данные: ФИО студента; пол; группа.<p> Вывести данные из файла на экран.<p> Подсчитать количество юношей и количество девушек 301 группы.<p> Создать новый файл данных, содержащий сведения о студентах 302 группы (используя существующий файл данных).");

        btnPerformT37_4.setText("Выполнить");
        btnPerformT37_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformT37_4ActionPerformed(evt);
            }
        });

        lstGroup302.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(lstGroup302);

        lstGroup301.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(lstGroup301);

        lblTotalManWoman.setText("Вывод:");

        jLabel12.setText("Введите номер 2 группы:");

        txtfGroup.setText("302");
        txtfGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfGroupActionPerformed(evt);
            }
        });

        jLabel16.setText("Введите адрес для сохранения файла:");

        txtfAdres.setText("D:\\");
            txtfAdres.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtfAdresActionPerformed(evt);
                }
            });

            btnSaveFile.setText("Сохранить файл");
            btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSaveFileActionPerformed(evt);
                }
            });

            txtfFileName.setText("FileName");
            txtfFileName.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtfFileNameActionPerformed(evt);
                }
            });

            jLabel17.setText("Введите имя файла:");

            javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
            jPanel10.setLayout(jPanel10Layout);
            jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btnPerformT37_4))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTask37_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTotalManWoman)
                                .addComponent(jLabel12)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtfAdres))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtfFileName))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSaveFile)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblOp))
                                .addComponent(txtfGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 222, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTask37_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtfGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSaveFile)
                        .addComponent(txtfFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOp))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblTotalManWoman)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(jScrollPane8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                    .addComponent(btnPerformT37_4)
                    .addContainerGap())
            );

            jTabbedPane6.addTab("Задача 37", jPanel10);

            javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
            jPanel9.setLayout(jPanel9Layout);
            jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane6)
            );
            jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane6)
            );

            jTabbedPane1.addTab("Раздел 4", jPanel9);

            btnWorkPrimer1.setText("Выполнить");

            tblPrimer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            tblPrimer1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"1", null, null, null, null, null},
                    {"2", null, null, null, null, null},
                    {"3", null, null, null, null, null},
                    {"4", null, null, null, null, null},
                    {"5", null, null, null, null, null},
                    {"6", null, null, null, null, null}
                },
                new String [] {
                    "Строка 1", "Строка 2", "Строка 3", "Строка 4", "Строка 5", "Строка 6"
                }
            ));
            jScrollPane1.setViewportView(tblPrimer1);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnWorkPrimer1))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(734, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addGap(288, 288, 288)
                    .addComponent(btnWorkPrimer1))
            );

            jTabbedPane3.addTab("Пример 1", jPanel2);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane3)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane3)
            );

            jTabbedPane1.addTab("Примеры", jPanel1);

            jMenu1.setText("Файл");

            Exit.setText("Выйти");
            Exit.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ExitActionPerformed(evt);
                }
            });
            jMenu1.add(Exit);

            jMenuBar1.add(jMenu1);

            jMenu2.setText("Справка");

            jMenuItem3.setText("О программе");
            jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem3ActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuItem3);
            jMenu2.add(jSeparator1);

            jMenu3.setText("Инструкция");

            jMenu4.setText("Раздел 1");

            jMenuItem5.setText("Задача 12");
            jMenu4.add(jMenuItem5);
            jMenu4.add(jSeparator6);

            jMenuItem6.setText("Задача 37");
            jMenu4.add(jMenuItem6);
            jMenu4.add(jSeparator7);

            jMenuItem7.setText("Задача 62");
            jMenu4.add(jMenuItem7);

            jMenu3.add(jMenu4);
            jMenu3.add(jSeparator2);

            jMenu5.setText("Раздел 2");

            jMenuItem8.setText("Задача 12");
            jMenu5.add(jMenuItem8);
            jMenu5.add(jSeparator8);

            jMenuItem9.setText("Задача 37");
            jMenu5.add(jMenuItem9);

            jMenu3.add(jMenu5);
            jMenu3.add(jSeparator3);

            jMenu6.setText("Раздел 3");

            jMenuItem1.setText("Задача 12");
            jMenu6.add(jMenuItem1);
            jMenu6.add(jSeparator4);

            jMenuItem2.setText("Задача 37");
            jMenu6.add(jMenuItem2);
            jMenu6.add(jSeparator5);

            jMenuItem4.setText("Задача 62");
            jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem4ActionPerformed(evt);
                }
            });
            jMenu6.add(jMenuItem4);

            jMenu3.add(jMenu6);

            jMenu2.add(jMenu3);

            jMenuBar1.add(jMenu2);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnPerform1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerform1ActionPerformed
        Work1();
        Work2();
        Work3();
    }//GEN-LAST:event_btnPerform1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Разработчик: Мольков А. В. и Помелов А. О. 21-ИС-1 была написана в 2023 году   ©");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void btnPerformT12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformT12ActionPerformed
        Task12();
    }//GEN-LAST:event_btnPerformT12ActionPerformed

    private void btnPerformT37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformT37ActionPerformed
        Task37();
    }//GEN-LAST:event_btnPerformT37ActionPerformed

    private void pnlTask37AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pnlTask37AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTask37AncestorAdded

    private void lblArrayT12AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblArrayT12AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblArrayT12AncestorAdded

    private void btnPerformT62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformT62ActionPerformed
        Task62();
    }//GEN-LAST:event_btnPerformT62ActionPerformed

    private void btnPerformT12_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformT12_3ActionPerformed
        Task12_3();        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerformT12_3ActionPerformed

    private void btnPerformT37_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformT37_3ActionPerformed
        Task37_3();        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerformT37_3ActionPerformed

    private void btnPerformT62_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformT62_3ActionPerformed
        Task62_3();        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerformT62_3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void txtFldTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldTextActionPerformed

    private void txtFldNaturalNumbresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldNaturalNumbresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldNaturalNumbresActionPerformed

    private void btnPerformT37_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformT37_4ActionPerformed
        Task37_4();        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerformT37_4ActionPerformed

    private void txtfGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfGroupActionPerformed

    private void txtStolb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStolb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStolb2ActionPerformed

    private void txtStolb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStolb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStolb1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tm.setRowCount(0);
        tm1.setRowCount(0);
        tm2.setRowCount(0);
        tm3.setRowCount(0);
        Task37_2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtStrokaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStrokaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStrokaActionPerformed

    private void txtStolbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStolbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStolbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tm.setRowCount(0);
        Task12_2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfTxtTask62_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfTxtTask62_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfTxtTask62_3ActionPerformed

    private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
        if (txtfAdres.getText().isEmpty() || txtfFileName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Введите имя файла и путь куда хотите его сохранить"); // Проверка на содержание текста
        } else {
            fileName = txtfAdres.getText() + "/" + txtfFileName.getText() + ".txt";
            String text = "Количество мальчиков = " + totalMan + " Количество девочек = " + totalWoman;
            SaveFileTask.savefile(fileName, text);
            lblOp.setText("Вы сохранили файл: " + txtfFileName.getText() + " Путь до вашего файла: " + txtfAdres.getText());
    }//GEN-LAST:event_btnSaveFileActionPerformed
    }

    private void txtfFileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfFileNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfFileNameActionPerformed

    private void txtfAdresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfAdresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfAdresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tasks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JButton btnPerform1;
    private javax.swing.JButton btnPerformT12;
    private javax.swing.JButton btnPerformT12_3;
    private javax.swing.JButton btnPerformT37;
    private javax.swing.JButton btnPerformT37_3;
    private javax.swing.JButton btnPerformT37_4;
    private javax.swing.JButton btnPerformT62;
    private javax.swing.JButton btnPerformT62_3;
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JButton btnWorkPrimer1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JLabel lblAnswer1;
    private javax.swing.JLabel lblAnswer12;
    private javax.swing.JLabel lblAnswer2;
    private javax.swing.JLabel lblAnswer3;
    private javax.swing.JLabel lblAnswer37;
    private javax.swing.JLabel lblAnswer62l1;
    private javax.swing.JLabel lblAnswer62l2;
    private javax.swing.JLabel lblAnswer62l3;
    private javax.swing.JLabel lblArrayT12;
    private javax.swing.JLabel lblArrayT37;
    private javax.swing.JLabel lblArrayT62;
    private javax.swing.JLabel lblConclusion;
    private javax.swing.JLabel lblNotidication;
    private javax.swing.JLabel lblOp;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblTask12;
    private javax.swing.JLabel lblTask12_3;
    private javax.swing.JLabel lblTask37;
    private javax.swing.JLabel lblTask37_3;
    private javax.swing.JLabel lblTask37_4;
    private javax.swing.JLabel lblTask62;
    private javax.swing.JLabel lblTask62_3;
    private javax.swing.JLabel lblText1;
    private javax.swing.JLabel lblText2;
    private javax.swing.JLabel lblText3;
    private javax.swing.JLabel lblTotalManWoman;
    private javax.swing.JLabel lblTotalW12_2;
    private javax.swing.JList<String> lstGroup301;
    private javax.swing.JList<String> lstGroup302;
    private javax.swing.JPanel pnlChapter1;
    private javax.swing.JPanel pnlChapter2;
    private javax.swing.JPanel pnlPage1;
    private javax.swing.JPanel pnlTask12;
    private javax.swing.JPanel pnlTask37;
    private javax.swing.JPanel pnlTask62;
    private javax.swing.JTable tblMatrica;
    private javax.swing.JTable tblMaxEl;
    private javax.swing.JTable tblMinEl;
    private javax.swing.JTable tblPrimer1;
    private javax.swing.JTable tblTotal;
    private javax.swing.JTable tblWork372;
    private javax.swing.JTextField txtFldNaturalNumbres;
    private javax.swing.JTextField txtFldText;
    private javax.swing.JTextField txtStolb;
    private javax.swing.JTextField txtStolb1;
    private javax.swing.JTextField txtStolb2;
    private javax.swing.JTextField txtStroka;
    private javax.swing.JTextField txtfAdres;
    private javax.swing.JTextField txtfFileName;
    private javax.swing.JTextField txtfGroup;
    private javax.swing.JTextField txtfKTask62_3;
    private javax.swing.JTextField txtfNTask62_3;
    private javax.swing.JTextField txtfTxtTask62_3;
    private javax.swing.JTabbedPane Задача_37;
    // End of variables declaration//GEN-END:variables
}
