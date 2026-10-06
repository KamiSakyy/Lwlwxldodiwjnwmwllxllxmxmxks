package rm0;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.ArrayList;
import jn0.h40;
import jn0.k00;
import jn0.yf0;
import jo.h60;
import jo.k20;
import jo.mi0;
import kc0.s00;
import kc0.uw;
import kc0.yb0;
import u10.gv;
import u10.uy;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fa implements z01.n1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final com.github.service.wrapper.bShadow t;
    public final v71.v u;

    public fa(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
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
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            case 3:
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

    @Override // z01.n1
    public final y71.i a(z01.i0 i0Var, String str, ArrayList arrayList, ProjectsMetaInfo projectsMetaInfo) {
        switch (this.r) {
            case 0:
                k71.k.g(i0Var, "labelAble");
                k71.k.g(str, "labelableId");
                return y71.n1.y(new v9(new y00.l(in.r.h(this.t.d(new s00(str, arrayList))), 10), 3), this.u);
            case 1:
                k71.k.g(i0Var, "labelAble");
                k71.k.g(str, "labelableId");
                return y71.n1.y(new c8(y71.n1.I(new y00.l(in.r.h(this.t.d(new h60(str, arrayList))), 10), new c00.m((a71.c) null, projectsMetaInfo, this, 13)), 4), this.u);
            case 2:
                k71.k.g(i0Var, "labelAble");
                k71.k.g(str, "labelableId");
                return y71.n1.y(new vb0.s7(new y00.l(in.r.h(this.t.d(new uy(str, arrayList))), 10), 0), this.u);
            default:
                k71.k.g(i0Var, "labelAble");
                k71.k.g(str, "labelableId");
                return y71.n1.y(new c8(y71.n1.I(new y00.l(in.r.h(this.t.d(new h40(str, arrayList))), 10), new c00.m((a71.c) null, projectsMetaInfo, this, 18)), 10), this.u);
        }
    }

    @Override // z01.n1
    public final Object b(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new v9(new y00.l(com.github.service.wrapper.a.o(this.s, new uw(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 10), 2), this.u);
            case 1:
                return y71.n1.y(new t00.q6(new y00.l(com.github.service.wrapper.a.o(this.s, new k20(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 10), 18), this.u);
            case 2:
                return y71.n1.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new gv(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 10), 29), this.u);
            default:
                return y71.n1.y(new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.s, new k00(new aa.u0(str4), str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 10), 12), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
