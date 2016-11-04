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

package org.neptunepowered.gravel.api.entity;

import org.neptunepowered.gravel.api.entity.query.Query;

import java.util.Optional;

/**
 * A manipulator for applying {@link Query} manipulations on an {@link Entity}.
 */
public interface EntityManipulator<T> {

    /**
     * Checks if this manipulator supports the given Entity type.
     *
     * @param entity The entity class
     * @return {@code True} if the entity type is supported
     */
    boolean supports(Class<? extends Entity> entity);

    /**
     * Sets the value of this manipulator's query to the given entity.
     *
     * @param entity The entity
     * @param value The new value
     * @return {@code True} if the manipulation was successful
     */
    boolean set(Entity entity, T value);

    /**
     * Gets the value of this manipulator's query for the given entity.
     *
     * @param entity The entity
     * @return The value, if available
     */
    Optional<T> get(Entity entity);

}
