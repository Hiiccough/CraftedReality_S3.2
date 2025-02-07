package net.hiccough.craftedreality.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class Voidstone extends Block {
    public Voidstone(Properties properties) {
        super(properties);
    }

    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        super.animateTick(state, world, pos, random);

        // Check for nearest player
        Player nearestPlayer = world.getNearestPlayer(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 10.0, false);

        if (nearestPlayer != null) {
            // Calculate distance between player and block
            double distance = nearestPlayer.distanceToSqr(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5); // Squared distance
            double maxDistance = 15.0 * 15.0; // Maximum distance (10 blocks) squared

            // Inverse chance based on distance (closer = higher chance)
            double proximityChance = Math.max(0.07, 0.12 - (distance / maxDistance)); // Minimum chance of 10%

            // Trigger particles and sound based on proximity chance
            if (random.nextFloat() < proximityChance) {
                // Generate particles
                for (int i = 0; i < 8; i++) {
                    double centerX = pos.getX() + 0.5;
                    double centerY = pos.getY() + 0.5 + random.nextDouble() * 0.3; // Slight height variation
                    double centerZ = pos.getZ() + 0.5;

                    double angle = random.nextDouble() * Math.PI * 2;
                    double radius = 0.2 + random.nextDouble() * 0.6;

                    double offsetX = Math.cos(angle) * radius;
                    double offsetZ = Math.sin(angle) * radius;

                    double velocityX = offsetX * 0.1; // Slight outward motion
                    double velocityY = 0.05 + random.nextDouble() * 0.1; // Upward motion
                    double velocityZ = offsetZ * 0.1;

                    if (random.nextBoolean()) {
                        world.addParticle(ParticleTypes.END_ROD, centerX + offsetX, centerY, centerZ + offsetZ, velocityX, velocityY, velocityZ);
                    } else {
                        world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, centerX + offsetX, centerY, centerZ + offsetZ, velocityX, velocityY, velocityZ);
                    }
                }

                // Play sound
                world.playLocalSound(
                        pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                        SoundEvents.WARDEN_HEARTBEAT, // Replace with desired sound
                        SoundSource.BLOCKS,
                        15.0f, // Volume
                        -1.0f, // Slight pitch variation
                        false // No delay
                );
            }
        }
    }
}
