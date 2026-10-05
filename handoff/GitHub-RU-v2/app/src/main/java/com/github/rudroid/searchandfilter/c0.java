package com.github.rudroid.searchandfilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public static final ArrayList a(List list, List list2) {
        k71.k.g(list, "<this>");
        k71.k.g(list2, "storedFilters");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            com.github.domain.searchandfilter.filters.data.d dVar = (com.github.domain.searchandfilter.filters.data.d) it.next();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                if (k71.k.b(((com.github.domain.searchandfilter.filters.data.d) obj).s, dVar.s)) {
                    break;
                }
                i++;
            }
            if (i > -1) {
                arrayList.set(i, dVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((com.github.domain.searchandfilter.filters.data.d) obj2).r == bm.l.T) {
                arrayList2.add(obj2);
            }
        }
        return x61.m.l0(arrayList2, arrayList);
    }
}
