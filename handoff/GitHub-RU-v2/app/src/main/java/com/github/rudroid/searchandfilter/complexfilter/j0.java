package com.github.rudroid.searchandfilter.complexfilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0<T> extends h0<T> {
    @Override // com.github.rudroid.searchandfilter.complexfilter.h0
    public final ArrayList c(List list, List list2) {
        T t;
        k71.k.g(list, "items");
        k71.k.g(list2, "replacements");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        for (T t2 : list) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((Boolean) this.a.s(t2, t)).booleanValue()) {
                    break;
                }
            }
            if (t != null) {
                t2 = t;
            }
            arrayList.add(t2);
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(new w61.k(obj, Boolean.valueOf(b(obj))));
        }
        return arrayList2;
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
        if (!z) {
            linkedHashSet.clear();
            linkedHashSet.add(obj);
        }
        List F0 = x61.m.F0(linkedHashSet);
        y1 y1Var = this.b;
        y1Var.getClass();
        y1Var.k((Object) null, F0);
    }
}
