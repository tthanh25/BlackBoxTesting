import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityBillCalculatorTest {
    @Test
    void whiteboxtesting() {
        assertEquals(0, ElectricityBillCalculator.calculateElectricityBill(-10));
        assertEquals(30000, ElectricityBillCalculator.calculateElectricityBill(30));
        assertEquals(45000, ElectricityBillCalculator.calculateElectricityBill(45));
        assertEquals(95000, ElectricityBillCalculator.calculateElectricityBill(80));
        assertEquals(225000 , ElectricityBillCalculator.calculateElectricityBill(150));
        assertEquals(450000 , ElectricityBillCalculator.calculateElectricityBill(250));
        assertEquals(0, ElectricityBillCalculator.calculateElectricityBill(0));
        assertEquals(0, ElectricityBillCalculator.calculateElectricityBill(-50));
    }
    @Test
    void Blackboxtesting() {
        assertEquals(-90, ElectricityBillCalculator.calculateElectricityBill(-10));
        assertEquals(30000, ElectricityBillCalculator.calculateElectricityBill(30));
        assertEquals(45000, ElectricityBillCalculator.calculateElectricityBill(45));
        assertEquals(95000, ElectricityBillCalculator.calculateElectricityBill(80));
        assertEquals(225000 , ElectricityBillCalculator.calculateElectricityBill(150));
        assertEquals(450000 , ElectricityBillCalculator.calculateElectricityBill(250));
        assertEquals(0, ElectricityBillCalculator.calculateElectricityBill(0));
    }
    @Test
    void ControlFlowTest() {
        assertEquals(30000, ElectricityBillCalculator.calculateElectricityBill(30));
        assertEquals(95000, ElectricityBillCalculator.calculateElectricityBill(80));
        assertEquals(225000 , ElectricityBillCalculator.calculateElectricityBill(150));
        assertEquals(450000 , ElectricityBillCalculator.calculateElectricityBill(250));
    }
    @Test
    void DataflowTest() {
        assertEquals(30000, ElectricityBillCalculator.calculateElectricityBill(30));
        assertEquals(95000, ElectricityBillCalculator.calculateElectricityBill(80));
        assertEquals(225000 , ElectricityBillCalculator.calculateElectricityBill(150));
        assertEquals(450000 , ElectricityBillCalculator.calculateElectricityBill(250));
        assertEquals(30000, ElectricityBillCalculator.calculateElectricityBill(30));
        assertEquals(95000, ElectricityBillCalculator.calculateElectricityBill(80));
        assertEquals(225000 , ElectricityBillCalculator.calculateElectricityBill(150));
        assertEquals(450000 , ElectricityBillCalculator.calculateElectricityBill(250));
    }
}

