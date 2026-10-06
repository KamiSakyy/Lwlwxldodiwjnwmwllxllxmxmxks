package com.github.rudroid.shortcuts;

import rm0.r3Shadow;

@c71.e(c = "com.github.rudroid.shortcuts.ShortcutViewModel$1", f = "ShortcutViewModel.kt", l = {36}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class t extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ tm.b w;
    public final /* synthetic */ w x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(tm.b bVar, w wVar, a71.c cVar) {
        super(2, cVar);
        this.w = bVar;
        this.x = wVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new t(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            w wVar = this.x;
            oa.j d = wVar.t.d();
            String str = wVar.u.a;
            tm.b bVar = this.w;
            bVar.getClass();
            k71.k.g(str, "id");
            r3Shadow b = bVar.a.b(d, str);
            s sVar = new s(wVar);
            this.v = 1;
            if (b.b(sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
