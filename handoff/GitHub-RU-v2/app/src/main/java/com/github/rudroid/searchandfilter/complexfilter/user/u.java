package com.github.rudroid.searchandfilter.complexfilter.user;

import com.github.rudroid.searchandfilter.complexfilter.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public static final ArrayList a(h0 h0Var, Object obj, List list, List list2, List list3) {
        Object obj2;
        k71.k.g(list, "preSelectedItems");
        k71.k.g(list2, "items");
        k71.k.g(list3, "replacements");
        List n = d0.n(obj);
        j71.e eVar = h0Var.a;
        ArrayList c = c(list, list2, eVar);
        ArrayList arrayList = new ArrayList();
        int size = c.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = c.get(i2);
            i2++;
            if (!k71.k.b(obj3, obj)) {
                arrayList.add(obj3);
            }
        }
        ArrayList l0 = x61.m.l0(n, arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list2) {
            if (!h0Var.a(obj4)) {
                arrayList2.add(obj4);
            }
        }
        ArrayList l02 = x61.m.l0(l0, arrayList2);
        ArrayList arrayList3 = new ArrayList(x61.n.F(l02, 10));
        int size2 = l02.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj5 = l02.get(i3);
            i3++;
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((Boolean) eVar.s(obj5, obj2)).booleanValue()) {
                    break;
                }
            }
            if (obj2 != null) {
                obj5 = obj2;
            }
            arrayList3.add(obj5);
        }
        ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj6 = arrayList3.get(i);
            i++;
            arrayList4.add(new w61.k(obj6, Boolean.valueOf(h0Var.b(obj6))));
        }
        return arrayList4;
    }

    public static final ArrayList b(h0 h0Var, List list, List list2, List list3) {
        Object obj;
        k71.k.g(list, "preSelectedItems");
        k71.k.g(list2, "items");
        k71.k.g(list3, "replacements");
        j71.e eVar = h0Var.a;
        ArrayList c = c(list, list2, eVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (!h0Var.a(obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList l0 = x61.m.l0(c, arrayList);
        ArrayList arrayList2 = new ArrayList(x61.n.F(l0, 10));
        int size = l0.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = l0.get(i2);
            i2++;
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Boolean) eVar.s(obj3, obj)).booleanValue()) {
                    break;
                }
            }
            if (obj != null) {
                obj3 = obj;
            }
            arrayList2.add(obj3);
        }
        ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj4 = arrayList2.get(i);
            i++;
            arrayList3.add(new w61.k(obj4, Boolean.valueOf(h0Var.b(obj4))));
        }
        return arrayList3;
    }

    public static final ArrayList c(List list, List list2, j71.e eVar) {
        Object obj;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        for (Object obj2 : list) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Boolean) eVar.s(obj, obj2)).booleanValue()) {
                    break;
                }
            }
            if (obj != null) {
                obj2 = obj;
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }
}
