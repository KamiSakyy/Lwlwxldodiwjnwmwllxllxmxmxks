package rm0;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import kc0.l80;
import kc0.t60;
import kc0.wx;
import kc0.yb0;
import u10.l60;
import u10.v40;
import u10.y90;
import u10.yv;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ja implements z01.o1, yb0, y90 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.bShadow t;
    public v71.v u;

    public ja(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
        }
    }

    @Override // z01.o1
    public final y71.i a(String str, String str2, ProjectsMetaInfo projectsMetaInfo, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                aa.u0 u0Var = new aa.u0(str2);
                aa.t0 t0Var = aa.t0.d;
                return y71.n1Shadow.y(new v9(new y00.l(in.rShadow.h(this.t.d(new t60(str, t0Var, t0Var, t0Var, t0Var, u0Var))), 10), 4), this.u);
            default:
                k71.k.g(str, "id");
                aa.u0 u0Var2 = new aa.u0(str2);
                aa.t0 t0Var2 = aa.t0.d;
                return y71.n1Shadow.y(new vb0.s7(new y00.l(in.rShadow.h(this.t.d(new v40(str, t0Var2, t0Var2, t0Var2, t0Var2, u0Var2))), 10), 1), this.u);
        }
    }

    @Override // z01.o1
    public final y71.i b(String str, String str2, ProjectsMetaInfo projectsMetaInfo, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                aa.u0 u0Var = new aa.u0(str2);
                aa.t0 t0Var = aa.t0.d;
                return y71.n1Shadow.y(new v9(new y00.l(in.rShadow.h(this.t.d(new l80(str, t0Var, t0Var, t0Var, t0Var, t0Var, u0Var))), 10), 5), this.u);
            default:
                k71.k.g(str, "id");
                aa.u0 u0Var2 = new aa.u0(str2);
                aa.t0 t0Var2 = aa.t0.d;
                return y71.n1Shadow.y(new vb0.s7(new y00.l(in.rShadow.h(this.t.d(new l60(str, t0Var2, t0Var2, t0Var2, t0Var2, t0Var2, u0Var2))), 10), 2), this.u);
        }
    }

    @Override // z01.o1
    public final y71.i c(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y71.n1Shadow.y(new v9(new y00.l(com.github.service.wrapper.a.o(this.s, new wx(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 10), 6), this.u);
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y71.n1Shadow.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new yv(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 10), 3), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
