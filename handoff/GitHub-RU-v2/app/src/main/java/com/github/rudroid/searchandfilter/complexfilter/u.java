package com.github.rudroid.searchandfilter.complexfilter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u<T> extends h0<T> {
    public Object e;

    public u(j71.e eVar, Object obj) {
        super(eVar);
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
        this.d = list;
        LinkedHashSet linkedHashSet = this.c;
        linkedHashSet.clear();
        linkedHashSet.addAll(list);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.h0
    public final void e(Object obj, boolean z) {
        LinkedHashSet linkedHashSet = this.c;
        if (z) {
            linkedHashSet.removeIf(new g0(new com.github.rudroid.repositories.repositoryownerrepositories.d(4, this, obj)));
        } else {
            Object obj2 = this.e;
            if (k71.k.b(obj, obj2)) {
                linkedHashSet.clear();
            } else {
                linkedHashSet.removeIf(new g0(new com.github.rudroid.repositories.repositoryownerrepositories.d(4, this, obj2)));
            }
            linkedHashSet.add(obj);
        }
        List F0 = x61.m.F0(linkedHashSet);
        y1 y1Var = this.b;
        y1Var.getClass();
        y1Var.k((Object) null, F0);
    }
}
