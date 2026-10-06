package rm0;

import com.github.service.models.ApiFailureType;
import jn0.of0;
import jn0.yf0;
import jo.ci0;
import jo.mi0;
import kc0.ob0;
import kc0.yb0;
import u10.o90;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oa implements z01.q1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.bShadow s;
    public final v71.v t;
    public final s01.p u;

    public oa(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                this.u = new jy.d(jVar, bVar, vVar, new np.h(28), new n0.x(22), s01.o.r, new n0.x(23), new np.h(29), new oo.a(0), new oo.a(1), new oo.a(2), null, null, 126976);
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                this.u = new sw0.c(jVar, bVar, vVar, new xn.q1(22), new wy0.n6(9), s01.o.r, new wy0.n6(10), new xn.q1(23), new xn.q1(24), new xn.q1(25), new xn.q1(26), null, null, 126976);
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                this.u = new jy.d(jVar, bVar, vVar, new np.h(23), new n0.x(20), s01.o.r, new n0.x(21), new np.h(24), new np.h(25), new np.h(26), new np.h(27), null, null, 126976);
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                this.u = new jy.d(jVar, bVar, vVar, new oo.a(11), new n0.x(27), s01.o.r, new n0.x(28), new oo.a(12), new oo.a(13), new oo.a(14), new oo.a(15), null, null, 126976);
                break;
        }
    }

    @Override // z01.q1
    public final y71.i a(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "login");
                return y71.n1.y(new j3(com.github.service.wrapper.b.a(this.s, new ob0(str), ga.h.t, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), 48), 28), this.t);
            case 1:
                k71.k.g(str, "login");
                return y71.n1.y(new t00.h7(com.github.service.wrapper.b.a(this.s, new ci0(str), ga.h.t, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), 48), 15), this.t);
            case 2:
                k71.k.g(str, "login");
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.b.a(this.s, new o90(str), ga.h.t, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), 48), 23), this.t);
            default:
                k71.k.g(str, "login");
                return y71.n1.y(new wy0.d6(com.github.service.wrapper.b.a(this.s, new of0(str), ga.h.t, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), 48), 18), this.t);
        }
    }

    @Override // z01.q1
    public final y71.i b(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "login");
                return this.u.e(new pc0.a(str));
            case 1:
                k71.k.g(str, "login");
                return this.u.e(new oo.b(str));
            case 2:
                k71.k.g(str, "login");
                return ((sw0.c) this.u).e(new z10.a(str));
            default:
                k71.k.g(str, "login");
                return this.u.e(new on0.a(str));
        }
    }

    @Override // z01.q1
    public final y71.i c(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "login");
                return this.u.b(new pc0.a(str));
            case 1:
                k71.k.g(str, "login");
                return this.u.b(new oo.b(str));
            case 2:
                k71.k.g(str, "login");
                return ((sw0.c) this.u).b(new z10.a(str));
            default:
                k71.k.g(str, "login");
                return this.u.b(new on0.a(str));
        }
    }

    @Override // z01.q1
    public final y71.i d(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "login");
                return this.u.h(new pc0.a(str));
            case 1:
                k71.k.g(str, "login");
                return this.u.h(new oo.b(str));
            case 2:
                k71.k.g(str, "login");
                return ((sw0.c) this.u).h(new z10.a(str));
            default:
                k71.k.g(str, "login");
                return this.u.h(new on0.a(str));
        }
    }

    @Override // z01.q1
    public final y71.i e(String str) {
        switch (this.r) {
            case 0:
                return y71.n1.y(in.r.l(new y00.l(com.github.service.wrapper.a.o(this.s, new ob0(str), null, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), null, 50), 10)), this.t);
            case 1:
                return y71.n1.y(in.r.l(new y00.l(com.github.service.wrapper.a.o(this.s, new ci0(str), null, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), null, 50), 10)), this.t);
            case 2:
                return y71.n1.y(in.r.l(new y00.l(com.github.service.wrapper.a.o(this.s, new o90(str), null, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), null, 50), 10)), this.t);
            default:
                return y71.n1.y(in.r.l(new y00.l(com.github.service.wrapper.a.o(this.s, new of0(str), null, true, sy.f0.n(in.r.a, ApiFailureType.NOT_FOUND), null, 50), 10)), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
