package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h3 extends g5 {
    private static final h3 zzh;
    private int zzb;
    private m5 zzd = e6.v;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        h3 h3Var = new h3();
        zzh = h3Var;
        g5.m(h3.class, h3Var);
    }

    public static g3 w() {
        return (g3) zzh.h();
    }

    public static g3 x(h3 h3Var) {
        f5 h = zzh.h();
        h.g(h3Var);
        return (g3) h;
    }

    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        s4.c(arrayList, this.zzd);
    }

    public final void B() {
        this.zzd = e6.v;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void E() {
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
            return new f6(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", j3.class, "zze", "zzf", "zzg", s1.j});
        }
        if (i2 == 3) {
            return new h3();
        }
        if (i2 == 4) {
            return new g3(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final j3 r(int i) {
        return (j3) this.zzd.get(i);
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i, j3 j3Var) {
        E();
        this.zzd.set(i, j3Var);
    }

    public final /* synthetic */ void z(j3 j3Var) {
        E();
        this.zzd.add(j3Var);
    }
}
