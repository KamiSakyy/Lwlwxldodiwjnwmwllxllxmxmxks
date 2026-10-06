package fd0;

import java.util.List;
import kc0.q00;
import kc0.r00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gp implements aaShadow.a {
    public static final gp a = new gp();
    public static final List b = sy.d0Shadow.n("labelableRecord");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        q00 q00Var = null;
        while (eVar.r0(b) == 0) {
            q00Var = (q00) aa.c.b(aa.c.c(fp.a, true)).a(eVar, wVar);
        }
        return new r00(q00Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r00 r00Var = (r00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r00Var, "value");
        fVar.z0("labelableRecord");
        aa.c.b(aa.c.c(fp.a, true)).b(fVar, wVar, r00Var.a);
    }
}
