public class Progression{
    private long first;
    private long cur;
    
    public abstract Progression(){
        this.cur= 0;
        this.first=0;
    }

    public long firstValue(){
        this.cur = this.first;
        return this.cur;
    }

    public long nextValue(){
        return this.cur++;
    }

    public abstract void printProgression(n int);
}
