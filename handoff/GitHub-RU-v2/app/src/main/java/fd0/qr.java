package fd0;

import java.util.List;
import kc0.f40;
import kc0.g40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qr implements aaShadow.a {
    public static final qr a = new qr();
    public static final List b = sy.d0.n("unlockLockable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g40 g40Var = null;
        while (eVar.r0(b) == 0) {
            g40Var = (g40) aa.c.b(aa.c.c(rr.a, false)).a(eVar, wVar);
        }
        return new f40(g40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f40 f40Var = (f40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f40Var, "value");
        fVar.z0("unlockLockable");
        aa.c.b(aa.c.c(rr.a, false)).b(fVar, wVar, f40Var.a);
    }
}
