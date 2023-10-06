//Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.
/*Sınıfın Nitelikleri
name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Sınıfın Metotları
Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.*/



package javaapplication121;
import java.util.Calendar;
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    Employee( String name,int salary,int workHours, int hireYear){
    this.name=name;
    this.salary=salary;
    this.workHours=workHours;
    this.hireYear=hireYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }
    public void  tax(){
        if(salary<1000){
        double taxAmount=salary*0.03;
        salary-=taxAmount;
        }
      }
    public void bonus(){
    if(workHours>40){
    double bonusAmount=(workHours-40)*30;
    salary+=bonusAmount;
    }
    }
    public void raiseSalary(){
         int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - hireYear;
        if (yearsWorked < 10) {
            salary *= 1.05; // %5 zam
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            salary *= 1.10; // %10 zam
        } else {
            salary *= 1.15; // %15 zam
        }
    }
    @Override
    public String toString() {
        return "Adı: " + name +
               "\nMaaşı: " + salary +
               "\nHaftalık Çalışma Saati: " + workHours +
               "\nİşe Başlama Yılı: " + hireYear;
    }
    public static void main(String[] args) {
        Employee e1=new Employee("Kemal",1500,54,2011);
       e1.tax();
        e1.bonus();
        e1.raiseSalary();
        System.out.println(e1.toString());
        
    }
    
}
