package com.github.rudroid.actions.checkdetail;

import android.content.Context;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static final String a(mn.a aVar, Context context) {
        String str;
        k71.k.g(aVar, "<this>");
        k71.k.g(context, "context");
        return (!x61.l.j0(new mn.k[]{mn.k.r, mn.k.u}).contains(aVar.a) || (str = aVar.j) == null) ? c1.a(new w61.k(aVar.e, aVar.f), context, aVar.i, k71.k.b(aVar.n, Boolean.TRUE)) : str;
    }

    public static final String b(mn.a aVar, Context context) {
        k71.k.g(aVar, "<this>");
        String str = aVar.d;
        String str2 = aVar.h;
        if (str2 == null || !(!t71.p.T(str2))) {
            return str;
        }
        String string = context.getString(2131954770, str2, str);
        k71.k.d(string);
        return string;
    }
}
