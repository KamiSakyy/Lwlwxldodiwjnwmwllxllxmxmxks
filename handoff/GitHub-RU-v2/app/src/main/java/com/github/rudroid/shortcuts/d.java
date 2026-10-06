package com.github.rudroid.shortcuts;

import rm0.r3Shadow;
import y71.n1Shadow;

@c71.e(c = "com.github.rudroid.shortcuts.ConfigureShortcutViewModel$1", f = "ConfigureShortcutViewModel.kt", l = {131}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ e w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, a71.c cVar) {
        super(2, cVar);
        this.w = eVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            e eVar = this.w;
            r3Shadow l = n1Shadow.l(eVar.A, eVar.D, eVar.B, new b(4, null));
            c cVar = new c(eVar);
            this.v = 1;
            if (l.b(cVar, this) == aVar) {
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
