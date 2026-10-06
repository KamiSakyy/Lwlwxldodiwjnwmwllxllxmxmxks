package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n0 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final e1 a;

    public n0(e1 e1Var) {
        this.a = e1Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        c21.u.g(atomicReference);
        c21.u.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : g(str, c2.c, c2.a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : g(str, c2.f, c2.e, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : str.startsWith("_exp_") ? f1.e.z("experiment_id(", str, ")") : g(str, c2.j, c2.i, d);
    }

    public final String d(w wVar) {
        e1 e1Var = this.a;
        if (!e1Var.a()) {
            return wVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(wVar.t);
        sb.append(",name=");
        sb.append(a(wVar.r));
        sb.append(",params=");
        v vVar = wVar.s;
        sb.append(vVar == null ? null : !e1Var.a() ? vVar.r.toString() : e(vVar.C()));
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder p = f1.e.p("Bundle[{");
        for (String str : bundle.keySet()) {
            if (p.length() != 8) {
                p.append(", ");
            }
            p.append(b(str));
            p.append("=");
            Object obj = bundle.get(str);
            p.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        p.append("}]");
        return p.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder p = f1.e.p("[");
        for (Object obj : objArr) {
            String e = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e != null) {
                if (p.length() != 1) {
                    p.append(", ");
                }
                p.append(e);
            }
        }
        p.append("]");
        return p.toString();
    }
}
