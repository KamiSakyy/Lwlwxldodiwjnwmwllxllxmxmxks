package fz;

import ct.u;
import dw.m3;
import gv.z2;
import java.util.ArrayList;
import java.util.List;
import jo.hi;
import jo.ji;
import jo.li;
import jo.mi;
import jo.ni;
import jo.oi;
import jo.pi;
import jo.qi;
import jo.ri;
import jo.si;
import jo.ti;
import jo.ui;
import jo.vi;
import m7.y;
import qx.c1;
import tu.s;
import x61.n;
import x61.r;
import yz0.t1;
import yz0.w1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements w1 {
    public final ji a;
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

    public e(ji jiVar) {
        r rVar;
        ui uiVar;
        si siVar;
        ri riVar;
        ti tiVar;
        vi viVar;
        List<pi> list;
        k71.k.g(jiVar, "data");
        this.a = jiVar;
        hi hiVar = jiVar.f;
        if (hiVar == null || (list = hiVar.a) == null) {
            rVar = null;
        } else {
            rVar = new ArrayList();
            for (pi piVar : list) {
                t1 k = piVar != null ? b41.b.k(piVar.b) : null;
                if (k != null) {
                    rVar.add(k);
                }
            }
        }
        r<mi> rVar2 = r.r;
        this.b = rVar == null ? rVar2 : rVar;
        r<ni> rVar3 = this.a.d.b;
        rVar3 = rVar3 == null ? rVar2 : rVar3;
        ArrayList arrayList = new ArrayList();
        for (ni niVar : rVar3) {
            c1 c1Var = (niVar == null || (viVar = niVar.b) == null) ? null : viVar.c;
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
        this.c = arrayList2;
        ji jiVar2 = this.a;
        this.d = jiVar2.d.a;
        r<li> rVar4 = jiVar2.b.b;
        rVar4 = rVar4 == null ? rVar2 : rVar4;
        ArrayList arrayList3 = new ArrayList();
        for (li liVar : rVar4) {
            z2 z2Var = (liVar == null || (tiVar = liVar.b) == null) ? null : tiVar.c;
            if (z2Var != null) {
                arrayList3.add(z2Var);
            }
        }
        ArrayList arrayList4 = new ArrayList(n.F(arrayList3, 10));
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            arrayList4.add(m71.a.h0((z2) obj2));
        }
        this.e = arrayList4;
        ji jiVar3 = this.a;
        this.f = jiVar3.b.a;
        r<qi> rVar5 = jiVar3.a.b;
        rVar5 = rVar5 == null ? rVar2 : rVar5;
        ArrayList arrayList5 = new ArrayList();
        for (qi qiVar : rVar5) {
            u uVar = (qiVar == null || (riVar = qiVar.b) == null) ? null : riVar.c;
            if (uVar != null) {
                arrayList5.add(uVar);
            }
        }
        ArrayList arrayList6 = new ArrayList(n.F(arrayList5, 10));
        int size3 = arrayList5.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList5.get(i4);
            i4++;
            arrayList6.add(b91.g.W((u) obj3));
        }
        this.g = arrayList6;
        ji jiVar4 = this.a;
        this.h = jiVar4.a.a;
        r<oi> rVar6 = jiVar4.e.b;
        rVar6 = rVar6 == null ? rVar2 : rVar6;
        ArrayList arrayList7 = new ArrayList();
        for (oi oiVar : rVar6) {
            s sVar = (oiVar == null || (siVar = oiVar.b) == null) ? null : siVar.c;
            if (sVar != null) {
                arrayList7.add(sVar);
            }
        }
        ArrayList arrayList8 = new ArrayList(n.F(arrayList7, 10));
        int size4 = arrayList7.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList7.get(i5);
            i5++;
            arrayList8.add(y.O((s) obj4));
        }
        this.i = arrayList8;
        ji jiVar5 = this.a;
        this.j = jiVar5.e.a;
        r rVar7 = jiVar5.c.b;
        rVar2 = rVar7 != null ? rVar7 : rVar2;
        ArrayList arrayList9 = new ArrayList();
        for (mi miVar : rVar2) {
            m3 m3Var = (miVar == null || (uiVar = miVar.b) == null) ? null : uiVar.c;
            if (m3Var != null) {
                arrayList9.add(m3Var);
            }
        }
        ArrayList arrayList10 = new ArrayList(n.F(arrayList9, 10));
        int size5 = arrayList9.size();
        while (i < size5) {
            Object obj5 = arrayList9.get(i);
            i++;
            arrayList10.add(new c((m3) obj5));
        }
        this.k = arrayList10;
        this.l = this.a.c.a;
    }

    public final int a() {
        return this.j;
    }

    public final ArrayList b() {
        return this.c;
    }

    public final ArrayList c() {
        return this.k;
    }

    public final int d() {
        return this.f;
    }

    public final ArrayList e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(this.a, ((e) obj).a);
    }

    public final int f() {
        return this.h;
    }

    public final ArrayList g() {
        return this.g;
    }

    public final int h() {
        return this.l;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final ArrayList i() {
        return this.e;
    }

    public final boolean isEmpty() {
        return this.c.isEmpty() && this.e.isEmpty() && this.g.isEmpty() && this.i.isEmpty() && this.k.isEmpty();
    }

    public final int j() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List k() {
        return this.b;
    }

    public final String toString() {
        return "ApolloGlobalSearch(data=" + this.a + ")";
    }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
