package com.nukkitx.nbt.tag;

public class EndTag extends Tag<Void> {
    public static final EndTag INSTANCE = new EndTag();

    private EndTag() {
        super(null);
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public EndTag rename(String newName) {
        return INSTANCE;
    }

    @Override
    public Void getValue() {
        return null;
    }
}
