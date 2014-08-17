package gy.fox.hobnob.HobMod2.init;


import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.sound.SoundEvent;

public class modSounds {

    public ISound soundBakerCat = new ISound() {
        @Override
        public ResourceLocation getPositionedSoundLocation() {
            ResourceLocation ResLoc = new ResourceLocation("hobmod","baker.cat");
            return ResLoc;
        }

        @Override
        public boolean canRepeat() {
            return true;
        }

        @Override
        public int getRepeatDelay() {
            return 0;
        }

        @Override
        public float getVolume() {
            return 1.0f;
        }

        @Override
        public float getPitch() {
            return 1.0f;
        }

        @Override
        public float getXPosF() {
            return 0;
        }

        @Override
        public float getYPosF() {
            return 0;
        }

        @Override
        public float getZPosF() {
            return 0;
        }

        @Override
        public AttenuationType getAttenuationType() {
            return null;
        }
    };



}
