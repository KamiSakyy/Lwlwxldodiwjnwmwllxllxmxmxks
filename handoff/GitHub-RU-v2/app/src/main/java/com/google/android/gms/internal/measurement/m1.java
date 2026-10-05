package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 extends g5 {
    private static final m1 zzi;
    private int zzb;
    private int zzd;
    private m5 zze;
    private m5 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        m1 m1Var = new m1();
        zzi = m1Var;
        g5.m(m1.class, m1Var);
    }

    public m1() {
        e6 e6Var = e6.v;
        this.zze = e6Var;
        this.zzf = e6Var;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", v1.class, "zzf", o1.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new m1();
        }
        if (i2 == 4) {
            return new l1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final v1 t(int i) {
        return (v1) this.zze.get(i);
    }

    public final m5 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final o1 w(int i) {
        return (o1) this.zzf.get(i);
    }

    public final void x(int i, v1 v1Var) {
        m5 m5Var = this.zze;
        if (!((t4) m5Var).r) {
            int size = m5Var.size();
            this.zze = m5Var.E(size + size);
        }
        this.zze.set(i, v1Var);
    }

    public final void y(int i, o1 o1Var) {
        m5 m5Var = this.zzf;
        if (!((t4) m5Var).r) {
            int size = m5Var.size();
            this.zzf = m5Var.E(size + size);
        }
        this.zzf.set(i, o1Var);
    }
}
