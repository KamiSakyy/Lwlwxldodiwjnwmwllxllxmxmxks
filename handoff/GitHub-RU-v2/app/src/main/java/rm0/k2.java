package rm0;

import com.github.service.models.response.TrendingPeriod;
import jn0.f50;
import jn0.qi;
import jn0.sd;
import jn0.wd;
import jn0.yf0;
import jo.f70;
import jo.mi0;
import jo.nj;
import jo.pe;
import jo.te;
import kc0.cd;
import kc0.q10;
import kc0.yb0;
import kc0.yc;
import kc0.zg;
import u10.sz;
import u10.xf;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k2 implements z01.q, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final com.github.service.wrapper.b t;
    public final v71.v u;

    public k2(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, int i) {
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

    @Override // z01.q
    public final Object a() {
        switch (this.r) {
            case 0:
                return y71.n1.y(new gl.f(com.github.service.wrapper.a.o(this.t, new zg(), ga.h.r, false, null, null, 56), 24), this.u);
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.t, new nj(), ga.h.r, false, null, null, 56), 6), this.u);
            case 2:
                return y71.n1.y(new t00.h7(com.github.service.wrapper.a.o(this.t, new xf(), ga.h.r, false, null, null, 56), 25), this.u);
            default:
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.t, new qi(), ga.h.r, false, null, null, 56), 11), this.u);
        }
    }

    @Override // z01.q
    public final Object b(String str, String str2, TrendingPeriod trendingPeriod) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new gl.f(com.github.service.wrapper.a.o(this.t, new cd(new aa.u0(str), new aa.u0(str2), new aa.u0(trendingPeriod != null ? sy.s.p(trendingPeriod) : null)), null, false, null, null, 62), 28), this.u);
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.t, new te(new aa.u0(str), new aa.u0(str2), new aa.u0(trendingPeriod != null ? com.google.android.gms.internal.measurement.d5.Y(trendingPeriod) : null)), null, false, null, null, 62), 10), this.u);
            case 2:
                return y41.t1.S("refreshTrending", "3.10");
            default:
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.t, new wd(new aa.u0(str), new aa.u0(str2), new aa.u0(trendingPeriod != null ? k21.f.H(trendingPeriod) : null)), null, false, null, null, 62), 15), this.u);
        }
    }

    @Override // z01.q
    public final y71.i c() {
        switch (this.r) {
            case 0:
                return y71.n1.y(y71.n1.x(new androidx.lifecycle.n(this, (a71.c) null, 16), new t00.f8(new m7.x(this, new yc(new aa.u0(30)), (a71.c) null, 5))), this.u);
            case 1:
                return y71.n1.y(y71.n1.x(new androidx.lifecycle.n(this, (a71.c) null, 17), new t00.f8(new m7.x(this, new pe(new aa.u0(30)), (a71.c) null, 9))), this.u);
            case 2:
                return y41.t1.S("loadNextAwesomeTopicsPage", "3.10");
            default:
                return y71.n1.y(y71.n1.x(new androidx.lifecycle.n(this, (a71.c) null, 19), new t00.f8(new m7.x(this, new sd(new aa.u0(30)), (a71.c) null, 17))), this.u);
        }
    }

    @Override // z01.q
    public final Object d(String str, String str2, TrendingPeriod trendingPeriod) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new gl.f(com.github.service.wrapper.b.a(this.t, new cd(new aa.u0(str), new aa.u0(str2), new aa.u0(trendingPeriod != null ? sy.s.p(trendingPeriod) : null)), ga.h.r, false, null, 60), 27), this.u);
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.b.a(this.t, new te(new aa.u0(str), new aa.u0(str2), new aa.u0(trendingPeriod != null ? com.google.android.gms.internal.measurement.d5.Y(trendingPeriod) : null)), ga.h.r, false, null, 60), 9), this.u);
            case 2:
                return y41.t1.S("observeTrending", "3.10");
            default:
                return y71.n1.y(new vm0.h(com.github.service.wrapper.b.a(this.t, new wd(new aa.u0(str), new aa.u0(str2), new aa.u0(trendingPeriod != null ? k21.f.H(trendingPeriod) : null)), ga.h.r, false, null, 60), 14), this.u);
        }
    }

    @Override // z01.q
    public final y71.i e() {
        switch (this.r) {
            case 0:
                return y71.n1.y(new gl.f(com.github.service.wrapper.b.a(this.t, new yc(new aa.u0(30)), ga.h.r, false, null, 56), 26), this.u);
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.b.a(this.t, new pe(new aa.u0(30)), ga.h.r, false, null, 56), 8), this.u);
            case 2:
                return y41.t1.S("observeAwesomeTopics", "3.10");
            default:
                return y71.n1.y(new vm0.h(com.github.service.wrapper.b.a(this.t, new sd(new aa.u0(30)), ga.h.r, false, null, 56), 13), this.u);
        }
    }

    @Override // z01.q
    public final Object f() {
        switch (this.r) {
            case 0:
                return y71.n1.y(new gl.f(com.github.service.wrapper.a.o(this.s, new q10(), null, false, null, null, 58), 25), this.u);
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new f70(), null, false, null, null, 58), 7), this.u);
            case 2:
                return y71.n1.y(new t00.h7(com.github.service.wrapper.a.o(this.s, new sz(), null, false, null, null, 58), 26), this.u);
            default:
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new f50(), null, false, null, null, 58), 12), this.u);
        }
    }

    @Override // z01.q
    public final y71.i g() {
        switch (this.r) {
            case 0:
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new yc(new aa.u0(30)), null, false, null, null, 58)), this.u);
            case 1:
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new pe(new aa.u0(30)), null, false, null, null, 58)), this.u);
            case 2:
                return y41.t1.S("refreshAwesomeTopics", "3.10");
            default:
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new sd(new aa.u0(30)), null, false, null, null, 58)), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
