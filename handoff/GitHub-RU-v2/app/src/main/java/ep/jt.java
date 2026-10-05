package ep;

import java.util.List;
import jo.a60;
import jo.b60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jt implements aa.a {
    public static final jt a = new jt();
    public static final List b = sy.d0.n("replaceActorsForAssignable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b60 b60Var = null;
        while (eVar.r0(b) == 0) {
            b60Var = (b60) aa.c.b(aa.c.c(kt.a, false)).a(eVar, wVar);
        }
        return new a60(b60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a60 a60Var = (a60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a60Var, "value");
        fVar.z0("replaceActorsForAssignable");
        aa.c.b(aa.c.c(kt.a, false)).b(fVar, wVar, a60Var.a);
    }
}
