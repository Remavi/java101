package Hafta2.SalaryCalculator;

public class Employee {
    String name; //Çalışanın ismi
    double salary;//Çalışanın maaşı
    int workHours;//Çalışanın haftalık çalışma saati
    int hireYear;//Çalışanın işe girme yılı

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax (){ //Vergi hesaplama
        if (salary > 1000){
            return (salary*3/100);
        } else {
            return 0;
        }
    }

    public double bonus (){ //Bonus hesaplama
        return 30 * (workHours > 40 ? workHours - 40: 0);
    }

    public double raiseSalary (){ //Çalışma yılına göre zam hesaplama
        int workYear = 2021 - hireYear;
        if (workYear < 10){
            return salary*5/100;
        } else if (workYear > 9 && workYear < 20){
            return salary*10/100;
        } else {
            return salary*15/100;
        }
    }

    public String toString(){ //Çalışan bilgileri
        return "İsim: "+name+"\n" +
                "Maaşı: "+salary+"\n" +
                "Çalışma saati: "+workHours+"\n" +
                "Başlangıç yılı: "+hireYear+"\n" +
                "Vergi: "+ tax()+"\n" +
                "Bonus: "+ bonus()+ "\n" +
                "Maaş artışı: "+raiseSalary()+"\n" +
            "Vergi ve Bonuslar ile birlikte maaş: "+ (salary - tax() +bonus())+"\n" +
            "Toplam Maaş: "+ (salary - tax() +bonus()+ raiseSalary());
    }
}
