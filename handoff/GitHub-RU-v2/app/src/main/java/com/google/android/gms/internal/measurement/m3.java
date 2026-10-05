package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m3 extends g5 {
    private static final m3 zzg;
    private l5 zzb;
    private l5 zzd;
    private m5 zze;
    private m5 zzf;

    static {
        m3 m3Var = new m3();
        zzg = m3Var;
        g5.m(m3.class, m3Var);
    }

    public m3() {
        s5 s5Var = s5.v;
        this.zzb = s5Var;
        this.zzd = s5Var;
        e6 e6Var = e6.v;
        this.zze = e6Var;
        this.zzf = e6Var;
    }

    public static l3 x() {
        return (l3) zzg.h();
    }

    public static m3 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = s5.v;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((t4) randomAccess).r) {
            s5 s5Var = (s5) randomAccess;
            int i = s5Var.t;
            this.zzd = s5Var.E(i + i);
        }
        s4.c(list, this.zzd);
    }

    public final void C() {
        this.zzd = s5.v;
    }

    public final void D(ArrayList arrayList) {
        m5 m5Var = this.zze;
        if (!((t4) m5Var).r) {
            int size = m5Var.size();
            this.zze = m5Var.E(size + size);
        }
        s4.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = e6.v;
    }

    public final void F(Iterable iterable) {
        m5 m5Var = this.zzf;
        if (!((t4) m5Var).r) {
            int size = m5Var.size();
            this.zzf = m5Var.E(size + size);
        }
        s4.c(iterable, this.zzf);
    }

    public final void G() {
        this.zzf = e6.v;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", z2.class, "zzf", o3.class});
        }
        if (i2 == 3) {
            return new m3();
        }
        if (i2 == 4) {
            return new l3(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return ((s5) this.zzb).size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return ((s5) this.zzd).size();
    }

    public final m5 t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final void z(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((t4) randomAccess).r) {
            s5 s5Var = (s5) randomAccess;
            int i = s5Var.t;
            this.zzb = s5Var.E(i + i);
        }
        s4.c(iterable, this.zzb);
    }
}
