package rm0;

import jn0.yf0;
import jo.mi0;
import kc0.yb0;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l9 implements z01.i1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final s01.p s;

    public l9(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = new sw0.c(jVar, bVar, vVar, new sw0.e(27), new sw0.b(6), s01.o.r, new sw0.b(7), new sw0.e(28), new sw0.e(29), new t00.ua(0), new t00.ua(1), null, null, 129024);
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = new sw0.c(jVar, bVar, vVar, new v00.n(23), new sw0.b(26), s01.o.r, new sw0.b(27), new v00.n(24), new v00.n(25), new v00.n(26), new v00.n(27), null, null, 129024);
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = new sw0.c(jVar, bVar, vVar, new wy0.p4(9), new wy0.n6(1), s01.o.r, new wy0.n6(2), new wy0.p4(10), new wy0.p4(11), new wy0.p4(12), new wy0.p4(13), null, null, 129024);
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = new jy.d(jVar, bVar, vVar, new s(12), new py0.o(29), s01.o.r, new ya(0), new s(13), new s(14), new s(15), new s(16), null, null, 129024);
                break;
        }
    }

    @Override // z01.i1
    public final y71.i a() {
        switch (this.r) {
        }
        return ((sw0.c) this.s).b(s01.n.a);
    }

    @Override // z01.i1
    public final y71.i b() {
        switch (this.r) {
        }
        return ((sw0.c) this.s).e(s01.n.a);
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
