package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w3 extends t1 {
    private static final w3 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        w3 w3Var = new w3();
        zzb = w3Var;
        t1.f(w3.class, w3Var);
    }

    public static v3 p() {
        return (v3) zzb.k();
    }

    public static /* synthetic */ void q(w3 w3Var, boolean z) {
        w3Var.zzd |= 8;
        w3Var.zzh = z;
    }

    public static /* synthetic */ void r(w3 w3Var, int i) {
        w3Var.zzd |= 16;
        w3Var.zzi = i;
    }

    public static /* synthetic */ void s(w3 w3Var, long j) {
        w3Var.zzd |= 4;
        w3Var.zzg = j;
    }

    public static /* synthetic */ void t(w3 w3Var) {
        w3Var.zzd |= 32;
        w3Var.zzj = 0;
    }

    public static /* synthetic */ void u(w3 w3Var) {
        w3Var.zzd |= 2;
        w3Var.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new w3();
        }
        if (i2 == 4) {
            return new v3(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
