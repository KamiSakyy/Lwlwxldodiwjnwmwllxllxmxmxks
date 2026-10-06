package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public enum q4 implements i5 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(0),
    s(1),
    t(2),
    u(3),
    v(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(6),
    w(7),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(8),
    x(9),
    y(10),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(11),
    z(-1);

    public final int r;

    q4(int i) {
        this.r = i;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final int c() {
        if (this != z) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
