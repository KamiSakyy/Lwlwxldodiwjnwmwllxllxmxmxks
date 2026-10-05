package fd0;

import java.util.List;
import kc0.j00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bp implements aa.a {
    public static final bp a = new bp();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        yd0.c c = yd0.d.c(eVar, wVar);
        if (str != null) {
            return new j00(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00 j00Var = (j00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j00Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, j00Var.a);
        List list = yd0.d.a;
        yd0.c cVar = j00Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, cVar.a);
        yd0.a aVar = cVar.b;
        if (aVar != null) {
            yd0.e.d(fVar, wVar, aVar);
        }
        yd0.b bVar = cVar.c;
        if (bVar != null) {
            yd0.f.d(fVar, wVar, bVar);
        }
    }
}
