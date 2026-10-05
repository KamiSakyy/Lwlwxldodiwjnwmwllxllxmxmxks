package com.github.rudroid.codesearch;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class e<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f8830r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f8831s;

    public e(boolean z10, g gVar) {
        this.f8830r = z10;
        this.f8831s = gVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        List list;
        w61.k kVar = (w61.k) obj;
        g gVar = this.f8831s;
        y1 y1Var = gVar.f8841y;
        boolean z10 = this.f8830r;
        List list2 = x61.r.r;
        if (!z10 && (list = (List) ((g1) y1Var.getValue()).getData()) != null) {
            list2 = list;
        }
        Object obj2 = kVar.r;
        Object obj3 = kVar.s;
        gVar.f8840x = (x01.i) obj2;
        if (((List) obj3).isEmpty()) {
            w0.l(y1Var, list2);
        } else {
            w0.p(y1Var, x61.m.l0(list2, (Iterable) obj3));
        }
        return w61.a0.a;
    }
}
