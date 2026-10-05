package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n4 {
    public final o4 a;
    public int b = 1;
    public long c = a();

    public n4(o4 o4Var) {
        this.a = o4Var;
    }

    public final long a() {
        o4 o4Var = this.a;
        c21.u.g(o4Var);
        long longValue = ((Long) c0.v.a(null)).longValue();
        long longValue2 = ((Long) c0.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        o4Var.f().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
