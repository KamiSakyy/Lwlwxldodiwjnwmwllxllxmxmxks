package pl0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ri0.d5;
import ri0.e5;
import ri0.f5;
import ri0.r5;
import ri0.v4;
import ri0.w4;
import x61.rShadow;
import yz0.e2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public static ArrayList a(r5 r5Var, w4 w4Var, v4 v4Var) {
        e2 e2Var;
        Object obj;
        List<e5> list = w4Var != null ? w4Var.a : null;
        rShadow rVar = rShadow.r;
        if (list == null) {
            list = rVar;
        }
        ArrayList arrayList = new ArrayList();
        for (e5 e5Var : list) {
            wi0.l lVar = e5Var != null ? e5Var.c : null;
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
            arrayList2.add(c.e((wi0.l) obj2));
        }
        List<d5> list2 = r5Var != null ? r5Var.a : null;
        if (list2 == null) {
            list2 = rVar;
        }
        ArrayList arrayList3 = new ArrayList();
        for (d5 d5Var : list2) {
            uj0.d dVar = d5Var != null ? d5Var.c : null;
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
            uj0.d dVar2 = (uj0.d) obj3;
            uj0.c cVar = dVar2.d;
            boolean z = dVar2.c;
            if ((cVar != null ? cVar.c : null) != null) {
                e2Var = c.c(cVar.c, z);
            } else if ((cVar != null ? cVar.b : null) != null) {
                uj0.b bVar = cVar.b;
                List<f5> list3 = v4Var != null ? v4Var.a : null;
                if (list3 == null) {
                    list3 = rVar;
                }
                ArrayList arrayList5 = new ArrayList();
                for (f5 f5Var : list3) {
                    wi0.l lVar2 = f5Var != null ? f5Var.c : null;
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
                    wi0.g gVar = ((wi0.l) obj).d;
                    if (k71.k.b(gVar != null ? gVar.b : null, dVar2.d.b.c)) {
                        break;
                    }
                }
                e2Var = c.d(bVar, z, (wi0.l) obj);
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
