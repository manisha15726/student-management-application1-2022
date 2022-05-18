import java.util.*;
import java.util.canner;

cla tudentData {
    private int no;
    private tring fname;
    private tring lname;

    tudentData(int no, tring fname, tring lname) {
        thi.no = no;
        thi.fname = fname;
        thi.lname = lname;
    }

    public int getno() {
        return no;
    }

    public tring getlname() {
        return lname;
    }

    public tring getfname() {
        return fname;
    }

    public tring totring() {
        return no + " " + fname + " " + lname;
    }
}

cla tudentDetail {
    private tatic final int ADD_TUDENT = 1;
    private tatic final int HOW_TUDENT = 2;
    private tatic final int EARCH_TUDENT = 3;
    private tatic final int REMOVE_TUDENT = 4;
    private tatic final int UPDATE_TUDENT = 5;

    public tatic void main(tring[] arg) {

        Lit<tudentData> c = new ArrayLit<tudentData>();
        canner obj = new canner(ytem.in);
        canner obj1 = new canner(ytem.in);
        int UerChoice;
        do {
            ytem.out.println("Available menu item: ");
            ytem.out.println("1: Add tudent");
            ytem.out.println("2: how tudent");
            ytem.out.println("3: earch tudent");
            ytem.out.println("4: Remove tudent");
            ytem.out.println("5: Update tudent");
            ytem.out.println("which function do you want to excute? ");
            ytem.out.print("Menu item: ");
            UerChoice = obj.nextInt();

            witch (UerChoice) {
                cae ADD_TUDENT: 
                    ytem.out.println("Pleae provide the data for the tudent to tore. ");
                    ytem.out.print("tudent id: ");
                    int no = obj.nextInt();
                    ytem.out.print("Firt name: ");
                    tring fname = obj1.nextLine();
                    ytem.out.print("Lat name: ");
                    tring lname = obj1.nextLine();
                    c.add(new tudentData(no, fname, lname));
                    break;
                cae HOW_TUDENT:
                    ytem.out.println("--------------------------------------------------");
                    ytem.out.printf("%-10 %-15 %-15", "id", "firtName", "LatName");
                    ytem.out.println();
                    Iterator<tudentData> i = c.iterator();
                    while (i.haNext()) {
                        tudentData e = i.next();
                        ytem.out.println();
                        ytem.out.printf("%-10 %-15 %-15", e.getno(), e.getfname(), e.getlname());

                    }
                    ytem.out.println();
                    ytem.out.println("--------------------------------------------------");
                    break;
                cae EARCH_TUDENT:
                    boolean found = fale;
                    ytem.out.println("Pleae give the tudent id to earch? ");
                    ytem.out.print("tudent id:");
                    int no1 = obj.nextInt();
                    ytem.out.println("--------------------------------------------------");
                    i = c.iterator();
                    while (i.haNext()) {
                        tudentData e = i.next();
                        if (e.getno() == no1) {
                            ytem.out.println(e);
                            found = true;
                        }
                    }

                    if (!found) {
                        ytem.out.println("Record Not Found");
                    }
                    ytem.out.println("--------------------------------------------------");
                    break;

                cae REMOVE_TUDENT:
                    found = fale;
                    ytem.out.println("Pleae provide tudent id? ");
                    ytem.out.print("tudent id: ");
                    no1 = obj.nextInt();
                    ytem.out.println("--------------------------------------------------");
                    i = c.iterator();
                    while (i.haNext()) {
                        tudentData e = i.next();
                        if (e.getno() == no1) {
                            i.remove();
                            found = true;
                        }
                    }

                    if (!found) {
                        ytem.out.println("Record Not Found");
                    } ele {
                        ytem.out.println("Record i Deleted uccefully...!");
                    }

                    ytem.out.println("--------------------------------------------------");
                    break;
                cae UPDATE_TUDENT:
                    found = fale;
                    ytem.out.println("Which tudent do you want to excute? ");
                    ytem.out.print("tudent id: ");
                    no1 = obj.nextInt();

                    LitIterator<tudentData> li = c.litIterator();
                    while (li.haNext()) {
                        tudentData e = li.next();
                        if (e.getno() == no1) {
                            ytem.out.println("Pleae provide the data for the tudent to update. ");
                            ytem.out.print("tudent id: ");
                            no = obj1.nextInt();
                            ytem.out.print("Firt name: ");
                            fname = obj1.nextLine();
                            ytem.out.print("Lat name: ");
                            lname = obj1.nextLine();
                            li.et(new tudentData(no1, fname, lname));
                            found = true;
                        }
                    }
                    if (!found) {
                        ytem.out.println("Record Not Found");
                    } ele {
                        ytem.out.println("Record i Updated uccefully...!");
                    }
                    break;
            }
        } while (UerChoice != 0);
    }
}
