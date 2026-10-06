package rm0;

import java.util.ArrayList;
import jn0.cf0;
import jn0.ii;
import jn0.jp;
import jn0.me0;
import jn0.yf0;
import jo.ah0;
import jo.br;
import jo.fj;
import jo.mi0;
import jo.qh0;
import kc0.cb0;
import kc0.ma0;
import kc0.rg;
import kc0.rn;
import kc0.yb0;
import u10.c90;
import u10.m80;
import u10.nm;
import u10.pf;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p3 implements yb0, z01.a0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.bShadow t;
    public v71.v u;
    public aa.w0 v;

    public p3(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new fj();
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new pf();
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new ii();
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new rg();
                break;
        }
    }

    @Override // z01.a0
    public final y71.i a() {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new j3(com.github.service.wrapper.a.o(this.t, (rg) this.v, null, false, null, null, 62), 3), this.u);
            case 1:
                return y71.n1Shadow.y(new sm.b(com.github.service.wrapper.a.o(this.t, this.v, null, false, null, null, 62), 15), this.u);
            case 2:
                return y71.n1Shadow.y(new vb0.e2(com.github.service.wrapper.a.o(this.t, this.v, null, false, null, null, 62), 1), this.u);
            default:
                return y71.n1Shadow.y(new vm0.h(com.github.service.wrapper.a.o(this.t, (ii) this.v, null, false, null, null, 62), 20), this.u);
        }
    }

    @Override // z01.a0
    public final y71.i b() {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new j3(com.github.service.wrapper.b.a(this.t, (rg) this.v, ga.h.t, false, null, 60), 2), this.u);
            case 1:
                return y71.n1Shadow.y(new sm.b(com.github.service.wrapper.b.a(this.t, this.v, ga.h.t, false, null, 60), 14), this.u);
            case 2:
                return y71.n1Shadow.y(new vb0.e2(com.github.service.wrapper.b.a(this.t, this.v, ga.h.t, false, null, 60), 0), this.u);
            default:
                return y71.n1Shadow.y(new vm0.h(com.github.service.wrapper.b.a(this.t, (ii) this.v, ga.h.t, false, null, 60), 19), this.u);
        }
    }

    @Override // z01.a0
    public final y71.i c(ArrayList arrayList) {
        switch (this.r) {
            case 0:
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((g01.d) obj).b) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, 10));
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    arrayList3.add(sy.d0Shadow.B(((g01.d) obj2).a));
                }
                aa.u0 u0Var = new aa.u0(arrayList3);
                ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList, 10));
                int size3 = arrayList.size();
                while (i < size3) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    arrayList4.add(sy.d0Shadow.B(((g01.d) obj3).a));
                }
                return y71.n1Shadow.y(new o3(in.rShadow.h(this.s.d(new ma0(u0Var, arrayList4))), 0), this.u);
            case 1:
                ArrayList arrayList5 = new ArrayList();
                int size4 = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size4) {
                    Object obj4 = arrayList.get(i5);
                    i5++;
                    if (((g01.d) obj4).b) {
                        arrayList5.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList(x61.n.F(arrayList5, 10));
                int size5 = arrayList5.size();
                int i6 = 0;
                while (i6 < size5) {
                    Object obj5 = arrayList5.get(i6);
                    i6++;
                    arrayList6.add(aa1.b.W(((g01.d) obj5).a));
                }
                aa.u0 u0Var2 = new aa.u0(arrayList6);
                ArrayList arrayList7 = new ArrayList(x61.n.F(arrayList, 10));
                int size6 = arrayList.size();
                while (i4 < size6) {
                    Object obj6 = arrayList.get(i4);
                    i4++;
                    arrayList7.add(aa1.b.W(((g01.d) obj6).a));
                }
                return y71.n1Shadow.y(new o3(in.rShadow.h(this.s.d(new ah0(u0Var2, arrayList7))), 28), this.u);
            case 2:
                ArrayList arrayList8 = new ArrayList();
                int size7 = arrayList.size();
                int i7 = 0;
                int i8 = 0;
                while (i8 < size7) {
                    Object obj7 = arrayList.get(i8);
                    i8++;
                    if (((g01.d) obj7).b) {
                        arrayList8.add(obj7);
                    }
                }
                ArrayList arrayList9 = new ArrayList(x61.n.F(arrayList8, 10));
                int size8 = arrayList8.size();
                int i9 = 0;
                while (i9 < size8) {
                    Object obj8 = arrayList8.get(i9);
                    i9++;
                    arrayList9.add(sy.w.A(((g01.d) obj8).a));
                }
                aa.u0 u0Var3 = new aa.u0(arrayList9);
                ArrayList arrayList10 = new ArrayList(x61.n.F(arrayList, 10));
                int size9 = arrayList.size();
                while (i7 < size9) {
                    Object obj9 = arrayList.get(i7);
                    i7++;
                    arrayList10.add(sy.w.A(((g01.d) obj9).a));
                }
                return y71.n1Shadow.y(new vb0.p1(in.rShadow.h(this.s.d(new m80(u0Var3, arrayList10))), 2), this.u);
            default:
                ArrayList arrayList11 = new ArrayList();
                int size10 = arrayList.size();
                int i10 = 0;
                int i12 = 0;
                while (i12 < size10) {
                    Object obj10 = arrayList.get(i12);
                    i12++;
                    if (((g01.d) obj10).b) {
                        arrayList11.add(obj10);
                    }
                }
                ArrayList arrayList12 = new ArrayList(x61.n.F(arrayList11, 10));
                int size11 = arrayList11.size();
                int i13 = 0;
                while (i13 < size11) {
                    Object obj11 = arrayList11.get(i13);
                    i13++;
                    arrayList12.add(com.google.common.util.concurrent.a.X(((g01.d) obj11).a));
                }
                aa.u0 u0Var4 = new aa.u0(arrayList12);
                ArrayList arrayList13 = new ArrayList(x61.n.F(arrayList, 10));
                int size12 = arrayList.size();
                while (i10 < size12) {
                    Object obj12 = arrayList.get(i10);
                    i10++;
                    arrayList13.add(com.google.common.util.concurrent.a.X(((g01.d) obj12).a));
                }
                return y71.n1Shadow.y(new wy0.h1(in.rShadow.h(this.s.d(new me0(u0Var4, arrayList13))), 3), this.u);
        }
    }

    @Override // z01.a0
    public final y71.i d() {
        switch (this.r) {
            case 0:
                return com.github.rudroid.common.v.b(new j3(com.github.service.wrapper.a.o(this.s, new rn(new aa.u0(25)), null, false, null, null, 62), 1), this.u);
            case 1:
                return com.github.rudroid.common.v.b(new sm.b(com.github.service.wrapper.a.o(this.s, new br(new aa.u0(25)), null, false, null, null, 62), 13), this.u);
            case 2:
                return com.github.rudroid.common.v.b(new t00.h7(com.github.service.wrapper.a.o(this.s, new nm(new aa.u0(25)), null, false, null, null, 62), 29), this.u);
            default:
                return com.github.rudroid.common.v.b(new vm0.h(com.github.service.wrapper.a.o(this.s, new jp(new aa.u0(25)), null, false, null, null, 62), 18), this.u);
        }
    }

    @Override // z01.a0
    public final y71.i e() {
        switch (this.r) {
            case 0:
                return com.github.rudroid.common.v.b(new j3(com.github.service.wrapper.a.o(this.s, new cb0(), null, false, null, null, 62), 0), this.u);
            case 1:
                return com.github.rudroid.common.v.b(new sm.b(com.github.service.wrapper.a.o(this.s, new qh0(), null, false, null, null, 62), 12), this.u);
            case 2:
                return com.github.rudroid.common.v.b(new t00.h7(com.github.service.wrapper.a.o(this.s, new c90(), null, false, null, null, 62), 28), this.u);
            default:
                return com.github.rudroid.common.v.b(new vm0.h(com.github.service.wrapper.a.o(this.s, new cf0(), null, false, null, null, 62), 17), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
