package eo0;

import java.util.List;
import jn0.y00;
import jn0.z00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class up implements aaShadow.a {
    public static final up a = new up();
    public static final List b = sy.d0.o(new String[]{"id", "mergeQueue", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        y00 y00Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                y00Var = (y00) aa.c.b(aa.c.c(tp.a, false)).a(eVar, wVar);
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
            return new z00(str, y00Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z00 z00Var = (z00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z00Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z00Var.a);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(tp.a, false)).b(fVar, wVar, z00Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z00Var.c);
    }
}
