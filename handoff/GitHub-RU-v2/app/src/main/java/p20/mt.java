package p20;

import java.util.List;
import u10.s60;
import u10.u60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mt implements aaShadow.a {
    public static final mt a = new mt();
    public static final List b = sy.d0Shadow.o("id", "owner", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        s60 s60Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                s60Var = (s60) aa.c.c(kt.a, false).a(eVar, wVar);
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
        if (s60Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new u60(str, s60Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u60 u60Var = (u60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u60Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u60Var.a);
        fVar.z0("owner");
        aa.c.c(kt.a, false).b(fVar, wVar, u60Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, u60Var.c);
    }
}
