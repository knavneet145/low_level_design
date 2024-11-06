package com.lld.StackOverflow;

public class Tag {
    private EntityType type;
    private String ParentId;

    public Tag(EntityType type, String parentId) {
        this.type = type;
        ParentId = parentId;
    }

    public EntityType getType() {
        return type;
    }

    public String getParentId() {
        return ParentId;
    }
}
