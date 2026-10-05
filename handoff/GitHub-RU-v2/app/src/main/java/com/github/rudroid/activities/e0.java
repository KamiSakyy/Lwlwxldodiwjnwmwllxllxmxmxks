package com.github.rudroid.activities;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: /home/user/work/p/classes.dex */
public final class e0 {
    public static final d0 a(Context context) {
        k71.k.g(context, "<this>");
        Object obj = context;
        while (obj instanceof ContextWrapper) {
            if (obj instanceof d0) {
                return (d0) obj;
            }
            Context baseContext = ((ContextWrapper) obj).getBaseContext();
            k71.k.f(baseContext, "getBaseContext(...)");
            obj = baseContext;
        }
        return null;
    }
}
