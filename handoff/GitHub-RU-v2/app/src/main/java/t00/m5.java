package t00;

import com.github.service.models.response.ProjectV2OrderField;
import jn0.yf0;
import jo.mi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m5 implements z01.s0, mi0, yf0 {
    public final /* synthetic */ int r;
    public final s01.p s;

    public m5(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = new a00.b(jVar, bVar, vVar, new d9.l(20), new com.github.rudroid.widget.contribution.a(15), s01.o.r, new com.github.rudroid.widget.contribution.a(16), new d9.l(21), new d9.l(22), new d9.l(23), new d9.l(24), null, null, 129024);
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = new a00.b(jVar, bVar, vVar, new a0.m1(20), new a00.a(0, (byte) 0), s01.o.r, new a00.a(1, (byte) 0), new a0.m1(21), new a0.m1(22), new a0.m1(23), new a0.m1(24), null, null, 129024);
                break;
        }
    }

    public final y71.i a(String str, ProjectV2OrderField projectV2OrderField, v01.a aVar) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "query");
                k71.k.g(projectV2OrderField, "orderField");
                k71.k.g(aVar, "orderDirection");
                return ((a00.b) this.s).b(new a00.c(str, projectV2OrderField, aVar));
            default:
                k71.k.g(str, "query");
                k71.k.g(projectV2OrderField, "orderField");
                k71.k.g(aVar, "orderDirection");
                return ((a00.b) this.s).b(new dy0.a(str, projectV2OrderField, aVar));
        }
    }

    public final y71.i b(String str, ProjectV2OrderField projectV2OrderField, v01.a aVar) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "query");
                k71.k.g(projectV2OrderField, "orderField");
                k71.k.g(aVar, "orderDirection");
                return ((a00.b) this.s).h(new a00.c(str, projectV2OrderField, aVar));
            default:
                k71.k.g(str, "query");
                k71.k.g(projectV2OrderField, "orderField");
                k71.k.g(aVar, "orderDirection");
                return ((a00.b) this.s).h(new dy0.a(str, projectV2OrderField, aVar));
        }
    }

    public final y71.i c(String str, ProjectV2OrderField projectV2OrderField, v01.a aVar) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "query");
                k71.k.g(projectV2OrderField, "orderField");
                k71.k.g(aVar, "orderDirection");
                return ((a00.b) this.s).e(new a00.c(str, projectV2OrderField, aVar));
            default:
                k71.k.g(str, "query");
                k71.k.g(projectV2OrderField, "orderField");
                k71.k.g(aVar, "orderDirection");
                return ((a00.b) this.s).e(new dy0.a(str, projectV2OrderField, aVar));
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
