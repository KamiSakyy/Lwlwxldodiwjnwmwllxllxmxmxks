package fk;

import bm.l;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import k81.q1;
import k81.u0;
import k81.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final b Companion = new b();

    public static ArrayList a(String str) {
        k.g(str, "serializedFilters");
        try {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            ArrayList a = d.a((List) bVar.a(str, new k81.d(new u0(new z("com.github.domain.searchandfilter.filters.data.Filter.FilterType", l.values()), m71.a.z(q1.a), 1), 0)));
            if (a.isEmpty()) {
                return null;
            }
            return a;
        } catch (Exception unused) {
            return null;
        }
    }
}
