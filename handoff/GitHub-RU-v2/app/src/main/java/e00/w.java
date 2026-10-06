package e00;

import d00.c0;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements aa.a {
    public static final w a = new w();
    public static final List b = d0Shadow.o("items", "viewGroupId", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c0 c0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                c0Var = (c0) aa.c.c(v.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (c0Var == null) {
            k41.b.B(eVar, "items");
            throw null;
        }
        if (str2 != null) {
            return new d00.d0(c0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d00.d0 d0Var = (d00.d0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("items");
        aa.c.c(v.a, false).b(fVar, wVar, d0Var.a);
        fVar.z0("viewGroupId");
        aa.c.i.b(fVar, wVar, d0Var.b);
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, d0Var.c);
    }
}
