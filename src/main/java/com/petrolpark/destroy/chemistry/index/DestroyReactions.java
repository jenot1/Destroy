package com.petrolpark.destroy.chemistry.index;

import com.petrolpark.destroy.Destroy;
import com.petrolpark.destroy.chemistry.Reaction;
import com.petrolpark.destroy.chemistry.Reaction.ReactionBuilder;
import com.petrolpark.destroy.chemistry.reactionresult.PrecipitateReactionResult;
import com.petrolpark.destroy.item.DestroyItems;

import net.minecraft.world.item.Items;

public class DestroyReactions {

    public static final Reaction

    ACETONE_CYANOHYDRIN_SYNTHESIS = builder()
        .id("acetone_cyanohydrin_synthesis")
        .addReactant(DestroyMolecules.CYANIDE)
        .addReactant(DestroyMolecules.ACETONE)
        .addReactant(DestroyMolecules.PROTON)
        .addProduct(DestroyMolecules.ACETONE_CYANOHYDRIN)
        .build(), // This is a generic Cyanide addition-elimination and will be removed in place of the automatically generated reaction

    AIBN_SYNTHESIS = builder()
        .id("aibn_synthesis")
        .addReactant(DestroyMolecules.ACETONE_CYANOHYDRIN, 2)
        .addReactant(DestroyMolecules.HYDRAZINE)
        .addReactant(DestroyMolecules.CHLORINE)
        .addProduct(DestroyMolecules.AIBN)
        .addProduct(DestroyMolecules.WATER, 2)
        .addProduct(DestroyMolecules.HYDROCHLORIC_ACID, 2)
        .build(),

    //TODO generic reaction hydrocyanation
    //TODO generic reaction ammonia methylation

    ANDRUSSOW_PROCESS = builder()
        .id("andrussow_process")
        .addReactant(DestroyMolecules.METHANE, 2, 1)
        .addReactant(DestroyMolecules.AMMONIA, 2, 1)
        .addReactant(DestroyMolecules.OXYGEN, 3, 1)
        .addProduct(DestroyMolecules.HYDROGEN_CYANIDE, 2)
        .addProduct(DestroyMolecules.WATER, 6)
        .build(), //TODO add platinum catalyst and require ~1200 degrees

    ANTHRAQUINONE_PROCESS = builder()
        .id("anthraquinone_process")
        .addReactant(DestroyMolecules.ETHYLANTHRAHYDROQUINONE)
        .addReactant(DestroyMolecules.OXYGEN)
        .addProduct(DestroyMolecules.ETHYLANTHRAQUINONE)
        .addReactant(DestroyMolecules.HYDROGEN_PEROXIDE)
        .build(),

    ANTHRAQUINONE_REDUCTION = builder()
        .id("anthraquinone_reduction")
        .addReactant(DestroyMolecules.ETHYLANTHRAQUINONE)
        .addReactant(DestroyMolecules.HYDROGEN)
        .addProduct(DestroyMolecules.ETHYLANTHRAHYDROQUINONE)
        .build(), //TODO add palladium catalyst

    BENZENE_ETHYLATION = builder()
        .id("benzene_ethylation")
        .addReactant(DestroyMolecules.BENZENE)
        .addReactant(DestroyMolecules.ETHENE)
        .addCatalyst(DestroyMolecules.PROTON, 1)
        .addProduct(DestroyMolecules.ETHYLBENZENE)
        .build(),

    BENZENE_HYDROGENATION = builder()
        .id("benzene_hydrogenation")
        .addReactant(DestroyMolecules.BENZENE)
        .addReactant(DestroyMolecules.HYDROGEN, 2, 1)
        .addProduct(DestroyMolecules.CYCLOHEXENE)
        .build(), //TODO add nickel catalyst

    BUTADIENE_CARBONYLATION = builder()
        .id("butadiene_carbonylation")
        .addReactant(DestroyMolecules.BUTADIENE)
        .addReactant(DestroyMolecules.CARBON_MONOXIDE, 2)
        .addReactant(DestroyMolecules.WATER, 2, 1)
        .addProduct(DestroyMolecules.ADIPIC_ACID)
        .build(),

    CARBON_MONOXIDE_OXIDATION = builder()
        .id("carbon_monoxide_oxidation")
        .addReactant(DestroyMolecules.CARBON_MONOXIDE, 2, 1)
        .addReactant(DestroyMolecules.OXYGEN)
        .addProduct(DestroyMolecules.CARBON_DIOXIDE, 2)
        .build(),

