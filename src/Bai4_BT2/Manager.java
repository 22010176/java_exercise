package Bai4_BT2;

import java.util.ArrayList;

public class Manager {
    public static int maxNV = 5;
    private static int _id = 0;
    private int id;
    private ArrayList<Employee> teams;

    Manager() {
        this.id = ++_id;
        teams = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String toString() {
        String res = String.format("id team: %d, so nhan vien: %d\n", id, teams.size());
        for (int i = 0; i < teams.size(); ++i)
            res += teams.get(i).toString() + "\n";
        return res;
    }

    public void printEE() {
        System.out.println(toString());
    }

    public ArrayList<Employee> getTeams() {
        return teams;
    }

    public int coutNumNV() {
        return teams.size();
    }

    public void setNumNV(int NumNV) {
        if (NumNV > maxNV)
            return;

        if (teams.size() < NumNV)
            teams.add(new Employee());
    }

    public void removeNV(int id) {
        for (int i = 0; i < teams.size(); ++i)
            if (id == teams.get(i).getId())
                teams.remove(i);
    }

    public void addEE(Employee emp) {
        if (maxNV <= teams.size())
            return;
        teams.add(emp);
    }

    public int search(Employee ee) {
        for (int i = 0; i < teams.size(); ++i)
            if (ee.getId() == teams.get(i).getId())
                return i;
        return -1;
    }
}
