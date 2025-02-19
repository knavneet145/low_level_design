package com.lld.RestaurentManagementSystem.Factory;

import com.lld.RestaurentManagementSystem.StaffManager;
import com.lld.RestaurentManagementSystem.StaffMember;

public class StaffMemberFactory {
    private static long id = 0;
    public static StaffMember getStaffMemberInstance(String name, String role, String schedule) {
        StaffMember staffMember = new StaffMember(name, String.valueOf(++id), role, schedule);
        StaffManager.addStaffMember(staffMember);
        return staffMember;
    }
}
