package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q3 extends t1 {
    private static final q3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private j3 zzg;
    private k3 zzh;

    static {
        q3 q3Var = new q3();
        zzb = q3Var;
        t1.f(q3.class, q3Var);
    }

    public static /* synthetic */ void p(q3 q3Var, u3 u3Var) {
        q3Var.zzf = u3Var;
        q3Var.zze = 4;
    }

    public static p3 q() {
        return (p3) zzb.k();
    }

    public static /* synthetic */ void r(q3 q3Var, y2 y2Var) {
        q3Var.zzf = y2Var;
        q3Var.zze = 2;
    }

    public static /* synthetic */ void s(q3 q3Var, b3 b3Var) {
        q3Var.zzf = b3Var;
        q3Var.zze = 3;
    }

    public static /* synthetic */ void t(q3 q3Var, f3 f3Var) {
        f3Var.getClass();
        q3Var.zzf = f3Var;
        q3Var.zze = 7;
    }

    public static /* synthetic */ void u(q3 q3Var, j3 j3Var) {
        j3Var.getClass();
        q3Var.zzg = j3Var;
        q3Var.zzd |= 1;
    }

    public static /* synthetic */ void v(q3 q3Var, t3 t3Var) {
        q3Var.zzf = t3Var;
        q3Var.zze = 8;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", y2.class, b3.class, u3.class, h3.class, "zzh", f3.class, t3.class});
        }
        if (i2 == 3) {
            return new q3();
        }
        if (i2 == 4) {
            return new p3(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
