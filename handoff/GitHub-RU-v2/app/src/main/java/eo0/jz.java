package eo0;

import java.util.List;
import jn0.ef0;
import jn0.if0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jz implements aa.a {
    public static final jz a = new jz();
    public static final List b = sy.d0.o(new String[]{"user", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        if0 if0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                if0Var = (if0) aa.c.b(aa.c.c(nz.a, false)).a(eVar, wVar);
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
            return new ef0(if0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ef0 ef0Var = (ef0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ef0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(nz.a, false)).b(fVar, wVar, ef0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ef0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ef0Var.c);
    }
}
