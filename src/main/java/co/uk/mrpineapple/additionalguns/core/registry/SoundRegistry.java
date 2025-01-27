package co.uk.mrpineapple.additionalguns.core.registry;

import co.uk.mrpineapple.additionalguns.core.AdditionalGuns;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {
    // Deferred Register for sound registration.
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AdditionalGuns.ID);

    /* Sounds */
    public static final RegistryObject<SoundEvent> MAMMOTH_FIRE = register("item.mammoth.fire");
    public static final RegistryObject<SoundEvent> MAMMOTH_SUPPRESSED = register("item.mammoth.suppressed");
    public static final RegistryObject<SoundEvent> VAL_FIRE = register("item.val.fire");
    public static final RegistryObject<SoundEvent> AKM_FIRE = register("item.akm.fire");
    public static final RegistryObject<SoundEvent> AK_ZERO_ONE_FIVE_FIRE = register("item.ak105.fire");
    public static final RegistryObject<SoundEvent> AK_SEVEN_FOUR_FIRE = register("item.ak74.fire");
    public static final RegistryObject<SoundEvent> AKS_SEVEN_FOUR_U = register("item.aks74u.fire");
    public static final RegistryObject<SoundEvent> AK_SUPPRESSED = register("item.ak.suppressed");
    public static final RegistryObject<SoundEvent> ACE_OF_SPADES_FIRE = register("item.ace_of_spades.fire");
    public static final RegistryObject<SoundEvent> AWM_FIRE = register("item.awm.fire");
    public static final RegistryObject<SoundEvent> M_FOUR_FIRE = register("item.m4.fire");
    public static final RegistryObject<SoundEvent> M_FOUR_SUPPRESSED = register("item.m4.suppressed");

    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(AdditionalGuns.ID, name)));
    }
}
