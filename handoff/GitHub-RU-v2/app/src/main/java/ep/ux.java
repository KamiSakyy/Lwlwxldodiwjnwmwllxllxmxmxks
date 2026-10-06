package ep;

import java.util.List;
import jo.rc0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ux implements aaShadow.a {
    public static final ux a = new ux();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        ss.a c = ssShadow.b.c(eVar, wVar);
        if (str != null) {
            return new rc0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rc0 rc0Var = (rc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rc0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, rc0Var.a);
        List list = ssShadow.b.a;
        ssShadow.b.d(fVar, wVar, rc0Var.b);
    }
}
