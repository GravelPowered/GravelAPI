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

package org.neptunepowered.gravel.api.entity.query;

import com.google.common.base.MoreObjects;

/**
 * Represents a of to manipulate an entity.
 */
public final class Query<T> {

    /**
     * Creates a {@link Query} using the given path.
     *
     * @param path The path to use for serialisation.
     * @param <T> The type of the of
     * @return The of
     */
    public static <T> Query<T> of(final String... path) {
        return new Query<>(path);
    }

    private final String[] path;

    private Query(final String[] path) {
        this.path = path;
    }

    /**
     * Gets the path used in serialisation.
     *
     * @return The path
     */
    public String[] getPath() {
        return this.path;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Query)) {
            return false;
        }

        final Query that = (Query) obj;
        return this.path == that.path;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("path", this.path)
                .toString();
    }

}
