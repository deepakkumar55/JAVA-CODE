
# JAVA

- Java ek high-level, object-oriented programming language hai jo bahut popular hai software development mein. Iska upyog applications, web development, mobile apps aur bahut kuch ke liye hota hai. Java platform-independent hai, matlab ki iska code aap ek jagah likh sakte hai aur dusri jagah usko chala sakte hai.

- Java ka code byte code ke roop mein compile hota hai, jise JVM (Java Virtual Machine) interpret karke execute karta hai. Iski wajah se Java code alag-alag operating systems par chalta hai.

- Java mein aap classes aur objects ka upyog karke programs likh sakte hai. Har program ek class mein hota hai, aur har class ke andar methods hote hai jo task ko perform karte hai. Java ke libraries aur frameworks se aap apne programs ko simplify kar sakte hai.

- Java ko sikhna asaan hai kyunki iska syntax dusre programming languages se similar hai. Isme exception handling aur garbage collection jaise features hote hai jo code ki suraksha aur saaf-safai ke liye helpful hai.

#### Java Example :-
```
class Main{  
    public static void main(String args[]){  
     System.out.println("Hello Deepak");  
    }  
}  
```
# History of Java
- Java ko 1995 mein James Gosling aur uske sathiyon ne develop kiya tha. Java ka mool udeshya "write once, run anywhere" tha, yani ek bar likho, kahin bhi chalao. Java ko initially "Oak" naam se develop kiya gaya tha, lekin baad mein uska naam Java rakha gaya

#  Features of Java
Java ke kuch mahatvapurna guno ko samjhaane ke liye, hume kuch Hindi aur English shabdon ka samanvay karke use karenge:

