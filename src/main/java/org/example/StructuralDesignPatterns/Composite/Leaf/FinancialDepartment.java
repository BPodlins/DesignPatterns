package org.example.StructuralDesignPatterns.Composite.Leaf;

import org.example.StructuralDesignPatterns.Composite.Department;

public class FinancialDepartment implements Department {
    public FinancialDepartment(int i, String financialDepartment) {
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
