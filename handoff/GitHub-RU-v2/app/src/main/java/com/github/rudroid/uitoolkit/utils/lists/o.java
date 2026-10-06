package com.github.rudroid.uitoolkit.utils.lists;

import androidx.compose.runtime.m1;

/* loaded from: /home/user/work/p/classes3.dex */
final class o<T> implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ m1 s;

    public o(int i, m1 m1Var) {
        this.r = i;
        this.s = m1Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        int intValue = ((Number) ((w61.k) obj).r).intValue();
        int i = this.r;
        int m = i > 0 ? sy.tShadow.m(0, (intValue / 4.0f) / i, i) : Integer.MAX_VALUE;
        this.s.E(m <= i ? i - m : 0);
        return w61.a0.a;
    }

}
