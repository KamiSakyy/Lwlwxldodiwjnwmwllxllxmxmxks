package com.github.service.models.response.type;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class RepositoryRecommendationReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RepositoryRecommendationReason[] $VALUES;
    public static final RepositoryRecommendationReason CONTRIBUTED = new RepositoryRecommendationReason("CONTRIBUTED", 0);
    public static final RepositoryRecommendationReason FOLLOWED = new RepositoryRecommendationReason("FOLLOWED", 1);
    public static final RepositoryRecommendationReason OTHER = new RepositoryRecommendationReason("OTHER", 2);
    public static final RepositoryRecommendationReason POPULAR = new RepositoryRecommendationReason("POPULAR", 3);
    public static final RepositoryRecommendationReason STARRED = new RepositoryRecommendationReason("STARRED", 4);
    public static final RepositoryRecommendationReason TOPICS = new RepositoryRecommendationReason("TOPICS", 5);
    public static final RepositoryRecommendationReason TRENDING = new RepositoryRecommendationReason("TRENDING", 6);
    public static final RepositoryRecommendationReason VIEWED = new RepositoryRecommendationReason("VIEWED", 7);
    public static final RepositoryRecommendationReason UNKNOWN__ = new RepositoryRecommendationReason("UNKNOWN__", 8);

    private static final /* synthetic */ RepositoryRecommendationReason[] $values() {
        return new RepositoryRecommendationReason[]{CONTRIBUTED, FOLLOWED, OTHER, POPULAR, STARRED, TOPICS, TRENDING, VIEWED, UNKNOWN__};
    }

    static {
        RepositoryRecommendationReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private RepositoryRecommendationReason(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static RepositoryRecommendationReason valueOf(String str) {
        return (RepositoryRecommendationReason) Enum.valueOf(RepositoryRecommendationReason.class, str);
    }

    public static RepositoryRecommendationReason[] values() {
        return (RepositoryRecommendationReason[]) $VALUES.clone();
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}