    CARBON_TETRACHLORIDE_FLUORINATION = builder()
        .id("carbon_tetrachloride_fluorination")
        .addReactant(DestroyMolecules.CARBON_TETRACHLORIDE, 2, 1)
        .addReactant(DestroyMolecules.HYDROFLUORIC_ACID, 3, 1)
        .addProduct(DestroyMolecules.DICHLORODIFLUOROMETHANE)
        .addProduct(DestroyMolecules.TRICHLOROFLUOROMETHANE)
        .addProduct(DestroyMolecules.HYDROCHLORIC_ACID, 3)
        .build(), //TODO eventually replace with generic halogen substitution reaction

    CELLULOSE_NITRATION = builder()
        .id("cellulose_nitration")
        .addReactant(DestroyMolecules.NITRONIUM)
        .addSimpleItemReactant(DestroyItems.PAPER_PULP.get(), 2f)
        .addProduct(DestroyMolecules.PROTON)
        .addProduct(DestroyMolecules.WATER) //TODO in future add oxalic acid side product
        .withResult(2f, (m, r) -> new PrecipitateReactionResult(m, r, () -> DestroyItems.NITROCELLULOSE.asStack()))
        .build(),

    CHLORINE_HALOFORM_REACTION = builder()
        .id("chlorine_haloform_reaction")
        .addReactant(DestroyMolecules.HYPOCHLORITE, 3, 0)
        .addReactant(DestroyMolecules.ACETONE)
        .addProduct(DestroyMolecules.ACETATE)
        .addProduct(DestroyMolecules.CHLOROFORM)
        .addProduct(DestroyMolecules.HYDROXIDE, 2)
        .addCatalyst(DestroyMolecules.HYDROXIDE, 0)
        .build(),

    CHLORINE_SOLVATION = builder()
        .id("chlorine_solvation")
        .addReactant(DestroyMolecules.CHLORINE)
        .addReactant(DestroyMolecules.WATER)
        .addProduct(DestroyMolecules.HYDROCHLORIC_ACID)
        .addProduct(DestroyMolecules.PROTON)
        .addProduct(DestroyMolecules.HYPOCHLORITE)
        .build(), //TODO add UV catalyst and reverse reaction

    //TODO add fluorine/chlorine substitution
    //TODO add UV chlorination with Chlorine gas

    CHLORODIFLUOROMETHANE_PYROLYSIS = builder()
        .id("chlorodifluoromethane_pyrolysis")
        .addReactant(DestroyMolecules.CHLORODIFLUOROMETHANE, 2)
        .addProduct(DestroyMolecules.HYDROFLUORIC_ACID, 2)
        .addProduct(DestroyMolecules.TETRAFLUOROETHENE)
        .build(),

    CHLOROFORM_FLUORINATION = builder()
        .id("chloroform_fluorination")
        .addReactant(DestroyMolecules.CHLOROFORM)
        .addReactant(DestroyMolecules.HYDROFLUORIC_ACID, 2)
        .addProduct(DestroyMolecules.CHLORODIFLUOROMETHANE)
        .addProduct(DestroyMolecules.HYDROCHLORIC_ACID, 2)
        .build(),

    CUMENE_PROCESS = builder()
        .id("cumene_process")
        .addReactant(DestroyMolecules.BENZENE)
        .addReactant(DestroyMolecules.PROPENE)
        .addCatalyst(DestroyMolecules.AIBN, 0)
        .addCatalyst(DestroyMolecules.PROTON, 1)
        //TODO add Lewis acid catalyst
        .addProduct(DestroyMolecules.PHENOL)
        .addProduct(DestroyMolecules.ACETONE)
        .build(),

    CYCLOHEXENE_OXIDATIVE_CLEAVAGE = builder()
        .id("cyclohexene_oxidative_cleavage")
        .addReactant(DestroyMolecules.CYCLOHEXENE)
        .addReactant(DestroyMolecules.HYDROGEN_PEROXIDE, 3, 1)
        .addProduct(DestroyMolecules.ADIPIC_ACID)
        .addProduct(DestroyMolecules.WATER, 2)
        .build(), //TODO add "tungsten" catalyst. This reaction also has as phase-transfer catalyst but I have chosen to ignore it.
    
    //TODO contact process
    //TODO cisplatin synthesis
    //TODO possible cyclopentanone/cyclopentadiene interconversion
    //TODO cyclopentanone synthesis from adipic acid

