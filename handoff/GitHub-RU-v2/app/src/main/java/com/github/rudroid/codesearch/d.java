package com.github.rudroid.codesearch;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import java.util.Collection;
import y71.y1;

@c71.e(c = "com.github.rudroid.codesearch.GlobalCodeSearchResultViewModel$search$1$2", f = "GlobalCodeSearchResultViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class d extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f8827v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f8828w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, boolean z10, a71.c cVar) {
        super(2, cVar);
        this.f8827v = gVar;
        this.f8828w = z10;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d(this.f8827v, this.f8828w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        d r10 = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        y1 y1Var = this.f8827v.f8841y;
        Collection collection = (Collection) ((g1) y1Var.getValue()).getData();
        if (collection == null || collection.isEmpty()) {
            w0.n(y1Var);
        } else if (this.f8828w) {
            w0.i(y1Var);
        } else {
            w0.g(y1Var);
        }
        return w61.a0.a;
    }
}
