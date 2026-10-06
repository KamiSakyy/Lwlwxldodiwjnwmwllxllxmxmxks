package com.github.rudroid.shortcuts;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 extends androidx.compose.foundation.lazy.layout.s0 {
    public final /* synthetic */ d0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var) {
        super(7, x61.rShadow.r);
        this.t = d0Var;
    }

    public final void i(r71.e eVar, Object obj, Object obj2) {
        k71.k.g(eVar, "property");
        List list = (List) obj2;
        List list2 = (List) obj;
        boolean isEmpty = list2.isEmpty();
        d0 d0Var = this.t;
        if (!isEmpty && list.isEmpty()) {
            d0Var.s(0, list2.size());
            return;
        }
        if (list2.isEmpty() && !list.isEmpty()) {
            d0Var.r(0, list.size());
        } else {
            if (list2.isEmpty()) {
                return;
            }
            d0Var.n();
        }
    }
    public Object t(Object p1, Object p2) { return null; }
}