    BASIC_DIELS_ALDER_REACTION = builder()
        .id("basic_diels_alder_reaction")
        .addReactant(DestroyMolecules.BUTADIENE)
        .addReactant(DestroyMolecules.ETHENE)
        .addProduct(DestroyMolecules.CYCLOHEXENE)
        .build(),

    ETHYLANTHRAQUINONE_SYNTHESIS = builder()
        .id("ethylanthraquinone_synthesis")
        .addReactant(DestroyMolecules.PHTHALIC_ANHYDRIDE)
        .addReactant(DestroyMolecules.ETHYLBENZENE)
        .addProduct(DestroyMolecules.WATER)
        .addProduct(DestroyMolecules.ETHYLANTHRAQUINONE) //TODO add zeolite catalyst
        .build(),

    ETHYLBENZENE_DEHYDROGENATION = builder()
        .id("ethylbenzene_dehydrogenation")
        .addReactant(DestroyMolecules.ETHYLBENZENE)
        .addCatalyst(DestroyMolecules.WATER, 2)
        .addCatalyst(DestroyMolecules.IRON_III, 1)
        .addProduct(DestroyMolecules.STYRENE)
        .addProduct(DestroyMolecules.HYDROGEN)
        .build(), //TODO ensure superheated and carefully balance rate constant with that of hydrogenation of styrene

    GLYCEROL_NITRATION = builder()
        .id("glycerol_nitration")
        .addReactant(DestroyMolecules.GLYCEROL)
        .addReactant(DestroyMolecules.NITRONIUM, 3)
        .addProduct(DestroyMolecules.PROTON, 3)
        .addProduct(DestroyMolecules.NITROGLYCERINE)
        .build(),

    GOLD_DISSOLUTION = builder()
        .id("gold_dissolution")
        .addSimpleItemReactant(Items.GOLDEN_CARROT, 1f)
        .addReactant(DestroyMolecules.NITRIC_ACID)
        .addReactant(DestroyMolecules.HYDROCHLORIC_ACID, 4, 1)
        .addProduct(DestroyMolecules.CHLOROAURATE)
        .addProduct(DestroyMolecules.PROTON)
        .addProduct(DestroyMolecules.WATER, 3)
        .addProduct(DestroyMolecules.NITROGEN_DIOXIDE, 3)
        .build(),

    //TODO iodine dissolution and precipitation

    HABER_PROCESS = builder()
        .id("haber_process")
        .addReactant(DestroyMolecules.NITROGEN)
        .addReactant(DestroyMolecules.HYDROGEN, 3, 0)
        .addProduct(DestroyMolecules.AMMONIA, 2)
        .build(), //TODO add iron catalyst and reversibility
    //TODO add oxidation of nitrogen in air so this is more difficult
        
    HYDROGEN_CHLORIDE_SYNTHESIS = builder()
        .id("hydrogen_chloride_synthesis")
        .addReactant(DestroyMolecules.HYDROGEN)
        .addReactant(DestroyMolecules.CHLORINE)
        .addProduct(DestroyMolecules.HYDROCHLORIC_ACID, 2)
        .build(), //TODO add UV catalyst
    
    HYDROGEN_IODIDE_SYNTHESIS = builder()
        .id("hydrogen_iodide_synthesis")
        .addReactant(DestroyMolecules.HYDRAZINE)
        .addReactant(DestroyMolecules.IODINE, 2)
        .addProduct(DestroyMolecules.HYDROGEN_IODIDE, 4)
        .addProduct(DestroyMolecules.NITROGEN)
        .build(),
    
    HYDROXIDE_NEUTRALIZATION = builder()
        .id("hydroxide_neutralization")
        .addReactant(DestroyMolecules.HYDROXIDE)
        .addReactant(DestroyMolecules.PROTON)
        .addProduct(DestroyMolecules.WATER)
        .activationEnergy(0f)
        .preexponentialFactor(6.5e4f) //TODO fiddle with values because currently Water is the most acidic substance in the mod
        .enthalpyChange(-52.014f)
        .reverseReaction(reaction -> reaction
            .activationEnergy(52.014f)
            .preexponentialFactor(519.5f)
            .setOrder(DestroyMolecules.WATER, 2)
        ).build(),

