package com.github.service.models.response.type;

import android.os.Parcel;
import android.os.Parcelable;
import d71.a;
import k71.k;
import l7.c0;
import r01.m;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PatchStatus implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PatchStatus[] $VALUES;
    public static final Parcelable.Creator<PatchStatus> CREATOR;
    public static final m Companion;
    private final String rawValue;
    public static final PatchStatus ADDED = new PatchStatus("ADDED", 0, "ADDED");
    public static final PatchStatus DELETED = new PatchStatus("DELETED", 1, "DELETED");
    public static final PatchStatus RENAMED = new PatchStatus("RENAMED", 2, "RENAMED");
    public static final PatchStatus COPIED = new PatchStatus("COPIED", 3, "COPIED");
    public static final PatchStatus MODIFIED = new PatchStatus("MODIFIED", 4, "MODIFIED");
    public static final PatchStatus CHANGED = new PatchStatus("CHANGED", 5, "CHANGED");
    public static final PatchStatus UNKNOWN__ = new PatchStatus("UNKNOWN__", 6, "UNKNOWN__");

    private static final /* synthetic */ PatchStatus[] $values() {
        return new PatchStatus[]{ADDED, DELETED, RENAMED, COPIED, MODIFIED, CHANGED, UNKNOWN__};
    }

    static {
        PatchStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new m();
        CREATOR = new c0(10);
    }

    private PatchStatus(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PatchStatus valueOf(String str) {
        return (PatchStatus) Enum.valueOf(PatchStatus.class, str);
    }

    public static PatchStatus[] values() {
        return (PatchStatus[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(name());
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}
