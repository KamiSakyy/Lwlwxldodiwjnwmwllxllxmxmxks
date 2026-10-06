package com.github.rudroid.feed.filter;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import java.util.ArrayList;
import java.util.Set;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class s<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f12613r;

    public s(z zVar) {
        this.f12613r = zVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        y1 y1Var = this.f12613r.f12625w;
        g1.a aVar = g1.Companion;
        ArrayList arrayList = new ArrayList();
        for (T t10 : (Set) obj) {
            if (!sy.pShadow.o(((t10.f) t10).b)) {
                arrayList.add(t10);
            }
        }
        Set K0 = x61.m.K0(arrayList);
        aVar.getClass();
        t1 t1Var = new t1(K0);
        y1Var.getClass();
        y1Var.k((Object) null, t1Var);
        return w61.a0.a;
    }
}
