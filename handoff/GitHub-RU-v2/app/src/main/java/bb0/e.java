package bb0;

import ea0.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k70.q;
import sy.u;
import sy.y;
import u10.af;
import u10.bf;
import u10.cf;
import u10.df;
import u10.ef;
import u10.ff;
import u10.ue;
import u10.we;
import u10.xe;
import u10.ye;
import u10.ze;
import w80.a2;
import x61.n;
import x61.rShadow;
import yz0.w1;
import z70.l2;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements w1 {
    public ue a;
    public ArrayList b;
    public int c;
    public ArrayList d;
    public int e;
    public ArrayList f;
    public int g;
    public ArrayList h;
    public int i;
    public ArrayList j;
    public int k;

    public e(ue ueVar) {
        ef efVar;
        cf cfVar;
        bf bfVar;
        df dfVar;
        ff ffVar;
        k71.k.g(ueVar, "data");
        this.a = ueVar;
        List list = ueVar.d.b;
        List<xe> list2 = r.r;
        list = list == null ? list2 : list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            c1 c1Var = null;
            if (!it.hasNext()) {
                break;
            }
            ye yeVar = (ye) it.next();
            if (yeVar != null && (ffVar = yeVar.b) != null) {
                c1Var = ffVar.c;
            }
            if (c1Var != null) {
                arrayList.add(c1Var);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(new d((c1) obj));
        }
        this.b = arrayList2;
        ue ueVar2 = this.a;
        this.c = ueVar2.d.a;
        List<we> list3 = ueVar2.b.b;
        list3 = list3 == null ? list2 : list3;
        ArrayList arrayList3 = new ArrayList();
        for (we weVar : list3) {
            l2 l2Var = (weVar == null || (dfVar = weVar.b) == null) ? null : dfVar.c;
            if (l2Var != null) {
                arrayList3.add(l2Var);
            }
        }
        ArrayList arrayList4 = new ArrayList(n.F(arrayList3, 10));
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            arrayList4.add(y.l((l2) obj2));
        }
        this.d = arrayList4;
        ue ueVar3 = this.a;
        this.e = ueVar3.b.a;
        List<af> list4 = ueVar3.a.b;
        list4 = list4 == null ? list2 : list4;
        ArrayList arrayList5 = new ArrayList();
        for (af afVar : list4) {
            w50.l lVar = (afVar == null || (bfVar = afVar.b) == null) ? null : bfVar.c;
            if (lVar != null) {
                arrayList5.add(lVar);
            }
        }
        ArrayList arrayList6 = new ArrayList(n.F(arrayList5, 10));
        int size3 = arrayList5.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList5.get(i4);
            i4++;
            arrayList6.add(sy.n.F((w50.l) obj3));
        }
        this.f = arrayList6;
        ue ueVar4 = this.a;
        this.g = ueVar4.a.a;
        List<ze> list5 = ueVar4.e.b;
        list5 = list5 == null ? list2 : list5;
        ArrayList arrayList7 = new ArrayList();
        for (ze zeVar : list5) {
            q qVar = (zeVar == null || (cfVar = zeVar.b) == null) ? null : cfVar.c;
            if (qVar != null) {
                arrayList7.add(qVar);
            }
        }
        ArrayList arrayList8 = new ArrayList(n.F(arrayList7, 10));
        int size4 = arrayList7.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList7.get(i5);
            i5++;
            arrayList8.add(u.m((q) obj4));
        }
        this.h = arrayList8;
        ue ueVar5 = this.a;
        this.i = ueVar5.e.a;
        List list6 = ueVar5.c.b;
        list2 = list6 != null ? list6 : list2;
        ArrayList arrayList9 = new ArrayList();
        for (xe xeVar : list2) {
            a2 a2Var = (xeVar == null || (efVar = xeVar.b) == null) ? null : efVar.c;
            if (a2Var != null) {
                arrayList9.add(a2Var);
            }
        }
        ArrayList arrayList10 = new ArrayList(n.F(arrayList9, 10));
        int size5 = arrayList9.size();
        while (i < size5) {
            Object obj5 = arrayList9.get(i);
            i++;
            arrayList10.add(new c((a2) obj5));
        }
        this.j = arrayList10;
        this.k = this.a.c.a;
    }

    public final int a() {
        return this.i;
    }

    public final ArrayList b() {
        return this.b;
    }

    public static final ArrayList c() {
        return this.j;
    }

    public final int d() {
        return this.e;
    }

    public final ArrayList e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(this.a, ((e) obj).a);
    }

    public final int f() {
        return this.g;
    }

    public final ArrayList g() {
        return this.f;
    }

    public final int h() {
        return this.k;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final ArrayList i() {
        return this.d;
    }

    public final boolean isEmpty() {
        return this.b.isEmpty() && this.d.isEmpty() && this.f.isEmpty() && this.h.isEmpty() && this.j.isEmpty();
    }

    public final int j() {
        return this.c;
    }

    public final List k() {
        return r.r;
    }

    public final String toString() {
        return "ApolloGlobalSearch(data=" + this.a + ")";
    }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
