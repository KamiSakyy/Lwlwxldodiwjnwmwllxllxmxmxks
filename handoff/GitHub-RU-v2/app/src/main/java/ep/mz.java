package ep;

import java.util.List;
import jo.cf0;
import jo.jf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mz implements aaShadow.a {
    public static final mz a = new mz();
    public static final List b = sy.d0.n("requestReviews");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jf0 jf0Var = null;
        while (eVar.r0(b) == 0) {
            jf0Var = (jf0) aa.c.b(aa.c.c(tz.a, false)).a(eVar, wVar);
        }
        return new cf0(jf0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        cf0 cf0Var = (cf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cf0Var, "value");
        fVar.z0("requestReviews");
        aa.c.b(aa.c.c(tz.a, false)).b(fVar, wVar, cf0Var.a);
    }
}
