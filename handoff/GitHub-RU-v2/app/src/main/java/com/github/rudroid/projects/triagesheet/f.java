package com.github.rudroid.projects.triagesheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import le.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {
    public static ArrayList a(List list) {
        k71.k.g(list, "selectableItems");
        m.d dVar = new m.d(2131954901);
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new m.f((d) it.next()));
        }
        return x61.m.l0(sy.d0Shadow.n(dVar), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static ArrayList b(List list) {
        Object n10;
        k71.k.g(list, "selectableItems");
        m.d dVar = new m.d(2131952995);
        if (list.isEmpty()) {
            n10 = sy.d0Shadow.n(new m.b());
        } else {
            n10 = new ArrayList(x61.n.F(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n10.add(new m.h((d) it.next()));
            }
        }
        return x61.m.l0(sy.d0Shadow.n(dVar), (Iterable) n10);
    }
}