    HYPOCHLORITE_FORMATION = builder()
        .id("hypochlorite_formation")
        .addReactant(DestroyMolecules.CHLORINE)
        .addReactant(DestroyMolecules.HYDROXIDE, 2, 1)
        .addCatalyst(DestroyMolecules.SODIUM_ION, 1)
        .addProduct(DestroyMolecules.CHLORIDE)
        .addProduct(DestroyMolecules.HYPOCHLORITE)
        .addProduct(DestroyMolecules.WATER)
        .build(),

    KOLBE_SCHMITT_REACTION = builder()
        .id("kolbe_schmitt_reaction")
        .addReactant(DestroyMolecules.CARBON_DIOXIDE)
        .addReactant(DestroyMolecules.PHENOL)
        .addCatalyst(DestroyMolecules.SODIUM_ION, 1) //TODO actually add sodium phenoxide intermediate
        .addCatalyst(DestroyMolecules.PROTON, 1)
        .addProduct(DestroyMolecules.SALICYLIC_ACID)
        .build(),
    
    //TODO add hydrogenation of nitriles to amines as generic reaction

    MERCURY_FULMINATION = builder()
        .id("mercury_fulmination")
        .addReactant(DestroyMolecules.MERCURY, 3, 1)
        .addReactant(DestroyMolecules.NITRIC_ACID, 12, 2)
        .addReactant(DestroyMolecules.ETHANOL, 4, 1)
        .addProduct(DestroyMolecules.CARBON_DIOXIDE, 2)
        .addProduct(DestroyMolecules.WATER, 18)
        .addProduct(DestroyMolecules.NITROGEN_DIOXIDE, 6)
        .withResult(1f, (m, r) -> new PrecipitateReactionResult(m, r, () -> DestroyItems.FULMINATED_MERCURY.asStack())) //TODO figure out actual molar ratios
        .build(),

    METHANOL_SYNTHESIS = builder()
        .id("methanol_synthesis")
        .addReactant(DestroyMolecules.CARBON_MONOXIDE)
        .addReactant(DestroyMolecules.HYDROGEN, 2, 1) //TODO check rate exponent of hydrogen
        .addProduct(DestroyMolecules.METHANOL)
        .build(), //TODO zinc/copper oxide catalyst and ensure high pressure is used

    METHYL_ACETATE_CARBONYLATION = builder()
        .id("methyl_acetate_carbonylation")
        .addReactant(DestroyMolecules.METHANOL)
        .addReactant(DestroyMolecules.CARBON_MONOXIDE)
        .addProduct(DestroyMolecules.ACETIC_ACID)
        .build(), //TODO silica catalyst

    NHN_SYNTHESIS = builder()
        .id("nhn_synthesis")
        .addReactant(DestroyMolecules.NICKEL_ION)
        .addReactant(DestroyMolecules.NITRATE, 2, 0)
        .addReactant(DestroyMolecules.HYDRAZINE, 3)
        .withResult(3f, (m, r) -> new PrecipitateReactionResult(m, r, () -> DestroyItems.NICKEL_HYDRAZINE_NITRATE.asStack())) //TODO figure out actual molar ratios
        .build(),

    NITRONIUM_FORMATION = builder()
        .id("nitronium_formation")
        .addReactant(DestroyMolecules.NITRIC_ACID)
        .addReactant(DestroyMolecules.SULFURIC_ACID)
        .addProduct(DestroyMolecules.NITRONIUM)
        .addProduct(DestroyMolecules.WATER)
        .addProduct(DestroyMolecules.HYDROGENSULFATE)
        .build(), //TODO make reversible

    NYLON_POLYMERISATION = builder()
        .id("nylon_polymerisation")
        .addReactant(DestroyMolecules.ADIPIC_ACID)
        .addReactant(DestroyMolecules.HEXANEDIAMINE)
        .withResult(3f, (m, r) -> new PrecipitateReactionResult(m, r, () -> DestroyItems.NYLON.asStack())) //TODO work out proportions
        .build(),

    ORTHOXYLENE_OXIDATION = builder()
        .id("orthoxylene_oxidation")
        .addReactant(DestroyMolecules.ORTHOXYLENE)
        .addReactant(DestroyMolecules.OXYGEN, 3, 1)
        .addCatalyst(DestroyMolecules.MERCURY, 1)
        .addProduct(DestroyMolecules.PHTHALIC_ANHYDRIDE)
        .build(),

