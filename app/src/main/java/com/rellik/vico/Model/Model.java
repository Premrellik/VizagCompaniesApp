package com.rellik.vico.Model;




public class Model implements Comparable<Model>  {



    private String Company;
    private String Details;
    private String ClickHere;




    public String getClickHere() {
        return ClickHere;
    }

    public void setClickHere(String ClickHere) {
       this. ClickHere = ClickHere;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
       this.Details = Details;
    }



   public int compareTo(Model m){
   return  this.Company.compareTo(m.getCompany());
   }



}
