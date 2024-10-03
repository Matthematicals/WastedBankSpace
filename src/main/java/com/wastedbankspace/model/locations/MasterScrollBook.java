/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2021, Riley McGee
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.wastedbankspace.model.locations;

import com.wastedbankspace.model.StorableItem;
import lombok.Getter;
import net.runelite.api.ItemID;

@Getter
public enum MasterScrollBook implements StorableItem {
    NARDAH_TELEPORT(ItemID.NARDAH_TELEPORT),
    DIGSITE_TELEPORT(ItemID.DIGSITE_TELEPORT),
    FELDIP_HILLS_TELEPORT(ItemID.FELDIP_HILLS_TELEPORT),
    LUNAR_ISLE_TELEPORT(ItemID.LUNAR_ISLE_TELEPORT),
    MORTTON_TELEPORT(ItemID.MORTTON_TELEPORT),
    PEST_CONTROL_TELEPORT(ItemID.PEST_CONTROL_TELEPORT),
    PISCATORIS_TELEPORT(ItemID.PISCATORIS_TELEPORT),
    TAI_BWO_WANNAI_TELEPORT(ItemID.TAI_BWO_WANNAI_TELEPORT),
    IORWERTH_CAMP_TELEPORT(ItemID.IORWERTH_CAMP_TELEPORT),
    MOS_LEHARMLESS_TELEPORT(ItemID.MOS_LEHARMLESS_TELEPORT),
    LUMBERYARD_TELEPORT(ItemID.LUMBERYARD_TELEPORT),
    ZULANDRA_TELEPORT(ItemID.ZULANDRA_TELEPORT),
    KEY_MASTER_TELEPORT(ItemID.KEY_MASTER_TELEPORT),
    REVENANT_CAVE_TELEPORT(ItemID.REVENANT_CAVE_TELEPORT),
    WATSON_TELEPORT(ItemID.WATSON_TELEPORT),
    GUTHIXIAN_TEMPLE_TELEPORT(ItemID.GUTHIXIAN_TEMPLE_TELEPORT),
    SPIDER_CAVE_TELEPORT(ItemID.SPIDER_CAVE_TELEPORT),
    COLOSSAL_WYRM_TELEPORT_SCROLL(ItemID.COLOSSAL_WYRM_TELEPORT_SCROLL);

    private final int itemID;
    @Getter
    private final String location = "Master Scroll Book";
    @Getter
    private final boolean isBis;

    MasterScrollBook(int itemID) {
        this.itemID = itemID;
        this.isBis = false;
    }
}
