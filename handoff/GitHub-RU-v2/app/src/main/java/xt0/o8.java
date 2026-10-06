package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o8 implements aa.a {
    public static final o8 a = new o8();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "requestedBy", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        h8 h8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                h8Var = (h8) aa.c.b(aa.c.c(n8.a, false)).a(eVar, wVar);
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
            return new i8(str, h8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i8 i8Var = (i8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i8Var.a);
        fVar.z0("requestedBy");
        aa.c.b(aa.c.c(n8.a, false)).b(fVar, wVar, i8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i8Var.c);
    }
}
