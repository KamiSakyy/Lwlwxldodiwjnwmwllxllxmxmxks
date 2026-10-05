package com.google.android.gms.internal.play_billing;

import android.os.Build;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j3 extends t1 {
    private static final j3 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        j3 j3Var = new j3();
        zzb = j3Var;
        t1.f(j3.class, j3Var);
    }

    public static /* synthetic */ void A(j3 j3Var, int i) {
        j3Var.zzd |= 128;
        j3Var.zzl = i;
    }

    public static /* synthetic */ void B(j3 j3Var, int i) {
        j3Var.zzd |= 256;
        j3Var.zzm = i;
    }

    public static /* synthetic */ void C(j3 j3Var, int i) {
        j3Var.zzd |= 8;
        j3Var.zzh = i;
    }

    public static /* synthetic */ void D(j3 j3Var, long j) {
        j3Var.zzd |= 16;
        j3Var.zzi = j;
    }

    public static /* synthetic */ void E(j3 j3Var, long j) {
        j3Var.zzd |= 32;
        j3Var.zzj = j;
    }

    public static /* synthetic */ void p(j3 j3Var) {
        j3Var.zzd |= 512;
        j3Var.zzn = 846465066L;
    }

    public static /* synthetic */ void q(j3 j3Var, String str) {
        str.getClass();
        j3Var.zzd |= 4;
        j3Var.zzg = str;
    }

    public static /* synthetic */ void r(j3 j3Var) {
        String str = Build.BRAND;
        str.getClass();
        j3Var.zzd |= 1024;
        j3Var.zzo = str;
    }

    public static /* synthetic */ void s(j3 j3Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        j3Var.zzd |= 8192;
        j3Var.zzr = str;
    }

    public static /* synthetic */ void t(j3 j3Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        j3Var.zzd |= 4096;
        j3Var.zzq = str;
    }

    public static /* synthetic */ void u(j3 j3Var) {
        String str = Build.MODEL;
        str.getClass();
        j3Var.zzd |= 2048;
        j3Var.zzp = str;
    }

    public static /* synthetic */ void v(j3 j3Var, int i) {
        j3Var.zzd |= 16384;
        j3Var.zzs = i;
    }

    public static /* synthetic */ void w(j3 j3Var, boolean z) {
        j3Var.zzd |= 64;
        j3Var.zzk = z;
    }

    public static /* synthetic */ void x(j3 j3Var) {
        j3Var.zzd |= 1;
        j3Var.zze = "8.3.0";
    }

    public static /* synthetic */ void y(j3 j3Var, String str) {
        j3Var.zzd |= 2;
        j3Var.zzf = str;
    }

    public static i3 z() {
        return (i3) zzb.k();
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new j3();
        }
        if (i2 == 4) {
            return new i3(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
