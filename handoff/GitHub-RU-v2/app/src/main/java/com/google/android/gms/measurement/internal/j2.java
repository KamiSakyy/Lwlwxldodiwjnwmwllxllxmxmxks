package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 implements Runnable {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public j2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.n0 n0Var, String str, String str2, boolean z) {
        this.v = n0Var;
        this.s = str;
        this.t = str2;
        this.u = z;
        this.w = appMeasurementDynamiteService;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:33:0x010b, B:35:0x0116, B:38:0x0123, B:40:0x0129, B:41:0x0143, B:42:0x014c, B:46:0x0154, B:49:0x016d, B:50:0x017c, B:52:0x0174, B:53:0x018f, B:55:0x0195, B:57:0x019b, B:59:0x01a1, B:61:0x01a7, B:63:0x01af, B:65:0x01b7, B:67:0x01bd, B:70:0x01cf, B:75:0x0094, B:77:0x009a, B:79:0x00a4, B:81:0x00aa, B:83:0x00b0, B:85:0x00b6, B:87:0x00be, B:89:0x00c6, B:91:0x00ce, B:93:0x00d6, B:94:0x00ec, B:96:0x00fa), top: B:74:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:33:0x010b, B:35:0x0116, B:38:0x0123, B:40:0x0129, B:41:0x0143, B:42:0x014c, B:46:0x0154, B:49:0x016d, B:50:0x017c, B:52:0x0174, B:53:0x018f, B:55:0x0195, B:57:0x019b, B:59:0x01a1, B:61:0x01a7, B:63:0x01af, B:65:0x01b7, B:67:0x01bd, B:70:0x01cf, B:75:0x0094, B:77:0x009a, B:79:0x00a4, B:81:0x00aa, B:83:0x00b0, B:85:0x00b6, B:87:0x00be, B:89:0x00c6, B:91:0x00ce, B:93:0x00d6, B:94:0x00ec, B:96:0x00fa), top: B:74:0x0094 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        p2 p2Var;
        s0 s0Var;
        Bundle z0;
        String str;
        switch (this.r) {
            case 0:
                p3 p = ((AppMeasurementDynamiteService) this.w).f.p();
                com.google.android.gms.internal.measurement.n0 n0Var = (com.google.android.gms.internal.measurement.n0) this.v;
                String str2 = (String) this.s;
                String str3 = (String) this.t;
                p.z();
                p.A();
                p.N(new g3(p, str2, str3, p.P(false), this.u, n0Var));
                break;
            case 1:
                String str4 = (String) this.s;
                String str5 = (String) this.t;
                p3 p2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((t2) this.w)).s).p();
                AtomicReference atomicReference = (AtomicReference) this.v;
                p2.z();
                p2.A();
                p2.N(new g3(p2, atomicReference, str4, str5, p2.P(false), this.u));
                break;
            case 2:
                p2 p2Var2 = (p2) this.w;
                t2 t2Var = (t2) p2Var2.s;
                t2Var.z();
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s;
                e1 e1Var = t2Var.J;
                String str6 = (String) this.t;
                Uri uri = (Uri) this.v;
                try {
                    t4 t4Var = o1Var.z;
                    s0 s0Var2 = o1Var.w;
                    o1.k(t4Var);
                    try {
                        p2Var = p2Var2;
                        if (TextUtils.isEmpty(str6)) {
                            s0Var = s0Var2;
                        } else {
                            try {
                                if (str6.contains("gclid")) {
                                    s0Var = s0Var2;
                                } else {
                                    s0Var = s0Var2;
                                    if (!str6.contains("gbraid") && !str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_id") && !str6.contains("dclid") && !str6.contains("srsltid") && !str6.contains("sfmc_id")) {
                                        s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s).w;
                                        o1.m(s0Var3);
                                        s0Var3.E.a("Activity created with data 'referrer' without required params");
                                    }
                                }
                                z0 = t4Var.z0(Uri.parse("https://google.com/search?".concat(str6)));
                                if (z0 != null) {
                                    z0.putString("_cis", "referrer");
                                }
                                String str7 = (String) this.s;
                                if (this.u) {
                                    t4 t4Var2 = o1Var.z;
                                    o1.k(t4Var2);
                                    Bundle z02 = t4Var2.z0(uri);
                                    if (z02 != null) {
                                        z02.putString("_cis", "intent");
                                        if (z02.containsKey("gclid") || z0 == null || !z0.containsKey("gclid")) {
                                            str = "Activity created with data 'referrer' without required params";
                                        } else {
                                            str = "Activity created with data 'referrer' without required params";
                                            z02.putString("_cer", "gclid=" + z0.getString("gclid"));
                                        }
                                        t2Var.G(str7, "_cmp", z02);
                                        e1Var.c(str7, z02);
                                        if (!TextUtils.isEmpty(str6)) {
                                            o1.m(s0Var);
                                            s0 s0Var4 = s0Var;
                                            q0 q0Var = s0Var4.E;
                                            q0Var.b(str6, "Activity created with referrer");
                                            if (!o1Var.u.J(null, c0.G0)) {
                                                if (!str6.contains("gclid") || (!str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_term") && !str6.contains("utm_content"))) {
                                                    o1.m(s0Var4);
                                                    q0Var.a(str);
                                                    break;
                                                } else if (!TextUtils.isEmpty(str6)) {
                                                    o1Var.B.getClass();
                                                    t2Var.J("auto", "_ldl", str6, true, System.currentTimeMillis());
                                                    break;
                                                }
                                            } else {
                                                if (z0 != null) {
                                                    t2Var.G(str7, "_cmp", z0);
                                                    e1Var.c(str7, z0);
                                                } else {
                                                    o1.m(s0Var4);
                                                    q0Var.b(str6, "Referrer does not contain valid parameters");
                                                }
                                                o1Var.B.getClass();
                                                t2Var.J("auto", "_ldl", null, true, System.currentTimeMillis());
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                str = "Activity created with data 'referrer' without required params";
                                if (!TextUtils.isEmpty(str6)) {
                                }
                            } catch (RuntimeException e) {
                                e = e;
                                p2Var2 = p2Var;
                                s0 s0Var5 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((t2) p2Var2.s)).s).w;
                                o1.m(s0Var5);
                                s0Var5.x.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                return;
                            }
                        }
                        z0 = null;
                        String str72 = (String) this.s;
                        if (this.u) {
                        }
                        str = "Activity created with data 'referrer' without required params";
                        if (!TextUtils.isEmpty(str6)) {
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        s0 s0Var52 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((t2) p2Var2.s)).s).w;
                        o1.m(s0Var52);
                        s0Var52.x.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    p2Var = p2Var2;
                }
                break;
            default:
                v4 v4Var = (v4) this.v;
                p3 p3Var = (p3) this.w;
                f0 f0Var = p3Var.v;
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s;
                if (f0Var == null) {
                    s0 s0Var6 = o1Var2.w;
                    o1.m(s0Var6);
                    s0Var6.x.a("Failed to send default event parameters to service");
                    break;
                } else {
                    if (o1Var2.u.J(null, c0.b1)) {
                        p3Var.R(f0Var, this.u ? null : (v) this.s, v4Var);
                        break;
                    } else {
                        try {
                            f0Var.z((Bundle) this.t, v4Var);
                            p3Var.M();
                            break;
                        } catch (RemoteException e4) {
                            s0 s0Var7 = o1Var2.w;
                            o1.m(s0Var7);
                            s0Var7.x.b(e4, "Failed to send default event parameters to service");
                        }
                    }
                }
        }
    }

    public j2(p2 p2Var, boolean z, Uri uri, String str, String str2) {
        this.u = z;
        this.v = uri;
        this.s = str;
        this.t = str2;
        this.w = p2Var;
    }

    public j2(t2 t2Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.v = atomicReference;
        this.s = str;
        this.t = str2;
        this.u = z;
        Objects.requireNonNull(t2Var);
        this.w = t2Var;
    }

    public j2(p3 p3Var, v4 v4Var, boolean z, v vVar, Bundle bundle) {
        this.v = v4Var;
        this.u = z;
        this.s = vVar;
        this.t = bundle;
        Objects.requireNonNull(p3Var);
        this.w = p3Var;
    }
}
