package rm0;

import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.PullRequestUpdateState;
import gn0.bm;
import gn0.ll;
import gn0.nn;
import hc0.lk;
import hc0.lm;
import hc0.zk;
import java.util.ArrayList;
import java.util.List;
import jn0.ad0;
import jn0.bd0;
import jn0.cd0;
import jn0.il;
import jn0.lc0;
import jn0.qb0;
import jn0.tc;
import jn0.xc0;
import jn0.xm;
import jn0.yf0;
import jn0.zc;
import jn0.zc0;
import jo.ee0;
import jo.ib;
import jo.jo;
import jo.lf0;
import jo.mi0;
import jo.nf0;
import jo.nm;
import jo.of0;
import jo.pf0;
import jo.qd;
import jo.qf0;
import jo.wd;
import jo.ze0;
import kc0.a90;
import kc0.b90;
import kc0.c90;
import kc0.fc;
import kc0.gl;
import kc0.l80;
import kc0.m70;
import kc0.rj;
import kc0.x80;
import kc0.yb0;
import kc0.z80;
import kc0.zb;
import kotlin.NoWhenBranchMatchedException;
import m10.l00;
import m10.py;
import m10.ux;
import pz0.hs;
import pz0.ou;
import pz0.zs;
import u10.a70;
import u10.b70;
import u10.c70;
import u10.ck;
import u10.l60;
import u10.o50;
import u10.pi;
import u10.rb;
import u10.x60;
import u10.xb;
import u10.y90;
import u10.z60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b6 implements z01.t0, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.bShadow t;
    public v71.v u;
    public s01.p v;

    public b6(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new a00.b(jVar, bVar, vVar, new h0.r(23), new he.c(8), s01.oShadow.r, new he.c(9), new h0.r(24), new h0.r(25), new h0.r(26), new h0.r(27), new he.c(10), null, 120832);
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new jy.d(jVar, bVar, vVar, new jy.b(23), new ie.d(28), s01.oShadow.r, new ie.d(29), new jy.b(24), new jy.b(25), new jy.b(26), new jy.b(27), new lb0.a(0), null, 120832);
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new jy.d(jVar, bVar, vVar, new lm0.g(11), new lb0.a(6), s01.oShadow.r, new lb0.a(7), new lm0.g(12), new lm0.g(13), new lm0.g(14), new lm0.g(15), new lb0.a(8), null, 120832);
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new a00.b(jVar, bVar, vVar, new h0.r(13), new he.c(2), s01.oShadow.r, new he.c(3), new h0.r(14), new h0.r(15), new h0.r(16), new h0.r(17), new he.c(4), null, 120832);
                break;
        }
    }

    @Override // z01.t0
    public final y71.i a(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                k71.k.g(str2, "title");
                ll.Companion.getClass();
                z80 z80Var = new z80(new b90(new a90(str, str2, str2, ((aa.q) ll.K).a)));
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.k(new c90(str, str2), z80Var))), this.u);
            case 1:
                k71.k.g(str, "id");
                k71.k.g(str2, "title");
                ux.Companion.getClass();
                aa.m0 nf0Var = new nf0(new pf0(new of0(str, str2, str2, ((aa.q) ux.T).a)));
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.k(new qf0(str, str2), nf0Var))), this.u);
            case 2:
                k71.k.g(str, "id");
                k71.k.g(str2, "title");
                lk.Companion.getClass();
                aa.m0 z60Var = new z60(new b70(new a70(str, str2, str2, ((aa.q) lk.J).a)));
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.k(new c70(str, str2), z60Var))), this.u);
            default:
                k71.k.g(str, "id");
                k71.k.g(str2, "title");
                hs.Companion.getClass();
                zc0 zc0Var = new zc0(new bd0(new ad0(str, str2, str2, ((aa.q) hs.N).a)));
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.k(new cd0(str, str2), zc0Var))), this.u);
        }
    }

    @Override // z01.t0
    public final Object b(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(in.rShadow.l(this.v.b(new hm0.a(str, str2, str3))), this.u);
            case 1:
                return y71.n1Shadow.y(in.rShadow.l(this.v.b(new i00.a(str, str2, str3))), this.u);
            case 2:
                return y71.n1Shadow.y(in.rShadow.l(this.v.b(new lb0.b(str, str2, str3))), this.u);
            default:
                return y71.n1Shadow.y(in.rShadow.l(this.v.b(new ly0.a(str, str2, str3))), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i c(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                aa.u0 u0Var = new aa.u0(nn.t);
                aa.t0 t0Var = aa.t0.d;
                l80 l80Var = new l80(str, u0Var, t0Var, t0Var, t0Var, t0Var, t0Var);
                com.github.service.wrapper.bShadow bVar = this.t;
                return y71.n1Shadow.y(new d5(new y00.l(in.rShadow.m(in.rShadow.h(bVar.d(l80Var)), bVar, new ri0.w3(), str, new s(8)), 10), 9), this.u);
            case 1:
                k71.k.g(str, "id");
                aa.u0 u0Var2 = new aa.u0(l00.t);
                aa.t0 t0Var2 = aa.t0.d;
                aa.n0Shadow ze0Var = new ze0(str, u0Var2, t0Var2, t0Var2, t0Var2, t0Var2);
                com.github.service.wrapper.bShadow bVar2 = this.t;
                return y71.n1Shadow.y(new t00.w3(new y00.l(in.rShadow.m(in.rShadow.h(bVar2.d(ze0Var)), bVar2, new gv.g4(), str, new sw0.e(20)), 10), 23), this.u);
            case 2:
                k71.k.g(str, "id");
                aa.u0 u0Var3 = new aa.u0(lm.t);
                aa.t0 t0Var3 = aa.t0.d;
                aa.n0Shadow l60Var = new l60(str, u0Var3, t0Var3, t0Var3, t0Var3, t0Var3, t0Var3);
                com.github.service.wrapper.bShadow bVar3 = this.t;
                return y71.n1Shadow.y(new vb0.t3(new y00.l(in.rShadow.m(in.rShadow.h(bVar3.d(l60Var)), bVar3, new z70.m3(0), str, new v00.n(17)), 10), 7), this.u);
            default:
                k71.k.g(str, "id");
                aa.u0 u0Var4 = new aa.u0(ou.t);
                aa.t0 t0Var4 = aa.t0.d;
                lc0 lc0Var = new lc0(str, u0Var4, t0Var4, t0Var4, t0Var4, t0Var4, t0Var4);
                com.github.service.wrapper.bShadow bVar4 = this.t;
                return y71.n1Shadow.y(new wy0.q3(new y00.l(in.rShadow.m(in.rShadow.h(bVar4.d(lc0Var)), bVar4, new xt0.w3(), str, new wy0.p4(2)), 10), 18), this.u);
        }
    }

    @Override // z01.t0
    public final Object d(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.m(in.rShadow.h(this.s.d(new kc0.o8(str2))), this.t, new ri0.i4(), str, new s(7))), this.u);
            case 1:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.m(in.rShadow.h(this.s.d(new jo.fa(str2))), this.t, new gv.s4(), str, new sw0.e(21))), this.u);
            case 2:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.m(in.rShadow.h(this.s.d(new u10.g8(str2))), this.t, new z70.x3(0), str, new v00.n(18))), this.u);
            default:
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.m(in.rShadow.h(this.s.d(new jn0.i9(str2))), this.t, new xt0.i4(), str, new wy0.p4(4))), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i e(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "queryString");
                return y71.n1Shadow.y(this.v.h(new hm0.a(str, str2, str3)), this.u);
            case 1:
                k71.k.g(str, "queryString");
                return y71.n1Shadow.y(this.v.h(new i00.a(str, str2, str3)), this.u);
            case 2:
                k71.k.g(str, "queryString");
                return y71.n1Shadow.y(this.v.h(new lb0.b(str, str2, str3)), this.u);
            default:
                k71.k.g(str, "queryString");
                return y71.n1Shadow.y(this.v.h(new ly0.a(str, str2, str3)), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i f(String str, PullRequestMergeMethod pullRequestMergeMethod, String str2, yz0.s2 s2Var, String str3) {
        switch (this.r) {
            case 0:
                bm s = pullRequestMergeMethod != null ? sy.f0.s(pullRequestMergeMethod) : null;
                aa.u0 u0Var = aa.t0.d;
                aa.u0 u0Var2 = s == null ? u0Var : new aa.u0(s);
                aa.u0 u0Var3 = str2 == null ? u0Var : new aa.u0(str2);
                String str4 = s2Var != null ? s2Var.r : null;
                aa.u0 u0Var4 = str4 == null ? u0Var : new aa.u0(str4);
                String str5 = s2Var != null ? s2Var.s : null;
                aa.u0 u0Var5 = str5 == null ? u0Var : new aa.u0(str5);
                if (str3 != null) {
                    u0Var = new aa.u0(str3);
                }
                return y71.n1Shadow.y(new d5(new y00.l(in.rShadow.h(this.t.d(new fc(str, u0Var2, u0Var3, u0Var4, u0Var5, u0Var))), 10), 5), this.u);
            case 1:
                py z = pullRequestMergeMethod != null ? w8.s.z(pullRequestMergeMethod) : null;
                aa.u0 u0Var6 = aa.t0.d;
                aa.u0 u0Var7 = z == null ? u0Var6 : new aa.u0(z);
                aa.u0 u0Var8 = str2 == null ? u0Var6 : new aa.u0(str2);
                String str6 = s2Var != null ? s2Var.r : null;
                aa.u0 u0Var9 = str6 == null ? u0Var6 : new aa.u0(str6);
                String str7 = s2Var != null ? s2Var.s : null;
                aa.u0 u0Var10 = str7 == null ? u0Var6 : new aa.u0(str7);
                if (str3 != null) {
                    u0Var6 = new aa.u0(str3);
                }
                return y71.n1Shadow.y(new t00.w3(new y00.l(in.rShadow.h(this.t.d(new wd(str, u0Var7, u0Var8, u0Var9, u0Var10, u0Var6))), 10), 19), this.u);
            case 2:
                zk F = pullRequestMergeMethod != null ? i21.a.F(pullRequestMergeMethod) : null;
                aa.u0 u0Var11 = aa.t0.d;
                aa.u0 u0Var12 = F == null ? u0Var11 : new aa.u0(F);
                aa.u0 u0Var13 = str2 == null ? u0Var11 : new aa.u0(str2);
                String str8 = s2Var != null ? s2Var.r : null;
                aa.u0 u0Var14 = str8 == null ? u0Var11 : new aa.u0(str8);
                String str9 = s2Var != null ? s2Var.s : null;
                aa.u0 u0Var15 = str9 == null ? u0Var11 : new aa.u0(str9);
                if (str3 != null) {
                    u0Var11 = new aa.u0(str3);
                }
                return y71.n1Shadow.y(new vb0.t3(new y00.l(in.rShadow.h(this.t.d(new xb(str, u0Var12, u0Var13, u0Var14, u0Var15, u0Var11))), 10), 3), this.u);
            default:
                zs Q = pullRequestMergeMethod != null ? aa1.b.Q(pullRequestMergeMethod) : null;
                aa1.bShadow bVar = aa.t0.d;
                aa1.bShadow u0Var16 = Q == null ? bVar : new aa.u0(Q);
                aa1.bShadow u0Var17 = str2 == null ? bVar : new aa.u0(str2);
                String str10 = s2Var != null ? s2Var.r : null;
                aa1.bShadow u0Var18 = str10 == null ? bVar : new aa.u0(str10);
                String str11 = s2Var != null ? s2Var.s : null;
                aa1.bShadow u0Var19 = str11 == null ? bVar : new aa.u0(str11);
                if (str3 != null) {
                    bVar = new aa.u0(str3);
                }
                return y71.n1Shadow.y(new wy0.q3(new y00.l(in.rShadow.h(this.t.d(new zc(str, u0Var16, u0Var17, u0Var18, u0Var19, bVar))), 10), 14), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i g(String str, int i, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                return y71.n1Shadow.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.t, new pi0.f(str, i, str2), ga.h.r, false, null, null, 60), 10), 8), this.u);
            case 1:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                return y71.n1Shadow.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.t, new ev.f(str, i, str2), ga.h.r, false, null, null, 60), 10), 22), this.u);
            case 2:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                return y71.n1Shadow.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.t, new x70.f(str, i, str2), ga.h.r, false, null, null, 60), 10), 6), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                return y71.n1Shadow.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.t, new vt0.f(str, i, str2), ga.h.r, false, null, null, 60), 10), 17), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    @Override // z01.t0
    public final y71.i i(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "queryString");
                return y71.n1Shadow.y(new go0.i(this.v.e(new hm0.a(str, str2, str3)), str3, 13), this.u);
            case 1:
                k71.k.g(str, "queryString");
                return y71.n1Shadow.y(new go0.i(this.v.e(new i00.a(str, str2, str3)), str3, 14), this.u);
            case 2:
                k71.k.g(str, "queryString");
                return y71.n1Shadow.y(new go0.i(this.v.e(new lb0.b(str, str2, str3)), str3, 17), this.u);
            default:
                k71.k.g(str, "queryString");
                return y71.n1Shadow.y(new go0.i(this.v.e(new ly0.a(str, str2, str3)), str3, 18), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i j(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullId");
                return y71.n1Shadow.y(y71.n1Shadow.I(new c00.g(in.rShadow.h(this.s.d(new kc0.i2(str))), this, str, 17), new c00.m((a71.c) null, this, str, 9)), this.u);
            case 1:
                k71.k.g(str, "pullId");
                return y71.n1Shadow.y(y71.n1Shadow.I(new c00.g(in.rShadow.h(this.s.d(new jo.t2(str))), this, str, 20), new c00.m((a71.c) null, this, str, 11)), this.u);
            case 2:
                k71.k.g(str, "pullId");
                return y71.n1Shadow.y(y71.n1Shadow.I(new c00.g(in.rShadow.h(this.s.d(new u10.i2(str))), this, str, 23), new c00.m((a71.c) null, this, str, 14)), this.u);
            default:
                k71.k.g(str, "pullId");
                return y71.n1Shadow.y(y71.n1Shadow.I(new c00.g(in.rShadow.h(this.s.d(new jn0.o2(str))), this, str, 25), new c00.m((a71.c) null, this, str, 16)), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i k(String str, PullRequestUpdateState pullRequestUpdateState, String str2, ArrayList arrayList) {
        nn nnVar;
        l00 l00Var;
        lm lmVar;
        ou ouVar;
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                if (pullRequestUpdateState != null) {
                    int i = vl0.k.a[pullRequestUpdateState.ordinal()];
                    if (i == 1) {
                        nnVar = nn.u;
                    } else if (i == 2) {
                        nnVar = nn.t;
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nnVar = nn.s;
                    }
                } else {
                    nnVar = null;
                }
                aa1.bShadow bVar = aa.t0.d;
                return y71.n1Shadow.y(new d5(new y00.l(in.rShadow.h(this.t.d(new l80(str, nnVar == null ? bVar : new aa.u0(nnVar), bVar, str2 == null ? bVar : new aa.u0(str2), bVar, arrayList == null ? bVar : new aa.u0(arrayList), bVar))), 10), 10), this.u);
            case 1:
                k71.k.g(str, "id");
                if (pullRequestUpdateState != null) {
                    int i2 = dz.m.a[pullRequestUpdateState.ordinal()];
                    if (i2 == 1) {
                        l00Var = l00.u;
                    } else if (i2 == 2) {
                        l00Var = l00.t;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l00Var = l00.s;
                    }
                } else {
                    l00Var = null;
                }
                aa1.bShadow bVar2 = aa.t0.d;
                return y71.n1Shadow.y(new t00.w3(new y00.l(in.rShadow.h(this.t.d(new ze0(str, l00Var == null ? bVar2 : new aa.u0(l00Var), bVar2, str2 == null ? bVar2 : new aa.u0(str2), bVar2, bVar2))), 10), 24), this.u);
            case 2:
                k71.k.g(str, "id");
                if (pullRequestUpdateState != null) {
                    int i3 = ab0.j.a[pullRequestUpdateState.ordinal()];
                    if (i3 == 1) {
                        lmVar = lm.u;
                    } else if (i3 == 2) {
                        lmVar = lm.t;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lmVar = lm.s;
                    }
                } else {
                    lmVar = null;
                }
                aa1.bShadow bVar3 = aa.t0.d;
                return y71.n1Shadow.y(new vb0.t3(new y00.l(in.rShadow.h(this.t.d(new l60(str, lmVar == null ? bVar3 : new aa.u0(lmVar), bVar3, str2 == null ? bVar3 : new aa.u0(str2), bVar3, arrayList == null ? bVar3 : new aa.u0(arrayList), bVar3))), 10), 8), this.u);
            default:
                k71.k.g(str, "id");
                if (pullRequestUpdateState != null) {
                    int i4 = jx0.l.a[pullRequestUpdateState.ordinal()];
                    if (i4 == 1) {
                        ouVar = ou.u;
                    } else if (i4 == 2) {
                        ouVar = ou.t;
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ouVar = ou.s;
                    }
                } else {
                    ouVar = null;
                }
                aa1.bShadow bVar4 = aa.t0.d;
                return y71.n1Shadow.y(new wy0.q3(new y00.l(in.rShadow.h(this.t.d(new lc0(str, ouVar == null ? bVar4 : new aa.u0(ouVar), bVar4, str2 == null ? bVar4 : new aa.u0(str2), bVar4, arrayList == null ? bVar4 : new aa.u0(arrayList), bVar4))), 10), 19), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i l(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new d5(new y00.l(in.rShadow.h(this.t.d(new kc0.r9(str))), 10), 4), this.u);
            case 1:
                return y71.n1Shadow.y(new t00.w3(new y00.l(in.rShadow.h(this.t.d(new ib(str))), 10), 18), this.u);
            case 2:
                return y71.n1Shadow.y(new vb0.t3(new y00.l(in.rShadow.h(this.t.d(new u10.j9(str))), 10), 2), this.u);
            default:
                return y71.n1Shadow.y(new wy0.q3(new y00.l(in.rShadow.h(this.t.d(new jn0.la(str))), 10), 13), this.u);
        }
    }

    @Override // z01.t0
    public final Object m(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new kc0.k4(new aa.u0(str2), str), null, false, null, null, 62), 10), 6), this.u);
            case 1:
                return y71.n1Shadow.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.s, new jo.z4(new aa.u0(str2), str), null, false, null, null, 62), 10), 20), this.u);
            case 2:
                return y71.n1Shadow.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new u10.k4(new aa.u0(str2), str), null, false, null, null, 62), 10), 4), this.u);
            default:
                return y71.n1Shadow.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new jn0.q4(new aa.u0(str2), str), null, false, null, null, 62), 10), 15), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i n(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("observePullRequestStatus", "3.12");
            case 1:
                k71.k.g(str, "pullRequestId");
                return y71.n1Shadow.y(new sm.b(com.github.service.wrapper.b.a(this.t, new ey.j(str), ga.h.t, false, null, 60), 20), this.u);
            case 2:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("observePullRequestStatus", "3.10");
            default:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("observePullRequestStatus", "3.17");
        }
    }

    @Override // z01.t0
    public final y71.i o(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullRequestId");
                return y71.n1Shadow.y(new j3(com.github.service.wrapper.b.a(this.t, new pi0.k(str), ga.h.t, false, null, 60), 7), this.u);
            case 1:
                k71.k.g(str, "pullRequestId");
                return y71.n1Shadow.y(new sm.b(com.github.service.wrapper.b.a(this.t, new ev.k(str), ga.h.t, false, null, 60), 21), this.u);
            case 2:
                k71.k.g(str, "pullRequestId");
                return y71.n1Shadow.y(new vb0.e2(com.github.service.wrapper.b.a(this.t, new x70.k(str), ga.h.t, false, null, 60), 5), this.u);
            default:
                k71.k.g(str, "pullRequestId");
                return y71.n1Shadow.y(new vm0.h(com.github.service.wrapper.b.a(this.t, new vt0.k(str), ga.h.t, false, null, 60), 25), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i p(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullRequestReviewId");
                k71.k.g(str2, "message");
                return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new zb(str, str2))), 10), new v4(this, null, 1), 6), 12), this.u);
            case 1:
                k71.k.g(str, "pullRequestReviewId");
                k71.k.g(str2, "message");
                return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new qd(str, str2))), 10), new v4(this, null, 6), 6), 24), this.u);
            case 2:
                k71.k.g(str, "pullRequestReviewId");
                k71.k.g(str2, "message");
                return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new rb(str, str2))), 10), new v4(this, null, 12), 6), 5), this.u);
            default:
                k71.k.g(str, "pullRequestReviewId");
                k71.k.g(str2, "message");
                return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new tc(str, str2))), 10), new v4(this, null, 20), 6), 16), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i q(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new ml0.h(str)))), this.u);
            case 1:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new py.h(str)))), this.u);
            case 2:
                return y41.t1.S("removeFromMergeQueue", "3.10");
            default:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new yw0.h(str)))), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i r(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                kc0.z4 z4Var = new kc0.z4(str);
                com.github.service.wrapper.bShadow bVar = this.t;
                return y71.n1Shadow.y(new d5(new y00.l(in.rShadow.m(in.rShadow.h(bVar.d(z4Var)), bVar, new ri0.w3(), str, new s(6)), 10), 3), this.u);
            case 1:
                k71.k.g(str, "id");
                aa.n0Shadow p5Var = new jo.p5(str);
                com.github.service.wrapper.bShadow bVar2 = this.t;
                return y71.n1Shadow.y(new t00.w3(new y00.l(in.rShadow.m(in.rShadow.h(bVar2.d(p5Var)), bVar2, new gv.g4(), str, new sw0.e(22)), 10), 17), this.u);
            case 2:
                k71.k.g(str, "id");
                aa.n0Shadow z4Var2 = new u10.z4(str);
                com.github.service.wrapper.bShadow bVar3 = this.t;
                return y71.n1Shadow.y(new vb0.t3(new y00.l(in.rShadow.m(in.rShadow.h(bVar3.d(z4Var2)), bVar3, new z70.m3(0), str, new v00.n(19)), 10), 1), this.u);
            default:
                k71.k.g(str, "id");
                jn0.f5 f5Var = new jn0.f5(str);
                com.github.service.wrapper.bShadow bVar4 = this.t;
                return y71.n1Shadow.y(new wy0.q3(new y00.l(in.rShadow.m(in.rShadow.h(bVar4.d(f5Var)), bVar4, new xt0.w3(), str, new wy0.p4(3)), 10), 12), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i s(String str, int i, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.t, new gl(str, i, str2), null, false, null, null, 58), 10), 7), this.u);
            case 1:
                return y71.n1Shadow.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.t, new jo(str, i, str2), null, false, null, null, 58), 10), 21), this.u);
            case 2:
                return y71.n1Shadow.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.t, new ck(str, i, str2), null, false, null, null, 58), 10), 5), this.u);
            default:
                return y71.n1Shadow.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.t, new xm(str, i, str2), null, false, null, null, 58), 10), 16), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i t(String str, List list, List list2, List list3, boolean z) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                return y71.n1Shadow.y(new d5(new y00.l(in.rShadow.h(this.t.d(new x80(str, new aa.u0(list), new aa.u0(list2), new aa.u0(Boolean.valueOf(z))))), 10), 11), this.u);
            case 1:
                k71.k.g(str, "id");
                return y71.n1Shadow.y(new t00.w3(new y00.l(in.rShadow.h(this.t.d(new lf0(str, new aa.u0(list), new aa.u0(list2), new aa.u0(list3), new aa.u0(Boolean.valueOf(z))))), 10), 25), this.u);
            case 2:
                k71.k.g(str, "id");
                return y71.n1Shadow.y(new vb0.t3(new y00.l(in.rShadow.h(this.t.d(new x60(str, new aa.u0(list), new aa.u0(list2), new aa.u0(Boolean.valueOf(z))))), 10), 9), this.u);
            default:
                k71.k.g(str, "id");
                return y71.n1Shadow.y(new wy0.q3(new y00.l(in.rShadow.h(this.t.d(new xc0(str, new aa.u0(list), new aa.u0(list2), new aa.u0(Boolean.valueOf(z))))), 10), 20), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i u(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new rj(str)))), this.u);
            case 1:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new nm(str)))), this.u);
            case 2:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new pi(str)))), this.u);
            default:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new il(str)))), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i v(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new m70(str, str2)))), this.u);
            case 1:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new ee0(str, str2)))), this.u);
            case 2:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new o50(str, str2)))), this.u);
            default:
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new qb0(str, str2)))), this.u);
        }
    }

    @Override // z01.t0
    public final y71.i w(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new d5(new y00.l(in.rShadow.h(this.t.d(new ml0.p(str, str2 == null ? aa.t0.d : new aa.u0(str2)))), 10), 2), this.u);
            case 1:
                return y71.n1Shadow.y(new t00.w3(new y00.l(in.rShadow.h(this.t.d(new py.p(str, str2 == null ? aa.t0.d : new aa.u0(str2)))), 10), 16), this.u);
            case 2:
                return y41.t1.S("addToMergeQueue", "3.10");
            default:
                return y71.n1Shadow.y(new wy0.q3(new y00.l(in.rShadow.h(this.t.d(new yw0.p(str, str2 == null ? aa.t0.d : new aa.u0(str2)))), 10), 11), this.u);
        }
    }
}
