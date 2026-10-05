package rm0;

import com.github.service.models.ApiFailureType;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.df;
import jn0.fv;
import jn0.nv;
import jn0.tf;
import jn0.yf0;
import jn0.zz;
import jo.bg;
import jo.cx;
import jo.kx;
import jo.mi0;
import jo.qg;
import jo.z10;
import kc0.be;
import kc0.ct;
import kc0.jw;
import kc0.md;
import kc0.us;
import kc0.yb0;
import m10.hf;
import m10.jf;
import m10.mf;
import pz0.dc;
import pz0.ec;
import pz0.fc;
import u10.id;
import u10.qr;
import u10.tc;
import u10.vu;
import u10.y90;
import u10.yr;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a3 implements z01.s, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final q81.u t;
    public final v71.v u;

    public a3(com.github.service.wrapper.j jVar, q81.u uVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = uVar;
                this.u = vVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = uVar;
                this.u = vVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = uVar;
                this.u = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = uVar;
                this.u = vVar;
                break;
        }
    }

    @Override // z01.s
    public final y71.i a(String str, String str2, String str3, String str4, File file, boolean z) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str3, "ref");
                k71.k.g(str4, "path");
                return y71.n1.y(new p2(new y00.l(com.github.service.wrapper.a.o(this.s, new us(str, str2, str3, str4), null, false, null, null, 58), 10), this, file, str4, z, 0), this.u);
            case 1:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str3, "ref");
                k71.k.g(str4, "path");
                return y71.n1.y(new p2(new y00.l(com.github.service.wrapper.a.o(this.s, new cx(str, str2, str3, str4), null, false, null, null, 58), 10), this, file, str4, z, 1), this.u);
            case 2:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str3, "ref");
                k71.k.g(str4, "path");
                return y71.n1.y(new p2(new y00.l(com.github.service.wrapper.a.o(this.s, new qr(str, str2, str3, str4), null, false, null, null, 58), 10), this, file, str4, z, 2), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str3, "ref");
                k71.k.g(str4, "path");
                return y71.n1.y(new p2(new y00.l(com.github.service.wrapper.a.o(this.s, new fv(str, str2, str3, str4), null, false, null, null, 58), 10), this, file, str4, z, 3), this.u);
        }
    }

    @Override // z01.s
    public final y71.i b(String str, String str2, String str3, String str4, String str5, String str6, e01.a aVar) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "branchName");
                k71.k.g(str6, "$v$c$com-github-android-common-datatypes-CommitOid$-expectedHeadOid$0");
                List<e01.b> list = aVar.a;
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                for (e01.b bVar : list) {
                    arrayList.add(new gn0.ha(bVar.c, bVar.a));
                }
                aa.u0 u0Var = new aa.u0(arrayList);
                List list2 = aVar.b;
                ArrayList arrayList2 = new ArrayList(x61.n.F(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new gn0.ja(((e01.c) it.next()).a));
                }
                gn0.ia iaVar = new gn0.ia(u0Var, new aa.u0(arrayList2));
                aa.u0 u0Var2 = new aa.u0(str3);
                String h = f1.e.h(str, "/", str2);
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new kc0.k6(new gn0.i5(new gn0.l4(u0Var2, h == null ? aa.t0.d : new aa.u0(h)), str6, new aa.u0(iaVar), new gn0.k4(new aa.u0(str4), str5)))))), this.u);
            case 1:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "branchName");
                k71.k.g(str6, "$v$c$com-github-android-common-datatypes-CommitOid$-expectedHeadOid$0");
                List<e01.b> list3 = aVar.a;
                ArrayList arrayList3 = new ArrayList(x61.n.F(list3, 10));
                for (e01.b bVar2 : list3) {
                    arrayList3.add(new hf(bVar2.c, bVar2.a));
                }
                aa.u0 u0Var3 = new aa.u0(arrayList3);
                List list4 = aVar.b;
                ArrayList arrayList4 = new ArrayList(x61.n.F(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new mf(((e01.c) it2.next()).a));
                }
                jf jfVar = new jf(u0Var3, new aa.u0(arrayList4));
                aa.u0 u0Var4 = new aa.u0(str3);
                String h2 = f1.e.h(str, "/", str2);
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new jo.j7(new m10.x8(new m10.g6(u0Var4, h2 == null ? aa.t0.d : new aa.u0(h2)), str6, new aa.u0(jfVar), new m10.f6(new aa.u0(str4), str5)))))), this.u);
            case 2:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "branchName");
                k71.k.g(str6, "$v$c$com-github-android-common-datatypes-CommitOid$-expectedHeadOid$0");
                List<e01.b> list5 = aVar.a;
                ArrayList arrayList5 = new ArrayList(x61.n.F(list5, 10));
                for (e01.b bVar3 : list5) {
                    arrayList5.add(new hc0.t9(bVar3.c, bVar3.a));
                }
                aa.u0 u0Var5 = new aa.u0(arrayList5);
                List list6 = aVar.b;
                ArrayList arrayList6 = new ArrayList(x61.n.F(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(new hc0.v9(((e01.c) it3.next()).a));
                }
                hc0.u9 u9Var = new hc0.u9(u0Var5, new aa.u0(arrayList6));
                aa.u0 u0Var6 = new aa.u0(str3);
                String h3 = f1.e.h(str, "/", str2);
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new u10.c6(new hc0.y4(new hc0.b4(u0Var6, h3 == null ? aa.t0.d : new aa.u0(h3)), str6, new aa.u0(u9Var), new hc0.a4(new aa.u0(str4), str5)))))), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "branchName");
                k71.k.g(str6, "$v$c$com-github-android-common-datatypes-CommitOid$-expectedHeadOid$0");
                List<e01.b> list7 = aVar.a;
                ArrayList arrayList7 = new ArrayList(x61.n.F(list7, 10));
                for (e01.b bVar4 : list7) {
                    arrayList7.add(new dc(bVar4.c, bVar4.a));
                }
                aa.u0 u0Var7 = new aa.u0(arrayList7);
                List list8 = aVar.b;
                ArrayList arrayList8 = new ArrayList(x61.n.F(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(new fc(((e01.c) it4.next()).a));
                }
                ec ecVar = new ec(u0Var7, new aa.u0(arrayList8));
                aa.u0 u0Var8 = new aa.u0(str3);
                String h4 = f1.e.h(str, "/", str2);
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new jn0.z6(new pz0.x5(new pz0.a5(u0Var8, h4 == null ? aa.t0.d : new aa.u0(h4)), str6, new aa.u0(ecVar), new pz0.z4(new aa.u0(str4), str5)))))), this.u);
        }
    }

    @Override // z01.s
    public final y71.i c(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str4, "path");
                return y71.n1.y(new cn.q(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new ct(str, str2, f1.e.h(str3, ":", str4)), null, false, null, null, 58), 10), 16), 19), this.u);
            case 1:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str4, "path");
                return y71.n1.y(new cn.q(new v9(new y00.l(com.github.service.wrapper.a.o(this.s, new kx(str, str2, f1.e.h(str3, ":", str4)), null, false, null, null, 58), 10), 25), 27), this.u);
            case 2:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str4, "path");
                return y71.n1.y(new t00.f8(5, new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new yr(str, str2, f1.e.h(str3, ":", str4)), null, false, null, null, 58), 10), 15)), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str4, "path");
                return y71.n1.y(new t00.f8(12, new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new nv(str, str2, f1.e.h(str3, ":", str4)), null, false, null, null, 58), 10), 22)), this.u);
        }
    }

    @Override // z01.s
    public final y71.i d(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str4, "path");
                return y71.n1.y(new gl.f(com.github.service.wrapper.a.o(this.s, new be(str, str2, str3, str4), null, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), null, 50), 29), this.u);
            case 1:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str4, "path");
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new qg(str, str2, str3, str4), null, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), null, 50), 11), this.u);
            case 2:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str4, "path");
                return y71.n1.y(new t00.h7(com.github.service.wrapper.a.o(this.s, new id(str, str2, str3, str4), null, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), null, 50), 27), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str4, "path");
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new tf(str, str2, str3, str4), null, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), null, 50), 16), this.u);
        }
    }

    @Override // z01.s
    public final y71.i e(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str3, "branch");
                k71.k.g(str4, "path");
                return y71.n1.y(new y2(com.github.service.wrapper.a.o(this.s, new jw(str, str2, str4.length() == 0 ? str3 : f1.e.h(str3, ":", str4), str3), null, false, null, null, 58), str3, str4, 0), this.u);
            case 1:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str3, "branch");
                k71.k.g(str4, "path");
                return y71.n1.y(new y2(com.github.service.wrapper.a.o(this.s, new z10(str, str2, str4.length() == 0 ? str3 : f1.e.h(str3, ":", str4), str3), null, false, null, null, 58), str3, str4, 1), this.u);
            case 2:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str3, "branch");
                k71.k.g(str4, "path");
                return y71.n1.y(new y2(com.github.service.wrapper.a.o(this.s, new vu(str, str2, str4.length() == 0 ? str3 : f1.e.h(str3, ":", str4), str3), null, false, null, null, 58), str3, str4, 2), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "repo");
                k71.k.g(str3, "branch");
                k71.k.g(str4, "path");
                return y71.n1.y(new y2(com.github.service.wrapper.a.o(this.s, new zz(str, str2, str4.length() == 0 ? str3 : f1.e.h(str3, ":", str4), str3), null, false, null, null, 58), str3, str4, 3), this.u);
        }
    }

    @Override // z01.s
    public final y71.i f(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repoOwner");
                k71.k.g(str2, "repoName");
                StringBuilder sb = new StringBuilder("repo:");
                f1.e.x(sb, str, "/", str2, " AND (");
                return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new kc0.h5(com.github.rudroid.copilot.h1.p(sb, str3, ")"), str4 == null ? aa.t0.d : new aa.u0(str4)), null, false, null, null, 58), 10), 17), this.u);
            case 1:
                k71.k.g(str, "repoOwner");
                k71.k.g(str2, "repoName");
                StringBuilder sb2 = new StringBuilder("repo:");
                f1.e.x(sb2, str, "/", str2, " AND (");
                return y71.n1.y(new v9(new y00.l(com.github.service.wrapper.a.o(this.s, new jo.x5(com.github.rudroid.copilot.h1.p(sb2, str3, ")"), str4 == null ? aa.t0.d : new aa.u0(str4)), null, false, null, null, 58), 10), 26), this.u);
            case 2:
                k71.k.g(str, "repoOwner");
                k71.k.g(str2, "repoName");
                return y41.t1.S("searchCode", "3.10");
            default:
                k71.k.g(str, "repoOwner");
                k71.k.g(str2, "repoName");
                StringBuilder sb3 = new StringBuilder("repo:");
                f1.e.x(sb3, str, "/", str2, " AND (");
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new jn0.n5(com.github.rudroid.copilot.h1.p(sb3, str3, ")"), str4 == null ? aa.t0.d : new aa.u0(str4)), null, false, null, null, 58), 10), 23), this.u);
        }
    }

    @Override // z01.s
    public final y71.i g(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-oid$0");
                k71.k.g(str4, "path");
                return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new md(str, str2, str3, str4), null, false, null, null, 58), 10), 15), this.u);
            case 1:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-oid$0");
                k71.k.g(str4, "path");
                return y71.n1.y(new v9(new y00.l(com.github.service.wrapper.a.o(this.s, new bg(str, str2, str3, str4), null, false, null, null, 58), 10), 24), this.u);
            case 2:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-oid$0");
                k71.k.g(str4, "path");
                return y71.n1.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new tc(str, str2, str3, str4), null, false, null, null, 58), 10), 14), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "$v$c$com-github-android-common-datatypes-CommitOid$-oid$0");
                k71.k.g(str4, "path");
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new df(str, str2, str3, str4), null, false, null, null, 58), 10), 21), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
