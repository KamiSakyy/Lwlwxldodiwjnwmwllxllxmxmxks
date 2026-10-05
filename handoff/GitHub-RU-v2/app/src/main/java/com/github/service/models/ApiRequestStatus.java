package com.github.service.models;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ApiRequestStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ApiRequestStatus[] $VALUES;
    public static final ApiRequestStatus LOADING = new ApiRequestStatus("LOADING", 0);
    public static final ApiRequestStatus SUCCESS = new ApiRequestStatus("SUCCESS", 1);
    public static final ApiRequestStatus FAILURE = new ApiRequestStatus("FAILURE", 2);

    private static final /* synthetic */ ApiRequestStatus[] $values() {
        return new ApiRequestStatus[]{LOADING, SUCCESS, FAILURE};
    }

    static {
        ApiRequestStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private ApiRequestStatus(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ApiRequestStatus valueOf(String str) {
        return (ApiRequestStatus) Enum.valueOf(ApiRequestStatus.class, str);
    }

    public static ApiRequestStatus[] values() {
        return (ApiRequestStatus[]) $VALUES.clone();
    }
}
