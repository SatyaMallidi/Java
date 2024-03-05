class InsurancePolicy {
    private String policyHolder;
    private int policyNumber;
    private double coverageAmount;

    public InsurancePolicy(String policyHolder, int policyNumber, double coverageAmount) {
        this.policyHolder = policyHolder;
        this.policyNumber = policyNumber;
        this.coverageAmount = coverageAmount;
    }

    public void describePolicy() {
        System.out.println("Policy Holder: " + policyHolder);
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Coverage Amount: $" + coverageAmount);
    }
    public double calculatePremium() {
        return coverageAmount * 0.02;
    }
}

class LifeInsurance extends InsurancePolicy {
    private int policyTerm;

    public LifeInsurance(String policyHolder, int policyNumber, double coverageAmount, int policyTerm) {
        super(policyHolder, policyNumber, coverageAmount);
        this.policyTerm = policyTerm;
    }

    public double calculatePremium() {
        return super.calculatePremium() + (policyTerm * 50);
    }
}

class HealthInsurance extends InsurancePolicy {
    private boolean hasPreExistingCondition;

    public HealthInsurance(String policyHolder, int policyNumber, double coverageAmount, boolean hasPreExistingCondition) {
        super(policyHolder, policyNumber, coverageAmount);
        this.hasPreExistingCondition = hasPreExistingCondition;
    }

    public double calculatePremium() {
            return hasPreExistingCondition ? super.calculatePremium() * 1.5 : super.calculatePremium();
        }

    }

class InsuranceSystem {
    public static void main(String[] args) {
        InsurancePolicy policy = new InsurancePolicy("Satya", 101, 100000);
        LifeInsurance lifePolicy = new LifeInsurance("Narayana", 201, 200000, 10);
        HealthInsurance healthPolicy = new HealthInsurance("Reddy", 301, 50000, true);

        System.out.println("Policy details:");
        policy.describePolicy();
        System.out.println("Premium: $" + policy.calculatePremium());
        System.out.println();

        System.out.println("Life Insurance details:");
        lifePolicy.describePolicy();
        System.out.println("Premium: $" + lifePolicy.calculatePremium());
        System.out.println();

        System.out.println("Health Insurance details:");
        healthPolicy.describePolicy();
        System.out.println("Premium: $" + healthPolicy.calculatePremium());
    }
}

