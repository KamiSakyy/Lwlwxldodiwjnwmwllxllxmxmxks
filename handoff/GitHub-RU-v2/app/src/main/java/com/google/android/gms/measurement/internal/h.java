package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h extends androidx.compose.foundation.lazy.layout.s0 {
    public Boolean t;
    public String u;
    public g v;
    public Boolean w;

    public final boolean A(String str) {
        return "1".equals(this.v.e(str, "gaia_collection_enabled"));
    }

    public final boolean B(String str) {
        return "1".equals(this.v.e(str, "measurement.event_sampling_enabled"));
    }

    public final boolean C() {
        if (this.t == null) {
            Boolean L = L("app_measurement_lite");
            this.t = L;
            if (L == null) {
                this.t = Boolean.FALSE;
            }
        }
        return this.t.booleanValue() || !((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).s;
    }

    public final String D(String str) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            c21.u.g(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            s0 s0Var3 = o1Var.w;
            o1.m(s0Var3);
            s0Var3.x.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            s0 s0Var4 = o1Var.w;
            o1.m(s0Var4);
            s0Var4.x.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void E() {
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).getClass();
    }

    public final String F(String str, b0 b0Var) {
        return TextUtils.isEmpty(str) ? (String) b0Var.a(null) : (String) b0Var.a(this.v.e(str, b0Var.a));
    }

    public final long G(String str, b0 b0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) b0Var.a(null)).longValue();
        }
        String e = this.v.e(str, b0Var.a);
        if (TextUtils.isEmpty(e)) {
            return ((Long) b0Var.a(null)).longValue();
        }
        try {
            return ((Long) b0Var.a(Long.valueOf(Long.parseLong(e)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) b0Var.a(null)).longValue();
        }
    }

    public final int H(String str, b0 b0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) b0Var.a(null)).intValue();
        }
        String e = this.v.e(str, b0Var.a);
        if (TextUtils.isEmpty(e)) {
            return ((Integer) b0Var.a(null)).intValue();
        }
        try {
            return ((Integer) b0Var.a(Integer.valueOf(Integer.parseInt(e)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) b0Var.a(null)).intValue();
        }
    }

    public final double I(String str, b0 b0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) b0Var.a(null)).doubleValue();
        }
        String e = this.v.e(str, b0Var.a);
        if (TextUtils.isEmpty(e)) {
            return ((Double) b0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) b0Var.a(Double.valueOf(Double.parseDouble(e)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) b0Var.a(null)).doubleValue();
        }
    }

    public final boolean J(String str, b0 b0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) b0Var.a(null)).booleanValue();
        }
        String e = this.v.e(str, b0Var.a);
        return TextUtils.isEmpty(e) ? ((Boolean) b0Var.a(null)).booleanValue() : ((Boolean) b0Var.a(Boolean.valueOf("1".equals(e)))).booleanValue();
    }

    public final Bundle K() {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        try {
            Context context = o1Var.r;
            Context context2 = o1Var.r;
            s0 s0Var = o1Var.w;
            if (context.getPackageManager() == null) {
                o1.m(s0Var);
                s0Var.x.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo d = i21.b.a(context2).d(context2.getPackageName(), 128);
            if (d != null) {
                return d.metaData;
            }
            o1.m(s0Var);
            s0Var.x.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean L(String str) {
        c21.u.d(str);
        Bundle K = K();
        if (K != null) {
            if (K.containsKey(str)) {
                return Boolean.valueOf(K.getBoolean(str));
            }
            return null;
        }
        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
        o1.m(s0Var);
        s0Var.x.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean M() {
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).getClass();
        Boolean L = L("firebase_analytics_collection_deactivated");
        return L != null && L.booleanValue();
    }

    public final boolean N() {
        Boolean L = L("google_analytics_automatic_screen_reporting_enabled");
        return L == null || L.booleanValue();
    }

    public final y1 O(String str, boolean z) {
        Object obj;
        c21.u.d(str);
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        Bundle K = K();
        if (K == null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = K.get(str);
        }
        y1 y1Var = y1.UNINITIALIZED;
        if (obj == null) {
            return y1Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return y1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return y1.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return y1.POLICY;
        }
        s0 s0Var2 = o1Var.w;
        o1.m(s0Var2);
        s0Var2.A.b(str, "Invalid manifest metadata for");
        return y1Var;
    }

    public h(Object... a) {
    }
}
