package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.m8;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t2 extends e0 {
    public boolean A;
    public int B;
    public g2 C;
    public g2 D;
    public PriorityQueue E;
    public boolean F;
    public b2 G;
    public AtomicLong H;
    public long I;
    public e1 J;
    public boolean K;
    public g2 L;
    public s2 M;
    public g2 N;
    public y51.c O;
    public p2 u;
    public b1.m v;
    public CopyOnWriteArraySet w;
    public boolean x;
    public AtomicReference y;
    public Object z;

    public t2(o1 o1Var) {
        super(o1Var);
        this.w = new CopyOnWriteArraySet();
        this.z = new Object();
        this.A = false;
        this.B = 1;
        this.K = true;
        this.O = new y51.c(28, this);
        this.y = new AtomicReference();
        this.G = b2.c;
        this.I = -1L;
        this.H = new AtomicLong(0L);
        this.J = new e1(o1Var, 3);
    }

    @Override // com.google.android.gms.measurement.internal.e0
    public final boolean C() {
        return false;
    }

    public final void D(b2 b2Var) {
        z();
        boolean z = (b2Var.i(a2.ANALYTICS_STORAGE) && b2Var.i(a2.AD_STORAGE)) || ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).p().I();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        m1Var.z();
        if (z != o1Var.Q) {
            m1 m1Var2 = o1Var.x;
            o1.m(m1Var2);
            m1Var2.z();
            o1Var.Q = z;
            c1 c1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).v;
            o1.k(c1Var);
            c1Var.z();
            Boolean valueOf = c1Var.D().contains("measurement_enabled_from_api") ? Boolean.valueOf(c1Var.D().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                Q(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z3 = !z2 || this.v == null || t4.Y(str2);
            if (str == null) {
                str = "app";
            }
            String str3 = str;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).x;
            o1.m(m1Var);
            m1Var.I(new l2(this, str3, str2, j, bundle3, z2, z3, z));
            return;
        }
        f3 f3Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).C;
        o1.l(f3Var);
        synchronized (f3Var.D) {
            try {
                if (!f3Var.C) {
                    s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).w;
                    o1.m(s0Var);
                    s0Var.C.a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).u.getClass();
                    }
                    s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).w;
                    o1.m(s0Var2);
                    s0Var2.C.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).u.getClass();
                    }
                    s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).w;
                    o1.m(s0Var3);
                    s0Var3.C.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.w0 w0Var = f3Var.y;
                    string2 = w0Var != null ? f3Var.G(w0Var.s) : "Activity";
                }
                String str5 = string2;
                b3 b3Var = f3Var.u;
                if (f3Var.z && b3Var != null) {
                    f3Var.z = false;
                    boolean equals = Objects.equals(b3Var.b, str5);
                    boolean equals2 = Objects.equals(b3Var.a, string);
                    if (equals && equals2) {
                        s0 s0Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).w;
                        o1.m(s0Var4);
                        s0Var4.C.a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s;
                s0 s0Var5 = o1Var.w;
                o1.m(s0Var5);
                s0Var5.F.c("Logging screen view with name, class", string == null ? "null" : string, str5 == null ? "null" : str5);
                b3 b3Var2 = f3Var.u == null ? f3Var.v : f3Var.u;
                t4 t4Var = o1Var.z;
                o1.k(t4Var);
                b3 b3Var3 = new b3(string, str5, t4Var.w0(), true, j);
                f3Var.u = b3Var3;
                f3Var.v = b3Var2;
                f3Var.A = b3Var3;
                o1Var.B.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                m1 m1Var2 = o1Var.x;
                o1.m(m1Var2);
                m1Var2.I(new r1(f3Var, bundle2, b3Var3, b3Var2, elapsedRealtime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F() {
        s0 s0Var;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        z3 z3Var;
        z3 z3Var2;
        t2 t2Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i12;
        String str2;
        com.google.android.gms.internal.measurement.r4 r4Var;
        com.google.common.collect.m d;
        z();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        s0 s0Var2 = o1Var.w;
        g21.a aVar = o1Var.B;
        o1.m(s0Var2);
        s0Var2.E.a("Handle tcf update.");
        c1 c1Var = o1Var.v;
        o1.k(c1Var);
        SharedPreferences E = c1Var.E();
        HashMap hashMap = new HashMap();
        b0 b0Var = c0.Z0;
        int i13 = 2;
        int i14 = 1;
        if (((Boolean) b0Var.a(null)).booleanValue()) {
            com.google.common.collect.h hVar = b4.a;
            com.google.android.gms.internal.measurement.q4 q4Var = com.google.android.gms.internal.measurement.q4.s;
            s0Var = s0Var2;
            a4 a4Var = a4.r;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(q4Var, a4Var);
            com.google.android.gms.internal.measurement.q4 q4Var2 = com.google.android.gms.internal.measurement.q4.t;
            a4 a4Var2 = a4.s;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(q4Var2, a4Var2);
            com.google.android.gms.internal.measurement.q4 q4Var3 = com.google.android.gms.internal.measurement.q4.u;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(q4Var3, a4Var);
            com.google.android.gms.internal.measurement.q4 q4Var4 = com.google.android.gms.internal.measurement.q4.v;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(q4Var4, a4Var);
            com.google.android.gms.internal.measurement.q4 q4Var5 = com.google.android.gms.internal.measurement.q4.w;
            List asList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(q4Var5, a4Var2), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.q4.x, a4Var2), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.q4.y, a4Var2));
            androidx.compose.foundation.lazy.layout.o1 o1Var2 = new androidx.compose.foundation.lazy.layout.o1(asList != null ? asList.size() : 4);
            o1Var2.o(asList);
            com.google.common.collect.m d2 = o1Var2.d();
            int i15 = com.google.common.collect.f.t;
            com.google.common.collect.o oVar = new com.google.common.collect.o("CH");
            char[] cArr = new char[5];
            boolean contains = E.contains("IABTCF_TCString");
            try {
                i5 = E.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i5 = -1;
            }
            try {
                i6 = E.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused2) {
                i6 = -1;
            }
            try {
                i7 = E.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused3) {
                i7 = -1;
            }
            int i16 = i6;
            try {
                i8 = E.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused4) {
                i8 = -1;
            }
            try {
                i9 = E.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused5) {
                i9 = -1;
            }
            String a = b4.a(E, "IABTCF_PublisherCC");
            int i17 = i5;
            androidx.compose.foundation.lazy.layout.o1 o1Var3 = new androidx.compose.foundation.lazy.layout.o1(4);
            com.google.common.collect.k kVar = d2.s;
            if (kVar == null) {
                str2 = a;
                i10 = i8;
                i12 = i9;
                com.google.common.collect.k kVar2 = new com.google.common.collect.k(d2, new com.google.common.collect.l(d2.v, 0, d2.w));
                d2.s = kVar2;
                kVar = kVar2;
            } else {
                i10 = i8;
                i12 = i9;
                str2 = a;
            }
            com.google.android.gms.internal.play_billing.b0 it = kVar.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                r4Var = com.google.android.gms.internal.measurement.r4.v;
                if (!hasNext) {
                    break;
                }
                com.google.android.gms.internal.measurement.q4 q4Var6 = (com.google.android.gms.internal.measurement.q4) it.next();
                int c = q4Var6.c();
                com.google.android.gms.internal.play_billing.b0 b0Var2 = it;
                com.google.common.collect.m mVar = d2;
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(c);
                String a2 = b4.a(E, sb.toString());
                if (!TextUtils.isEmpty(a2) && a2.length() >= 755) {
                    int digit = Character.digit(a2.charAt(754), 10);
                    com.google.android.gms.internal.measurement.r4 r4Var2 = com.google.android.gms.internal.measurement.r4.s;
                    if (digit < 0 || digit > com.google.android.gms.internal.measurement.r4.values().length || digit == 0) {
                        r4Var = r4Var2;
                    } else if (digit == i14) {
                        r4Var = com.google.android.gms.internal.measurement.r4.t;
                    } else if (digit == i13) {
                        r4Var = com.google.android.gms.internal.measurement.r4.u;
                    }
                }
                o1Var3.n(q4Var6, r4Var);
                it = b0Var2;
                d2 = mVar;
                i13 = 2;
                i14 = 1;
            }
            com.google.common.collect.m mVar2 = d2;
            com.google.common.collect.m d3 = o1Var3.d();
            String a3 = b4.a(E, "IABTCF_PurposeConsents");
            String a4 = b4.a(E, "IABTCF_VendorConsents");
            boolean z = !TextUtils.isEmpty(a4) && a4.length() >= 755 && a4.charAt(754) == '1';
            String a5 = b4.a(E, "IABTCF_PurposeLegitimateInterests");
            String a6 = b4.a(E, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !TextUtils.isEmpty(a6) && a6.length() >= 755 && a6.charAt(754) == '1';
            cArr[0] = '2';
            if (contains) {
                com.google.android.gms.internal.measurement.r4 r4Var3 = (com.google.android.gms.internal.measurement.r4) d3.get(q4Var);
                com.google.android.gms.internal.measurement.r4 r4Var4 = (com.google.android.gms.internal.measurement.r4) d3.get(q4Var3);
                com.google.android.gms.internal.measurement.r4 r4Var5 = (com.google.android.gms.internal.measurement.r4) d3.get(q4Var4);
                com.google.android.gms.internal.measurement.r4 r4Var6 = (com.google.android.gms.internal.measurement.r4) d3.get(q4Var5);
                androidx.compose.foundation.lazy.layout.o1 o1Var4 = new androidx.compose.foundation.lazy.layout.o1(4);
                o1Var4.n("Version", "2");
                boolean z3 = z;
                o1Var4.n("VendorConsent", true != z ? "0" : "1");
                boolean z4 = z2;
                o1Var4.n("VendorLegitimateInterest", true != z2 ? "0" : "1");
                o1Var4.n("gdprApplies", i7 != 1 ? "0" : "1");
                int i18 = i12;
                o1Var4.n("EnableAdvertiserConsentMode", i18 != 1 ? "0" : "1");
                o1Var4.n("PolicyVersion", String.valueOf(i16));
                o1Var4.n("CmpSdkID", String.valueOf(i17));
                int i19 = i10;
                o1Var4.n("PurposeOneTreatment", i19 != 1 ? "0" : "1");
                String str3 = str2;
                o1Var4.n("PublisherCC", str3);
                o1Var4.n("PublisherRestrictions1", String.valueOf(r4Var3 != null ? r4Var3.c() : r4Var.c()));
                o1Var4.n("PublisherRestrictions3", String.valueOf(r4Var4 != null ? r4Var4.c() : r4Var.c()));
                o1Var4.n("PublisherRestrictions4", String.valueOf(r4Var5 != null ? r4Var5.c() : r4Var.c()));
                o1Var4.n("PublisherRestrictions7", String.valueOf(r4Var6 != null ? r4Var6.c() : r4Var.c()));
                String d4 = b4.d(q4Var, a3, a5);
                String d5 = b4.d(q4Var3, a3, a5);
                String d6 = b4.d(q4Var4, a3, a5);
                String d7 = b4.d(q4Var5, a3, a5);
                m7.y.p("Purpose1", d4);
                m7.y.p("Purpose3", d5);
                m7.y.p("Purpose4", d6);
                m7.y.p("Purpose7", d7);
                o1Var4.o(com.google.common.collect.m.a(4, new Object[]{"Purpose1", d4, "Purpose3", d5, "Purpose4", d6, "Purpose7", d7}, null).entrySet());
                int i20 = i7;
                o1Var4.o(com.google.common.collect.m.a(5, new Object[]{"AuthorizePurpose1", true != b4.b(q4Var, mVar2, d3, oVar, cArr, i18, i20, i19, str3, a3, a5, z3, z4) ? "0" : "1", "AuthorizePurpose3", true != b4.b(q4Var3, mVar2, d3, oVar, cArr, i18, i20, i19, str3, a3, a5, z3, z4) ? "0" : "1", "AuthorizePurpose4", true != b4.b(q4Var4, mVar2, d3, oVar, cArr, i18, i20, i19, str3, a3, a5, z3, z4) ? "0" : "1", "AuthorizePurpose7", true != b4.b(q4Var5, mVar2, d3, oVar, cArr, i18, i20, i19, str3, a3, a5, z3, z4) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                d = o1Var4.d();
            } else {
                d = com.google.common.collect.m.x;
            }
            z3Var = new z3(d);
            str = "";
        } else {
            s0Var = s0Var2;
            String a7 = b4.a(E, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(a7) && a7.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(a7.charAt(754)));
            }
            try {
                i = E.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i = -1;
            }
            if (i != -1) {
                hashMap.put("gdprApplies", String.valueOf(i));
            }
            try {
                i2 = E.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i2 = -1;
            }
            if (i2 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(i2));
            }
            try {
                i3 = E.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i3 = -1;
            }
            if (i3 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(i3));
            }
            String a8 = b4.a(E, "IABTCF_PurposeConsents");
            if (!str.equals(a8)) {
                hashMap.put("PurposeConsents", a8);
            }
            try {
                i4 = E.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i4 = -1;
            }
            if (i4 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(i4));
            }
            z3Var = new z3(hashMap);
        }
        o1.m(s0Var);
        s0 s0Var3 = s0Var;
        q0 q0Var = s0Var3.F;
        q0Var.b(z3Var, "Tcf preferences read");
        if (!o1Var.u.J(null, b0Var)) {
            if (c1Var.H(z3Var)) {
                Bundle b = z3Var.b();
                o1.m(s0Var3);
                q0Var.b(b, "Consent generated from Tcf");
                if (b != Bundle.EMPTY) {
                    aVar.getClass();
                    T(b, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", z3Var.c());
                G("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        c1Var.z();
        String string = c1Var.D().getString("stored_tcf_param", str);
        HashMap hashMap2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            z3Var2 = new z3(hashMap2);
        } else {
            for (String str4 : string.split(";")) {
                String[] split = str4.split("=");
                if (split.length >= 2 && b4.a.contains(split[0])) {
                    hashMap2.put(split[0], split[1]);
                }
            }
            z3Var2 = new z3(hashMap2);
        }
        if (c1Var.H(z3Var)) {
            Bundle b2 = z3Var.b();
            o1.m(s0Var3);
            q0Var.b(b2, "Consent generated from Tcf");
            if (b2 != Bundle.EMPTY) {
                aVar.getClass();
                t2Var = this;
                t2Var.T(b2, -30, System.currentTimeMillis());
            } else {
                t2Var = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap hashMap3 = z3Var2.a;
            String str5 = (hashMap3.isEmpty() || ((String) hashMap3.get("Version")) != null) ? "0" : "1";
            Bundle b3 = z3Var.b();
            Bundle b4 = z3Var2.b();
            bundle2.putString("_tcfm", str5.concat((b3.size() == b4.size() && Objects.equals(b3.getString("ad_storage"), b4.getString("ad_storage")) && Objects.equals(b3.getString("ad_personalization"), b4.getString("ad_personalization")) && Objects.equals(b3.getString("ad_user_data"), b4.getString("ad_user_data"))) ? "0" : "1"));
            String str6 = (String) z3Var.a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str6)) {
                str6 = "200000";
            }
            bundle2.putString("_tcfd2", str6);
            bundle2.putString("_tcfd", z3Var.c());
            t2Var.G("auto", "_tcf", bundle2);
        }
    }

    public final void G(String str, String str2, Bundle bundle) {
        z();
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).B.getClass();
        H(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void H(long j, Bundle bundle, String str, String str2) {
        z();
        boolean z = true;
        if (this.v != null && !t4.Y(str2)) {
            z = false;
        }
        I(str, str2, j, bundle, true, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        t2 t2Var;
        c1 c1Var;
        g21.a aVar;
        h hVar;
        c1 c1Var2;
        y51.c cVar;
        boolean z4;
        long j2;
        boolean b;
        t2 t2Var2;
        long j3;
        int i;
        long j4;
        boolean G;
        ArrayList arrayList;
        int i2;
        Bundle[] bundleArr;
        String str3 = str;
        c21.u.d(str3);
        c21.u.g(bundle);
        z();
        A();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        boolean e = o1Var.e();
        y3 y3Var = o1Var.y;
        h hVar2 = o1Var.u;
        Context context = o1Var.r;
        t4 t4Var = o1Var.z;
        s0 s0Var = o1Var.w;
        if (!e) {
            o1.m(s0Var);
            s0Var.E.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = o1Var.r().C;
        if (list != null && !list.contains(str2)) {
            o1.m(s0Var);
            s0Var.E.c("Dropping non-safelisted event. event name, origin", str2, str3);
            return;
        }
        if (!this.x) {
            this.x = true;
            try {
                try {
                    (!o1Var.s ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e2) {
                    o1.m(s0Var);
                    s0Var.A.b(e2, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                o1.m(s0Var);
                s0Var.D.a("Tag Manager is not found and thus will not be used");
            }
        }
        n0 n0Var = o1Var.A;
        c1 c1Var3 = o1Var.v;
        g21.a aVar2 = o1Var.B;
        if (!hVar2.J(null, c0.f1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            aVar2.getClass();
            aVar = aVar2;
            c1Var = c1Var3;
            hVar = hVar2;
            K(System.currentTimeMillis(), string, "auto", "_lgclid");
            t2Var = this;
        } else {
            t2Var = this;
            c1Var = c1Var3;
            aVar = aVar2;
            hVar = hVar2;
        }
        if (!z || t4.B[0].equals(str2)) {
            c1Var2 = c1Var;
        } else {
            o1.k(t4Var);
            o1.k(c1Var);
            c1Var2 = c1Var;
            t4Var.K(bundle, c1Var2.Q.U());
        }
        y51.c cVar2 = t2Var.O;
        if (!z3 && !"_iap".equals(str2)) {
            o1.k(t4Var);
            int i3 = 2;
            if (t4Var.A0("event", str2)) {
                if (t4Var.C0("event", c2.a, c2.b, str2)) {
                    ((o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s).getClass();
                    if (t4Var.D0("event", 40, str2)) {
                        i3 = 0;
                    }
                } else {
                    i3 = 13;
                }
            }
            if (i3 != 0) {
                o1.m(s0Var);
                s0Var.z.b(n0Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                o1.k(t4Var);
                t4.P(cVar2, null, i3, "_ev", t4.E(40, str2, true), str2 != null ? str2.length() : 0);
                return;
            }
        }
        f3 f3Var = o1Var.C;
        o1.l(f3Var);
        b3 F = f3Var.F(false);
        if (F != null && !bundle.containsKey("_sc")) {
            F.d = true;
        }
        t4.r0(F, bundle, z && !z3);
        boolean equals = "am".equals(str3);
        boolean Y = t4.Y(str2);
        if (z) {
            cVar = cVar2;
            if (t2Var.v != null && !Y) {
                if (!equals) {
                    o1.m(s0Var);
                    s0Var.E.c("Passing event to registered event handler (FE)", n0Var.a(str2), n0Var.e(bundle));
                    c21.u.g(t2Var.v);
                    b1.m mVar = t2Var.v;
                    mVar.getClass();
                    try {
                        ((com.google.android.gms.internal.measurement.r0) mVar.s).m(j, bundle, str3, str2);
                        return;
                    } catch (RemoteException e3) {
                        o1 o1Var2 = ((AppMeasurementDynamiteService) mVar.t).f;
                        if (o1Var2 != null) {
                            s0 s0Var2 = o1Var2.w;
                            o1.m(s0Var2);
                            s0Var2.A.b(e3, "Event interceptor threw exception");
                            return;
                        }
                        return;
                    }
                }
                z4 = true;
                if (o1Var.h()) {
                    return;
                }
                o1.k(t4Var);
                o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s;
                int E0 = t4Var.E0(str2);
                if (E0 != 0) {
                    o1.m(s0Var);
                    s0Var.z.b(n0Var.a(str2), "Invalid event name. Event will not be logged (FE)");
                    String E = t4.E(40, str2, true);
                    int length = str2 != null ? str2.length() : 0;
                    o1.k(t4Var);
                    t4.P(cVar, null, E0, "_ev", E, length);
                    return;
                }
                Bundle H = t4Var.H(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
                c21.u.g(H);
                o1.l(f3Var);
                String str4 = "_o";
                if (f3Var.F(false) == null || !"_ae".equals(str2)) {
                    j2 = 0;
                } else {
                    o1.l(y3Var);
                    a0.o2 o2Var = y3Var.x;
                    ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((y3) o2Var.d)).s).B.getClass();
                    j2 = 0;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j5 = elapsedRealtime - o2Var.b;
                    o2Var.b = elapsedRealtime;
                    if (j5 > 0) {
                        t4Var.h0(H, j5);
                    }
                }
                if (!"auto".equals(str3) && "_ssr".equals(str2)) {
                    String string2 = H.getString("_ffr");
                    int i4 = g21.d.a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        string2 = null;
                    } else if (string2 != null) {
                        string2 = string2.trim();
                    }
                    c1 c1Var4 = o1Var3.v;
                    o1.k(c1Var4);
                    if (Objects.equals(string2, c1Var4.N.o())) {
                        s0 s0Var3 = o1Var3.w;
                        o1.m(s0Var3);
                        s0Var3.E.a("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        c1 c1Var5 = o1Var3.v;
                        o1.k(c1Var5);
                        c1Var5.N.p(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    c1 c1Var6 = o1Var3.v;
                    o1.k(c1Var6);
                    String o = c1Var6.N.o();
                    if (!TextUtils.isEmpty(o)) {
                        H.putString("_ffr", o);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(H);
                if (hVar.J(null, c0.U0)) {
                    o1.l(y3Var);
                    y3Var.z();
                    b = y3Var.v;
                } else {
                    o1.k(c1Var2);
                    b = c1Var2.K.b();
                }
                o1.k(c1Var2);
                if (c1Var2.H.a() > j2 && c1Var2.J(j) && b) {
                    o1.m(s0Var);
                    s0Var.F.a("Current session is expired, remove the session number, ID, and engagement time");
                    aVar.getClass();
                    c1 c1Var7 = c1Var2;
                    i = 0;
                    K(System.currentTimeMillis(), null, "auto", "_sid");
                    aVar.getClass();
                    K(System.currentTimeMillis(), null, "auto", "_sno");
                    aVar.getClass();
                    K(System.currentTimeMillis(), null, "auto", "_se");
                    t2Var2 = this;
                    j3 = j2;
                    c1Var7.I.b(j3);
                } else {
                    t2Var2 = this;
                    j3 = j2;
                    i = 0;
                }
                if (H.getLong("extend_session", j3) == 1) {
                    o1.m(s0Var);
                    s0Var.F.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    o1.l(y3Var);
                    j4 = j;
                    y3Var.w.x(j4);
                } else {
                    j4 = j;
                }
                ArrayList arrayList3 = new ArrayList(H.keySet());
                Collections.sort(arrayList3);
                int size = arrayList3.size();
                int i5 = i;
                while (i5 < size) {
                    String str5 = (String) arrayList3.get(i5);
                    if (str5 != null) {
                        o1.k(t4Var);
                        Object obj = H.get(str5);
                        arrayList = arrayList3;
                        if (obj instanceof Bundle) {
                            i2 = size;
                            Bundle[] bundleArr2 = new Bundle[1];
                            bundleArr2[i] = (Bundle) obj;
                            bundleArr = bundleArr2;
                        } else {
                            i2 = size;
                            if (obj instanceof Parcelable[]) {
                                Parcelable[] parcelableArr = (Parcelable[]) obj;
                                bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                            } else if (obj instanceof ArrayList) {
                                ArrayList arrayList4 = (ArrayList) obj;
                                bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                            } else {
                                bundleArr = null;
                            }
                        }
                        if (bundleArr != null) {
                            H.putParcelableArray(str5, bundleArr);
                        }
                    } else {
                        arrayList = arrayList3;
                        i2 = size;
                    }
                    i5++;
                    arrayList3 = arrayList;
                    size = i2;
                }
                int i6 = i;
                while (i6 < arrayList2.size()) {
                    Bundle bundle2 = (Bundle) arrayList2.get(i6);
                    String str6 = i6 != 0 ? "_ep" : str2;
                    String str7 = str4;
                    bundle2.putString(str7, str3);
                    if (z2) {
                        bundle2 = t4Var.b0(bundle2);
                    }
                    String str8 = str3;
                    Bundle bundle3 = bundle2;
                    w wVar = new w(str6, new v(bundle2), str8, j4);
                    p3 p = o1Var.p();
                    p.getClass();
                    p.z();
                    p.A();
                    p.L();
                    m0 o2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p).s).o();
                    o2.getClass();
                    Parcel obtain = Parcel.obtain();
                    c21.c0.b(wVar, obtain, i);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    if (marshall.length > 131072) {
                        s0 s0Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) o2).s).w;
                        o1.m(s0Var4);
                        s0Var4.y.a("Event is too long for local database. Sending event directly to service");
                        G = false;
                    } else {
                        G = o2.G(0, marshall);
                    }
                    p.N(new j3(p, p.P(true), G, wVar, 1));
                    if (!z4) {
                        Iterator it = t2Var2.w.iterator();
                        while (it.hasNext()) {
                            ((d2) it.next()).a(j, new Bundle(bundle3), str, str2);
                        }
                    }
                    i6++;
                    str3 = str;
                    j4 = j;
                    str4 = str7;
                    i = 0;
                }
                o1.l(f3Var);
                if (f3Var.F(false) == null || !"_ae".equals(str2)) {
                    return;
                }
                o1.l(y3Var);
                aVar.getClass();
                y3Var.x.o(true, true, SystemClock.elapsedRealtime());
                return;
            }
        } else {
            cVar = cVar2;
        }
        z4 = equals;
        if (o1Var.h()) {
        }
    }

    public final void J(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (z) {
            t4 t4Var = o1Var.z;
            o1.k(t4Var);
            i = t4Var.F0(str2);
        } else {
            t4 t4Var2 = o1Var.z;
            o1.k(t4Var2);
            if (t4Var2.A0("user property", str2)) {
                if (t4Var2.C0("user property", c2.i, null, str2)) {
                    ((o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var2).s).getClass();
                    if (t4Var2.D0("user property", 24, str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        y51.c cVar = this.O;
        if (i != 0) {
            o1.k(o1Var.z);
            String E = t4.E(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            o1.k(o1Var.z);
            t4.P(cVar, null, i, "_ev", E, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            m1 m1Var = o1Var.x;
            o1.m(m1Var);
            m1Var.I(new r1(this, str3, str2, null, j, 1));
            return;
        }
        t4 t4Var3 = o1Var.z;
        o1.k(t4Var3);
        int M = t4Var3.M(obj, str2);
        if (M != 0) {
            o1.k(t4Var3);
            String E2 = t4.E(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            o1.k(o1Var.z);
            t4.P(cVar, null, M, "_ev", E2, length);
            return;
        }
        o1.k(t4Var3);
        Object N = t4Var3.N(obj, str2);
        if (N != null) {
            m1 m1Var2 = o1Var.x;
            o1.m(m1Var2);
            m1Var2.I(new r1(this, str3, str2, N, j, 1));
        }
    }

    public final void K(long j, Object obj, String str, String str2) {
        String str3;
        boolean G;
        Object obj2 = obj;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.d(str);
        c21.u.d(str2);
        z();
        A();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj2 = Long.valueOf(j2);
                    c1 c1Var = o1Var.v;
                    o1.k(c1Var);
                    c1Var.E.p(j2 == 1 ? "true" : "false");
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.F.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj2);
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                c1 c1Var2 = o1Var.v;
                o1.k(c1Var2);
                c1Var2.E.p("unset");
            } else {
                str4 = str2;
            }
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.F.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj2);
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!o1Var.e()) {
            s0 s0Var3 = o1Var.w;
            o1.m(s0Var3);
            s0Var3.F.a("User property not set since app measurement is disabled");
            return;
        }
        if (o1Var.h()) {
            q4 q4Var = new q4(j, obj3, str3, str);
            p3 p = o1Var.p();
            p.z();
            p.A();
            p.L();
            m0 o = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p).s).o();
            o.getClass();
            Parcel obtain = Parcel.obtain();
            c21.c0.c(q4Var, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                s0 s0Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) o).s).w;
                o1.m(s0Var4);
                s0Var4.y.a("User property too long for local database. Sending directly to service");
                G = false;
            } else {
                G = o.G(1, marshall);
            }
            p.N(new j3(p, p.P(true), G, q4Var, 0));
        }
    }

    public final void L() {
        z();
        A();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (o1Var.h()) {
            h hVar = o1Var.u;
            ((o1) ((androidx.compose.foundation.lazy.layout.s0) hVar).s).getClass();
            Boolean L = hVar.L("google_analytics_deferred_deep_link_enabled");
            if (L != null && L.booleanValue()) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.E.a("Deferred Deep Link feature enabled.");
                m1 m1Var = o1Var.x;
                o1.m(m1Var);
                m1Var.I(new f2(this, 2));
            }
            p3 p = o1Var.p();
            p.z();
            p.A();
            v4 P = p.P(true);
            p.L();
            o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) p).s;
            o1Var2.u.J(null, c0.b1);
            o1Var2.o().G(3, new byte[0]);
            p.N(new k3(p, P, 1));
            this.K = false;
            c1 c1Var = o1Var.v;
            o1.k(c1Var);
            c1Var.z();
            String string = c1Var.D().getString("previous_os_version", null);
            ((o1) ((androidx.compose.foundation.lazy.layout.s0) c1Var).s).q().B();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = c1Var.D().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            o1Var.q().B();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            G("auto", "_ou", bundle);
        }
    }

    public final void M(Bundle bundle, long j) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.A.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        c2.e(bundle2, "app_id", String.class, null);
        c2.e(bundle2, "origin", String.class, null);
        c2.e(bundle2, "name", String.class, null);
        c2.e(bundle2, "value", Object.class, null);
        c2.e(bundle2, "trigger_event_name", String.class, null);
        c2.e(bundle2, "trigger_timeout", Long.class, 0L);
        c2.e(bundle2, "timed_out_event_name", String.class, null);
        c2.e(bundle2, "timed_out_event_params", Bundle.class, null);
        c2.e(bundle2, "triggered_event_name", String.class, null);
        c2.e(bundle2, "triggered_event_params", Bundle.class, null);
        c2.e(bundle2, "time_to_live", Long.class, 0L);
        c2.e(bundle2, "expired_event_name", String.class, null);
        c2.e(bundle2, "expired_event_params", Bundle.class, null);
        c21.u.d(bundle2.getString("name"));
        c21.u.d(bundle2.getString("origin"));
        c21.u.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        t4 t4Var = o1Var.z;
        n0 n0Var = o1Var.A;
        s0 s0Var2 = o1Var.w;
        o1.k(t4Var);
        if (t4Var.F0(string) != 0) {
            o1.m(s0Var2);
            s0Var2.x.b(n0Var.c(string), "Invalid conditional user property name");
            return;
        }
        o1.k(t4Var);
        if (t4Var.M(obj, string) != 0) {
            o1.m(s0Var2);
            s0Var2.x.c("Invalid conditional user property value", n0Var.c(string), obj);
            return;
        }
        Object N = t4Var.N(obj, string);
        if (N == null) {
            o1.m(s0Var2);
            s0Var2.x.c("Unable to normalize conditional user property value", n0Var.c(string), obj);
            return;
        }
        c2.c(bundle2, N);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            o1.m(s0Var2);
            s0Var2.x.c("Invalid conditional user property timeout", n0Var.c(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            o1.m(s0Var2);
            s0Var2.x.c("Invalid conditional user property time to live", n0Var.c(string), Long.valueOf(j3));
        } else {
            m1 m1Var = o1Var.x;
            o1.m(m1Var);
            m1Var.I(new n2(this, bundle2, 0));
        }
    }

    public final void N(String str, String str2, Bundle bundle) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        o1Var.B.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        c21.u.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        m1Var.I(new n2(this, bundle2, 1));
    }

    public final String O() {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        try {
            return c2.b(o1Var.r, o1Var.G);
        } catch (IllegalStateException e) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void P(b2 b2Var, long j, boolean z) {
        int i = b2Var.b;
        z();
        A();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c1 c1Var = o1Var.v;
        s0 s0Var = o1Var.w;
        o1.k(c1Var);
        b2 G = c1Var.G();
        if (j <= this.I && b2.l(G.b, i)) {
            o1.m(s0Var);
            s0Var.D.b(b2Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        c1 c1Var2 = o1Var.v;
        o1.k(c1Var2);
        c1Var2.z();
        if (!b2.l(i, c1Var2.D().getInt("consent_source", 100))) {
            o1.m(s0Var);
            s0Var.D.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = c1Var2.D().edit();
        edit.putString("consent_settings", b2Var.g());
        edit.putInt("consent_source", i);
        edit.apply();
        o1.m(s0Var);
        s0Var.F.b(b2Var, "Setting storage consent(FE)");
        this.I = j;
        if (o1Var.p().J()) {
            p3 p = o1Var.p();
            p.z();
            p.A();
            p.N(new n3(p, 2));
        } else {
            p3 p2 = o1Var.p();
            p2.z();
            p2.A();
            if (p2.I()) {
                p2.N(new k3(p2, p2.P(false)));
            }
        }
        if (z) {
            o1Var.p().D(new AtomicReference());
        }
    }

    public final void Q(Boolean bool, boolean z) {
        z();
        A();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        s0 s0Var = o1Var.w;
        o1.m(s0Var);
        s0Var.E.b(bool, "Setting app measurement enabled (FE)");
        c1 c1Var = o1Var.v;
        o1.k(c1Var);
        c1Var.z();
        SharedPreferences.Editor edit = c1Var.D().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z) {
            c1Var.z();
            SharedPreferences.Editor edit2 = c1Var.D().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        m1Var.z();
        if (o1Var.Q || !(bool == null || bool.booleanValue())) {
            R();
        }
    }

    public final void R() {
        z();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c1 c1Var = o1Var.v;
        s0 s0Var = o1Var.w;
        g21.a aVar = o1Var.B;
        o1.k(c1Var);
        String o = c1Var.E.o();
        if (o != null) {
            if ("unset".equals(o)) {
                aVar.getClass();
                K(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(o) ? 0L : 1L);
                aVar.getClass();
                K(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!o1Var.e() || !this.K) {
            o1.m(s0Var);
            s0Var.E.a("Updating Scion state (FE)");
            p3 p = o1Var.p();
            p.z();
            p.A();
            p.N(new k3(p, p.P(true), 3));
            return;
        }
        o1.m(s0Var);
        s0Var.E.a("Recording app launch after enabling measurement for the first time (FE)");
        L();
        y3 y3Var = o1Var.y;
        o1.l(y3Var);
        y3Var.w.w();
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        m1Var.I(new f2(this, 1));
    }

    public final void S() {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (!(o1Var.r.getApplicationContext() instanceof Application) || this.u == null) {
            return;
        }
        ((Application) o1Var.r.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.u);
    }

    public final void T(Bundle bundle, int i, long j) {
        Boolean bool;
        String str;
        y1 y1Var;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        A();
        b2 b2Var = b2.c;
        a2[] a2VarArr = z1.STORAGE.r;
        int length = a2VarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                str = null;
                break;
            }
            String str2 = a2VarArr[i2].r;
            if (bundle.containsKey(str2) && (str = bundle.getString(str2)) != null) {
                if ((str.equals("granted") ? Boolean.TRUE : str.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i2++;
        }
        if (str != null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.C.b(str, "Ignoring invalid consent setting");
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.C.a("Valid consent values are 'granted', 'denied'");
        }
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        boolean F = m1Var.F();
        b2 b = b2.b(i, bundle);
        Iterator it = b.a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            y1Var = y1.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((y1) it.next()) != y1Var) {
                V(b, F);
                break;
            }
        }
        q c = q.c(i, bundle);
        Iterator it2 = c.e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((y1) it2.next()) != y1Var) {
                U(c, F);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = b2.d(bundle.getString("ad_personalization")).ordinal();
            if (ordinal == 2) {
                bool = Boolean.FALSE;
            } else if (ordinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str3 = i == -30 ? "tcf" : "app";
            if (F) {
                K(j, bool.toString(), str3, "allow_personalized_ads");
            } else {
                J(str3, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void U(q qVar, boolean z) {
        com.google.common.util.concurrent.b bVar = new com.google.common.util.concurrent.b(this, qVar, false, 10);
        if (z) {
            z();
            bVar.run();
        } else {
            m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).x;
            o1.m(m1Var);
            m1Var.I(bVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:75:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void V(com.google.android.gms.measurement.internal.b2 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t2.V(com.google.android.gms.measurement.internal.b2, boolean):void");
    }

    public final void W() {
        m8.a();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        h hVar = o1Var.u;
        m1 m1Var = o1Var.x;
        s0 s0Var = o1Var.w;
        if (hVar.J(null, c0.Q0)) {
            o1.m(m1Var);
            if (m1Var.F()) {
                o1.m(s0Var);
                s0Var.x.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (w80.w3.e()) {
                o1.m(s0Var);
                s0Var.x.a("Cannot get trigger URIs from main thread");
                return;
            }
            A();
            o1.m(s0Var);
            s0Var.F.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            o1.m(m1Var);
            m1Var.J(atomicReference, 10000L, "get trigger URIs", new m2(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                o1.m(s0Var);
                s0Var.z.a("Timed out waiting for get trigger URIs");
            } else {
                o1.m(m1Var);
                m1Var.I(new Runnable() { // from class: com.google.android.gms.measurement.internal.q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2 t2Var = t2.this;
                        t2Var.z();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        c1 c1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).v;
                        o1.k(c1Var);
                        SparseArray F = c1Var.F();
                        for (c4 c4Var : list) {
                            int i = c4Var.t;
                            if (!F.contains(i) || ((Long) F.get(i)).longValue() < c4Var.s) {
                                t2Var.X().add(c4Var);
                            }
                        }
                        t2Var.Y();
                    }
                });
            }
        }
    }

    public final PriorityQueue X() {
        if (this.E == null) {
            this.E = new PriorityQueue(Comparator.comparing(r2.a, androidx.viewpager.widget.b.b));
        }
        return this.E;
    }

    public final void Y() {
        c4 c4Var;
        z();
        this.F = false;
        if (X().isEmpty() || this.A || (c4Var = (c4) X().poll()) == null) {
            return;
        }
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        t4 t4Var = o1Var.z;
        o1.k(t4Var);
        h7.a T = t4Var.T();
        if (T != null) {
            this.A = true;
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            q0 q0Var = s0Var.F;
            String str = c4Var.r;
            q0Var.b(str, "Registering trigger URI");
            com.google.common.util.concurrent.c e = T.e(Uri.parse(str));
            if (e != null) {
                e.a(new com.google.common.util.concurrent.b(0, e, new b1.m(this, c4Var, false, 22)), new h2(0, this));
            } else {
                this.A = false;
                X().add(c4Var);
            }
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s2 {
        public s2() {
        }
    }
}
