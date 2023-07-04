package com.petrolpark.destroy.test;

import com.petrolpark.destroy.chemistry.Formula;
import com.petrolpark.destroy.chemistry.Molecule;
import com.petrolpark.destroy.chemistry.Molecule.MoleculeBuilder;
import com.petrolpark.destroy.chemistry.index.DestroyMolecules;
import com.petrolpark.destroy.chemistry.index.DestroyReactions;
import com.petrolpark.destroy.chemistry.index.DestroyTopologies;

public class ChemistryTest {

    public static void main(String ...args) {

        DestroyTopologies.register();
        DestroyMolecules.register();
        DestroyReactions.register();
        
        MoleculeBuilder builder = new MoleculeBuilder("test");
        Molecule HENRYANE = builder.id("henryane")
            .structure(Formula.deserialize("destroy:cubane:COOH+1.9,,,COOH,Cl,F,N"))
            .build();
        
        System.out.println(HENRYANE.getStructuralFormula());
        
    };
};
