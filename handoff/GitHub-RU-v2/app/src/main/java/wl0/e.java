package wl0;

import ci0.q;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.List;
import kc0.ag;
import kc0.bg;
import kc0.cg;
import kc0.dg;
import kc0.eg;
import kc0.fg;
import kc0.gg;
import kc0.hg;
import kc0.tf;
import kc0.vf;
import kc0.xf;
import kc0.yf;
import kc0.zf;
import oj0.e2;
import ri0.p2;
import w8.s;
import wk0.c1;
import x61.n;
import x61.r;
import yz0.t1;
import yz0.w1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements w1 {
    public final vf a;
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
    public e(vf vfVar) {
        ArrayList arrayList;
        gg ggVar;
        eg egVar;
        dg dgVar;
        fg fgVar;
        hg hgVar;
        List<bg> list;
        k71.k.g(vfVar, "data");
        this.a = vfVar;
        tf tfVar = vfVar.f;
        if (tfVar == null || (list = tfVar.a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (bg bgVar : list) {
                t1 N = bgVar != null ? i4.N(bgVar.b) : null;
                if (N != null) {
                    arrayList.add(N);
                }
            }
        }
        List list2 = r.r;
        this.b = arrayList == null ? list2 : arrayList;
        List<zf> list3 = this.a.d.b;
        list3 = list3 == null ? list2 : list3;
        ArrayList arrayList2 = new ArrayList();
        for (zf zfVar : list3) {
            c1 c1Var = (zfVar == null || (hgVar = zfVar.b) == null) ? null : hgVar.c;
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
        vf vfVar2 = this.a;
        this.d = vfVar2.d.a;
        List<xf> list4 = vfVar2.b.b;
        list4 = list4 == null ? list2 : list4;
        ArrayList arrayList4 = new ArrayList();
        for (xf xfVar : list4) {
            p2 p2Var = (xfVar == null || (fgVar = xfVar.b) == null) ? null : fgVar.c;
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
            arrayList5.add(y9.a.G((p2) obj2));
        }
        this.e = arrayList5;
        vf vfVar3 = this.a;
        this.f = vfVar3.b.a;
        List<cg> list5 = vfVar3.a.b;
        list5 = list5 == null ? list2 : list5;
        ArrayList arrayList6 = new ArrayList();
        for (cg cgVar : list5) {
            mg0.m mVar = (cgVar == null || (dgVar = cgVar.b) == null) ? null : dgVar.c;
            if (mVar != null) {
                arrayList6.add(mVar);
            }
        }
        ArrayList arrayList7 = new ArrayList(n.F(arrayList6, 10));
        int size3 = arrayList6.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList6.get(i4);
            i4++;
            arrayList7.add(d5.b0((mg0.m) obj3));
        }
        this.g = arrayList7;
        vf vfVar4 = this.a;
        this.h = vfVar4.a.a;
        List<ag> list6 = vfVar4.e.b;
        list6 = list6 == null ? list2 : list6;
        ArrayList arrayList8 = new ArrayList();
        for (ag agVar : list6) {
            q qVar = (agVar == null || (egVar = agVar.b) == null) ? null : egVar.c;
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
            arrayList9.add(s.C((q) obj4));
        }
        this.i = arrayList9;
        vf vfVar5 = this.a;
        this.j = vfVar5.e.a;
        List list7 = vfVar5.c.b;
        List<yf> list8 = list7 != null ? list7 : list2;
        ArrayList arrayList10 = new ArrayList();
        for (yf yfVar : list8) {
            e2 e2Var = (yfVar == null || (ggVar = yfVar.b) == null) ? null : ggVar.c;
            if (e2Var != null) {
                arrayList10.add(e2Var);
            }
        }
        ArrayList arrayList11 = new ArrayList(n.F(arrayList10, 10));
        int size5 = arrayList10.size();
        while (i < size5) {
            Object obj5 = arrayList10.get(i);
            i++;
            arrayList11.add(new c((e2) obj5));
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
}
