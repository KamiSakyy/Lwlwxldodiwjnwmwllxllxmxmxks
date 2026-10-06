package com.github.rudroid.projects.triagesheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {
    public static final ArrayList a(List list, List list2) {
        k71.k.g(list, "<this>");
        k71.k.g(list2, "that");
        ArrayList arrayList = new ArrayList(x61.n.F(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).h());
        }
        Set K0 = x61.m.K0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!K0.contains(((d) obj).h())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l01.w0 w0Var = (l01.w0) it.next();
            arrayList.add(new l(w0Var, w0Var.t, w0Var.r, w0Var.u, w0Var.v, w0Var.w));
        }
        return arrayList;
    }
    public static Object a(Object p1, Object p2, Object p3) { return null; }
}
