package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d3 extends t1 {
    private static final d3 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        d3 d3Var = new d3();
        zzb = d3Var;
        t1.f(d3.class, d3Var);
    }

    public static /* synthetic */ void p(d3 d3Var, int i) {
        d3Var.zzd |= 1;
        d3Var.zze = i;
    }

    public static c3 q() {
        return (c3) zzb.k();
    }

    public static /* synthetic */ void r(d3 d3Var, String str) {
        d3Var.zzd |= 8;
        d3Var.zzh = str;
    }

    public static /* synthetic */ void s(d3 d3Var, String str) {
        str.getClass();
        d3Var.zzd |= 2;
        d3Var.zzf = str;
    }

    public static /* synthetic */ void t(d3 d3Var) {
        d3Var.zzd |= 32;
        d3Var.zzj = 0;
    }

    public static /* synthetic */ void u(d3 d3Var, int i) {
        d3Var.zzd |= 16;
        d3Var.zzi = i;
    }

    public static void v(d3 d3Var, int i) {
        d3Var.zzg = com.github.rudroid.copilot.h1.c(i);
        d3Var.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", f1.d, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new d3();
        }
        if (i2 == 4) {
            return new c3(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
