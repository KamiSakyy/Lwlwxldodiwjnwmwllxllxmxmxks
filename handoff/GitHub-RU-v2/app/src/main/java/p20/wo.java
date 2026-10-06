package p20;

import java.util.List;
import u10.e00;
import u10.f00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wo implements aaShadow.a {
    public static final wo a = new wo();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e00 e00Var = null;
        while (eVar.r0(b) == 0) {
            e00Var = (e00) aa.c.b(aa.c.c(vo.a, true)).a(eVar, wVar);
        }
        return new f00(e00Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f00 f00Var = (f00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f00Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(vo.a, true)).b(fVar, wVar, f00Var.a);
    }
}
