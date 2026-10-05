package com.github.rudroid.settings.applock;

import a0.s0;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.d1;
import l7.x1;
import y71.h1;
import y71.m1;
import y71.n1;
import y71.q1;
import y71.s1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public static final a Companion = new a();

    public static final class a {
    }

    public static final x1 a(v vVar, Context context, int i) {
        String string = context.getString(2131951791);
        String string2 = context.getString(i);
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!t.e.m(33023)) {
            throw new IllegalArgumentException(s0.l(new StringBuilder("Authenticator combination is unsupported on API "), Build.VERSION.SDK_INT, ": BIOMETRIC_WEAK | DEVICE_CREDENTIAL"));
        }
        boolean l = t.e.l(33023);
        if (TextUtils.isEmpty(null) && !l) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty(null) || !l) {
            return new x1(string, string2);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    public static yf.e b(Context context) {
        int j = new l51.h(new a7.d(context, 8)).j(33023);
        return j != 0 ? j != 11 ? j != 12 ? yf.e.r : yf.e.s : yf.e.t : yf.e.u;
    }

    public static boolean c(Context context) {
        return new l51.h(new a7.d(context, 8)).j(255) == 0;
    }

    public static h1 d(v vVar, k.i iVar) {
        y71.c h = n1.h(new z(iVar, vVar, c(iVar) ? 2131951790 : 2131951797, null));
        androidx.lifecycle.x i = d1.i(iVar);
        y11.l n = n1.n(h, 0);
        m1 a2 = n1.a(0, n.a, (x71.a) n.c);
        a71.h hVar = (a71.h) n.d;
        y71.i iVar2 = (y71.i) n.b;
        a81.t tVar = n1.a;
        s1 s1Var = q1.a;
        s1 s1Var2 = q1.b;
        v71.b0.y(i, hVar, s1Var2.equals(s1Var) ? v71.a0.r : v71.a0.u, new m7.x(s1Var2, iVar2, a2, tVar, (a71.c) null));
        return new h1(a2);
    }

}
