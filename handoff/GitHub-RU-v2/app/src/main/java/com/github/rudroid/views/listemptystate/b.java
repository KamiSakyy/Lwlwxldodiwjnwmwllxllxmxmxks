package com.github.rudroid.views.listemptystate;

import android.content.Context;
import k71.k;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public static final String a(a aVar, Context context) {
        k.g(aVar, "<this>");
        if (aVar instanceof h) {
            String string = context.getString(((h) aVar).a);
            k.f(string, "getString(...)");
            return string;
        }
        if (aVar instanceof i) {
            return ((i) aVar).a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
