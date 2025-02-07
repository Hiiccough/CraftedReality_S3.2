package net.hiccough.craftedreality.item;

import net.hiccough.craftedreality.CraftedReality;
import net.hiccough.craftedreality.item.custom.ChiselItem;
import net.hiccough.craftedreality.item.custom.FuelItem;
import net.hiccough.craftedreality.item.custom.HammerItem;
import net.hiccough.craftedreality.item.custom.ModArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

//creating items for the game
public class ModItems {

    //Registry for all new items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CraftedReality.MOD_ID);

    //Refined Ores
    public static final RegistryObject<Item> AQUARI_INGOT = ITEMS.register("aquari_ingot",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LUMITITE_INGOT = ITEMS.register("lumitite_ingot",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REFINED_FROSTIUM = ITEMS.register("refined_frostium",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            ()-> new Item(new Item.Properties()));

    //Raw Ores
    public static final RegistryObject<Item> RAW_AQUARI = ITEMS.register("raw_aquari",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_LUMITITE = ITEMS.register("raw_lumitite",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FROSTIUM_SHARD = ITEMS.register("frostium_shard",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.tutorialmod.kohlrabi"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> AURORA_ASHES = ITEMS.register("aurora_ashes",
            () -> new FuelItem(new Item.Properties(), 1200));

    //Items made from new material
    public static final RegistryObject<Item> AQUARI_SWORD = ITEMS.register("aquari_sword",
            () -> new SwordItem(ModToolTiers.AQUARI, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AQUARI, 3, -2.4f))));

    public static final RegistryObject<Item> AQUARI_PICKAXE = ITEMS.register("aquari_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AQUARI, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AQUARI, 1, -2.0f))));

    public static final RegistryObject<Item> AQUARI_SHOVEL = ITEMS.register("aquari_shovel",
            () -> new ShovelItem(ModToolTiers.AQUARI, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.AQUARI, 2, -3.0f))));

    public static final RegistryObject<Item> AQUARI_AXE = ITEMS.register("aquari_axe",
            () -> new AxeItem(ModToolTiers.AQUARI, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AQUARI, 6, -3.2f))));

    public static final RegistryObject<Item> AQUARI_HOE = ITEMS.register("aquari_hoe",
            () -> new HoeItem(ModToolTiers.AQUARI, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.AQUARI, 0, -3.4f))));

    public static final RegistryObject<Item> AQUARI_HAMMER = ITEMS.register("aquari_hammer",
            () -> new HammerItem(ModToolTiers.AQUARI, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AQUARI, 7, -3.5f))));

    public static final RegistryObject<Item> AQUARI_HELMET = ITEMS.register("aquari_helmet",
            () -> new ModArmorItem(ModArmorMaterials.AQUARI_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));

    public static final RegistryObject<Item> AQUARI_CHESTPLATE = ITEMS.register("aquari_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AQUARI_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));

    public static final RegistryObject<Item> AQUARI_LEGGINGS = ITEMS.register("aquari_leggings",
            () -> new ArmorItem(ModArmorMaterials.AQUARI_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));

    public static final RegistryObject<Item> AQUARI_BOOTS = ITEMS.register("aquari_boots",
            () -> new ArmorItem(ModArmorMaterials.AQUARI_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    public static final RegistryObject<Item> AQUARI_HORSE_ARMOR = ITEMS.register("aquari_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.AQUARI_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HICCOUGH_BOW = ITEMS.register("hiccough_bow",
            () -> new BowItem(new Item.Properties().durability(500)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
