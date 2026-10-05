package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n6 extends o6 {
    @Override // com.google.android.gms.internal.measurement.o6
    public final void a(Object obj, long j, byte b) {
        if (p6.g) {
            p6.c(obj, j, b);
        } else {
            p6.d(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o6
    public final boolean b(long j, Object obj) {
        return p6.g ? p6.n(j, obj) : p6.o(j, obj);
    }

    @Override // com.google.android.gms.internal.measurement.o6
    public final void c(Object obj, long j, boolean z) {
        if (p6.g) {
            p6.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            p6.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o6
    public final float d(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.o6
    public final void e(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.o6
    public final double f(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.o6
    public final void g(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