![App Screenshot](https://static.javatpoint.com/images/core/java-features.png)

1. Simple: Java ek saral aur aasaan bhasha hai, jisko samajhna aur likhna asaan hai.

2. Object-Oriented: Java ek "Object-oriented" bhasha hai, jiska matlab hai ki isme sabhi cheezen objects ke roop mein prastut hoti hain. Ye tareeka code ko modular aur sahaj banata hai.

3. Portable: Java ek sarvatra laayak bhasha hai, jiska arth hai ki Java ka code ek prakar se likha ja sakta hai aur phir alag-alag prakar ke computer systems par chala sakte hain.

4. Platform independent: Java pratform anuprayukt hai, iska matlab hai ki Java code ek baar likha ja sakta hai aur usse alag-alag pratforms par chala sakte hain jaise ki Windows, Mac, Linux, etc.

![App Screenshot](https://static.javatpoint.com/images/core/platform-independent-java.png)

5. Secured: Java surakshit hai aur security features provide karta hai. Isme kuch built-in security mechanisms hain, jaise ki bytecode verification, sandbox environment, aur exception handling.

![App Screenshot](https://static.javatpoint.com/images/core/java-security.png)

6. Robust: Java ek majboot bhasha hai, jisme error handling aur memory management ki suvidhaen hain. Ye sudridhata aur galatiyon ke saath samjhauta karne ki kshamta hai.

7. Architecture neutral: Java architecture-neutral hai, iska matlab hai ki Java code hardware architecture se asabhya nahin hai. Ye code ko alag-alag computer systems par aasani se chalane ki anumati deta hai.

8. Interpreted: Java ek anuvaadit bhasha hai, iska matlab hai ki Java ke code ko pahle bytecode mein anuvaadit kiya jata hai, jise phir JVM (Java Virtual Machine) interpret karta hai aur usko run karata hai.

9. High Performance: Java uchch pradarshan pradan karne ki kshamta rakhta hai. Ye ek just-in-time (JIT) compiler ka upyog karke bytecode ko surya anuvaadit karta hai, jisse pradarshan ko badhaya ja sakta hai.

10. Multithreaded: Java bahusankhyiki hai, yani isme aap ek saath kee threads chala sakte hain. Isse ek sath multiple tasks ko samaanvit roop se aur samay ke saath prabhavit roop se prastut kiya ja sakta hai.

11. Distributed: Java baantate hue hai, iska matlab hai ki Java ki madad se bane applications alag-alag computer systems aur networks par baant sakte hain. Ye distributed computing mein upyog kiya ja sakta hai.

12. Dynamic: Java gatividhijanak hai, jiske karan isme code runtime mein parivartit aur badlav ho sakta hai. Ye dinamik roop se code ko badalne ki anumati deta hai aur isko flexible banata hai.


# Parameters used in First Java Program

1. Class: Ek class ek code ka blueprint hota hai. Har Java program mein ek class hoti hai. Pahla parameter class ka naam hota hai.

2. Public: Public ek access modifier hai, jo batata hai ki class ya method dusre parts of program se accessible hai ya nahi. Yeh parameter class ke baad likha jata hai.

3. Static: Static ek keyword hai jo batata hai ki ek method ya variable class level par define hua hai aur object banane ke bina bhi uska istemaal kiya jaa sakta hai.

4. Void: Void ek return type hai jo batata hai ki method koi value return nahi karega.

5. Main: Main ek special method hai jo program ka execution shuru karta hai. Yeh method "public static void main(String[] args)" signature ke saath likha jata hai.

6. String[] args: Yeh ek parameter hai jo main method ko command line arguments provide karta hai.



```java
public class PahlaProgram {
    public static void main(String[] args) {
        // Program ki shuruwat yahan se hoti hai
    }
}
```

# compile time?
![App Screenshot](https://static.javatpoint.com/images/core/javacodecompile.png)

# runtime?

![App Screenshot](https://static.javatpoint.com/images/java-runtime-processing.png)

- Classloader: It is the subsystem of JVM that is used to load class files.

- Bytecode Verifier: Checks the code fragments for illegal code that can violate access rights to objects.

- Interpreter: Read bytecode stream then execute the instructions.

# Difference between JDK, JRE, and JVM
- JDK (Java Development Kit): JDK ek aisa package hai jo Java application aur software development ke liye use hota hai. Ismein Java compiler, libraries, aur development tools shaamil hote hain. JDK ka upyog Java code ko likhne, compile karne aur execute karne ke liye hota hai.

![App Screenshot](https://static.javatpoint.com/images/jdk2.png)

- JRE (Java Runtime Environment): JRE ek aisa environment hai jisme Java applications run hoti hain. Yeh ek runtime package hai jo Java ke compiled code (bytecode) ko execute karne ki suvidha pradaan karta hai. JRE mein JVM (Java Virtual Machine) bhi shaamil hoti hai.

![App Screenshot](https://static.javatpoint.com/images/jre2.png)

- JVM (Java Virtual Machine): JVM ek aisa virtual machine hai jo Java bytecode ko execute karta hai. Jab Java code ko compile karte hain, toh iska output bytecode format mein hota hai. Yeh bytecode JVM mein run hota hai. JVM bytecode ko machine-specific instructions mein translate karta hai aur usko hardware par execute karne ke liye responsible hota hai.

# JVM Architecture

![App Screenshot](https://static.javatpoint.com/images/jvm-architecture.png)

# Java Variables
- Java ke variables uss program mei values ko store karne ke liye use hote hai. Variables ek naam se pukare jaate hai aur unmein alag-alag types ki values rakhi ja sakti hai, jaise numbers, strings, ya phir objects. Jab hum koi variable create karte hai, to usko ek naam dete hai, jisse hum usko refer kar sake. Variable ko create karne ke liye hume uski data type bhi specify karni hoti hai, jaise int, float, ya string. Ek baar variable create ho gaya hai, usmein hum value assign kar sakte hai aur badle mein us value ko program ke dusre parts mein use kar sakte hai. Variables ke naam case-sensitive hote hai, yaani uppercase aur lowercase letters ka farak hota hai.
  ![App Screenshot](https://static.javatpoint.com/core/images/variable.png)

```
int data=50;//Here data is variable  
```
## Types of Variables

![App Screenshot](https://static.javatpoint.com/core/images/types-of-variables1.png)

- #### Local Variable
Local variable woh variables hote hai jo sirf ek specific block mein ya method mein use hote hai. Inhe method ke andar declare kiya jata hai aur unka scope sirf us method tak hi simit hota hai. Jab method ka execution khatm ho jata hai, tab local variable ki value destroy ho jati hai.

- #### Instance Variable
Instance variable woh variables hote hai jo class ke andar declare kiye jate hai, lekin kisi bhi method ke andar nahi. Inhein class ke har object ke saath ek sath banaya jata hai. Instance variables ka scope poore class tak hota hai, isliye inhein class ke bahar bhi access kiya ja sakta hai. Instance variables ka value object ke creation ke saath initialize hota hai aur object delete hone tak rehta hai.

- #### Static Variable
Static variable woh variables hote hai jo class ke andar declare kiye jate hai aur keyword "static" ke saath associate kiye jate hai. Ye variable sirf ek baar memory mein allocate hote hai, chahe us class se kitne bhi objects banaye jaaye. Static variables ka scope poore class mein hota hai. Inhein class ke bina bhi access kiya ja sakta hai. Static variables ki value class ke load hone se pehle initialize hoti hai aur program ke end tak rehti hai.

```
public class A  
{  
    static int m=100;//static variable  
    void method()  
    {    
        int n=90;//local variable    
    }  
    public static void main(String args[])  
    {  
        int data=50;//instance variable    
    }  
}//end of class   
```