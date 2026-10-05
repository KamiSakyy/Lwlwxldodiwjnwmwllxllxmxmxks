package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b3 extends g5 {
    private static final b3 zzj;
    private int zzb;
    private m5 zzd = e6.v;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        b3 b3Var = new b3();
        zzj = b3Var;
        g5.m(b3.class, b3Var);
    }

    public static a3 z() {
        return (a3) zzj.h();
    }

    public final /* synthetic */ void A(int i, e3 e3Var) {
        J();
        this.zzd.set(i, e3Var);
    }

    public final /* synthetic */ void B(e3 e3Var) {
        e3Var.getClass();
        J();
        this.zzd.add(e3Var);
    }

    public final /* synthetic */ void C(Iterable iterable) {
        J();
        s4.c(iterable, this.zzd);
    }

    public final void D() {
        this.zzd = e6.v;
    }

    public final /* synthetic */ void E(int i) {
        J();
        this.zzd.remove(i);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final void J() {
        m5 m5Var = this.zzd;
        if (((t4) m5Var).r) {
            return;
        }
        int size = m5Var.size();
        this.zzd = m5Var.E(size + size);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", e3.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new b3();
        }
        if (i2 == 4) {
            return new a3(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final e3 r(int i) {
        return (e3) this.zzd.get(i);
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final int y() {
        return this.zzh;
    }


}
