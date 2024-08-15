package org.example.models;

import java.util.Map;

public class UserRole {
    public static final String ADMIN = "admin";
    public static final String HR = "HR";
    public static final String MANAGEMENT = "Management";
    public static final String SALES = "Sales";
    int roleId;

    private static final Map<Integer, String> ROLES_MAP = Map.of(
            1, ADMIN,
            2, HR,
            3, MANAGEMENT,
            4, SALES
    );

    public UserRole(final int roleId) {
        setRoleId(roleId);
    }
    public String getRoleName() {
        return ROLES_MAP.get(getRoleId());
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(final int roleId) {
        this.roleId = roleId;
    }
}
