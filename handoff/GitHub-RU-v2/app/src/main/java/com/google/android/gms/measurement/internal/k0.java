package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.internal.measurement.m8;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 extends e0 {
    public long A;
    public long B;
    public List C;
    public String D;
    public int E;
    public String F;
    public String G;
    public long H;
    public String I;
    public String u;
    public String v;
    public int w;
    public String x;
    public String y;
    public long z;

    public k0(o1 o1Var, long j, long j2) {
        super(o1Var);
        this.H = 0L;
        this.I = null;
        this.A = j;
        this.B = j2;
    }

    @Override // com.google.android.gms.measurement.internal.e0
    public final boolean C() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0109  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v4 D(String str) {
        String str2;
        String str3;
        boolean z;
        long j;
        boolean z2;
        Class<?> loadClass;
        long j2;
        String str4;
        long a;
        int i;
        String str5;
        o1 o1Var;
        boolean z3;
        int i2;
        int i3;
        long j3;
        ApplicationInfo d;
        b0 b0Var;
        int i4;
        z();
        String F = F();
        String G = G();
        A();
        String str6 = this.v;
        A();
        long j4 = this.w;
        A();
        c21.u.g(this.x);
        String str7 = this.x;
        o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        h hVar = o1Var2.u;
        s0 s0Var = o1Var2.w;
        h hVar2 = o1Var2.u;
        Context context = o1Var2.r;
        t4 t4Var = o1Var2.z;
        c1 c1Var = o1Var2.v;
        hVar.E();
        A();
        z();
        long j5 = this.z;
        long j6 = 0;
        if (j5 == 0) {
            o1.k(t4Var);
            o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s;
            String packageName = context.getPackageName();
            t4Var.z();
            c21.u.d(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest Q = t4.Q();
            long j7 = -1;
            if (Q == null) {
                s0 s0Var2 = o1Var3.w;
                o1.m(s0Var2);
                s0Var2.x.a("Could not get MD5 instance");
                str2 = G;
                str3 = str6;
            } else {
                if (packageManager != null) {
                    try {
                        if (t4Var.d0(context, packageName)) {
                            str2 = G;
                            str3 = str6;
                            j7 = 0;
                        } else {
                            str2 = G;
                            try {
                                str3 = str6;
                                try {
                                    Signature[] signatureArr = i21.b.a(context).f(o1Var3.r.getPackageName(), 64).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        s0 s0Var3 = o1Var3.w;
                                        o1.m(s0Var3);
                                        s0Var3.A.a("Could not get signatures");
                                    } else {
                                        j7 = t4.R(Q.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    s0 s0Var4 = o1Var3.w;
                                    o1.m(s0Var4);
                                    s0Var4.x.b(e, "Package name not found");
                                    j = 0;
                                    this.z = j;
                                    boolean e2 = o1Var2.e();
                                    o1.k(c1Var);
                                    boolean z4 = !c1Var.J;
                                    z();
                                    if (o1Var2.e()) {
                                    }
                                    j2 = j;
                                    str4 = null;
                                    long j8 = o1Var2.U;
                                    o1.k(c1Var);
                                    a = c1Var.x.a();
                                    if (a != 0) {
                                    }
                                    A();
                                    int i5 = this.E;
                                    Boolean L = hVar2.L("google_analytics_adid_collection_enabled");
                                    if (L != null) {
                                    }
                                    o1.k(c1Var);
                                    c1Var.z();
                                    String str8 = str4;
                                    long j9 = j8;
                                    boolean z5 = c1Var.D().getBoolean("deferred_analytics_collection", z);
                                    Boolean valueOf = Boolean.valueOf(hVar2.O("google_analytics_default_allow_ad_personalization_signals", true) == y1.GRANTED);
                                    List list = this.C;
                                    String g = c1Var.G().g();
                                    if (this.D == null) {
                                    }
                                    String str9 = this.D;
                                    if (c1Var.G().i(a2.ANALYTICS_STORAGE)) {
                                    }
                                    Boolean L2 = hVar2.L("google_analytics_sgtm_upload_enabled");
                                    if (L2 != null) {
                                    }
                                    o1.k(t4Var);
                                    o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s;
                                    String str10 = str5;
                                    String F2 = F();
                                    boolean z6 = r3;
                                    if (o1Var.r.getPackageManager() != null) {
                                    }
                                    o1.k(c1Var);
                                    int i6 = c1Var.G().b;
                                    o1.k(c1Var);
                                    c1Var.z();
                                    String str11 = q.b(c1Var.D().getString("dma_consent_settings", null)).b;
                                    m8.a();
                                    b0Var = c0.Q0;
                                    if (hVar2.J(null, b0Var)) {
                                    }
                                    m8.a();
                                    if (hVar2.J(null, b0Var)) {
                                    }
                                    String str12 = hVar2.u;
                                    String valueOf2 = String.valueOf(b2.h(hVar2.O("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j10 = o1Var2.U;
                                    o1.j(o1Var2.L);
                                    return new v4(F, str2, str3, j4, str7, 133005L, j2, str, z2, z4, str8, j9, i, z3, z5, valueOf, this.A, list, g, str9, str10, z6, j3, i6, str11, i4, j6, str12, valueOf2, j10, com.github.rudroid.copilot.h1.d(o1Var2.L.E()));
                                }
                            } catch (PackageManager.NameNotFoundException e3) {
                                e = e3;
                                str3 = str6;
                                s0 s0Var42 = o1Var3.w;
                                o1.m(s0Var42);
                                s0Var42.x.b(e, "Package name not found");
                                j = 0;
                                this.z = j;
                                boolean e22 = o1Var2.e();
                                o1.k(c1Var);
                                boolean z42 = !c1Var.J;
                                z();
                                if (o1Var2.e()) {
                                }
                                j2 = j;
                                str4 = null;
                                long j82 = o1Var2.U;
                                o1.k(c1Var);
                                a = c1Var.x.a();
                                if (a != 0) {
                                }
                                A();
                                int i52 = this.E;
                                Boolean L3 = hVar2.L("google_analytics_adid_collection_enabled");
                                if (L3 != null) {
                                }
                                o1.k(c1Var);
                                c1Var.z();
                                String str82 = str4;
                                long j92 = j82;
                                boolean z52 = c1Var.D().getBoolean("deferred_analytics_collection", z);
                                Boolean valueOf3 = Boolean.valueOf(hVar2.O("google_analytics_default_allow_ad_personalization_signals", true) == y1.GRANTED);
                                List list2 = this.C;
                                String g2 = c1Var.G().g();
                                if (this.D == null) {
                                }
                                String str92 = this.D;
                                if (c1Var.G().i(a2.ANALYTICS_STORAGE)) {
                                }
                                Boolean L22 = hVar2.L("google_analytics_sgtm_upload_enabled");
                                if (L22 != null) {
                                }
                                o1.k(t4Var);
                                o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s;
                                String str102 = str5;
                                String F22 = F();
                                boolean z62 = r3;
                                if (o1Var.r.getPackageManager() != null) {
                                }
                                o1.k(c1Var);
                                int i62 = c1Var.G().b;
                                o1.k(c1Var);
                                c1Var.z();
                                String str112 = q.b(c1Var.D().getString("dma_consent_settings", null)).b;
                                m8.a();
                                b0Var = c0.Q0;
                                if (hVar2.J(null, b0Var)) {
                                }
                                m8.a();
                                if (hVar2.J(null, b0Var)) {
                                }
                                String str122 = hVar2.u;
                                String valueOf22 = String.valueOf(b2.h(hVar2.O("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j102 = o1Var2.U;
                                o1.j(o1Var2.L);
                                return new v4(F, str2, str3, j4, str7, 133005L, j2, str, z2, z42, str82, j92, i, z3, z52, valueOf3, this.A, list2, g2, str92, str102, z62, j3, i62, str112, i4, j6, str122, valueOf22, j102, com.github.rudroid.copilot.h1.d(o1Var2.L.E()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e4) {
                        e = e4;
                        str2 = G;
                    }
                } else {
                    str2 = G;
                    str3 = str6;
                }
                j = 0;
                this.z = j;
            }
            j = j7;
            this.z = j;
        } else {
            str2 = G;
            str3 = str6;
            z = false;
            j = j5;
        }
        boolean e222 = o1Var2.e();
        o1.k(c1Var);
        boolean z422 = !c1Var.J;
        z();
        if (o1Var2.e()) {
            z2 = e222;
            if (hVar2.J(null, c0.H0)) {
                o1.m(s0Var);
                s0Var.F.a("Disabled IID for tests.");
            } else {
                try {
                    loadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    j2 = j;
                    try {
                        Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                        if (invoke == null) {
                            str4 = null;
                        } else {
                            try {
                                str4 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                            } catch (Exception unused2) {
                                o1.m(s0Var);
                                s0Var.C.a("Failed to retrieve Firebase Instance Id");
                            }
                        }
                    } catch (Exception unused3) {
                        o1.m(s0Var);
                        s0Var.B.a("Failed to obtain Firebase Analytics instance");
                    }
                    long j822 = o1Var2.U;
                    o1.k(c1Var);
                    a = c1Var.x.a();
                    if (a != 0) {
                        j822 = Math.min(j822, a);
                    }
                    A();
                    int i522 = this.E;
                    Boolean L32 = hVar2.L("google_analytics_adid_collection_enabled");
                    boolean z7 = (L32 != null || L32.booleanValue()) ? true : z;
                    o1.k(c1Var);
                    c1Var.z();
                    String str822 = str4;
                    long j922 = j822;
                    boolean z522 = c1Var.D().getBoolean("deferred_analytics_collection", z);
                    Boolean valueOf32 = Boolean.valueOf(hVar2.O("google_analytics_default_allow_ad_personalization_signals", true) == y1.GRANTED);
                    List list22 = this.C;
                    String g22 = c1Var.G().g();
                    if (this.D == null) {
                        o1.k(t4Var);
                        this.D = t4Var.s0();
                    }
                    String str922 = this.D;
                    if (c1Var.G().i(a2.ANALYTICS_STORAGE)) {
                        i = i522;
                        str5 = null;
                    } else {
                        z();
                        if (this.H == 0) {
                            i = i522;
                        } else {
                            o1Var2.B.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.H;
                            i = i522;
                            if (this.G != null && currentTimeMillis > 86400000 && this.I == null) {
                                E();
                            }
                        }
                        if (this.G == null) {
                            E();
                        }
                        str5 = this.G;
                    }
                    Boolean L222 = hVar2.L("google_analytics_sgtm_upload_enabled");
                    boolean booleanValue = L222 != null ? false : L222.booleanValue();
                    o1.k(t4Var);
                    o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s;
                    String str1022 = str5;
                    String F222 = F();
                    boolean z622 = booleanValue;
                    if (o1Var.r.getPackageManager() != null) {
                        z3 = z7;
                        j3 = 0;
                    } else {
                        try {
                            z3 = z7;
                            i2 = 0;
                            try {
                                d = i21.b.a(o1Var.r).d(F222, 0);
                            } catch (PackageManager.NameNotFoundException unused4) {
                                s0 s0Var5 = o1Var.w;
                                o1.m(s0Var5);
                                s0Var5.D.b(F222, "PackageManager failed to find running app: app_id");
                                i3 = i2;
                                j3 = i3;
                                o1.k(c1Var);
                                int i622 = c1Var.G().b;
                                o1.k(c1Var);
                                c1Var.z();
                                String str1122 = q.b(c1Var.D().getString("dma_consent_settings", null)).b;
                                m8.a();
                                b0Var = c0.Q0;
                                if (hVar2.J(null, b0Var)) {
                                }
                                m8.a();
                                if (hVar2.J(null, b0Var)) {
                                }
                                String str1222 = hVar2.u;
                                String valueOf222 = String.valueOf(b2.h(hVar2.O("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j1022 = o1Var2.U;
                                o1.j(o1Var2.L);
                                return new v4(F, str2, str3, j4, str7, 133005L, j2, str, z2, z422, str822, j922, i, z3, z522, valueOf32, this.A, list22, g22, str922, str1022, z622, j3, i622, str1122, i4, j6, str1222, valueOf222, j1022, com.github.rudroid.copilot.h1.d(o1Var2.L.E()));
                            }
                        } catch (PackageManager.NameNotFoundException unused5) {
                            z3 = z7;
                            i2 = 0;
                        }
                        if (d != null) {
                            i3 = d.targetSdkVersion;
                            j3 = i3;
                        }
                        i3 = i2;
                        j3 = i3;
                    }
                    o1.k(c1Var);
                    int i6222 = c1Var.G().b;
                    o1.k(c1Var);
                    c1Var.z();
                    String str11222 = q.b(c1Var.D().getString("dma_consent_settings", null)).b;
                    m8.a();
                    b0Var = c0.Q0;
                    if (hVar2.J(null, b0Var)) {
                        o1.k(t4Var);
                        i4 = t4.U();
                    } else {
                        i4 = 0;
                    }
                    m8.a();
                    if (hVar2.J(null, b0Var)) {
                        o1.k(t4Var);
                        j6 = t4Var.V();
                    }
                    String str12222 = hVar2.u;
                    String valueOf2222 = String.valueOf(b2.h(hVar2.O("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j10222 = o1Var2.U;
                    o1.j(o1Var2.L);
                    return new v4(F, str2, str3, j4, str7, 133005L, j2, str, z2, z422, str822, j922, i, z3, z522, valueOf32, this.A, list22, g22, str922, str1022, z622, j3, i6222, str11222, i4, j6, str12222, valueOf2222, j10222, com.github.rudroid.copilot.h1.d(o1Var2.L.E()));
                }
            }
        } else {
            z2 = e222;
        }
        j2 = j;
        str4 = null;
        long j8222 = o1Var2.U;
        o1.k(c1Var);
        a = c1Var.x.a();
        if (a != 0) {
        }
        A();
        int i5222 = this.E;
        Boolean L322 = hVar2.L("google_analytics_adid_collection_enabled");
        if (L322 != null) {
        }
        o1.k(c1Var);
        c1Var.z();
        String str8222 = str4;
        long j9222 = j8222;
        boolean z5222 = c1Var.D().getBoolean("deferred_analytics_collection", z);
        Boolean valueOf322 = Boolean.valueOf(hVar2.O("google_analytics_default_allow_ad_personalization_signals", true) == y1.GRANTED);
        List list222 = this.C;
        String g222 = c1Var.G().g();
        if (this.D == null) {
        }
        String str9222 = this.D;
        if (c1Var.G().i(a2.ANALYTICS_STORAGE)) {
        }
        Boolean L2222 = hVar2.L("google_analytics_sgtm_upload_enabled");
        if (L2222 != null) {
        }
        o1.k(t4Var);
        o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s;
        String str10222 = str5;
        String F2222 = F();
        boolean z6222 = booleanValue;
        if (o1Var.r.getPackageManager() != null) {
        }
        o1.k(c1Var);
        int i62222 = c1Var.G().b;
        o1.k(c1Var);
        c1Var.z();
        String str112222 = q.b(c1Var.D().getString("dma_consent_settings", null)).b;
        m8.a();
        b0Var = c0.Q0;
        if (hVar2.J(null, b0Var)) {
        }
        m8.a();
        if (hVar2.J(null, b0Var)) {
        }
        String str122222 = hVar2.u;
        String valueOf22222 = String.valueOf(b2.h(hVar2.O("google_analytics_default_allow_ad_personalization_signals", true)));
        long j102222 = o1Var2.U;
        o1.j(o1Var2.L);
        return new v4(F, str2, str3, j4, str7, 133005L, j2, str, z2, z422, str8222, j9222, i, z3, z5222, valueOf322, this.A, list222, g222, str9222, str10222, z6222, j3, i62222, str112222, i4, j6, str122222, valueOf22222, j102222, com.github.rudroid.copilot.h1.d(o1Var2.L.E()));
    }

    public final void E() {
        String format;
        z();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c1 c1Var = o1Var.v;
        s0 s0Var = o1Var.w;
        o1.k(c1Var);
        if (c1Var.G().i(a2.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            t4 t4Var = o1Var.z;
            o1.k(t4Var);
            t4Var.x0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            o1.m(s0Var);
            s0Var.E.a("Analytics Storage consent is not granted");
            format = null;
        }
        o1.m(s0Var);
        s0Var.E.a("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.G = format;
        o1Var.B.getClass();
        this.H = System.currentTimeMillis();
    }

    public final String F() {
        A();
        c21.u.g(this.u);
        return this.u;
    }

    public final String G() {
        z();
        A();
        c21.u.g(this.F);
        return this.F;
    }
}
