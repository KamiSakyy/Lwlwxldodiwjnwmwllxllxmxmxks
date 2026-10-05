package com.github.rudroid.shortcuts;

import y71.y1;

@c71.e(c = "com.github.rudroid.shortcuts.ShortcutViewModel$deleteShortcut$1", f = "ShortcutViewModel.kt", l = {46, 48}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class v extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w w;
    public final /* synthetic */ y1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, y1 y1Var, a71.c cVar) {
        super(2, cVar);
        this.w = wVar;
        this.x = y1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new v(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (((y71.i) r9).b(r1, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
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
            w wVar = this.w;
            tm.i iVar = wVar.s;
            oa.j d = wVar.t.d();
            String str = wVar.u.a;
            com.github.rudroid.favorites.viewmodels.d dVar = new com.github.rudroid.favorites.viewmodels.d(y1Var, 3);
            this.v = 1;
            obj = iVar.a(d, str, dVar, this);
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
        u uVar = new u(y1Var);
        this.v = 2;
    }
}
