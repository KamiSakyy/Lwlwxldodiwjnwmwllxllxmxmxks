package ep;

import java.util.List;
import jo.j80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yu implements aa.a {
    public static final yu a = new yu();
    public static final List b = sy.d0.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new j80(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j80 j80Var = (j80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j80Var, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, j80Var.a);
    }
}
