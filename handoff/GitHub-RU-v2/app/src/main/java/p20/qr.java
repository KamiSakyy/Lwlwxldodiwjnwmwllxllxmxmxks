package p20;

import java.util.List;
import u10.i40;
import u10.j40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qr implements aaShadow.a {
    public static final qr a = new qr();
    public static final List b = sy.d0.n("issueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i40 i40Var = null;
        while (eVar.r0(b) == 0) {
            i40Var = (i40) aa.c.b(aa.c.c(pr.a, true)).a(eVar, wVar);
        }
        return new j40(i40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j40 j40Var = (j40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j40Var, "value");
        fVar.z0("issueComment");
        aa.c.b(aa.c.c(pr.a, true)).b(fVar, wVar, j40Var.a);
    }
}
