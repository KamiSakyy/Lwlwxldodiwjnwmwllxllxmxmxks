package com.github.rudroid.viewmodels;

import com.github.rudroid.viewmodels.t9;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

@c71.e(c = "com.github.rudroid.viewmodels.TriageReviewersViewModel$observeChannel$1", f = "TriageReviewersViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class ba extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ t9 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(t9 t9Var, a71.c cVar) {
        super(2, cVar);
        this.w = t9Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        ba baVar = new ba(this.w, cVar);
        baVar.v = obj;
        return baVar;
    }

    public final Object s(Object obj, Object obj2) {
        ba r = r((a71.c) obj2, (w61.k) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        LinkedHashSet linkedHashSet;
        w61.k kVar = (w61.k) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        String str = (String) kVar.r;
        t9.b bVar = (t9.b) kVar.s;
        if (t71.p.T(str)) {
            t9 t9Var = this.w;
            t9Var.I.clear();
            t9Var.J = str;
            if (bVar instanceof t9.b.C0017b) {
                linkedHashSet = t9Var.G;
            } else {
                if (!(bVar instanceof t9.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedHashSet = t9Var.H;
            }
            if (linkedHashSet.isEmpty()) {
                t9Var.P();
            } else {
                androidx.lifecycle.p0 p0Var = t9Var.z;
                fl.e eVar = fl.f.Companion;
                ArrayList Q = t9Var.Q(false);
                eVar.getClass();
                p0Var.k(fl.e.c(Q));
            }
        }
        return w61.a0.a;
    }
}
