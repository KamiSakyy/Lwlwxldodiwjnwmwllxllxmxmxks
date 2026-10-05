package com.github.rudroid.viewmodels;

import java.util.Iterator;
import java.util.LinkedHashSet;

@c71.e(c = "com.github.rudroid.viewmodels.TriageReviewersViewModel$saveReviewers$1$5", f = "TriageReviewersViewModel.kt", l = {196}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class da extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ t9 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(t9 t9Var, a71.c cVar) {
        super(2, cVar);
        this.w = t9Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new da(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (y71.j) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        boolean z;
        Object S;
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        this.v = 1;
        t9 t9Var = this.w;
        LinkedHashSet linkedHashSet = t9Var.D;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((yz0.e2) it.next()).a.u) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        LinkedHashSet linkedHashSet2 = t9Var.F;
        if (linkedHashSet2 == null || !linkedHashSet2.isEmpty()) {
            Iterator it2 = linkedHashSet2.iterator();
            while (it2.hasNext()) {
                if (((yz0.e2) it2.next()).a.u) {
                    break;
                }
            }
        }
        z2 = false;
        if (!z2 || z ? z2 || !z || (S = t9Var.S(this)) != b71.a.r : (S = t9Var.T(this)) != b71.a.r) {
            S = a0Var;
        }
        return S == aVar ? aVar : a0Var;
    }
}
