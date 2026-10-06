package t00;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.LinkedHashSet;
import java.util.Set;
import jn0.lc0;
import jn0.m10;
import jn0.xa0;
import jn0.yf0;
import jo.ld0;
import jo.m30;
import jo.mi0;
import jo.ze0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ma implements z01.o1, mi0, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.b t;
    public z01.p0 u;
    public v71.v v;

    public ma(int i, com.github.service.wrapper.b bVar, com.github.service.wrapper.j jVar, v71.v vVar, z01.p0 p0Var) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(p0Var, "boardService");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = p0Var;
                this.v = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(p0Var, "boardService");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = p0Var;
                this.v = vVar;
                break;
        }
    }

    public final y71.i a(String str, String str2, ProjectsMetaInfo projectsMetaInfo, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                aa.u0 u0Var = new aa.u0(str2);
                aa.t0 t0Var = aa.t0.d;
                return y71.n1Shadow.y(y71.n1Shadow.I(y71.n1Shadow.I(new rm0.c8(y71.n1Shadow.I(new y00.l(in.rShadow.h(this.t.d(new ld0(str, t0Var, t0Var, t0Var, u0Var))), 10), new z9(null, projectsMetaInfo, this, 0)), 5), new z9(null, projectsMetaInfo, this, 1)), new aaShadow(null, projectsMetaInfo, this, str3, 0)), this.v);
            default:
                k71.k.g(str, "id");
                aa.u0 u0Var2 = new aa.u0(str2);
                aa.t0 t0Var2 = aa.t0.d;
                return y71.n1Shadow.y(y71.n1Shadow.I(y71.n1Shadow.I(new rm0.c8(y71.n1Shadow.I(new y00.l(in.rShadow.h(this.t.d(new xa0(str, t0Var2, t0Var2, t0Var2, u0Var2))), 10), new wy0.a9((a71.c) null, projectsMetaInfo, this, 0)), 11), new wy0.a9((a71.c) null, projectsMetaInfo, this, 1)), new wy0.b9((a71.c) null, projectsMetaInfo, this, str3, 0)), this.v);
        }
    }

    public final y71.i b(String str, String str2, ProjectsMetaInfo projectsMetaInfo, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                aa.u0 u0Var = new aa.u0(str2);
                aa.t0 t0Var = aa.t0.d;
                return y71.n1Shadow.y(y71.n1Shadow.I(y71.n1Shadow.I(new rm0.c8(y71.n1Shadow.I(new y00.l(in.rShadow.h(this.t.d(new ze0(str, t0Var, t0Var, t0Var, t0Var, u0Var))), 10), new z9(null, projectsMetaInfo, this, 2)), 6), new z9(null, projectsMetaInfo, this, 3)), new aaShadow(null, projectsMetaInfo, this, str3, 1)), this.v);
            default:
                k71.k.g(str, "id");
                aa.u0 u0Var2 = new aa.u0(str2);
                aa.t0 t0Var2 = aa.t0.d;
                return y71.n1Shadow.y(y71.n1Shadow.I(y71.n1Shadow.I(new rm0.c8(y71.n1Shadow.I(new y00.l(in.rShadow.h(this.t.d(new lc0(str, t0Var2, t0Var2, t0Var2, t0Var2, t0Var2, u0Var2))), 10), new wy0.a9((a71.c) null, projectsMetaInfo, this, 2)), 12), new wy0.a9((a71.c) null, projectsMetaInfo, this, 3)), new wy0.b9((a71.c) null, projectsMetaInfo, this, str3, 1)), this.v);
        }
    }

    public final y71.i c(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y71.n1Shadow.y(new q6(new y00.l(com.github.service.wrapper.a.o(this.s, new m30(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 19), this.v);
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                return y71.n1Shadow.y(new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.s, new m10(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 13), this.v);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
