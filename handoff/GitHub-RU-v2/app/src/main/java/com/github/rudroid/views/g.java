package com.github.rudroid.views;

import androidx.compose.foundation.lazy.layout.s0;
import l7.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g extends s0 {
    public final /* synthetic */ i t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fl.f fVar, i iVar) {
        super(7, fVar);
        this.t = iVar;
    }

    public final void i(r71.e eVar, Object obj, Object obj2) {
        k71.k.g(eVar, "property");
        boolean F = i.F((fl.f) obj);
        boolean F2 = i.F((fl.f) obj2);
        i iVar = this.t;
        if (F && !F2) {
            iVar.t(0);
        } else {
            if (F || !F2) {
                return;
            }
            ((m0) iVar).a.e(0, 1);
        }
    }
    public Object ordinal() { return null; }
    public Object t(Object p1, Object p2) { return null; }
}
