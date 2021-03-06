/*
 * Copyright Car Connectivity Consortium
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
 *
 * You may decide to give the Car Connectivity Consortium input, suggestions
 * or feedback of a technical nature which may be implemented on the
 * Car Connectivity Consortium products (“Feedback”).
 *
 * You agrees that any such Feedback is given on non-confidential
 * basis and Licensee hereby waives any confidentiality restrictions
 * for such Feedback. In addition, Licensee grants to the Car Connectivity Consortium
 * and its affiliates a worldwide, non-exclusive, perpetual, irrevocable,
 * sub-licensable, royalty-free right and license under Licensee’s copyrights to copy,
 * reproduce, modify, create derivative works and directly or indirectly
 * distribute, make available and communicate to public the Feedback
 * in or in connection to any CCC products, software and/or services.
 */

package com.carconnectivity.mlmediaplayer.mediabrowser.events;

import com.carconnectivity.mlmediaplayer.mediabrowser.ProviderPlaybackState;
import com.carconnectivity.mlmediaplayer.mediabrowser.ProviderViewActive;
import com.carconnectivity.mlmediaplayer.utils.event.RockScoutEvent;

/**
 * Stores information about playback status.
 * Sticky event.
 */
public final class PlaybackStateChangedEvent implements RockScoutEvent {
    /**
     * Immutable view of provider who originated the playback change.
     */
    public final ProviderViewActive provider;
    /**
     * Latest playback state
     */
    public final ProviderPlaybackState state;

    public PlaybackStateChangedEvent
            (ProviderViewActive provider, ProviderPlaybackState state
            ) {
        if (provider == null) {
            throw new IllegalArgumentException("Provider cannot be null.");
        }
        if (state == null) {
            throw new IllegalArgumentException("State cannot be null.");
        }

        this.provider = provider;
        this.state = state;
    }

    @Override
    public String toString() {
        return "PlaybackStateChangedEvent{" +
                "provider.getUniqueName()=" + (provider != null ? provider.getUniqueName() : "null") +
                ", state=" + state +
                '}';
    }
}
