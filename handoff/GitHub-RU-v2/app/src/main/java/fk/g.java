package fk;

import bm.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import k81.q1;
import k81.u0;
import k81.z;
import x61.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static String a(List list) {
        k.g(list, "filters");
        l81.b bVar = l81.c.d;
        ArrayList arrayList = new ArrayList(n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.github.domain.searchandfilter.filters.data.d dVar = (com.github.domain.searchandfilter.filters.data.d) it.next();
            arrayList.add(new w61.k(dVar.r, dVar.o()));
        }
        bVar.getClass();
        return bVar.b(new k81.d(new u0(new z("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values()), m71.a.z(q1.a), 1), 0), arrayList);
    }
}
