package com.chargebee;

import com.chargebee.exceptions.InvalidRequestException;
import com.chargebee.models.*;
import com.chargebee.models.enums.AutoCollection;
import org.json.JSONObject;

import java.sql.Timestamp;
import java.util.List;

public class Sample {

    public static void main(String[] args) throws Exception {
        System.setProperty("com.chargebee.api.protocol","http");
        System.setProperty("com.chargebee.api.domain.suffix","localcb.in:8080");
        Environment.configure("mannar-test","test___dev__hwXQupepJp98r7jVlvCOWk60FbjyQGHI");

/*
        Result result = Customer.retrieve("__dev__8asr2TUhUXHp3v").request();
        Customer customer = result.customer();
        Card card = result.card();
        System.out.println(result.jsonResponse());
        System.out.println("CUSTOMER RESPONSE :  "+ customer);
        System.out.println("CARD RESPONSE :  "+ card);
*/

       /* System.setProperty("com.chargebee.api.protocol","http");
        System.setProperty("com.chargebee.api.domain.suffix","localcb.in:8080");
        Environment.configure("mannar-test","test___dev__hwXQupepJp98r7jVlvCOWk60FbjyQGHI");
        Result result1 = Subscription.delete("subs21")
                .header("Content-Type", "application/json")
                .request();

        Subscription subscription = result1.subscription();
        Customer customer = result1.customer();
        Card card = result1.card();
        System.out.println(result1.jsonResponse());
        System.out.println("SUBSCRIPTION RESPONSE :  "+ subscription);
        System.out.println("CUSTOMER RESPONSE :  "+ customer);
        System.out.println("CARD RESPONSE :  "+ card);*/

        Result result = Subscription.create()
                .planId("basic")
                .autoCollection(AutoCollection.OFF)
                .customerFirstName("John")
                .customerLastName("Doe")
                .customerEmail("john@user.com")
                .billingAddressFirstName("John")
                .billingAddressLastName("Doe")
                .billingAddressLine1("PO Box 9999")
                .billingAddressCity("Walnut")
                .billingAddressState("California")
                .billingAddressZip("91789")
                .billingAddressCountry("US")
               // .header("Content-Type", "application/json")
                .request();
        Subscription subscription = result.subscription();
        Customer customer = result.customer();
        Card card = result.card();
        Invoice invoice = result.invoice();
        List<UnbilledCharge> unbilledCharges = result.unbilledCharges();
        System.out.println(result.jsonResponse());
        System.out.println("SUBSCRIPTION RESPONSE :  "+ subscription);
        System.out.println("CUSTOMER RESPONSE :  "+ customer);
        System.out.println("Invoice RESPONSE :  "+ invoice);
        System.out.println("Unbilled RESPONSE :  "+ unbilledCharges);
        System.out.println("CARD RESPONSE :  "+ card);
/*        Result result = Customer.create()
                .firstName("John")
                .lastName("Doe")
                .email("john@test.com")
                .cardFirstName("Richard")
                .cardLastName("Fox")
                .cardNumber("4012888888881881")
                .cardExpiryMonth(10)
                .cardExpiryYear(2023)
                .cardCvv("999")
                .metaData(new JSONObject(" { \"features\" : {\n" +
                        "            \"usage-limit\" : \"5GB\",\n" +
                        "                    \"speed-within-quota\" : \"2MBbps\",\n" +
                        "                    \"post-usage-quota\" : \"512kbps\",\n" +
                        "        }}"))//object
              // .header("Content-Type", "application/json")
                .request();
        Customer customer = result.customer();
        System.out.println(result.jsonResponse());
        Card card = result.card();
        System.out.println("CUSTOMER RESPONSE :  "+ customer);
        System.out.println("CARD RESPONSE :  "+ card);*/

    /*    System.setProperty("com.chargebee.api.protocol","http");
        System.setProperty("com.chargebee.api.domain.suffix","localcb.in:8080");
        Environment.configure("mannar-test","test___dev__ESUrlfpkIB5cdIS7jcd5cuINZO23EqER4t");
        Result result = Subscription.retrieve("subs1").request();
        Subscription subscription = result.subscription();
        System.out.println(subscription.currentTermEnd());
        Customer customer = result.customer();
        Card card = result.card();*/

        //Environment.configure("khushbubibayprod-test","test_dcdJBZ0bhSs4Aa3RwYIPhgg63na79muFp");
        /*Result result = Subscription.changeTermEnd("169li0TFPt54L2ued")
            .termEndsAt(new Timestamp(2147483648L))
            .request();
        Subscription subscription = result.subscription();
        Customer customer = result.customer();
        Card card = result.card();
        Invoice invoice = result.invoice();
        List<UnbilledCharge> unbilledCharges = result.unbilledCharges();
        List<CreditNote> creditNotes = result.creditNotes();
*/
       /* Environment.configure("khushbubibayprod-test","test_dcdJBZ0bhSs4Aa3RwYIPhgg63na79muFp");
        Result result = Subscription.createWithItems("169lqeTQdS0t1LZO")
            .subscriptionItemItemPriceId(0,"testplan1subs-USD-Every-15-years")//testplan1subs-USD-Yearly //testplan1subs-USD-Every-15-years
            .subscriptionItemBillingCycles(0,2)
            .subscriptionItemQuantity(0,1)
            .subscriptionItemUnitPrice(0,100L)
            .request();
        Subscription subscription = result.subscription();
        System.out.println(subscription.id());
        Customer customer = result.customer();
        Card card = result.card();
        Invoice invoice = result.invoice();
        List<UnbilledCharge> unbilledCharges = result.unbilledCharges();
*/
       /* try{
            Result result = Subscription.retrieve("169li0TFPt54L2ued").request();
            Subscription subscription = result.subscription();
            Customer customer = result.customer();
            Card card = result.card();
        }catch (InvalidRequestException e){
            System.out.println("inal");
           e.printStackTrace();
        } catch (Exception e) {
            System.out.println("inalaaa");
            e.printStackTrace();
        }
*/
    }


}
