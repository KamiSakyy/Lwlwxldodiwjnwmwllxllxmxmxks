package t00;

import java.util.LinkedHashSet;
import jn0.yf0;
import jo.mi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v1Shadow implements z01.o, mi0, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.b s;
    public final v71.v t;

    public v1(com.github.service.wrapper.b bVar, v71.v vVar, int i) {
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

    public final y71.i a(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                return y71.n1.y(new rm0.v9(new y00.l(com.github.service.wrapper.b.a(this.s, new qp.j(str), ga.h.t, false, (LinkedHashSet) null, 60), 10), 23), this.t);
            default:
                k71.k.g(str, "id");
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.b.a(this.s, new lo0.j(str), ga.h.t, false, (LinkedHashSet) null, 60), 10), 20), this.t);
        }
    }

    public final y71.i b(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str2, "title");
                return y71.n1.y(jo.f4.f(in.r.h(this.s.d(new qp.o(new aa.u0(str2), str)))), this.t);
            default:
                k71.k.g(str2, "title");
                return y71.n1.y(jo.f4.f(in.r.h(this.s.d(new lo0.o(new aa.u0(str2), str)))), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
