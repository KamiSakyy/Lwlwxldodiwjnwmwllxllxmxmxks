package kx0;

import fw0.c1;
import java.util.ArrayList;
import java.util.List;
import jn0.kh;
import jn0.mh;
import jn0.oh;
import jn0.ph;
import jn0.qh;
import jn0.rh;
import jn0.sh;
import jn0.th;
import jn0.uh;
import jn0.vh;
import jn0.wh;
import jn0.xh;
import jn0.yh;
import kt0.q;
import ur0.o;
import uu0.k3;
import x61.n;
import x61.r;
import xt0.p2;
import yz0.t1;
import yz0.w1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements w1 {
    public final mh a;
    public final Object b;
    public final ArrayList c;
    public final int d;
    public final ArrayList e;
    public final int f;
    public final ArrayList g;
    public final int h;
    public final ArrayList i;
    public final int j;
    public final ArrayList k;
    public final int l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [x61.r] */
    public e(mh mhVar) {
        ArrayList arrayList;
        xh xhVar;
        vh vhVar;
        uh uhVar;
        wh whVar;
        yh yhVar;
        List<sh> list;
        k71.k.g(mhVar, "data");
        this.a = mhVar;
        kh khVar = mhVar.f;
        if (khVar == null || (list = khVar.a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (sh shVar : list) {
                t1 f = shVar != null ? y9.a.f(shVar.b) : null;
                if (f != null) {
                    arrayList.add(f);
                }
            }
        }
        List list2 = r.r;
        this.b = arrayList == null ? list2 : arrayList;
        List<qh> list3 = this.a.d.b;
        list3 = list3 == null ? list2 : list3;
        ArrayList arrayList2 = new ArrayList();
        for (qh qhVar : list3) {
            c1 c1Var = (qhVar == null || (yhVar = qhVar.b) == null) ? null : yhVar.c;
            if (c1Var != null) {
                arrayList2.add(c1Var);
            }
        }
        ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList3.add(new d((c1) obj));
        }
        this.c = arrayList3;
        mh mhVar2 = this.a;
        this.d = mhVar2.d.a;
        List<oh> list4 = mhVar2.b.b;
        list4 = list4 == null ? list2 : list4;
        ArrayList arrayList4 = new ArrayList();
        for (oh ohVar : list4) {
            p2 p2Var = (ohVar == null || (whVar = ohVar.b) == null) ? null : whVar.c;
            if (p2Var != null) {
                arrayList4.add(p2Var);
            }
        }
        ArrayList arrayList5 = new ArrayList(n.F(arrayList4, 10));
        int size2 = arrayList4.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList4.get(i3);
            i3++;
            arrayList5.add(k21.f.J((p2) obj2));
        }
        this.e = arrayList5;
        mh mhVar3 = this.a;
        this.f = mhVar3.b.a;
        List<th> list5 = mhVar3.a.b;
        list5 = list5 == null ? list2 : list5;
        ArrayList arrayList6 = new ArrayList();
        for (th thVar : list5) {
            o oVar = (thVar == null || (uhVar = thVar.b) == null) ? null : uhVar.c;
            if (oVar != null) {
                arrayList6.add(oVar);
            }
        }
        ArrayList arrayList7 = new ArrayList(n.F(arrayList6, 10));
        int size3 = arrayList6.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList6.get(i4);
            i4++;
            arrayList7.add(a.a.A((o) obj3));
        }
        this.g = arrayList7;
        mh mhVar4 = this.a;
        this.h = mhVar4.a.a;
        List<rh> list6 = mhVar4.e.b;
        list6 = list6 == null ? list2 : list6;
        ArrayList arrayList8 = new ArrayList();
        for (rh rhVar : list6) {
            q qVar = (rhVar == null || (vhVar = rhVar.b) == null) ? null : vhVar.c;
            if (qVar != null) {
                arrayList8.add(qVar);
            }
        }
        ArrayList arrayList9 = new ArrayList(n.F(arrayList8, 10));
        int size4 = arrayList8.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList8.get(i5);
            i5++;
            arrayList9.add(i21.a.J((q) obj4));
        }
        this.i = arrayList9;
        mh mhVar5 = this.a;
        this.j = mhVar5.e.a;
        List list7 = mhVar5.c.b;
        List<ph> list8 = list7 != null ? list7 : list2;
        ArrayList arrayList10 = new ArrayList();
        for (ph phVar : list8) {
            k3 k3Var = (phVar == null || (xhVar = phVar.b) == null) ? null : xhVar.c;
            if (k3Var != null) {
                arrayList10.add(k3Var);
            }
        }
        ArrayList arrayList11 = new ArrayList(n.F(arrayList10, 10));
        int size5 = arrayList10.size();
        while (i < size5) {
            Object obj5 = arrayList10.get(i);
            i++;
            arrayList11.add(new c((k3) obj5));
        }
        this.k = arrayList11;
        this.l = this.a.c.a;
    }

    @Override // yz0.w1
    public final int a() {
        return this.j;
    }

    @Override // yz0.w1
    public final ArrayList b() {
        return this.c;
    }

    @Override // yz0.w1
    public final ArrayList c() {
        return this.k;
    }

    @Override // yz0.w1
    public final int d() {
        return this.f;
    }

    @Override // yz0.w1
    public final ArrayList e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(this.a, ((e) obj).a);
    }

    @Override // yz0.w1
    public final int f() {
        return this.h;
    }

    @Override // yz0.w1
    public final ArrayList g() {
        return this.g;
    }

    @Override // yz0.w1
    public final int h() {
        return this.l;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // yz0.w1
    public final ArrayList i() {
        return this.e;
    }

    @Override // yz0.w1
    public final boolean isEmpty() {
        return this.c.isEmpty() && this.e.isEmpty() && this.g.isEmpty() && this.i.isEmpty() && this.k.isEmpty();
    }

    @Override // yz0.w1
    public final int j() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // yz0.w1
    public final List k() {
        return this.b;
    }

    public final String toString() {
        return "ApolloGlobalSearch(data=" + this.a + ")";
    }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
