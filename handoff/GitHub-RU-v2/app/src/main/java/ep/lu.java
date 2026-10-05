package ep;

import java.util.List;
import jo.q70;
import jo.u70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lu implements aa.a {
    public static final lu a = new lu();
    public static final List b = sy.d0.o("repositoryOwner", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u70 u70Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                u70Var = (u70) aa.c.b(aa.c.c(pu.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new q70(u70Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q70 q70Var = (q70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q70Var, "value");
        fVar.z0("repositoryOwner");
        aa.c.b(aa.c.c(pu.a, true)).b(fVar, wVar, q70Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q70Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q70Var.c);
    }
}
