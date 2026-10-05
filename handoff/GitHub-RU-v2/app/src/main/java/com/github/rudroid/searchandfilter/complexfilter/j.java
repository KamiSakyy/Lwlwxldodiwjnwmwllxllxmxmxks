package com.github.rudroid.searchandfilter.complexfilter;

import androidx.compose.foundation.lazy.layout.s0;
import androidx.lifecycle.p0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j extends s0 {
    public final /* synthetic */ b t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar) {
        super(7, "");
        this.t = bVar;
    }

    public final void i(r71.e eVar, Object obj, Object obj2) {
        k71.k.g(eVar, "property");
        b bVar = this.t;
        p0 p0Var = bVar.v;
        fl.f fVar = (fl.f) p0Var.d();
        if ((fVar != null ? fVar.a : null) == fl.g.s) {
            fl.e eVar2 = fl.f.Companion;
            List U = bVar.U();
            eVar2.getClass();
            p0Var.j(fl.e.c(U));
        }
    }
}
