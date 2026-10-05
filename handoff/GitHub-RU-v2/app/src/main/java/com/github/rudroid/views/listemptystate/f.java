package com.github.rudroid.views.listemptystate;

import androidx.compose.foundation.lazy.layout.s0;
import com.github.rudroid.views.listemptystate.e;
import k71.k;
import l7.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends s0 {
    public final /* synthetic */ e t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Object obj, e eVar) {
        super(7, obj);
        this.t = eVar;
    }

    public final void i(r71.e eVar, Object obj, Object obj2) {
        k.g(eVar, "property");
        e.d dVar = (e.d) obj;
        boolean z = ((e.d) obj2) instanceof e.b;
        if (z && (dVar instanceof e.b)) {
            return;
        }
        e eVar2 = this.t;
        if (z) {
            eVar2.t(0);
        } else if (!(dVar instanceof e.b) || z) {
            eVar2.o(0);
        } else {
            ((m0) eVar2).a.e(0, 1);
        }
    }
}
