package software.ulpgc.kata5;

import spark.Spark;

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void setupRoutes() {
        Spark.get("/", ((request, response) -> calculatorService.getCalculatorPage()));
        Spark.post("/calculate", ((request, response) -> calculatorService.calculateFactorial(request)));
    }
}
