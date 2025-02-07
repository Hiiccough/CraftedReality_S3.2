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

    public static final RegistryObject<Item> TYLERITE_SWORD = ITEMS.register("tylerite_sword",
            () -> new SwordItem(ModToolTiers.TYLERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.TYLERITE, 3, -2.4f))));

    public static final RegistryObject<Item> TYLERITE_PICKAXE = ITEMS.register("tylerite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TYLERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.TYLERITE, 1, -2.8f))));
    public static final RegistryObject<Item> TYLERITE_SHOVEL = ITEMS.register("tylerite_shovel",
            () -> new ShovelItem(ModToolTiers.TYLERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.TYLERITE, 2, -3.0f))));
    public static final RegistryObject<Item> TYLERITE_AXE = ITEMS.register("tylerite_axe",
            () -> new AxeItem(ModToolTiers.TYLERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.TYLERITE, 6, -3.2f))));
    public static final RegistryObject<Item> TYLERITE_HOE = ITEMS.register("tylerite_hoe",
            () -> new HoeItem(ModToolTiers.TYLERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.TYLERITE, 0, -3.4f))));
    public static final RegistryObject<Item> TYLERITE_HAMMER = ITEMS.register("tylerite_hammer",
            () -> new HammerItem(ModToolTiers.TYLERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.TYLERITE, 7, -3.5f))));

    public static final RegistryObject<Item> TYLERITE_HELMET = ITEMS.register("tylerite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.TYLERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final RegistryObject<Item> TYLERITE_CHESTPLATE = ITEMS.register("tylerite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TYLERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final RegistryObject<Item> TYLERITE_LEGGINGS = ITEMS.register("tylerite_leggings",
            () -> new ArmorItem(ModArmorMaterials.TYLERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final RegistryObject<Item> TYLERITE_BOOTS = ITEMS.register("tylerite_boots",
            () -> new ArmorItem(ModArmorMaterials.TYLERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    public static final RegistryObject<Item> TYLERITE_HORSE_ARMOR = ITEMS.register("tylerite_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.TYLERITE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HICCOUGH_SMITHING_TEMPLATE = ITEMS.register("hiccough_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(CraftedReality.MOD_ID, "hiccough")) );

    public static final RegistryObject<Item> HICCOUGH_BOW = ITEMS.register("hiccough_bow",
            () -> new BowItem(new Item.Properties().durability(500)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
