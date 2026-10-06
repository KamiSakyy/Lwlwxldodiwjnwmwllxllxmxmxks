package com.github.rudroid.shortcuts;

import java.util.List;
import y71.y1;

@c71.e(c = "com.github.rudroid.shortcuts.ShortcutsOverviewViewModel$saveShortcutsConfiguration$1", f = "ShortcutsOverviewViewModel.kt", l = {103, 105}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class m0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ n0 w;
    public final /* synthetic */ y1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, y1 y1Var, a71.c cVar) {
        super(2, cVar);
        this.w = n0Var;
        this.x = y1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new m0(this.w, this.x, cVar);
    }

    public static final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (((y71.i) r9).b(r1, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r9 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        y1 y1Var = this.x;
        if (i == 0) {
            sy.y.j(obj);
            n0 n0Var = this.w;
            tm.k kVar = n0Var.x;
            oa.j d = n0Var.y.d();
            List list = (List) n0Var.z.getValue();
            com.github.rudroid.favorites.viewmodels.d dVar = new com.github.rudroid.favorites.viewmodels.d(y1Var, 4);
            this.v = 1;
            obj = kVar.a(d, list, dVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
        }
        l0 l0Var = new l0(y1Var);
        this.v = 2;
    }
}
