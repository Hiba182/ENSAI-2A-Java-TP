package fr.ensai.library;
import java.util.List;

public class Library {
    private List<Item> items ;
    private List<Loan> activeLoans;
    private List<Loan> completedLoans;
    public Library (List <Item> items ,List <Loan> activeLoans,List <Loan> completedLoans ){
        this.items=items;
        this.activeLoans=activeLoans;
        this.completedLoans=completedLoans;
    }


}
