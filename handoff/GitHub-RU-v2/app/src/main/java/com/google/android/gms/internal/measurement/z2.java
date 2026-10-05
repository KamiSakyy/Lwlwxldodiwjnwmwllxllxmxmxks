package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z2 extends g5 {
    private static final z2 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        z2 z2Var = new z2();
        zzf = z2Var;
        g5.m(z2.class, z2Var);
    }

    public static y2 t() {
        return (y2) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new z2();
        }
        if (i2 == 4) {
            return new y2(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final long s() {
        return this.zze;
    }

    public final /* synthetic */ void u(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
