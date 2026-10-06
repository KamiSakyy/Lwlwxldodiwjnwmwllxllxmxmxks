package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public enum r4 implements i5 {
    s(0),
    t(1),
    u(2),
    v(3),
    w(-1);

    public int r;

    r4(int i) {
        this.r = i;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final int c() {
        if (this != w) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
