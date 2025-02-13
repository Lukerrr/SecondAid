/*
 * FirstAid API
 * Copyright (c) 2017-2023
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

package ichttt.mods.firstaid.api.event;

import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.Event;

/**
 * Base class for all first aid registry events
 * <br>
 * All events are fired on the {@link net.minecraftforge.common.MinecraftForge#EVENT_BUS} once the server starts
 */
public class FirstAidRegisterEvent extends Event {
    private final Level level;

    public FirstAidRegisterEvent(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}
