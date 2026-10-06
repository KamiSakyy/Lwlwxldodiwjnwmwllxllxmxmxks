package fd0;

import java.util.List;
import kc0.a00;
import kc0.wz;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ro implements aaShadow.a {
    public static final ro a = new ro();
    public static final List b = sy.d0.n("search");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        a00 a00Var = null;
        while (eVar.r0(b) == 0) {
            a00Var = (a00) aa.c.c(vo.a, false).a(eVar, wVar);
        }
        if (a00Var != null) {
            return new wz(a00Var);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wz wzVar = (wz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wzVar, "value");
        fVar.z0("search");
        aa.c.c(vo.a, false).b(fVar, wVar, wzVar.a);
    }
}
