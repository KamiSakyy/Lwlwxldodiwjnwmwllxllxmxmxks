package com.github.rudroid.viewmodels;

import com.github.rudroid.viewmodels.m8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

@c71.e(c = "com.github.rudroid.viewmodels.TriageLegacyProjectsViewModel$observeChannel$1", f = "TriageLegacyProjectsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class w8 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ m8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(m8 m8Var, a71.c cVar) {
        super(2, cVar);
        this.w = m8Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        w8 w8Var = new w8(this.w, cVar);
        w8Var.v = obj;
        return w8Var;
    }

    public final Object s(Object obj, Object obj2) {
        w8 r = r((a71.c) obj2, (String) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        LinkedHashSet linkedHashSet;
        String str = (String) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        if (t71.p.T(str)) {
            m8 m8Var = this.w;
            m8Var.H.clear();
            m8Var.I = str;
            m8.b bVar = m8Var.x;
            if (bVar instanceof m8.b.C0016b) {
                linkedHashSet = m8Var.G;
            } else {
                if (!(bVar instanceof m8.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedHashSet = m8Var.F;
            }
            if (linkedHashSet.isEmpty()) {
                m8Var.P();
            } else {
                androidx.lifecycle.p0 p0Var = m8Var.z;
                fl.e eVar = fl.f.Companion;
                ArrayList Q = m8Var.Q(false);
                eVar.getClass();
                p0Var.k(fl.e.c(Q));
            }
        }
        return w61.a0.a;
    }
}
