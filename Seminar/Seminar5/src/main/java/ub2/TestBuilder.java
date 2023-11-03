package ub2;

enum Operation {
    equal,
    greater,
    less
}

public class TestBuilder {
    private String description;
    private Double expected;
    private Operation operation;

    public TestBuilder() {

    }

    public TestBuilder describe(String description) {
        this.description = description;
        return this;
    }

    public TestBuilder expect(Double expected) {
        this.expected = expected;
        return this;
    }

    public TestBuilder equal() {
        this.operation = Operation.equal;
        return this;
    }

    public TestBuilder to(Double actual) {
        if (this.expected.equals(actual))
            throw new AssertionError(this.description + " failed");
        return this;
    }
}
