package fd0;

import java.util.List;
import kc0.v70;
import kc0.z70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hu implements aaShadow.a {
    public static final hu a = new hu();
    public static final List b = sy.d0Shadow.o(new String[]{"pullRequest", "clientMutationId"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v70 v70Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                v70Var = (v70) aa.c.b(aa.c.c(du.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new z70(v70Var, str);
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z70 z70Var = (z70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z70Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(du.a, true)).b(fVar, wVar, z70Var.a);
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, z70Var.b);
    }
}
