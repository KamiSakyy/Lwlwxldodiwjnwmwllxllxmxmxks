package t00;

import com.github.service.agents.AgentAssignment;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import jn0.c40;
import jn0.yf0;
import jo.c60;
import jo.mi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements z01.c, mi0, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.b s;
    public com.github.service.wrapper.j t;
    public z01.p0 u;
    public v71.v v;

    public k(int i, com.github.service.wrapper.b bVar, com.github.service.wrapper.j jVar, v71.v vVar, z01.p0 p0Var) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(jVar, "client");
                k71.k.g(p0Var, "boardService");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = jVar;
                this.u = p0Var;
                this.v = vVar;
                break;
            default:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(jVar, "client");
                k71.k.g(p0Var, "boardService");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = jVar;
                this.u = p0Var;
                this.v = vVar;
                break;
        }
    }

    public final Object a(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new rm0.v9(new y00.l(com.github.service.wrapper.a.o(this.s, new zx.m1(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), ga.h.r, false, (LinkedHashSet) null, (Set) null, 56), 10), 7), this.v);
            default:
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new oo0.g(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), ga.h.r, false, (LinkedHashSet) null, (Set) null, 56), 10), 4), this.v);
        }
    }

    public final y71.i b(String str, ArrayList arrayList, AgentAssignment agentAssignment, ProjectsMetaInfo projectsMetaInfo, String str2) {
        switch (this.r) {
            case 0:
                z01.b bVar = z01.b.r;
                k71.k.g(str, "assignableId");
                String str3 = agentAssignment.s;
                aa1.b bVar2 = aa.t0.d;
                aa1.b u0Var = str3 == null ? bVar2 : new aa.u0(str3);
                String str4 = agentAssignment.u;
                aa1.b u0Var2 = str4 == null ? bVar2 : new aa.u0(str4);
                String str5 = agentAssignment.t;
                aa1.b u0Var3 = str5 == null ? bVar2 : new aa.u0(str5);
                String str6 = agentAssignment.r;
                aa1.b u0Var4 = str6 == null ? bVar2 : new aa.u0(str6);
                String str7 = agentAssignment.v;
                if (str7 != null) {
                    bVar2 = new aa.u0(str7);
                }
                return y71.n1.y(y71.n1.I(y71.n1.I(new rm0.c8(y71.n1.I(new y00.l(in.r.h(this.s.d(new jo.e(str, arrayList, new aa.u0(new m10.z0(u0Var, u0Var2, u0Var3, bVar2, u0Var4))))), 10), new a(null, projectsMetaInfo, this, 0)), 1), new a(null, projectsMetaInfo, this, 1)), new b(null, projectsMetaInfo, this, str2, 0)), this.v);
            default:
                z01.b bVar3 = z01.b.r;
                k71.k.g(str, "assignableId");
                return y41.t1.S("addAssigneesToAssignable", "3.17");
        }
    }

    public final Object c(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new rm0.c(new y00.l(com.github.service.wrapper.a.o(this.s, new jo.m3(new aa.u0(str3), str2 == null ? aa.t0.d : new aa.u0(str2), str), ga.h.r, false, (LinkedHashSet) null, (Set) null, 56), 10), str2, 1), this.v);
            default:
                return y71.n1.y(new rm0.c(new y00.l(com.github.service.wrapper.a.o(this.s, new jn0.e3(new aa.u0(str3), str2 == null ? aa.t0.d : new aa.u0(str2), str), ga.h.r, false, (LinkedHashSet) null, (Set) null, 56), 10), str2, 3), this.v);
        }
    }

    public final y71.i d(String str, z01.b bVar, ArrayList arrayList, ProjectsMetaInfo projectsMetaInfo, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "assignableId");
                k71.k.g(bVar, "assignable");
                return y71.n1.y(y71.n1.I(y71.n1.I(new rm0.c8(y71.n1.I(new y00.l(in.r.h(this.s.d(new c60(str, arrayList, aa.t0.d))), 10), new a(null, projectsMetaInfo, this, 2)), 2), new a(null, projectsMetaInfo, this, 3)), new b(null, projectsMetaInfo, this, str2, 1)), this.v);
            default:
                k71.k.g(str, "assignableId");
                k71.k.g(bVar, "assignable");
                return y71.n1.y(y71.n1.I(y71.n1.I(new rm0.c8(y71.n1.I(new y00.l(in.r.h(this.s.d(new c40(str, arrayList))), 10), new wy0.c((a71.c) null, projectsMetaInfo, this, 0)), 8), new wy0.c((a71.c) null, projectsMetaInfo, this, 1)), new c00.a((a71.c) null, projectsMetaInfo, this, str2, 12)), this.v);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
