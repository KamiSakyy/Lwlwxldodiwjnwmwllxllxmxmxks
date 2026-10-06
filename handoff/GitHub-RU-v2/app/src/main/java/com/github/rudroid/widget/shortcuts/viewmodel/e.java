package com.github.rudroid.widget.shortcuts.viewmodel;

import sy.y;
import um.r;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.widget.shortcuts.viewmodel.ShortcutWidgetViewModel$updateShortcuts$1", f = "ShortcutWidgetViewModel.kt", l = {119}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
class e extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ f w;
    public final /* synthetic */ oa.j x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, oa.j jVar, a71.c cVar) {
        super(2, cVar);
        this.w = fVar;
        this.x = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new e(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        a0 a0Var = a0.a;
        if (i == 0) {
            y.j(obj);
            f fVar = this.w;
            tm.c cVar = fVar.u;
            cVar.getClass();
            oa.j jVar = this.x;
            k71.k.g(jVar, "user");
            r rVar = cVar.a;
            rVar.getClass();
            c00.g b = rVar.a.b(jVar);
            d dVar = new d(fVar, jVar);
            this.v = 1;
            Object b2 = b.b(new um.h(dVar, rVar, 1), this);
            if (b2 != b71.a.r) {
                b2 = a0Var;
            }
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return a0Var;
    }
    public static Object c(Object p1, Object p2, Object p3) { return null; }
}
