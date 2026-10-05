package com.github.rudroid.searchandfilter.complexfilter.repository;

import ic.xf;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x extends n1 {
    public final xf u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(xf xfVar, SelectableRepositoryFragment selectableRepositoryFragment) {
        super(((k5.f) xfVar).A);
        k71.k.g(selectableRepositoryFragment, "clickListener");
        this.u = xfVar;
        xfVar.P0(selectableRepositoryFragment);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class xf<T1,T2,T3,T4> {
        public xf() {
        }
    }
}
