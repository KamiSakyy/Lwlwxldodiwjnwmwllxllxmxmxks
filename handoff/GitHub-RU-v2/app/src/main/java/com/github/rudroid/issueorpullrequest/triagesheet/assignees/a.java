package com.github.rudroid.issueorpullrequest.triagesheet.assignees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import le.b;
import sy.d0;
import sy.f0;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static y61.b a(Set set, Set set2, Set set3, boolean z10, boolean z11) {
        w61.k kVar;
        k71.k.g(set, "selectedList");
        k71.k.g(set2, "selectableList");
        k71.k.g(set3, "suggestedList");
        y61.b i = d0.i();
        if (!z10) {
            i.add(new b.e(2131952995));
            if (set.isEmpty()) {
                i.add(new b.c());
            } else {
                Set set4 = set;
                ArrayList arrayList = new ArrayList(x61.n.F(set4, 10));
                Iterator it = set4.iterator();
                while (it.hasNext()) {
                    arrayList.add(new b.g((yz0.f) it.next()));
                }
                i.addAll(arrayList);
            }
        }
        if (!z10) {
            set2 = set3;
        }
        Set l = f0.l(set2, set);
        if (z10) {
            kVar = new w61.k(x61.r.r, x61.m.F0(l));
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : l) {
                if (((yz0.f) obj).u()) {
                    arrayList2.add(obj);
                } else {
                    arrayList3.add(obj);
                }
            }
            kVar = new w61.k(arrayList2, arrayList3);
        }
        List list = (List) kVar.r;
        List list2 = (List) kVar.s;
        if (!list.isEmpty()) {
            i.add(new b.e(2131952024));
            ArrayList arrayList4 = new ArrayList(x61.n.F(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new b.f((yz0.f) it2.next()));
            }
            i.addAll(arrayList4);
        }
        if (!list2.isEmpty()) {
            i.add(new b.e(z10 ? 2131954897 : 2131954903));
            ArrayList arrayList5 = new ArrayList(x61.n.F(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new b.f((yz0.f) it3.next()));
            }
            i.addAll(arrayList5);
        }
        if (z11) {
            i.add(new b.d(5, 2131952992));
        }
        return d0.h(i);
    }
}
