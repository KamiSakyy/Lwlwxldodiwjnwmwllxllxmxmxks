package ep;

import java.util.List;
import jo.ei0;
import jo.fi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m10Shadow implements aaShadow.a {
    public static final m10Shadow a = new m10Shadow();
    public static final List b = sy.d0.o("user", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fi0 fi0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fi0Var = (fi0) aa.c.b(aa.c.c(n10Shadow.a, true)).a(eVar, wVar);
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
            return new ei0(fi0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ei0 ei0Var = (ei0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ei0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(n10Shadow.a, true)).b(fVar, wVar, ei0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ei0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ei0Var.c);
    }
}
