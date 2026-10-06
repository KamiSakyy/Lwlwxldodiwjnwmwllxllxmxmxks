package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public enum y1 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    public final String r;

    y1(String str) {
        this.r = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.r;
    }
}
