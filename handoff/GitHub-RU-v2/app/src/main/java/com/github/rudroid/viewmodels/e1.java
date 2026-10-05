package com.github.rudroid.viewmodels;

import com.github.service.models.response.organizations.Organization;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import le.u;
import le.v;

/* loaded from: /home/user/work/p/classes3.dex */
final class e1<T> implements y71.j {
    public final /* synthetic */ g1 r;

    public e1(g1 g1Var) {
        this.r = g1Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        yz0.w1 w1Var = (yz0.w1) obj;
        androidx.lifecycle.p0 p0Var = this.r.x;
        fl.e eVar = fl.f.Companion;
        ArrayList arrayList = new ArrayList();
        if (!w1Var.isEmpty()) {
            if (!w1Var.k().isEmpty()) {
                arrayList.add(new v.d(2131953570));
                List k = w1Var.k();
                ArrayList arrayList2 = new ArrayList(x61.n.F(k, 10));
                Iterator<T> it = k.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new v.a((yz0.t1) it.next()));
                }
                arrayList.addAll(arrayList2);
                arrayList.add(new v.c(2131954341, (Integer) null, u.a.a));
            }
            int i = 0;
            if (w1Var.h() > 0) {
                arrayList.add(new v.d(2131953517));
                ArrayList c = w1Var.c();
                ArrayList arrayList3 = new ArrayList(x61.n.F(c, 10));
                int size = c.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = c.get(i2);
                    i2++;
                    arrayList3.add(new v.f((yz0.u1) obj2));
                }
                arrayList.addAll(arrayList3);
                if (w1Var.h() > 3) {
                    arrayList.add(new v.c(2131820644, Integer.valueOf(w1Var.h() - w1Var.c().size()), u.e.a));
                }
            }
            if (w1Var.f() > 0) {
                arrayList.add(new v.h());
                arrayList.add(new v.d(2131954340));
                ArrayList g = w1Var.g();
                ArrayList arrayList4 = new ArrayList(x61.n.F(g, 10));
                int size2 = g.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = g.get(i3);
                    i3++;
                    arrayList4.add(oe.b.a((yz0.y1) obj3, (String) null));
                }
                arrayList.addAll(arrayList4);
                if (w1Var.f() > 3) {
                    arrayList.add(new v.c(2131820641, Integer.valueOf(w1Var.f() - w1Var.g().size()), u.b.a));
                }
            }
            if (w1Var.d() > 0) {
                arrayList.add(new v.h());
                arrayList.add(new v.d(2131954344));
                ArrayList i4 = w1Var.i();
                ArrayList arrayList5 = new ArrayList(x61.n.F(i4, 10));
                int size3 = i4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj4 = i4.get(i5);
                    i5++;
                    yz0.j3 j3Var = (yz0.j3) obj4;
                    arrayList5.add(oe.d.b(j3Var, he.r.a(j3Var.v), 1));
                }
                arrayList.addAll(arrayList5);
                if (w1Var.d() > 3) {
                    arrayList.add(new v.c(2131820643, Integer.valueOf(w1Var.d() - w1Var.i().size()), u.d.a));
                }
            }
            if (w1Var.j() > 0) {
                arrayList.add(new v.h());
                arrayList.add(new v.d(2131954342));
                ArrayList b = w1Var.b();
                ArrayList arrayList6 = new ArrayList(x61.n.F(b, 10));
                int size4 = b.size();
                int i6 = 0;
                while (i6 < size4) {
                    Object obj5 = b.get(i6);
                    i6++;
                    arrayList6.add(new v.i((yz0.v1) obj5));
                }
                arrayList.addAll(arrayList6);
                if (w1Var.j() > 3) {
                    arrayList.add(new v.c(2131820645, Integer.valueOf(w1Var.j() - w1Var.b().size()), u.f.a));
                }
            }
            if (w1Var.a() > 0) {
                arrayList.add(new v.h());
                arrayList.add(new v.d(2131953408));
                ArrayList e = w1Var.e();
                ArrayList arrayList7 = new ArrayList(x61.n.F(e, 10));
                int size5 = e.size();
                while (i < size5) {
                    Object obj6 = e.get(i);
                    i++;
                    arrayList7.add(new com.github.rudroid.organizations.z((Organization) obj6));
                }
                arrayList.addAll(arrayList7);
                if (w1Var.a() > 3) {
                    arrayList.add(new v.c(2131820642, Integer.valueOf(w1Var.a() - w1Var.e().size()), u.c.a));
                }
            }
        }
        eVar.getClass();
        p0Var.k(fl.e.c(arrayList));
        return w61.a0.a;
    }
}
