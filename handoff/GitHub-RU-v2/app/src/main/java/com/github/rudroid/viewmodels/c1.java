package com.github.rudroid.viewmodels;

import java.util.ArrayList;
import java.util.List;
import le.v;

@c71.e(c = "com.github.rudroid.viewmodels.GlobalSearchViewModel$removeRecentSearch$1", f = "GlobalSearchViewModel.kt", l = {138, 139}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ g1 w;
    public final /* synthetic */ v.e x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(g1 g1Var, v.e eVar, a71.c cVar) {
        super(2, cVar);
        this.w = g1Var;
        this.x = eVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c1(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r10 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r10 == r0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        g1 g1Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            ck.b S = g1Var.S();
            String str = this.x.r;
            this.v = 1;
            S.getClass();
            ck.f fVar = (ck.f) S;
            Object M = m71.a.M(this, fVar.a, false, true, new ck.c(fVar, new ck.h(str), 0));
            if (M != aVar) {
                M = a0Var;
            }
            if (M != aVar) {
                M = a0Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                List list = (List) obj;
                if (list.isEmpty()) {
                    androidx.lifecycle.p0 p0Var = g1Var.x;
                    fl.e eVar = fl.f.Companion;
                    ArrayList X = g1.X(list);
                    eVar.getClass();
                    p0Var.k(fl.e.c(X));
                }
                return a0Var;
            }
            sy.y.j(obj);
        }
        ck.b S2 = g1Var.S();
        this.v = 2;
        obj = ((ck.f) S2).a(this);
    }
}
