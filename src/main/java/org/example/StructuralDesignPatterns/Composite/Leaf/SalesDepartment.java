package org.example.StructuralDesignPatterns.Composite.Leaf;

import org.example.StructuralDesignPatterns.Composite.Department;

public class SalesDepartment implements Department {
    public SalesDepartment(int i, String salesDepartment) {
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
