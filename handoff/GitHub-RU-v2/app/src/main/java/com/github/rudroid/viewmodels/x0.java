package com.github.rudroid.viewmodels;

import com.github.domain.database.GitHubDatabase;
import java.util.ArrayList;
import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.GlobalSearchViewModel$1", f = "GlobalSearchViewModel.kt", l = {67, 68, 71}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class x0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ g1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(g1 g1Var, a71.c cVar) {
        super(2, cVar);
        this.w = g1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new x0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r8 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (r8 == r0) goto L25;
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
            y00.l lVar = g1Var.u.b;
            this.v = 1;
            obj = y71.n1.v(lVar, this);
        } else if (i == 1) {
            sy.y.j(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                androidx.lifecycle.p0 p0Var = g1Var.x;
                fl.e eVar = fl.f.Companion;
                ArrayList X = g1.X((List) obj);
                eVar.getClass();
                p0Var.k(fl.e.c(X));
                return a0Var;
            }
            sy.y.j(obj);
            ck.b S = g1Var.S();
            this.v = 3;
            obj = ((ck.f) S).a(this);
        }
        oa.j jVar = (oa.j) obj;
        if (jVar != null) {
            ck.b D = ((GitHubDatabase) g1Var.t.a(jVar)).D();
            this.v = 2;
            Object M = m71.a.M(this, ((ck.f) D).a, false, true, new cd0.a(20));
            if (M != aVar) {
                M = a0Var;
            }
        }
        ck.b S2 = g1Var.S();
        this.v = 3;
        obj = ((ck.f) S2).a(this);
    }
}
