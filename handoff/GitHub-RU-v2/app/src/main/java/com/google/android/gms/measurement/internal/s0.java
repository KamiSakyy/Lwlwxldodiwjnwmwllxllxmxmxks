package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s0 extends w1 {
    public q0 A;
    public q0 B;
    public q0 C;
    public q0 D;
    public q0 E;
    public q0 F;
    public char u;
    public long v;
    public String w;
    public q0 x;
    public q0 y;
    public q0 z;

    public s0(o1 o1Var) {
        super(o1Var);
        this.u = (char) 0;
        this.v = -1L;
        this.x = new q0(this, 6, false, false);
        this.y = new q0(this, 6, true, false);
        this.z = new q0(this, 6, false, true);
        this.A = new q0(this, 5, false, false);
        this.B = new q0(this, 5, true, false);
        this.C = new q0(this, 5, false, true);
        this.D = new q0(this, 4, false, false);
        this.E = new q0(this, 3, false, false);
        this.F = new q0(this, 2, false, false);
    }

    public static r0 H(String str) {
        if (str == null) {
            return null;
        }
        return new r0(str);
    }

    public static String K(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String L = L(obj, z);
        String L2 = L(obj2, z);
        String L3 = L(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(L)) {
            sb.append(str2);
            sb.append(L);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(L2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(L2);
        }
        if (!TextUtils.isEmpty(L3)) {
            sb.append(str3);
            sb.append(L3);
        }
        return sb.toString();
    }

    public static String L(Object obj, boolean z) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(round2).length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof r0 ? ((r0) obj).a : z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = o1.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.measurement.internal.w1
    public final boolean A() {
        return false;
    }

    public final q0 D() {
        return this.x;
    }

    public final q0 E() {
        return this.A;
    }

    public final q0 F() {
        return this.E;
    }

    public final q0 G() {
        return this.F;
    }

    public final void I(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(J(), i)) {
            Log.println(i, J(), K(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        c21.uShadow.g(str);
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).x;
        if (m1Var == null) {
            Log.println(6, J(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!m1Var.t) {
                Log.println(6, J(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            m1Var.I(new p0(this, i, str, obj, obj2, obj3));
        }
    }

    public final String J() {
        String str;
        synchronized (this) {
            try {
                if (this.w == null) {
                    ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).u).s).getClass();
                    this.w = "FA";
                }
                c21.uShadow.g(this.w);
                str = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public s0(Object... a) {
    }
}
