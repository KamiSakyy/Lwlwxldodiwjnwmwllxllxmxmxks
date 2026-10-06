package com.github.rudroid.searchandfilter.complexfilter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0<T> extends h0<T> {
    public Object e;

    public k0(Object obj, com.github.rudroid.profile.ui.hShadow hVar) {
        super(hVar);
        this.e = obj;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.h0
    public final ArrayList c(List list, List list2) {
        k71.k.g(list, "items");
        k71.k.g(list2, "replacements");
        return com.github.rudroid.searchandfilter.complexfilter.user.u.a(this, this.e, this.d, list, list2);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.h0
    public final void d(List list) {
        k71.k.g(list, "items");
        LinkedHashSet linkedHashSet = this.c;
        linkedHashSet.clear();
        Object W = x61.m.W(list);
        if (W != null) {
            this.d = list;
            linkedHashSet.add(W);
        }
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.h0
    public final void e(Object obj, boolean z) {
        LinkedHashSet linkedHashSet = this.c;
        if (z && b(obj)) {
            linkedHashSet.clear();
        } else if (!z) {
            linkedHashSet.clear();
            linkedHashSet.add(obj);
        }
        List F0 = x61.m.F0(linkedHashSet);
        y1 y1Var = this.b;
        y1Var.getClass();
        y1Var.k((Object) null, F0);
    }
}
