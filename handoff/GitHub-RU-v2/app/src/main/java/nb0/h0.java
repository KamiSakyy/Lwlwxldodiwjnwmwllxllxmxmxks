package nb0;

import java.util.List;
import mb0.y0;
import mb0.z0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements aa.a {
    public static final h0 a = new h0();
    public static final List b = sy.d0Shadow.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        z0 z0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new y0(str, z0Var);
                }
                z0Var = (z0) aa.c.b(aa.c.c(i0.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y0 y0Var = (y0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, y0Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(i0.a, false)).b(fVar, wVar, y0Var.b);
    }
}
