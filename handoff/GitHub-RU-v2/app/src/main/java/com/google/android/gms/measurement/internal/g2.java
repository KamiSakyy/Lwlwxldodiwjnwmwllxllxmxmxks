package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g2 extends p {
    public final /* synthetic */ int e;
    public final /* synthetic */ t2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(t2 t2Var, x1 x1Var, int i) {
        super(x1Var);
        this.e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(t2Var);
                this.f = t2Var;
                super(x1Var);
                break;
            case 2:
                Objects.requireNonNull(t2Var);
                this.f = t2Var;
                super(x1Var);
                break;
            case 3:
                this.f = t2Var;
                super(x1Var);
                break;
            default:
                Objects.requireNonNull(t2Var);
                this.f = t2Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0126, code lost:
    
        if (r0.g0() >= 234200) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02fa  */
    @Override // com.google.android.gms.measurement.internal.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        j y;
        Bundle bundle;
        URL url;
        switch (this.e) {
            case 0:
                t2 t2Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.f).s).D;
                o1.l(t2Var);
                new Thread(new f2(t2Var, 0)).start();
                break;
            case 1:
                this.f.Y();
                break;
            case 2:
                this.f.F();
                break;
            default:
                t2 t2Var2 = this.f;
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var2).s;
                c1 c1Var = o1Var.v;
                s0 s0Var = o1Var.w;
                m1 m1Var = o1Var.x;
                o1.m(m1Var);
                m1Var.z();
                x2 x2Var = o1Var.F;
                o1.m(x2Var);
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) x2Var).s;
                o1.m(x2Var);
                String F = o1Var.r().F();
                Boolean L = o1Var.u.L("google_analytics_adid_collection_enabled");
                if (L == null || L.booleanValue()) {
                    o1.k(c1Var);
                    o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) c1Var).s;
                    c1Var.z();
                    if (c1Var.G().i(a2.AD_STORAGE)) {
                        o1Var3.B.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str = c1Var.z;
                        if (str == null || elapsedRealtime >= c1Var.B) {
                            c1Var.B = o1Var3.u.G(F, c0.b) + elapsedRealtime;
                            try {
                                c21.h0 a = x11.a.a(o1Var3.r);
                                c1Var.z = "";
                                String str2 = a.b;
                                if (str2 != null) {
                                    c1Var.z = str2;
                                }
                                c1Var.A = a.c;
                            } catch (Exception e) {
                                s0 s0Var2 = o1Var3.w;
                                o1.m(s0Var2);
                                s0Var2.E.b(e, "Unable to get advertising id");
                                c1Var.z = "";
                            }
                            pair = new Pair(c1Var.z, Boolean.valueOf(c1Var.A));
                        } else {
                            pair = new Pair(str, Boolean.valueOf(c1Var.A));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                        o1.m(s0Var);
                        s0Var.F.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    } else {
                        o1.m(x2Var);
                        x2Var.B();
                        ConnectivityManager connectivityManager = (ConnectivityManager) o1Var2.r.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                StringBuilder sb = new StringBuilder();
                                p3 p = o1Var.p();
                                p.z();
                                p.A();
                                if (p.G()) {
                                    t4 t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p).s).z;
                                    o1.k(t4Var);
                                    break;
                                }
                                t2 t2Var3 = o1Var.D;
                                o1.l(t2Var3);
                                o1 o1Var4 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var3).s;
                                t2Var3.z();
                                p3 p2 = o1Var4.p();
                                o1 o1Var5 = (o1) ((androidx.compose.foundation.lazy.layout.s0) p2).s;
                                p2.z();
                                p2.A();
                                f0 f0Var = p2.v;
                                if (f0Var == null) {
                                    p2.F();
                                    s0 s0Var3 = o1Var5.w;
                                    o1.m(s0Var3);
                                    s0Var3.E.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        y = f0Var.y(p2.P(false));
                                        p2.M();
                                    } catch (RemoteException e2) {
                                        s0 s0Var4 = o1Var5.w;
                                        o1.m(s0Var4);
                                        s0Var4.x.b(e2, "Failed to get consents; remote exception");
                                    }
                                    bundle = y == null ? y.r : null;
                                    if (bundle != null) {
                                        int i = o1Var.S;
                                        o1Var.S = i + 1;
                                        r13 = i < 10;
                                        o1.m(s0Var);
                                        String str3 = i < 10 ? "Retrying." : "Skipping.";
                                        s0Var.E.b(Integer.valueOf(o1Var.S), no.a.q(new StringBuilder(str3.length() + 60), "Failed to retrieve DMA consent from the service, ", str3, " retryCount"));
                                    } else {
                                        b2 b = b2.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(b.f());
                                        q c = q.c(100, bundle);
                                        String str4 = c.d;
                                        sb.append("&dma=");
                                        Boolean bool = c.c;
                                        Boolean bool2 = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool, bool2) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str4)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str4);
                                        }
                                        int ordinal = b2.d(bundle.getString("ad_personalization")).ordinal();
                                        if (ordinal != 2) {
                                            bool2 = ordinal != 3 ? null : Boolean.TRUE;
                                        }
                                        int i2 = !Objects.equals(bool2, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i2);
                                        o1.m(s0Var);
                                        s0Var.F.b(sb, "Consent query parameters to Bow");
                                        t4 t4Var2 = o1Var.z;
                                        o1.k(t4Var2);
                                        ((o1) ((androidx.compose.foundation.lazy.layout.s0) o1Var.r()).s).u.E();
                                        String str5 = (String) pair.first;
                                        long a2 = c1Var.M.a() - 1;
                                        String sb2 = sb.toString();
                                        o1 o1Var6 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var2).s;
                                        try {
                                            c21.u.d(str5);
                                            c21.u.d(F);
                                            String str6 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + t4Var2.g0()) + "&rdid=" + str5 + "&bundleid=" + F + "&retry=" + a2;
                                            if (F.equals(o1Var6.u.D("debug.deferred.deeplink"))) {
                                                str6 = str6.concat("&ddl_test=1");
                                            }
                                            if (!sb2.isEmpty()) {
                                                if (sb2.charAt(0) != '&') {
                                                    str6 = str6.concat("&");
                                                }
                                                str6 = str6.concat(sb2);
                                            }
                                            url = new URL(str6);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            s0 s0Var5 = o1Var6.w;
                                            o1.m(s0Var5);
                                            s0Var5.x.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r13) {
                                                return;
                                            }
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            s0 s0Var52 = o1Var6.w;
                                            o1.m(s0Var52);
                                            s0Var52.x.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r13) {
                                            }
                                        }
                                        if (url != null) {
                                            o1.m(x2Var);
                                            e1 e1Var = new e1(o1Var, 1);
                                            x2Var.B();
                                            m1 m1Var2 = o1Var2.x;
                                            o1.m(m1Var2);
                                            m1Var2.L(new v0(x2Var, F, url, (byte[]) null, (HashMap) null, e1Var));
                                        }
                                    }
                                }
                                y = null;
                                if (y == null) {
                                }
                                if (bundle != null) {
                                }
                            } else {
                                o1.m(s0Var);
                                s0Var.A.a("Network is not available for Deferred Deep Link request. Skipping");
                            }
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo == null) {
                        }
                        o1.m(s0Var);
                        s0Var.A.a("Network is not available for Deferred Deep Link request. Skipping");
                    }
                } else {
                    o1.m(s0Var);
                    s0Var.F.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (r13) {
                    t2Var2.L.b(2000L);
                    break;
                }
                break;
        }
    }
}
