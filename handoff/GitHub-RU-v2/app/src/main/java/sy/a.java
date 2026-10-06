package sy;

import gv.e5;
import gv.f5;
import gv.l5;
import gv.m5;
import gv.n5;
import gv.z5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import yz0.e2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static ArrayList a(z5 z5Var, f5 f5Var, e5 e5Var) {
        e2 e2Var;
        Object obj;
        Object obj2;
        List<m5> list = f5Var != null ? f5Var.a : null;
        List list2 = x61.r.r;
        if (list == null) {
            list = list2;
        }
        ArrayList arrayList = new ArrayList();
        for (m5 m5Var : list) {
            lv.m mVar = m5Var != null ? m5Var.c : null;
            if (mVar != null) {
                arrayList.add(mVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            arrayList2.add(c.h((lv.m) obj3));
        }
        List<l5> list3 = z5Var != null ? z5Var.a : null;
        if (list3 == null) {
            list3 = list2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (l5 l5Var : list3) {
            kw.e eVar = l5Var != null ? l5Var.c : null;
            if (eVar != null) {
                arrayList3.add(eVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj4 = arrayList3.get(i2);
            i2++;
            kw.e eVar2 = (kw.e) obj4;
            kw.d dVar = eVar2.d;
            boolean z = eVar2.c;
            if ((dVar != null ? dVar.c : null) != null) {
                e2Var = c.f(dVar.c, z);
            } else if ((dVar != null ? dVar.b : null) != null) {
                kw.c cVar = dVar.b;
                List<n5> list4 = e5Var != null ? e5Var.a : null;
                if (list4 == null) {
                    list4 = list2;
                }
                ArrayList arrayList5 = new ArrayList();
                for (n5 n5Var : list4) {
                    lv.m mVar2 = n5Var != null ? n5Var.c : null;
                    if (mVar2 != null) {
                        arrayList5.add(mVar2);
                    }
                }
                int size3 = arrayList5.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList5.get(i3);
                    i3++;
                    lv.g gVar = ((lv.m) obj2).d;
                    if (k71.k.b(gVar != null ? gVar.b : null, dVar.b.c)) {
                        break;
                    }
                }
                e2Var = c.g(cVar, z, (lv.m) obj2);
            } else if ((dVar != null ? dVar.d : null) != null) {
                kw.a aVar = dVar.d;
                List<n5> list5 = e5Var != null ? e5Var.a : null;
                if (list5 == null) {
                    list5 = list2;
                }
                ArrayList arrayList6 = new ArrayList();
                for (n5 n5Var2 : list5) {
                    lv.m mVar3 = n5Var2 != null ? n5Var2.c : null;
                    if (mVar3 != null) {
                        arrayList6.add(mVar3);
                    }
                }
                int size4 = arrayList6.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        obj = null;
                        break;
                    }
                    obj = arrayList6.get(i4);
                    i4++;
                    lv.g gVar2 = ((lv.m) obj).d;
                    if (k71.k.b(gVar2 != null ? gVar2.b : null, dVar.d.c)) {
                        break;
                    }
                }
                e2Var = c.e(aVar, z, (lv.m) obj);
            } else {
                e2Var = null;
            }
            if (e2Var != null) {
                arrayList4.add(e2Var);
            }
        }
        ArrayList l0 = x61.m.l0(arrayList2, arrayList4);
        HashSet hashSet = new HashSet();
        ArrayList arrayList7 = new ArrayList();
        int size5 = l0.size();
        int i5 = 0;
        while (i5 < size5) {
            Object obj5 = l0.get(i5);
            i5++;
            if (hashSet.add(((e2) obj5).a.x)) {
                arrayList7.add(obj5);
            }
        }
        return arrayList7;
    }
    public Object K(Object p1) { return null; }
    public static final Object b = null;
    public static final Object r = null;
    public static final Object s = null;
}
