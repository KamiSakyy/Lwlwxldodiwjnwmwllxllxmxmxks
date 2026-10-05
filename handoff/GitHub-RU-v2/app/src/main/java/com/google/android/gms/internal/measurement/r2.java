package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r2 extends g5 {
    private static final r2 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        r2 r2Var = new r2();
        zzk = r2Var;
        g5.m(r2.class, r2Var);
    }

    public static q2 w() {
        return (q2) zzk.h();
    }

    public static r2 x() {
        return zzk;
    }

    public final /* synthetic */ void A(boolean z) {
        this.zzb |= 4;
        this.zzf = z;
    }

    public final /* synthetic */ void B(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzb |= 16;
        this.zzh = z;
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzb |= 32;
        this.zzi = z;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzb |= 64;
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new r2();
        }
        if (i2 == 4) {
            return new q2(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }

    public final boolean p() {
        return this.zzd;
    }

    public final boolean q() {
        return this.zze;
    }

    public final boolean r() {
        return this.zzf;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzj;
    }

    public final /* synthetic */ void y(boolean z) {
        this.zzb |= 1;
        this.zzd = z;
    }

    public final /* synthetic */ void z(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }
}
