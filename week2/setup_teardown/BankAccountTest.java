package com.klu.junit_testing;

import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeClass
    public static void globalSetup() {
        System.out.println("==== Starting BankAccount Tests ====");
    }

    @AfterClass
    public static void globalTeardown() {
        System.out.println("==== Finished BankAccount Tests ====");
    }

    @Before
    public void setUp() {
        // Arrange - setup fresh account for each test
        account = new BankAccount("Navya", 1000.0);
        System.out.println(">> Test Setup: Account created");
    }

    @After
    public void tearDown() {
        // Cleanup after each test
        account = null;
        System.out.println("<< Test Teardown: Account cleared\n");
    }

    @Test
    public void testDeposit() {
        // Arrange
        double depositAmount = 500.0;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        // Arrange
        double withdrawAmount = 300.0;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(700.0, account.getBalance(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawMoreThanBalance() {
        // Act
        account.withdraw(2000.0); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeAmount() {
        // Act
        account.deposit(-100.0); 
    }

    @Test
    public void testOwnerName() {
        // Assert
        assertEquals("Navya", account.getOwner());
    }
}
