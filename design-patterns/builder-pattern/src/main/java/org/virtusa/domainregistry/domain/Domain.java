package org.virtusa.domainregistry.domain;

public class Domain {
    private final String domainName;
    private final int numberOfEmail;
    private final Boolean ssl;
    private final Boolean whoIsGuard;

    public Domain(Builder builder) {
        this.domainName = builder.domainName;
        this.numberOfEmail = builder.numberOfEmail;
        this.ssl = builder.ssl;
        this.whoIsGuard = builder.whoIsGuard;
    }

    @Override
    public String toString() {
        return "Domain {" +
                "domainName='" + domainName + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", ssl=" + ssl +
                ", whoIsGuard=" + whoIsGuard +
                '}';
    }

    public static class Builder {
        private String domainName;
        private int numberOfEmail;
        private Boolean ssl;
        private Boolean whoIsGuard;

        public Builder(String domainName) {
            this.domainName = domainName;
        }

        public Domain build() {
            return new Domain(this);
        }

        public Builder numberOfEmail(int numberOfEmail) {
            this.numberOfEmail = numberOfEmail;
            return this;
        }

        public Builder ssl(Boolean ssl) {
            this.ssl = ssl;
            return this;
        }

        public Builder whoIsGuard(Boolean whoIsGuard) {
            this.whoIsGuard = whoIsGuard;
            return this;
        }
    }
}
