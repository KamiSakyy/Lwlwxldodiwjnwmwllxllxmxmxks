package com.github.service.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import v8.l0;
import w61.h;
import w61.i;
import yz0.e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class TrendingPeriod implements Parcelable {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ TrendingPeriod[] $VALUES;
    private static final h $cachedSerializer$delegate;
    public static final Parcelable.Creator<TrendingPeriod> CREATOR;
    public static final Companion Companion;
    private String rawValue;
    public static final TrendingPeriod DAILY = new TrendingPeriod("DAILY", 0, "DAILY");
    public static final TrendingPeriod MONTHLY = new TrendingPeriod("MONTHLY", 1, "MONTHLY");
    public static final TrendingPeriod WEEKLY = new TrendingPeriod("WEEKLY", 2, "WEEKLY");
    public static final TrendingPeriod UNKNOWN__ = new TrendingPeriod("UNKNOWN__", 3, "UNKNOWN__");

    public static final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) TrendingPeriod.$cachedSerializer$delegate.getValue();
        }
    }

    private static final /* synthetic */ TrendingPeriod[] $values() {
        return new TrendingPeriod[]{DAILY, MONTHLY, WEEKLY, UNKNOWN__};
    }

    static {
        TrendingPeriod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new Companion();
        CREATOR = new e5(7);
        $cachedSerializer$delegate = w.s(i.r, new wm.a(26));
    }

    private TrendingPeriod(String str, int i, String str2) {
        this.rawValue = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return c1.f("com.github.service.models.response.TrendingPeriod", values());
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static TrendingPeriod valueOf(String str) {
        return (TrendingPeriod) Enum.valueOf(TrendingPeriod.class, str);
    }

    public static TrendingPeriod[] values() {
        return (TrendingPeriod[]) $VALUES.clone();
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

    public static Object name(Object... a) {
        return null;
    }

    public static Object c(Object... a) {
        return null;
    }
}
