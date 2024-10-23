import java.security.spec.RSAOtherPrimeInfo;

public class ER {
    public String scope = "brian Sugery";
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ER ER = new ER();
    }
    public ER (){
        scope = "amputation";
        System.out.println("number 1:" + scope);
        for(int scope = 0; scope < 10; scope++){
            System.out.println("number 4: " + this.scope);
        }

        String scope = "heart sugery";
        scope = "brain transplant (hopefully no one dies)";
        System.out.println("number 2:"  + scope);
        System.out.println("number 3: "+ this.scope);
        scope = OR("kidney transplant");
        System.out.println("number 6: " + scope);
    }
    public String OR(String scope){
        //scope = this.scope;
      //  this.scope = scope;
        System.out.println("number 5: " + scope);
        return this.scope;
    }
}