package org.example.CreationalDesignPatterns.Prototype;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class Client {

    @Test
    public void givenAPlasticTreePrototypeWhenClonedThenCreateA_Clone() {
        float mass, height, position, otherPosition;
        mass = 1;
        height = 1;
        position = 1;
        otherPosition = 2;

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(otherPosition);

        assertEquals(position, plasticTree.getPosition());
        assertEquals(otherPosition, anotherPlasticTree.getPosition());
    }

    @Test
    public void givenA_ListOfTreesWhenClonedThenCreateListOfClones() {

        PlasticTree plasticTree = new PlasticTree(1, 2);
        PineTree pineTree = new PineTree(1, 2);

        List<Tree> trees = Arrays.asList(plasticTree, pineTree);
        List<Tree> treeClones = trees.stream().map(Tree::copy).collect(toList());

        float height = plasticTree.getHeight();
        float position = plasticTree.getPosition();

        Tree plasticTreeClone = treeClones.get(1);

        assertEquals(height, plasticTreeClone.getHeight());
        assertEquals(position, plasticTreeClone.getPosition());
    }
}
