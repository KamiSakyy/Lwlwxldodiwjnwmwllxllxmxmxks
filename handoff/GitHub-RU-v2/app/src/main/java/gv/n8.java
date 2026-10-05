package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n8 implements aa.a {
    public static final n8 a = new n8();
    public static final List b = sy.d0.o("id", "comments", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        i8 i8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                i8Var = (i8) aa.c.c(m8.a, false).a(eVar, wVar);
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
        if (i8Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new j8(str, i8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j8 j8Var = (j8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j8Var.a);
        fVar.z0("comments");
        aa.c.c(m8.a, false).b(fVar, wVar, j8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j8Var.c);
    }
}
