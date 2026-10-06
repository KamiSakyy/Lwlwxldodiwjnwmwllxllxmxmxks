package ep;

import java.util.List;
import jo.x90;
import jo.y90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aw implements aaShadow.a {
    public static final aw a = new aw();
    public static final List b = sy.d0.n("unblockUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y90 y90Var = null;
        while (eVar.r0(b) == 0) {
            y90Var = (y90) aa.c.b(aa.c.c(bw.a, false)).a(eVar, wVar);
        }
        return new x90(y90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x90 x90Var = (x90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x90Var, "value");
        fVar.z0("unblockUser");
        aa.c.b(aa.c.c(bw.a, false)).b(fVar, wVar, x90Var.a);
    }
}
