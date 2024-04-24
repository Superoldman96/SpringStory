package com.dori.SpringStory.client.effects.parsers;

import com.dori.SpringStory.client.effects.Effect;
import com.dori.SpringStory.connection.packet.OutPacket;
import com.dori.SpringStory.enums.UserEffectTypes;

public record SquibEffect(String effectPath) implements Effect {
    @Override
    public UserEffectTypes getType() {
        return UserEffectTypes.SquibEffect;
    }

    @Override
    public void encode(OutPacket outPacket) {
        outPacket.encodeString(effectPath);
    }
}
