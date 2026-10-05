package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o3 extends g5 {
    private static final o3 zzf;
    private int zzb;
    private int zzd;
    private l5 zze = s5.v;

    static {
        o3 o3Var = new o3();
        zzf = o3Var;
        g5.m(o3.class, o3Var);
    }

    public static n3 u() {
        return (n3) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new o3();
        }
        if (i2 == 4) {
            return new n3(zzf);
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

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return ((s5) this.zze).size();
    }

    public final long t(int i) {
        return ((s5) this.zze).b(i);
    }

    public final /* synthetic */ void v(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final void w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((t4) randomAccess).r) {
            s5 s5Var = (s5) randomAccess;
            int i = s5Var.t;
            this.zze = s5Var.E(i + i);
        }
        s4.c(list, this.zze);
    }
}
