package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b3 extends t1 {
    private static final b3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        b3 b3Var = new b3();
        zzb = b3Var;
        t1.f(b3.class, b3Var);
    }

    public static /* synthetic */ void p(b3 b3Var, int i) {
        b3Var.zzg = i - 1;
        b3Var.zzd |= 1;
    }

    public static z2 q() {
        return (z2) zzb.k();
    }

    public static void s(b3 b3Var, g3 g3Var) {
        b3Var.zzh = g3Var.r;
        b3Var.zzd |= 2;
    }

    public static /* synthetic */ void t(b3 b3Var, o3 o3Var) {
        b3Var.zzf = o3Var;
        b3Var.zze = 4;
    }

    public static /* synthetic */ void u(b3 b3Var, w3 w3Var) {
        b3Var.zzf = w3Var;
        b3Var.zze = 3;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", f1.c, l3.class, w3.class, o3.class, "zzh", f1.e});
        }
        if (i2 == 3) {
            return new b3();
        }
        if (i2 == 4) {
            return new z2(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final o3 r() {
        return this.zze == 4 ? (o3) this.zzf : o3.p();
    }
}
