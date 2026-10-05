package ep;

import java.util.List;
import jo.y70;
import jo.z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ru implements aa.a {
    public static final ru a = new ru();
    public static final List b = sy.d0.o("node", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z70 z70Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                z70Var = (z70) aa.c.b(aa.c.c(su.a, true)).a(eVar, wVar);
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
            return new y70(z70Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y70 y70Var = (y70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y70Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(su.a, true)).b(fVar, wVar, y70Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y70Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y70Var.c);
    }
}
