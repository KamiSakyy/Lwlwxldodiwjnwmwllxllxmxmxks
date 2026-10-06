package com.github.service.models.response.type;

import d71.a;
import r01.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class SocialLinkService {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SocialLinkService[] $VALUES;
    public static final w Companion;
    private final String rawValue;
    public static final SocialLinkService BLUESKY = new SocialLinkService("BLUESKY", 0, "BLUESKY");
    public static final SocialLinkService FACEBOOK = new SocialLinkService("FACEBOOK", 1, "FACEBOOK");
    public static final SocialLinkService GENERIC = new SocialLinkService("GENERIC", 2, "GENERIC");
    public static final SocialLinkService HOMETOWN = new SocialLinkService("HOMETOWN", 3, "HOMETOWN");
    public static final SocialLinkService INSTAGRAM = new SocialLinkService("INSTAGRAM", 4, "INSTAGRAM");
    public static final SocialLinkService LINKEDIN = new SocialLinkService("LINKEDIN", 5, "LINKEDIN");
    public static final SocialLinkService MASTODON = new SocialLinkService("MASTODON", 6, "MASTODON");
    public static final SocialLinkService REDDIT = new SocialLinkService("REDDIT", 7, "REDDIT");
    public static final SocialLinkService TWITCH = new SocialLinkService("TWITCH", 8, "TWITCH");
    public static final SocialLinkService X = new SocialLinkService("X", 9, "TWITTER");
    public static final SocialLinkService YOUTUBE = new SocialLinkService("YOUTUBE", 10, "YOUTUBE");
    public static final SocialLinkService UNKNOWN__ = new SocialLinkService("UNKNOWN__", 11, "UNKNOWN__");

    private static final /* synthetic */ SocialLinkService[] $values() {
        return new SocialLinkService[]{BLUESKY, FACEBOOK, GENERIC, HOMETOWN, INSTAGRAM, LINKEDIN, MASTODON, REDDIT, TWITCH, X, YOUTUBE, UNKNOWN__};
    }

    static {
        SocialLinkService[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new w();
    }

    private SocialLinkService(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SocialLinkService valueOf(String str) {
        return (SocialLinkService) Enum.valueOf(SocialLinkService.class, str);
    }

    public static SocialLinkService[] values() {
        return (SocialLinkService[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static  ordinal(Object... a) {
        return null;
    }
}
