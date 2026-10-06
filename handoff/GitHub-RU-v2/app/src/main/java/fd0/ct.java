package fd0;

import java.util.List;
import kc0.k60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ct implements aaShadow.a {
    public static final ct a = new ct();
    public static final List b = sy.d0.o(new String[]{"name", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new k60(str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k60 k60Var = (k60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k60Var, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k60Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, k60Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k60Var.c);
    }
}
