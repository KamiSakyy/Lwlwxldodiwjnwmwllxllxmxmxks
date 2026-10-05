package com.github.service.models.response.feed;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class FeedDisinterestReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FeedDisinterestReason[] $VALUES;
    public static final FeedDisinterestReason DISMISSED = new FeedDisinterestReason("DISMISSED", 0);
    public static final FeedDisinterestReason EVENT_TYPE = new FeedDisinterestReason("EVENT_TYPE", 1);
    public static final FeedDisinterestReason EVENT_TYPE_RESOURCE = new FeedDisinterestReason("EVENT_TYPE_RESOURCE", 2);
    public static final FeedDisinterestReason RESOURCE = new FeedDisinterestReason("RESOURCE", 3);

    private static final /* synthetic */ FeedDisinterestReason[] $values() {
        return new FeedDisinterestReason[]{DISMISSED, EVENT_TYPE, EVENT_TYPE_RESOURCE, RESOURCE};
    }

    static {
        FeedDisinterestReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private FeedDisinterestReason(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static FeedDisinterestReason valueOf(String str) {
        return (FeedDisinterestReason) Enum.valueOf(FeedDisinterestReason.class, str);
    }

    public static FeedDisinterestReason[] values() {
        return (FeedDisinterestReason[]) $VALUES.clone();
    }
}
