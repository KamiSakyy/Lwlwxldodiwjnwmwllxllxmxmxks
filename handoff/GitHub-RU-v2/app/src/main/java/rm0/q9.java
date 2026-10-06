package rm0;

import gn0.br;
import gn0.cz;
import gn0.gt;
import gn0.jt;
import gn0.pt;
import gn0.su;
import hc0.cs;
import hc0.es;
import hc0.ks;
import hc0.ot;
import hc0.tx;
import hc0.xp;
import java.util.ArrayList;
import jn0.m40;
import jn0.u40;
import jn0.wt;
import jn0.xd0;
import jn0.yf0;
import jo.lg0;
import jo.m60;
import jo.mi0;
import jo.tv;
import jo.u60;
import kc0.f10;
import kc0.tr;
import kc0.x00;
import kc0.x90;
import kc0.yb0;
import m10.d80;
import m10.f40;
import m10.q60;
import m10.s60;
import m10.td0;
import pz0.d20;
import pz0.hy;
import pz0.q00;
import pz0.s00;
import pz0.y00;
import pz0.y60;
import u10.hz;
import u10.pq;
import u10.x70;
import u10.y90;
import u10.zy;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q9 implements z01.j1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public v71.v t;

    public q9(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
        }
    }

    @Override // z01.j1
    public final y71.i a(String str, q01.m mVar) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                return y71.n1Shadow.y(new o3(in.rShadow.k(this.s.d(new x90(new cz(new aa.u0(sy.n.D(mVar.e)), new aa.u0(sy.pShadow.t(mVar.f)), new aa.u0(mVar.a), new aa.u0(mVar.b), new aa.u0(com.google.android.gms.internal.measurement.b4.m0(mVar.c)), new aa.u0(sy.oShadow.k(mVar.d)), str)))), 16), this.t);
            case 1:
                k71.k.g(str, "id");
                return y71.n1Shadow.y(new t00.g3(in.rShadow.k(this.s.d(new lg0(new td0(new aa.u0(b41.b.N(mVar.e)), new aa.u0(com.google.android.gms.internal.measurement.z3.L(mVar.f)), new aa.u0(mVar.a), new aa.u0(mVar.b), new aa.u0(sy.pShadow.u(mVar.c)), new aa.u0(b91.g.S(mVar.d)), str)))), 19), this.t);
            case 2:
                k71.k.g(str, "id");
                return y71.n1Shadow.y(new vb0.p1(in.rShadow.k(this.s.d(new x70(new tx(new aa.u0(v8.l0.K(mVar.e)), new aa.u0(y41.t1.M(mVar.f)), new aa.u0(mVar.a), new aa.u0(mVar.b), new aa.u0(t.e.s(mVar.c)), new aa.u0(w8.s.y(mVar.d)), str)))), 20), this.t);
            default:
                k71.k.g(str, "id");
                return y71.n1Shadow.y(new wy0.h1(in.rShadow.k(this.s.d(new xd0(new y60(new aa.u0(com.google.android.gms.internal.measurement.i4.s0(mVar.e)), new aa.u0(b31.b.c0(mVar.f)), new aa.u0(mVar.a), new aa.u0(mVar.b), new aa.u0(y9.a.I(mVar.c)), new aa.u0(com.google.android.gms.internal.measurement.d5.Z(mVar.d)), str)))), 24), this.t);
        }
    }

    @Override // z01.j1
    public final y71.i b() {
        switch (this.r) {
            case 0:
                return com.github.rudroid.common.v.b(new j3(com.github.service.wrapper.a.o(this.s, new f10(new aa.u0(25)), null, false, null, null, 62), 25), this.t);
            case 1:
                return com.github.rudroid.common.v.b(new t00.h7(com.github.service.wrapper.a.o(this.s, new u60(new aa.u0(25)), null, false, null, null, 62), 12), this.t);
            case 2:
                return com.github.rudroid.common.v.b(new vb0.e2(com.github.service.wrapper.a.o(this.s, new hz(new aa.u0(25)), null, false, null, null, 62), 20), this.t);
            default:
                return com.github.rudroid.common.v.b(new wy0.d6(com.github.service.wrapper.a.o(this.s, new u40(new aa.u0(25)), null, false, null, null, 62), 15), this.t);
        }
    }

    @Override // z01.j1
    public final y71.i c(q01.m mVar) {
        switch (this.r) {
            case 0:
                jt D = sy.n.D(mVar.e);
                pt t = sy.pShadow.t(mVar.f);
                String str = mVar.a;
                String str2 = mVar.b;
                aa1.bShadow bVar = aa.t0.d;
                aa1.bShadow u0Var = str2 == null ? bVar : new aa.u0(str2);
                br m0 = com.google.android.gms.internal.measurement.b4.m0(mVar.c);
                if (m0 != null) {
                    bVar = new aa.u0(m0);
                }
                return y71.n1Shadow.y(new o3(in.rShadow.k(this.s.d(new kc0.o7(new gn0.n5(D, t, str, u0Var, bVar, sy.oShadow.k(mVar.d))))), 14), this.t);
            case 1:
                s60 N = b41.b.N(mVar.e);
                m10.y60 L = com.google.android.gms.internal.measurement.z3.L(mVar.f);
                String str3 = mVar.a;
                String str4 = mVar.b;
                aa1.bShadow bVar2 = aa.t0.d;
                aa1.bShadow u0Var2 = str4 == null ? bVar2 : new aa.u0(str4);
                f40 u = sy.pShadow.u(mVar.c);
                if (u != null) {
                    bVar2 = new aa.u0(u);
                }
                return y71.n1Shadow.y(new t00.g3(in.rShadow.k(this.s.d(new jo.b9(new m10.e9(N, L, str3, u0Var2, bVar2, b91.g.S(mVar.d))))), 17), this.t);
            case 2:
                es K = v8.l0.K(mVar.e);
                ks M = y41.t1.M(mVar.f);
                String str5 = mVar.a;
                String str6 = mVar.b;
                aa1.bShadow bVar3 = aa.t0.d;
                aa1.bShadow u0Var3 = str6 == null ? bVar3 : new aa.u0(str6);
                xp s = t.e.s(mVar.c);
                if (s != null) {
                    bVar3 = new aa.u0(s);
                }
                return y71.n1Shadow.y(new vb0.p1(in.rShadow.k(this.s.d(new u10.g7(new hc0.d5(K, M, str5, u0Var3, bVar3, w8.s.y(mVar.d))))), 18), this.t);
            default:
                s00 s0 = com.google.android.gms.internal.measurement.i4.s0(mVar.e);
                y00 c0 = b31.b.c0(mVar.f);
                String str7 = mVar.a;
                String str8 = mVar.b;
                aa1.bShadow bVar4 = aa.t0.d;
                aa1.bShadow u0Var4 = str8 == null ? bVar4 : new aa.u0(str8);
                hy I = y9.a.I(mVar.c);
                if (I != null) {
                    bVar4 = new aa.u0(I);
                }
                return y71.n1Shadow.y(new wy0.h1(in.rShadow.k(this.s.d(new jn0.e8(new pz0.c6(s0, c0, str7, u0Var4, bVar4, com.google.android.gms.internal.measurement.d5.Z(mVar.d))))), 22), this.t);
        }
    }

    @Override // z01.j1
    public final Object d(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.k(this.s.d(new tr(str)))), this.t);
            case 1:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.k(this.s.d(new tv(str)))), this.t);
            case 2:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.k(this.s.d(new pq(str)))), this.t);
            default:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.k(this.s.d(new wt(str)))), this.t);
        }
    }

    @Override // z01.j1
    public final Object e(ArrayList arrayList) {
        switch (this.r) {
            case 0:
                ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    q01.k kVar = (q01.k) obj;
                    k71.k.g(kVar, "<this>");
                    jt D = sy.n.D(kVar.f());
                    pt t = sy.pShadow.t(kVar.getIcon());
                    String name = kVar.getName();
                    String g = kVar.g();
                    aa.u0 u0Var = aa.t0.d;
                    aa.u0 u0Var2 = g == null ? u0Var : new aa.u0(g);
                    br m0 = com.google.android.gms.internal.measurement.b4.m0(kVar.i());
                    if (m0 != null) {
                        u0Var = new aa.u0(m0);
                    }
                    arrayList2.add(new gt(D, t, name, u0Var2, u0Var, sy.oShadow.k(kVar.getType())));
                }
                return y71.n1Shadow.y(new o3(in.rShadow.k(this.s.d(new x00(new su(arrayList2)))), 15), this.t);
            case 1:
                ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList, 10));
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    q01.k kVar2 = (q01.k) obj2;
                    k71.k.g(kVar2, "<this>");
                    s60 N = b41.b.N(kVar2.f());
                    m10.y60 L = com.google.android.gms.internal.measurement.z3.L(kVar2.getIcon());
                    String name2 = kVar2.getName();
                    String g2 = kVar2.g();
                    aa.u0 u0Var3 = aa.t0.d;
                    aa.u0 u0Var4 = g2 == null ? u0Var3 : new aa.u0(g2);
                    f40 u = sy.pShadow.u(kVar2.i());
                    if (u != null) {
                        u0Var3 = new aa.u0(u);
                    }
                    arrayList3.add(new q60(N, L, name2, u0Var4, u0Var3, b91.g.S(kVar2.getType())));
                }
                return y71.n1Shadow.y(new t00.g3(in.rShadow.k(this.s.d(new m60(new d80(arrayList3)))), 18), this.t);
            case 2:
                ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList, 10));
                int size3 = arrayList.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList.get(i3);
                    i3++;
                    q01.k kVar3 = (q01.k) obj3;
                    k71.k.g(kVar3, "<this>");
                    es K = v8.l0.K(kVar3.f());
                    ks M = y41.t1.M(kVar3.getIcon());
                    String name3 = kVar3.getName();
                    String g3 = kVar3.g();
                    aa.u0 u0Var5 = aa.t0.d;
                    aa.u0 u0Var6 = g3 == null ? u0Var5 : new aa.u0(g3Shadow);
                    xp s = t.e.s(kVar3.i());
                    if (s != null) {
                        u0Var5 = new aa.u0(s);
                    }
                    arrayList4.add(new cs(K, M, name3, u0Var6, u0Var5, w8.s.y(kVar3.getType())));
                }
                return y71.n1Shadow.y(new vb0.p1(in.rShadow.k(this.s.d(new zy(new ot(arrayList4)))), 19), this.t);
            default:
                ArrayList arrayList5 = new ArrayList(x61.n.F(arrayList, 10));
                int size4 = arrayList.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj4 = arrayList.get(i4);
                    i4++;
                    q01.k kVar4 = (q01.k) obj4;
                    k71.k.g(kVar4, "<this>");
                    s00 s0 = com.google.android.gms.internal.measurement.i4.s0(kVar4.f());
                    y00 c0 = b31.b.c0(kVar4.getIcon());
                    String name4 = kVar4.getName();
                    String g4 = kVar4.g();
                    aa.u0 u0Var7 = aa.t0.d;
                    aa.u0 u0Var8 = g4 == null ? u0Var7 : new aa.u0(g4);
                    hy I = y9.a.I(kVar4.i());
                    if (I != null) {
                        u0Var7 = new aa.u0(I);
                    }
                    arrayList5.add(new q00(s0, c0, name4, u0Var8, u0Var7, com.google.android.gms.internal.measurement.d5.Z(kVar4.getType())));
                }
                return y71.n1Shadow.y(new wy0.h1(in.rShadow.k(this.s.d(new m40(new d20(arrayList5)))), 23), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
