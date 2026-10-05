package hl0;

import aa.m0;
import aa.q;
import aa.q0;
import aa.t0;
import aa.u0;
import bz0.t;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.wrapper.j;
import dl0.r0;
import dl0.s0;
import g3.a0;
import g3.b0;
import gn0.hc;
import gn0.s5;
import gn0.xc;
import gn0.zc;
import hc0.i5;
import hc0.jc;
import hc0.lc;
import hc0.tb;
import hc0.vb;
import in.r;
import java.util.ArrayList;
import java.util.List;
import jo.f4;
import k71.k;
import kc0.fs;
import kc0.gs;
import kc0.gz;
import kc0.hs;
import kc0.is;
import kc0.q4;
import kc0.s4;
import kc0.t4;
import kc0.t60;
import kc0.u4;
import kc0.u6;
import kc0.v60;
import kc0.w60;
import kc0.x60;
import kc0.y60;
import kc0.yb0;
import kotlin.NoWhenBranchMatchedException;
import mg0.k0;
import py0.o;
import s01.p;
import t00.z1;
import u10.a50;
import u10.br;
import u10.cr;
import u10.dr;
import u10.er;
import u10.hx;
import u10.m6;
import u10.v40;
import u10.x40;
import u10.y40;
import u10.y90;
import u10.z40;
import v71.v;
import vb0.p1;
import vb0.u;
import w50.i0;
import y00.l;
import y41.t1;
import y71.i;
import y71.n1;
import y71.y;
import z01.h0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements h0, yb0, y90 {
    public final /* synthetic */ int r;
    public final j s;
    public final com.github.service.wrapper.b t;
    public final v u;
    public final p v;

    public f(j jVar, com.github.service.wrapper.b bVar, v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k.g(jVar, "client");
                k.g(bVar, "cachedClient");
                k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new jy.d(jVar, bVar, vVar, new q00.c(5), new o(6), s01.o.r, new o(7), new q00.c(6), new q00.c(7), new q00.c(8), new q00.c(9), new o(8), null, 120832);
                break;
            default:
                k.g(jVar, "client");
                k.g(bVar, "cachedClient");
                k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new a00.b(jVar, bVar, vVar, new b0(21), new a0(21), s01.o.r, new a0(22), new b0(22), new b0(23), new b0(24), new b0(25), new a0(23), null, 120832);
                break;
        }
    }

    @Override // z01.h0
    public final i a(String str, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "id");
                k.g(str2, "title");
                hc.Companion.getClass();
                v60 v60Var = new v60(new x60(new w60(str, str2, str2, ((q) hc.x).a)));
                return n1.y(f4.f(r.h(this.t.k(new y60(str, str2), v60Var))), this.u);
            default:
                k.g(str, "id");
                k.g(str2, "title");
                tb.Companion.getClass();
                m0 x40Var = new x40(new z40(new y40(str, str2, str2, ((q) tb.x).a)));
                return n1.y(f4.f(r.h(this.t.k(new a50(str, str2), x40Var))), this.u);
        }
    }

    @Override // z01.h0
    public final i b(String str, String str2, ArrayList arrayList) {
        switch (this.r) {
            case 0:
                k.g(str, "id");
                aa1.b bVar = t0.d;
                return n1.y(new az0.c(new l(r.h(this.t.d(new t60(str, bVar, bVar, str2 == null ? bVar : new u0(str2), arrayList == null ? bVar : new u0(arrayList), bVar))), 10), 10), this.u);
            default:
                k.g(str, "id");
                aa1.b bVar2 = t0.d;
                return n1.y(new u(new l(r.h(this.t.d(new v40(str, bVar2, bVar2, str2 == null ? bVar2 : new u0(str2), arrayList == null ? bVar2 : new u0(arrayList), bVar2))), 10), 17), this.u);
        }
    }

    @Override // z01.h0
    public final i c(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return n1.y(this.v.h(new gl0.a(str, str2, str3)), this.u);
            default:
                k.g(str, "queryString");
                return n1.y(this.v.h(new qa0.a(str, str2, str3)), this.u);
        }
    }

    @Override // z01.h0
    public final i d(String str) {
        switch (this.r) {
            case 0:
                k.g(str, "id");
                hc.Companion.getClass();
                String str2 = ((q) hc.x).a;
                fs fsVar = new fs(new hs(new gs(str2, str, new k0(str, xc.u, zc.v, true, str2))));
                return n1.y(new t(r.k(this.t.k(new is(str), fsVar)), 16), this.u);
            default:
                k.g(str, "id");
                tb.Companion.getClass();
                String str3 = ((q) tb.x).a;
                m0 brVar = new br(new dr(new cr(str3, str, new i0(str, jc.u, lc.v, true, str3))));
                return n1.y(new p1(r.k(this.t.k(new er(str), brVar)), 4), this.u);
        }
    }

    @Override // z01.h0
    public final i e(String str) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return t1.S("refreshAdvancedSearchIssuesOrPullRequests", "3.12");
            default:
                k.g(str, "queryString");
                return t1.S("refreshAdvancedSearchIssuesOrPullRequests", "3.10");
        }
    }

    @Override // z01.h0
    public final i f(String str) {
        switch (this.r) {
            case 0:
                return t1.S("fetchAdvancedSearchIssuesOrPullRequests", "3.12");
            default:
                return t1.S("fetchAdvancedSearchIssuesOrPullRequests", "3.10");
        }
    }

    @Override // z01.h0
    public final i g(String str) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return t1.S("observeAdvancedSearchIssuesOrPullRequests", "3.12");
            default:
                k.g(str, "queryString");
                return t1.S("observeAdvancedSearchIssuesOrPullRequests", "3.10");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    @Override // z01.h0
    public final i i(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return n1.y(new go0.i(this.v.e(new gl0.a(str, str2, str3)), str3, 5), this.u);
            default:
                k.g(str, "queryString");
                return n1.y(new go0.i(this.v.e(new qa0.a(str, str2, str3)), str3, 16), this.u);
        }
    }

    @Override // z01.h0
    public final i j(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return n1.y(r.l(this.v.b(new gl0.a(str, str2, str3))), this.u);
            default:
                k.g(str, "queryString");
                return n1.y(r.l(this.v.b(new qa0.a(str, str2, str3))), this.u);
        }
    }

    @Override // z01.h0
    public final Object k(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                Boolean bool = Boolean.FALSE;
                hc.Companion.getClass();
                r0 r0Var = new r0(new dl0.t0(new s0(bool, str, ((q) hc.x).a)));
                String g = x.i.g("type:issue repo:", str2, "/", str3, " sort:created-desc is:open");
                u0 u0Var = new u0((Object) null);
                aa1.b bVar = t0.d;
                aa1.b u0Var2 = str2 == null ? bVar : new u0(str2);
                if (str3 != null) {
                    bVar = new u0(str3);
                }
                return n1.y(r.l(new y(new l(r.h(this.t.k(new dl0.u0(str), r0Var)), 10), new h1.u(this, new gz(g, u0Var, u0Var2, bVar, new u0(Boolean.TRUE)), str, (a71.c) null, 3), 6)), this.u);
            default:
                Boolean bool2 = Boolean.FALSE;
                tb.Companion.getClass();
                m0 r0Var2 = new na0.r0(new na0.t0(new na0.s0(bool2, str, ((q) tb.x).a)));
                String g2 = x.i.g("type:issue repo:", str2, "/", str3, " sort:created-desc is:open");
                u0 u0Var3 = new u0((Object) null);
                aa1.b bVar2 = t0.d;
                aa1.b u0Var4 = str2 == null ? bVar2 : new u0(str2);
                if (str3 != null) {
                    bVar2 = new u0(str3);
                }
                return n1.y(r.l(new y(new l(r.h(this.t.k(new na0.u0(str), r0Var2)), 10), new z1(this, new hx(g2, u0Var3, u0Var4, bVar2, new u0(Boolean.TRUE)), str, (a71.c) null, 12), 6)), this.u);
        }
    }

    @Override // z01.h0
    public final i l(String str) {
        switch (this.r) {
            case 0:
                k.g(str, "queryString");
                return t1.S("loadAdvancedSearchIssuesOrPullRequestsPage", "3.12");
            default:
                k.g(str, "queryString");
                return t1.S("loadAdvancedSearchIssuesOrPullRequestsPage", "3.10");
        }
    }

    @Override // z01.h0
    public final i m(h01.e eVar) {
        switch (this.r) {
            case 0:
                String str = eVar.a;
                String str2 = eVar.b;
                String str3 = eVar.c;
                aa1.b bVar = t0.d;
                aa1.b u0Var = str3 == null ? bVar : new u0(str3);
                List list = eVar.e;
                aa1.b u0Var2 = list == null ? bVar : new u0(list);
                String str4 = eVar.f;
                aa1.b u0Var3 = str4 == null ? bVar : new u0(str4);
                List list2 = eVar.g;
                aa1.b u0Var4 = list2 == null ? bVar : new u0(list2);
                String str5 = eVar.i;
                if (str5 != null) {
                    bVar = new u0(str5);
                }
                return n1.y(new az0.c(new l(r.k(this.s.d(new u6(new s5(u0Var2, u0Var, bVar, u0Var4, u0Var3, str, str2)))), 10), 9), this.u);
            default:
                String str6 = eVar.a;
                String str7 = eVar.b;
                String str8 = eVar.c;
                aa1.b bVar2 = t0.d;
                aa1.b u0Var5 = str8 == null ? bVar2 : new u0(str8);
                List list3 = eVar.e;
                aa1.b u0Var6 = list3 == null ? bVar2 : new u0(list3);
                String str9 = eVar.f;
                aa1.b u0Var7 = str9 == null ? bVar2 : new u0(str9);
                List list4 = eVar.g;
                aa1.b u0Var8 = list4 == null ? bVar2 : new u0(list4);
                String str10 = eVar.i;
                if (str10 != null) {
                    bVar2 = new u0(str10);
                }
                return n1.y(new u(new l(r.k(this.s.d(new m6(new i5(u0Var6, u0Var5, bVar2, u0Var8, u0Var7, str6, str7)))), 10), 16), this.u);
        }
    }

    @Override // z01.h0
    public final i n(String str, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "parentIssueId");
                k.g(str2, "subIssueId");
                return t1.S("removeSubIssue", "3.12");
            default:
                k.g(str, "parentIssueId");
                k.g(str2, "subIssueId");
                return t1.S("removeSubIssue", "3.10");
        }
    }

    @Override // z01.h0
    public final i o(Boolean bool, String str, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "parentIssueId");
                k.g(str2, "subIssueId");
                return t1.S("addSubIssue", "3.12");
            default:
                k.g(str, "parentIssueId");
                k.g(str2, "subIssueId");
                return t1.S("addSubIssue", "3.10");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    @Override // z01.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i p(String str, CloseReason closeReason, z01.p pVar) {
        zc zcVar;
        int i;
        int i2;
        lc lcVar;
        int i3;
        int i4;
        switch (this.r) {
            case 0:
                k.g(str, "id");
                hc.Companion.getClass();
                q0 q0Var = hc.x;
                String str2 = ((q) q0Var).a;
                xc xcVar = xc.t;
                gn0.jc jcVar = null;
                if (closeReason != null && (i2 = pl0.o.a[closeReason.ordinal()]) != -1) {
                    if (i2 == 1) {
                        zcVar = zc.t;
                    } else if (i2 == 2) {
                        zcVar = zc.u;
                    } else if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s4 s4Var = new s4(new q4(new t4(str2, str, new k0(str, xcVar, zcVar, true, ((q) q0Var).a))));
                    i = closeReason != null ? -1 : pl0.o.a[closeReason.ordinal()];
                    if (i != -1) {
                        if (i == 1) {
                            jcVar = gn0.jc.s;
                        } else if (i == 2) {
                            jcVar = gn0.jc.t;
                        } else if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return n1.y(new t(r.k(this.t.k(new u4(str, jcVar != null ? t0.d : new u0(jcVar)), s4Var)), 15), this.u);
                }
                zcVar = null;
                s4 s4Var2 = new s4(new q4(new t4(str2, str, new k0(str, xcVar, zcVar, true, ((q) q0Var).a))));
                if (closeReason != null) {
                }
                if (i != -1) {
                }
                return n1.y(new t(r.k(this.t.k(new u4(str, jcVar != null ? t0.d : new u0(jcVar)), s4Var2)), 15), this.u);
            default:
                k.g(str, "id");
                tb.Companion.getClass();
                q0 q0Var2 = tb.x;
                String str3 = ((q) q0Var2).a;
                jc jcVar2 = jc.t;
                vb vbVar = null;
                if (closeReason != null && (i4 = va0.o.a[closeReason.ordinal()]) != -1) {
                    if (i4 == 1) {
                        lcVar = lc.t;
                    } else if (i4 == 2) {
                        lcVar = lc.u;
                    } else if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m0 s4Var3 = new u10.s4(new u10.q4(new u10.t4(str3, str, new i0(str, jcVar2, lcVar, true, ((q) q0Var2).a))));
                    i3 = closeReason != null ? -1 : va0.o.a[closeReason.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            vbVar = vb.s;
                        } else if (i3 == 2) {
                            vbVar = vb.t;
                        } else if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return n1.y(new p1(r.k(this.t.k(new u10.u4(str, vbVar != null ? t0.d : new u0(vbVar)), s4Var3)), 3), this.u);
                }
                lcVar = null;
                m0 s4Var32 = new u10.s4(new u10.q4(new u10.t4(str3, str, new i0(str, jcVar2, lcVar, true, ((q) q0Var2).a))));
                if (closeReason != null) {
                }
                if (i3 != -1) {
                }
                return n1.y(new p1(r.k(this.t.k(new u10.u4(str, vbVar != null ? t0.d : new u0(vbVar)), s4Var32)), 3), this.u);
        }
    }

    @Override // z01.h0
    public final i q(String str) {
        switch (this.r) {
            case 0:
                k.g(str, "issueId");
                return t1.S("fetchSubIssues", "3.12");
            default:
                k.g(str, "issueId");
                return t1.S("fetchSubIssues", "3.10");
        }
    }

    @Override // z01.h0
    public final i r(String str, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "issueId");
                return t1.S("updateIssueIssueType", "3.12");
            default:
                k.g(str, "issueId");
                return t1.S("updateIssueIssueType", "3.10");
        }
    }
}
