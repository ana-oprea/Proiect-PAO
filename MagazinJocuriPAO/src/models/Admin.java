package models;

import java.util.ArrayList;

public class Admin{
    private ArrayList<BoardGame> bgs;
    private ArrayList<ComicBook> cbs;
    float salesTotal;

    public Admin(){
        this.bgs = new ArrayList<>();
        this.cbs = new ArrayList<>();
        this.salesTotal = 0f;
    }

    public ArrayList<BoardGame> getBgs() {
        return bgs;
    }

    public void setBgs(ArrayList<BoardGame> bgs) {
        this.bgs = bgs;
    }

    public ArrayList<ComicBook> getCbs() {
        return cbs;
    }

    public void setCbs(ArrayList<ComicBook> cbs) {
        this.cbs = cbs;
    }

    public float getSalesTotal() {
        return salesTotal;
    }

    public void setSalesTotal(float value) {
        this.salesTotal += value;
    }

    public void addToBgs(BoardGame bg) {
        this.bgs.add(bg);
    }

    public void addToCbs(ComicBook cb) {
        this.cbs.add(cb);
    }

    public int getBgsSize(){
        return this.bgs.size();
    }
    public int getCbsSize(){
        return this.cbs.size();
    }

    public BoardGame getBgsById(int id){
        return this.bgs.get(id);
    }

    public ComicBook getCbsById(int id){
        return this.cbs.get(id);
    }
}
