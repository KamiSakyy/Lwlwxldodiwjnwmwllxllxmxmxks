package ky;

import aa.q;
import aa.t0;
import aa.u0;
import bz0.c0;
import com.github.service.agents.AgentAssignment;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import h1.u;
import in.rShadow;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jn0.a5;
import jn0.ab0;
import jn0.bb0;
import jn0.cb0;
import jn0.i20;
import jn0.ju;
import jn0.k7;
import jn0.qa0;
import jn0.r50;
import jn0.tu;
import jn0.v20;
import jn0.xa0;
import jn0.yf0;
import jn0.za0;
import jo.a80;
import jo.ed0;
import jo.f4Shadow;
import jo.g2;
import jo.gw;
import jo.h8;
import jo.i40;
import jo.k5;
import jo.ld0;
import jo.mi0;
import jo.nd0;
import jo.od0;
import jo.pd0;
import jo.qd0;
import jo.qw;
import jo.v40;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import m10.k20;
import m10.l9;
import m10.m0;
import m10.wh;
import m10.yh;
import m10.z0;
import ow0.a1;
import ow0.b1;
import ow0.c1;
import ow0.d1;
import pz0.h6;
import pz0.i0;
import pz0.le;
import pz0.ne;
import pz0.nw;
import rm0.v4;
import rm0.ya;
import s01.oShadow;
import s01.p;
import sy.z;
import t00.f8;
import t00.h7;
import t00.q6;
import t00.z1;
import v71.v;
import y00.l;
import y71.n1Shadow;
import y71.y;
import z01.h0;
import zx.a2;
import zx.b2;
import zx.c2;
import zx.d2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements h0, mi0, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.b s;
    public com.github.service.wrapper.j t;
    public v u;
    public p v;
    public p w;
    public Object x;
    public Object y;

    public j(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, com.github.service.wrapper.j jVar2, v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k.g(jVar, "client");
                k.g(bVar, "cachedClient");
                k.g(jVar2, "uncachedClient");
                k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = jVar2;
                this.u = vVar;
                s5.a aVar = new s5.a(27);
                sw0.b bVar2 = new sw0.b(2);
                oShadow oVar = oShadow.r;
                this.v = new sw0.c(jVar, bVar, vVar, aVar, bVar2, oVar, new sw0.b(3), new s5.a(28), new s5.a(29), new sw0.e(0), new sw0.e(1), new sw0.b(4), (LinkedHashSet) null, 120832);
                this.w = new sw0.c(jVar, bVar, vVar, new s5.a(22), new ya(29), oVar, new sw0.b(0), new s5.a(23), new s5.a(24), new s5.a(25), new s5.a(26), new sw0.b(1), (LinkedHashSet) null, 120832);
                this.x = new c0(bVar, 3);
                this.y = new c0(bVar, 4);
                break;
            default:
                k.g(jVar, "client");
                k.g(bVar, "cachedClient");
                k.g(jVar2, "uncachedClient");
                k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = jVar2;
                this.u = vVar;
                jy.b bVar3 = new jy.b(4);
                ie.d dVar = new ie.d(22);
                oShadow oVar2 = oShadow.r;
                this.v = new jy.d(jVar, bVar, vVar, bVar3, dVar, oVar2, new ie.d(23), new jy.b(5), new jy.b(6), new jy.b(7), new jy.b(8), new ie.d(24), null, 120832);
                this.w = new a00.b(jVar, bVar, vVar, new io0.f(29), new ie.d(19), oVar2, new ie.d(20), new jy.b(0), new jy.b(1), new jy.b(2), new jy.b(3), new ie.d(21), null, 120832);
                this.x = new c0(bVar, 1);
                this.y = new c0(bVar, 2);
                break;
        }
    }

    public final y71.i a(String str, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "id");
                k.g(str2, "title");
                wh.Companion.getClass();
                nd0 nd0Var = new nd0(new pd0(new od0(str, str2, str2, ((q) wh.B).a)));
                return n1Shadow.y(f4Shadow.f(rShadow.h(this.s.k(new qd0(str, str2), nd0Var))), this.u);
            default:
                k.g(str, "id");
                k.g(str2, "title");
                le.Companion.getClass();
                za0 za0Var = new za0(new bb0(new ab0(str, str2, str2, ((q) le.A).a)));
                return n1Shadow.y(f4Shadow.f(rShadow.h(this.s.k(new cb0(str, str2), za0Var))), this.u);
        }
    }

    public final y71.i b(String str, String str2, ArrayList arrayList) {
        switch (this.r) {
            case 0:
                k.g(str, "id");
                aa1.b bVar = t0.d;
                return n1Shadow.y(new az0.c(new l(rShadow.h(this.s.d(new ld0(str, bVar, bVar, str2 == null ? bVar : new u0(str2), bVar))), 10), 12), this.u);
            default:
                k.g(str, "id");
                aa1.b bVar2 = t0.d;
                return n1Shadow.y(new q6(new l(rShadow.h(this.s.d(new xa0(str, bVar2, bVar2, str2 == null ? bVar2 : new u0(str2), bVar2))), 10), 20), this.u);
        }
    }

    public final y71.i c(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return n1Shadow.y(((jy.d) this.v).h(new jy.c(str, str2, str3)), this.u);
            default:
                k.g(str, "queryString");
                return n1Shadow.y(this.v.h(new sw0.d(str, str2, str3)), this.u);
        }
    }

    public final y71.i d(String str) {
        switch (this.r) {
            case 0:
                k.g(str, "id");
                return n1Shadow.y(new aq.c(new y(rShadow.k(this.s.d(new qw(str))), new gi.b(this, str, null, 14), 6), 5), this.u);
            default:
                k.g(str, "id");
                return n1Shadow.y(new tw0.i(new y(rShadow.k(this.s.d(new tu(str))), new v4(this, str, (a71.c) null, 9), 6), 0), this.u);
        }
    }

    public final y71.i e(String str) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return n1Shadow.y(((a00.b) this.w).h(new jy.a(str)), this.u);
            default:
                k.g(str, "queryString");
                return n1Shadow.y(this.w.h(new sw0.a(str)), this.u);
        }
    }

    public final y71.i f(String str) {
        switch (this.r) {
            case 0:
                return n1Shadow.y(new gl.f(com.github.service.wrapper.a.o(this.t, new i40(p10.c.a(str), 10, t0.d), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 12), this.u);
            default:
                return n1Shadow.y(new h7(com.github.service.wrapper.a.o(this.t, new i20(p10.c.a(str), 10, t0.d), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 18), this.u);
        }
    }

    public final y71.i g(String str) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return n1Shadow.y(((a00.b) this.w).e(new jy.a(str)), this.u);
            default:
                k.g(str, "queryString");
                return n1Shadow.y(this.w.e(new sw0.a(str)), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    public final y71.i i(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return n1Shadow.y(new go0.i(((jy.d) this.v).e(new jy.c(str, str2, str3)), str3, 9), this.u);
            default:
                k.g(str, "queryString");
                return n1Shadow.y(new go0.i(this.v.e(new sw0.d(str, str2, str3)), str3, 15), this.u);
        }
    }

    public final y71.i j(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return n1Shadow.y(rShadow.l(((jy.d) this.v).b(new jy.c(str, str2, str3))), this.u);
            default:
                k.g(str, "queryString");
                return n1Shadow.y(rShadow.l(this.v.b(new sw0.d(str, str2, str3))), this.u);
        }
    }

    public final Object k(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                Boolean bool = Boolean.FALSE;
                wh.Companion.getClass();
                a2 a2Var = new a2(new c2(new b2(bool, str, ((q) wh.B).a)));
                String g = x.i.g("type:issue repo:", str2, "/", str3, " sort:created-desc is:open");
                u0 u0Var = new u0((Object) null);
                aa1.b bVar = t0.d;
                aa1.b u0Var2 = str2 == null ? bVar : new u0(str2);
                if (str3 != null) {
                    bVar = new u0(str3);
                }
                return n1Shadow.y(rShadow.l(new y(new l(rShadow.h(this.s.k(new d2(str), a2Var)), 10), new u(this, new v40(g, u0Var, u0Var2, bVar, new u0(Boolean.TRUE)), str, (a71.c) null, 9), 6)), this.u);
            default:
                Boolean bool2 = Boolean.FALSE;
                le.Companion.getClass();
                a1 a1Var = new a1(new c1(new b1(bool2, str, ((q) le.A).a)));
                String g2 = x.i.g("type:issue repo:", str2, "/", str3, " sort:created-desc is:open");
                a71.c cVar = null;
                u0 u0Var3 = new u0((Object) null);
                aa1.b bVar2 = t0.d;
                aa1.b u0Var4 = str2 == null ? bVar2 : new u0(str2);
                if (str3 != null) {
                    bVar2 = new u0(str3);
                }
                return n1Shadow.y(rShadow.l(new y(new l(rShadow.h(this.s.k(new d1(str), a1Var)), 10), new z1(this, new v20(g2, u0Var3, u0Var4, bVar2, new u0(Boolean.TRUE)), str, cVar, 8), 6)), this.u);
        }
    }

    public final y71.i l(String str) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return n1Shadow.y(rShadow.l(((a00.b) this.w).b(new jy.a(str))), this.u);
            default:
                k.g(str, "queryString");
                return n1Shadow.y(rShadow.l(this.w.b(new sw0.a(str))), this.u);
        }
    }

    public final y71.i m(h01.e eVar) {
        switch (this.r) {
            case 0:
                String str = eVar.a;
                String str2 = eVar.b;
                aa1.b s = a.a.s(eVar.c);
                aa1.b s2 = a.a.s(eVar.d);
                aa1.b s3 = a.a.s(eVar.e);
                aa1.b s4 = a.a.s(eVar.f);
                aa1.b s5 = a.a.s(eVar.g);
                aa1.b s6 = a.a.s(eVar.i);
                aa1.b s7 = a.a.s(eVar.h);
                aa1.b s8 = a.a.s(eVar.j);
                AgentAssignment agentAssignment = eVar.k;
                return n1Shadow.y(new cn.q(new c00.g(new l(rShadow.k(this.s.d(new h8(new l9(a.a.s(agentAssignment != null ? new z0(a.a.s(agentAssignment.s), a.a.s(agentAssignment.u), a.a.s(agentAssignment.t), a.a.s(agentAssignment.v), a.a.s(agentAssignment.r)) : null), s3, s, s6, s7, s5, s4, s2, s8, str, str2)))), 10), eVar, this, 12), 12), this.u);
            default:
                String str3 = eVar.a;
                String str4 = eVar.b;
                String str5 = eVar.c;
                aa1.b bVar = t0.d;
                aa1.b u0Var = str5 == null ? bVar : new u0(str5);
                String str6 = eVar.d;
                aa1.b u0Var2 = str6 == null ? bVar : new u0(str6);
                List list = eVar.e;
                aa1.b u0Var3 = list == null ? bVar : new u0(list);
                String str7 = eVar.f;
                aa1.b u0Var4 = str7 == null ? bVar : new u0(str7);
                List list2 = eVar.g;
                aa1.b u0Var5 = list2 == null ? bVar : new u0(list2);
                String str8 = eVar.i;
                aa1.b u0Var6 = str8 == null ? bVar : new u0(str8);
                String str9 = eVar.h;
                if (str9 != null) {
                    bVar = new u0(str9);
                }
                return n1Shadow.y(new f8(3, new c00.g(new l(rShadow.k(this.s.d(new k7(new h6(u0Var3, u0Var, u0Var6, bVar, u0Var5, u0Var4, u0Var2, str3, str4)))), 10), eVar, this, 21)), this.u);
        }
    }

    public final y71.i n(String str, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "parentIssueId");
                k.g(str2, "subIssueId");
                return n1Shadow.y(rShadow.l(new y(rShadow.h(this.s.d(new gw(new k20(str, str2)))), new u(this, str, str2, (a71.c) null, 8), 6)), this.u);
            default:
                k.g(str, "parentIssueId");
                k.g(str2, "subIssueId");
                return n1Shadow.y(rShadow.l(new y(rShadow.h(this.s.d(new ju(new nw(str, str2)))), new z1(this, str, str2, null, 7), 6)), this.u);
        }
    }

    public final y71.i o(Boolean bool, String str, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "parentIssueId");
                k.g(str2, "subIssueId");
                return n1Shadow.y(rShadow.l(rShadow.h(this.s.d(new g2(new m0(new u0(str2), new u0(bool), str))))), this.u);
            default:
                k.g(str, "parentIssueId");
                k.g(str2, "subIssueId");
                return n1Shadow.y(rShadow.l(rShadow.h(this.s.d(new jn0.b2(new i0(new u0(str2), new u0(bool), str))))), this.u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y71.i p(String str, CloseReason closeReason, z01.p pVar) {
        yh yhVar;
        ne neVar;
        switch (this.r) {
            case 0:
                k.g(str, "id");
                int i = closeReason == null ? -1 : z.a[closeReason.ordinal()];
                if (i == -1) {
                    yhVar = null;
                } else if (i == 1) {
                    yhVar = yh.s;
                } else if (i == 2) {
                    yhVar = yh.u;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yhVar = yh.t;
                }
                aa1.b bVar = t0.d;
                aa1.b u0Var = yhVar == null ? bVar : new u0(yhVar);
                String str2 = pVar != null ? pVar.a : null;
                if (str2 != null) {
                    bVar = new u0(str2);
                }
                return n1Shadow.y(new aq.c(new y(rShadow.k(this.s.d(new k5(str, u0Var, bVar))), new u(this, str, closeReason, (a71.c) null, 7), 6), 4), this.u);
            default:
                k.g(str, "id");
                int i2 = closeReason == null ? -1 : bx0.p.a[closeReason.ordinal()];
                a71.c cVar = null;
                if (i2 != -1) {
                    if (i2 == 1) {
                        neVar = ne.s;
                    } else if (i2 == 2) {
                        neVar = ne.t;
                    } else if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return n1Shadow.y(new aq.c(new y(rShadow.k(this.s.d(new a5(str, neVar != null ? t0.d : new u0(neVar)))), new z1(this, str, closeReason, cVar, 6), 6), 29), this.u);
                }
                neVar = null;
                return n1Shadow.y(new aq.c(new y(rShadow.k(this.s.d(new a5(str, neVar != null ? t0.d : new u0(neVar)))), new z1(this, str, closeReason, cVar, 6), 6), 29), this.u);
        }
    }

    public final y71.i q(String str) {
        switch (this.r) {
            case 0:
                k.g(str, "issueId");
                return new gl.f(com.github.service.wrapper.a.o(this.s, new a80(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 13);
            default:
                k.g(str, "issueId");
                return new h7(com.github.service.wrapper.a.o(this.s, new r50(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 19);
        }
    }

    public final y71.i r(String str, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "issueId");
                return n1Shadow.y(new az0.c(new l(rShadow.h(this.s.d(new ed0(str, str2 == null ? t0.d : new u0(str2)))), 10), 13), this.u);
            default:
                k.g(str, "issueId");
                return n1Shadow.y(new q6(new l(rShadow.h(this.s.d(new qa0(str, str2 == null ? t0.d : new u0(str2)))), 10), 21), this.u);
        }
    }
}
