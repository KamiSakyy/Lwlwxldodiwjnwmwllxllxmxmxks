package com.github.rudroid.uitoolkit.tooltip;

import c71.j;
import f0.j1;
import f1.ic;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.uitoolkit.tooltip.PrimaryTooltipBoxKt$PrimaryTooltipBox$7$1", f = "PrimaryTooltipBox.kt", l = {107}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d extends j implements j71.e {
    public int v;
    public final /* synthetic */ ic w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ic icVar, a71.c cVar) {
        super(2, cVar);
        this.w = icVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            y.j(obj);
            this.v = 1;
            if (this.w.c(j1.r, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return a0.a;
    }
}