    OSTWALD_PROCESS = builder()
        .id("ostwald_process")
        .addReactant(DestroyMolecules.AMMONIA)
        .addReactant(DestroyMolecules.OXYGEN, 2)
        .addProduct(DestroyMolecules.WATER)
        .addProduct(DestroyMolecules.NITRIC_ACID)
        .build(), //TODO add platinum/rhodium catalyst, potentially split into multiple equations and add side reactions

    //TODO phenylacetic acid synthesis, either from benzyl chloride or benzyl cyanide
    //TODO dissolution of prussian blue to make cyanide (or just remove prussian blue)

    PEROXIDE_PROCESS = builder()
        .id("peroxide_process")
        .addReactant(DestroyMolecules.HYDROGEN_PEROXIDE)
        .addReactant(DestroyMolecules.AMMONIA, 2, 1)
        .addCatalyst(DestroyMolecules.ACETONE, 1) //TODO possibly replace with butanone
        .addCatalyst(DestroyMolecules.PROTON, 0)
        .addProduct(DestroyMolecules.HYDRAZINE)
        .addProduct(DestroyMolecules.WATER, 2)
        .build(),

    TATP = builder()
        .id("tatp")
        .addReactant(DestroyMolecules.ACETONE)
        .addReactant(DestroyMolecules.HYDROGEN_PEROXIDE)
        // TODO acid catalyst
        .withResult(3f, (m, r) -> new PrecipitateReactionResult(m, r, () -> DestroyItems.ACETONE_PEROXIDE.asStack()))
        .build(),

    STEAM_REFORMATION = builder()
        .id("steam_reformation")
        .addReactant(DestroyMolecules.WATER)
        .addReactant(DestroyMolecules.METHANE)
        .addProduct(DestroyMolecules.CARBON_MONOXIDE)
        .addProduct(DestroyMolecules.HYDROGEN, 3)
        .build(), //TODO add nickel catalyst

    SODIUM_DISSOLUTION = builder()
        .id("sodium_dissolution")
        .addReactant(DestroyMolecules.SODIUM_METAL, 2, 1)
        .addReactant(DestroyMolecules.WATER, 2, 1)
        .addProduct(DestroyMolecules.SODIUM_ION, 2)
        .addProduct(DestroyMolecules.HYDROXIDE, 2)
        .addProduct(DestroyMolecules.HYDROGEN)
        .build(),
    
    SULFUR_OXIDATION = builder()    
        .id("sulfur_oxidation")
        .addReactant(DestroyMolecules.OCTASULFUR)
        .addReactant(DestroyMolecules.OXYGEN, 8, 1)
        .addProduct(DestroyMolecules.SULFUR_DIOXIDE, 8)
        .build(), //TODO replace with half-equation

    VINYL_ACETATE_SYNTHESIS = builder()
        .id("vinyl_acetate_synthesis")
        .addReactant(DestroyMolecules.ETHENE, 2, 1)
        .addReactant(DestroyMolecules.ACETIC_ACID, 2, 1)
        .addReactant(DestroyMolecules.OXYGEN)
        .addProduct(DestroyMolecules.VINYL_ACETATE, 2)
        .addProduct(DestroyMolecules.WATER, 2)
        .build(); //TODO add palladium catalyst

    // Acids
    static {
        builder().acid(DestroyMolecules.ACETIC_ACID, DestroyMolecules.ACETATE, 4.76f);
        builder().acid(DestroyMolecules.AMMONIUM, DestroyMolecules.AMMONIA, 9.25f);
        builder().acid(DestroyMolecules.HYDROCHLORIC_ACID, DestroyMolecules.CHLORIDE, -6.3f);
        builder().acid(DestroyMolecules.HYDROFLUORIC_ACID, DestroyMolecules.FLUORIDE, 3.17f);
        builder().acid(DestroyMolecules.HYDROGEN_CYANIDE, DestroyMolecules.CYANIDE, 9.2f);
        builder().acid(DestroyMolecules.HYDROGEN_IODIDE, DestroyMolecules.IODIDE, -9.3f);
        builder().acid(DestroyMolecules.HYDROGENSULFATE, DestroyMolecules.SULFATE, 1.99f);
        builder().acid(DestroyMolecules.NITRIC_ACID, DestroyMolecules.NITRATE, -1.3f);
        builder().acid(DestroyMolecules.SULFURIC_ACID, DestroyMolecules.HYDROGENSULFATE, -2.18f);
    };

    private static ReactionBuilder builder() {
        return new ReactionBuilder(Destroy.MOD_ID);
    };

    public static void register() {};
}
