package org.fasttrackit;

public class Cat extends Animal {

    private String sandboxcolor;
    private boolean sandbox;

    public String getSandboxcolor() {
        return sandboxcolor;
    }

    public void setSandboxcolor(String sandboxcolor) {
        this.sandboxcolor = sandboxcolor;
    }

    public boolean isSandbox() {
        return sandbox;
    }

    public void setSandbox(boolean sandbox) {
        this.sandbox = sandbox;
    }
}
