package ep;

import java.util.List;
import jo.y90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bw implements aaShadow.a {
    public static final bw a = new bw();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new y90(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y90 y90Var = (y90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y90Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, y90Var.a);
    }
}
