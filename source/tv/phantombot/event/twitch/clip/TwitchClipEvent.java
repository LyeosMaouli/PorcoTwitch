/*
 * Copyright (C) 2016-2017 phantombot.tv
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tv.phantombot.event.twitch.clip;

import tv.phantombot.event.twitch.TwitchEvent;
import tv.phantombot.twitchwsirc.Channel;

public class TwitchClipEvent extends TwitchEvent {

    private final String clipURL;
    private final String creator;
    private final Channel channel;

    public TwitchClipEvent(String clipURL, String creator) {
        this.clipURL = clipURL;
        this.creator = creator;
        this.channel = null;
    }

    public TwitchClipEvent(String clipURL, String creator, Channel channel) {
        this.clipURL = clipURL;
        this.creator = creator;
        this.channel = channel;
    }

    public String getClipURL() {
        return clipURL;
    }

    public String getCreator() {
        return creator;
    }

    public Channel getChannel() {
        return channel;
    }

}
