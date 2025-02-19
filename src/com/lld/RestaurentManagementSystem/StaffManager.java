package com.lld.RestaurentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class StaffManager {
    private static List<StaffMember> staffMembers = new ArrayList<>();

    private StaffManager() {
    }

    public static void addStaffMember(StaffMember staffMember) {
        staffMembers.add(staffMember);
    }

    public static void deleteStaffMember(StaffMember staffMember) {
        staffMembers.remove(staffMember);
    }
}
