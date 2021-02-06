# SOLID Principles

##### Single Responsibility Principle (SRP)

<table align="center">
  
  <tr>
  <th>PaymentProcessor : Before</th>
  <th>PaymentProcessor : After</th>
  </tr>
  <tr> 
  <td>
  
  ```java
class PaymentProcessor{

    public void charge(){
        //Initialize bank data
        //Send request to bank
    }

    public String createReport(){
        //Format the report
        return "Report";
    }

    public void printReport(){
        //Sending the report for printing
    }

    public void savePayment(){
        //Save to DB
    }

}
```
  
  
  </td>
  
  <td>


```java
class PaymentProcessor{

    public void charge(){
        //Initialize bank data
        //Send request to bank
    }

    public String createReport(){
        //Format the report
        return "Report";
    }

    public void printReport(){
        //Sending the report for printing
    }

    public void savePayment(){
        //Save to DB
    }

}
```


</td>
</tr>
  </table>
  
  
  
### Still in dev.
