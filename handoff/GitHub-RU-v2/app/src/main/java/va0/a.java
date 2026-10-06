package va0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import x61.rShadow;
import yz0.e2;
import z70.e5;
import z70.k4;
import z70.l4;
import z70.q4;
import z70.r4;
import z70.s4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static ArrayList a(e5 e5Var, l4 l4Var, k4 k4Var) {
        e2 e2Var;
        Object obj;
        List<r4> list = l4Var != null ? l4Var.a : null;
        List list2 = rShadow.r;
        if (list == null) {
            list = list2;
        }
        ArrayList arrayList = new ArrayList();
        for (r4 r4Var : list) {
            e80.l lVar = r4Var != null ? r4Var.c : null;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(c.e((e80.l) obj2));
        }
        List<q4> list3 = e5Var != null ? e5Var.a : null;
        if (list3 == null) {
            list3 = list2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (q4 q4Var : list3) {
            c90.d dVar = q4Var != null ? q4Var.c : null;
            if (dVar != null) {
                arrayList3.add(dVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj3 = arrayList3.get(i2);
            i2++;
            c90.d dVar2 = (c90.d) obj3;
            c90.c cVar = dVar2.d;
            boolean z = dVar2.c;
            if ((cVar != null ? cVar.c : null) != null) {
                e2Var = c.c(cVar.c, z);
            } else if ((cVar != null ? cVar.b : null) != null) {
                c90.b bVar = cVar.b;
                List<s4> list4 = k4Var != null ? k4Var.a : null;
                if (list4 == null) {
                    list4 = list2;
                }
                ArrayList arrayList5 = new ArrayList();
                for (s4 s4Var : list4) {
                    e80.l lVar2 = s4Var != null ? s4Var.c : null;
                    if (lVar2 != null) {
                        arrayList5.add(lVar2);
                    }
                }
                int size3 = arrayList5.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = arrayList5.get(i3);
                    i3++;
                    e80.g gVar = ((e80.l) obj).d;
                    if (k71.k.b(gVar != null ? gVar.b : null, dVar2.d.b.c)) {
                        break;
                    }
                }
                e2Var = c.d(bVar, z, (e80.l) obj);
            } else {
                e2Var = null;
            }
            if (e2Var != null) {
                arrayList4.add(e2Var);
            }
        }
        ArrayList l0 = x61.m.l0(arrayList2, arrayList4);
        HashSet hashSet = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        int size4 = l0.size();
        int i4 = 0;
        while (i4 < size4) {
            Object obj4 = l0.get(i4);
            i4++;
            if (hashSet.add(((e2) obj4).a.x)) {
                arrayList6.add(obj4);
            }
        }
        return arrayList6;
    }
}
