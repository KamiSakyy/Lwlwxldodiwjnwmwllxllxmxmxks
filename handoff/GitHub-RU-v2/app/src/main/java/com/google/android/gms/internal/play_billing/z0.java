package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 extends t1 {
    private static final z0 zzb;
    private int zzd;
    private e1 zze;
    private e1 zzf;
    private int zzg;

    static {
        z0 z0Var = new z0();
        zzb = z0Var;
        t1.f(z0.class, z0Var);
    }

    public static y0 p() {
        return (y0) zzb.k();
    }

    public static /* synthetic */ void q(z0 z0Var, e1 e1Var) {
        z0Var.zze = e1Var;
        z0Var.zzd |= 1;
    }

    public static /* synthetic */ void r(z0 z0Var, e1 e1Var) {
        z0Var.zzf = e1Var;
        z0Var.zzd |= 2;
    }

    public static /* synthetic */ void s(z0 z0Var, int i) {
        z0Var.zzg = i - 1;
        z0Var.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", f1.b});
        }
        if (i2 == 3) {
            return new z0();
        }
        if (i2 == 4) {
            return new y0(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
