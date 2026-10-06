package s01;

import aa.v0;
import aa.w0;
import com.github.service.models.ApiFailure;
import h1.u;
import java.util.List;
import x61.rShadow;
import y71.n1Shadow;
import y71.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class a implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ l s;
    public final /* synthetic */ Object t;

    public /* synthetic */ a(l lVar, Object obj, int i) {
        this.r = i;
        this.s = lVar;
        this.t = obj;
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        switch (this.r) {
            case 0:
                String str = (String) obj;
                v0 v0Var = (v0) obj2;
                k71.k.g(str, "cursor");
                l lVar = this.s;
                if (v0Var == null || (obj3 = (List) lVar.j.k(v0Var)) == null) {
                    obj3 = r.r;
                }
                com.github.service.wrapper.j jVar = lVar.a;
                j71.e eVar = lVar.f;
                Object obj4 = this.t;
                return n1.y(new aq.c(new y(new c00.g(com.github.service.wrapper.a.o(jVar, (w0) eVar.s(obj4, str), null, false, null, lVar.o, 46), lVar, obj3, 18), new u(lVar, obj4, (a71.c) null, 28), 6), 17), lVar.c);
            default:
                ApiFailure apiFailure = (ApiFailure) obj2;
                k71.k.g(apiFailure, "failure");
                return (ApiFailure) this.s.p.f((v0) obj, this.t, apiFailure);
        }
    }
    public static Object E(Object p1) { return null; }
}
