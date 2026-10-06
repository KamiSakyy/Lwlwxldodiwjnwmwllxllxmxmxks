package rm0;

import com.github.service.agents.AgentAssignment;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.ArrayList;
import kc0.n00;
import kc0.yb0;
import u10.py;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements z01.c, yb0, y90 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.bShadow s;
    public final v71.v t;

    public f(com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
        }
    }

    @Override // z01.c
    public final Object a(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new az0.c(new y00.l(com.github.service.wrapper.a.o(this.s, new ld0.g(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), ga.h.r, false, null, null, 56), 10), 28), this.t);
            default:
                return y71.n1.y(new t00.q6(new y00.l(com.github.service.wrapper.a.o(this.s, new v20.g(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), ga.h.r, false, null, null, 56), 10), 27), this.t);
        }
    }

    @Override // z01.c
    public final y71.i b(String str, ArrayList arrayList, AgentAssignment agentAssignment, ProjectsMetaInfo projectsMetaInfo, String str2) {
        switch (this.r) {
            case 0:
                z01.bShadow bVar = z01.b.r;
                k71.k.g(str, "assignableId");
                return y41.t1.S("addAssigneesToAssignable", "3.12");
            default:
                z01.bShadow bVar2 = z01.b.r;
                k71.k.g(str, "assignableId");
                return y41.t1.S("addAssigneesToAssignable", "3.10");
        }
    }

    @Override // z01.c
    public final Object c(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new c(new y00.l(com.github.service.wrapper.a.o(this.s, new kc0.y2(new aa.u0(str3), str2 == null ? aa.t0.d : new aa.u0(str2), str), ga.h.r, false, null, null, 56), 10), str2, 0), this.t);
            default:
                return y71.n1.y(new c(new y00.l(com.github.service.wrapper.a.o(this.s, new u10.y2(new aa.u0(str3), str2 == null ? aa.t0.d : new aa.u0(str2), str), ga.h.r, false, null, null, 56), 10), str2, 2), this.t);
        }
    }

    @Override // z01.c
    public final y71.i d(String str, z01.bShadow bVar, ArrayList arrayList, ProjectsMetaInfo projectsMetaInfo, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "assignableId");
                k71.k.g(bVar, "assignable");
                return y71.n1.y(new az0.c(new y00.l(in.r.h(this.s.d(new n00(str, arrayList))), 10), 29), this.t);
            default:
                k71.k.g(str, "assignableId");
                k71.k.g(bVar, "assignable");
                return y71.n1.y(new t00.q6(new y00.l(in.r.h(this.s.d(new py(str, arrayList))), 10), 28), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
    public Object ordinal() { return null; }
}
