package DJIA;

import static spark.Spark.get;

public class Hello {

    public static void main(String[] args) {
        get("/", (req, res) -> {
            return "The Current DJIA average is:  <18,717.03>";
        });
    }
}