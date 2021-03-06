/*
 * Copyright 2016 leon chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

import java.util.Arrays;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class SUnionStoreCommand implements Command {
    private String destination;
    private String keys[];

    public SUnionStoreCommand() {
    }

    public SUnionStoreCommand(String destination, String... keys) {
        this.destination = destination;
        this.keys = keys;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String[] getKeys() {
        return keys;
    }

    public void setKeys(String[] keys) {
        this.keys = keys;
    }

    @Override
    public String toString() {
        return "SUnionStoreCommand{" +
                "destination='" + destination + '\'' +
                ", key=" + Arrays.toString(keys) +
                '}';
    }

}
