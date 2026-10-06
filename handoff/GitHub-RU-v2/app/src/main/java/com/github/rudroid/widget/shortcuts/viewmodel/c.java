package com.github.rudroid.widget.shortcuts.viewmodel;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.widget.shortcuts.r;
import sy.y;
import v71.z;
import w61.a0;
import y71.y1;

@c71.e(c = "com.github.rudroid.widget.shortcuts.viewmodel.ShortcutWidgetViewModel$1", f = "ShortcutWidgetViewModel.kt", l = {67}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ f w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, a71.c cVar) {
        super(2, cVar);
        this.w = fVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        f fVar = this.w;
        if (i == 0) {
            y.j(obj);
            com.github.rudroid.widget.shortcuts.g gVar = fVar.t;
            z5.k kVar = fVar.x;
            this.v = 1;
            obj = gVar.a(kVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        r rVar = (r) obj;
        if (rVar != null) {
            y1 y1Var = fVar.y;
            b a = b.a((b) y1Var.getValue(), rVar.a, rVar.b, g1.a.c(g1.Companion), rVar.c, 5);
            y1Var.getClass();
            y1Var.k((Object) null, a);
            fVar.R();
        }
        return a0.a;
    }
    public Object v(Object) { return null; }
}
