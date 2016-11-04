/*
 * This file is part of GravelAPI, licensed under the BSD 3-Clause License.
 *
 * Copyright (c) 2016, Jamie Mansfield
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of the copyright holder nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
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

package org.neptunepowered.gravel.api.entity.component.living;

import org.neptunepowered.gravel.api.entity.query.Queries;
import org.neptunepowered.gravel.api.entity.component.Component;
import org.neptunepowered.gravel.api.entity.living.Living;

/**
 * A component representing health of a {@link Living} entity.
 */
public interface HealthComponent extends Component {

    /**
     * Gets the health of the {@link Living} entity.
     *
     * @return The entity's health
     */
    default double getHealth() {
        return this.getValue(Queries.HEALTH).get();
    }

    /**
     * Sets the health of the {@link Living} entity.
     *
     * @param health The new health value
     * @return This component
     */
    default HealthComponent setHealth(double health) {
        this.setValue(Queries.HEALTH, health);
        return this;
    }

    /**
     * Gets the max health of the {@link Living} entity.
     *
     * @return The entity's max health
     */
    default double getMaxHealth() {
        return this.getValue(Queries.MAX_HEALTH).get();
    }

    /**
     * Sets the maximum health of the {@link Living} entity.
     *
     * @param maxHealth The new value
     * @return This component
     */
    default HealthComponent setMaxHealth(double maxHealth) {
        this.setValue(Queries.MAX_HEALTH, maxHealth);
        return this;
    }

}
