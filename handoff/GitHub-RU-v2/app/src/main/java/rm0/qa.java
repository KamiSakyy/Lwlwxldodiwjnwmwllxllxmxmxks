package rm0;

import kc0.yb0;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qa implements z01.s1, yb0, y90 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.b s;
    public final v71.v t;
    public final s01.p u;

    public qa(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "unCachedClient");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                this.u = new a00.b(jVar, bVar, vVar, new io0.f(24), new ie.d(17), s01.o.r, new ie.d(18), new io0.f(25), new io0.f(26), new io0.f(27), new io0.f(28), null, null, 126976);
                break;
            default:
                k71.k.g(jVar, "unCachedClient");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                this.u = new a00.b(jVar, bVar, vVar, new id.a(25), new ie.d(4), s01.o.r, new ie.d(5), new id.a(26), new id.a(27), new id.a(28), new id.a(29), null, null, 126976);
                break;
        }
    }

    @Override // z01.s1
    public final y71.i a() {
        switch (this.r) {
            case 0:
                return y41.t1.S("fetchViewerEnabledFeatureFlags", "3.12");
            default:
                return y41.t1.S("fetchViewerEnabledFeatureFlags", "3.10");
        }
    }

    @Override // z01.s1
    public final y71.i b(String str) {
        switch (this.r) {
            case 0:
                return this.u.b(new in0.a(str));
            default:
                return this.u.b(new jc0.a(str));
        }
    }

    @Override // z01.s1
    public final y71.i c() {
        switch (this.r) {
            case 0:
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new uk0.d(), ga.h.r, false, null, null, 60), 29), this.t);
            default:
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new ca0.d(), ga.h.r, false, null, null, 60), 24), this.t);
        }
    }

    @Override // z01.s1
    public final y71.i d(String str) {
        switch (this.r) {
            case 0:
                return this.u.e(new in0.a(str));
            default:
                return this.u.e(new jc0.a(str));
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
