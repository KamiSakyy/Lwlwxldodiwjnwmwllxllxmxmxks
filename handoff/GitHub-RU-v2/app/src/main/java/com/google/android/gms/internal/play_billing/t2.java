package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t2 extends u2 {
    @Override // com.google.android.gms.internal.play_billing.u2
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.u2
    public final float b(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.u2
    public final void c(Object obj, long j, boolean z) {
        if (v2.g) {
            v2.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            v2.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.u2
    public final void d(Object obj, long j, byte b) {
        if (v2.g) {
            v2.c(obj, j, b);
        } else {
            v2.d(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.u2
    public final void e(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.u2
    public final void f(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.u2
    public final boolean g(long j, Object obj) {
        return v2.g ? v2.m(j, obj) : v2.n(j, obj);
    }
}
