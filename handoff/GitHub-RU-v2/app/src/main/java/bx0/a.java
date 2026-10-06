package bx0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import x61.rShadow;
import xt0.b5;
import xt0.c5;
import xt0.d5;
import xt0.n5;
import xt0.u4;
import xt0.v4;
import yz0.e2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public static ArrayList a(n5 n5Var, v4 v4Var, u4 u4Var) {
        e2 e2Var;
        Object obj;
        List<c5> list = v4Var != null ? v4Var.a : null;
        rShadow rVar = rShadow.r;
        if (list == null) {
            list = rVar;
        }
        ArrayList arrayList = new ArrayList();
        for (c5 c5Var : list) {
            cu0.l lVar = c5Var != null ? c5Var.c : null;
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
            arrayList2.add(c.g((cu0.l) obj2));
        }
        List<b5> list2 = n5Var != null ? n5Var.a : null;
        if (list2 == null) {
            list2 = rVar;
        }
        ArrayList arrayList3 = new ArrayList();
        for (b5 b5Var : list2) {
            bv0.d dVar = b5Var != null ? b5Var.c : null;
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
            bv0.d dVar2 = (bv0.d) obj3;
            bv0.c cVar = dVar2.d;
            boolean z = dVar2.c;
            if ((cVar != null ? cVar.c : null) != null) {
                e2Var = c.e(cVar.c, z);
            } else if ((cVar != null ? cVar.b : null) != null) {
                bv0.b bVar = cVar.b;
                List<d5> list3 = u4Var != null ? u4Var.a : null;
                if (list3 == null) {
                    list3 = rVar;
                }
                ArrayList arrayList5 = new ArrayList();
                for (d5 d5Var : list3) {
                    cu0.l lVar2 = d5Var != null ? d5Var.c : null;
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
                    cu0.g gVar = ((cu0.l) obj).d;
                    if (k71.k.b(gVar != null ? gVar.b : null, dVar2.d.b.c)) {
                        break;
                    }
                }
                e2Var = c.f(bVar, z, (cu0.l) obj);
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
