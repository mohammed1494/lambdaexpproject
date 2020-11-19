package Payment;

public class PaymentSystems {
    public static void processPayment() {
        System.out.println("Process customer payment ");
        PayByCreditCard.processPaymentByCreditCard();
        PayByCreditCardWithLambdaExp.processPaymentByCreditCardLambda();
    }
    public class PayByPayPal {
        public void processPaymentByPayPal() {
            System.out.println("Process customer payment using PayPal");
        }
    }
    public class PayByCrypto {
        public void processPaymentByCrypto() {
            System.out.println("Process customer payment using Crypto");
        }
    }
        public static  class PayByCreditCard {
            public static void processPaymentByCreditCard(){
                System.out.println("Process customer payment using Credit Card");
            Pay payex = new Pay(){
                @Override
                public void paymentMethod(){
                    System.out.println("System will process payment via credit card ");
                }
            };
                payex.paymentMethod();
            }
        public interface Pay{
        public void paymentMethod();
       }
    }

    public static class PayByCreditCardWithLambdaExp{
        public static void processPaymentByCreditCardLambda(){
            Pay payexa = () -> System.out.println("System will process payment via credit card and Lambda Expression ");
            payexa.paymentMethod();
        }
        public interface Pay{
            void paymentMethod();
        }
    }
}

