package do0;

import dn.g0;
import jn0.yf0;
import jo.mi0;
import kc0.yb0;
import q81.u;
import u10.y90;
import v71.v;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements kn.a, yf0, mi0, yb0, y90 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public u t;
    public com.github.rudroid.factories.actions.e u;
    public v v;

    public d(com.github.service.wrapper.j jVar, u uVar, com.github.rudroid.factories.actions.e eVar, v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(eVar, "logStorage");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = uVar;
                this.u = eVar;
                this.v = vVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(eVar, "logStorage");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = uVar;
                this.u = eVar;
                this.v = vVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(eVar, "logStorage");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = uVar;
                this.u = eVar;
                this.v = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okHttpClient");
                k71.k.g(eVar, "logStorage");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = uVar;
                this.u = eVar;
                this.v = vVar;
                break;
        }
    }

    public final y71.i a(String str, int i) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "checkRunId");
                bz0.t tVar = new bz0.t(in.rShadow.h(this.s.d(new yn0.h(str, i))), 2);
                v vVar = this.v;
                return n1Shadow.y(new cn.d(new c00.g(n1Shadow.y(tVar, vVar), this.u.b(str, i), new g0(this, (a71.c) null, 1), 27), 1), vVar);
            case 1:
                k71.k.g(str, "checkRunId");
                bz0.t tVar2 = new bz0.t(in.rShadow.h(this.s.d(new yo.h(str, i))), 6);
                v vVar2 = this.v;
                return n1Shadow.y(new cn.d(new c00.g(n1Shadow.y(tVar2, vVar2), this.u.b(str, i), new g0(this, (a71.c) null, 2), 27), 2), vVar2);
            case 2:
                k71.k.g(str, "checkRunId");
                bz0.t tVar3 = new bz0.t(in.rShadow.h(this.s.d(new zc0.h(str, i))), 10);
                v vVar3 = this.v;
                return n1Shadow.y(new cn.d(new c00.g(n1Shadow.y(tVar3, vVar3), this.u.b(str, i), new g0(this, (a71.c) null, 3), 27), 3), vVar3);
            default:
                k71.k.g(str, "checkRunId");
                bz0.t tVar4 = new bz0.t(in.rShadow.h(this.s.d(new j20.h(str, i))), 17);
                v vVar4 = this.v;
                return n1Shadow.y(new cn.d(new c00.g(n1Shadow.y(tVar4, vVar4), this.u.b(str, i), new g0(this, (a71.c) null, 6), 27), 4), vVar4);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
