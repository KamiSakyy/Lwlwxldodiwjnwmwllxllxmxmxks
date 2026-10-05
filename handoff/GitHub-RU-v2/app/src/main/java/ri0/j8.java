package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j8 implements aa.a {
    public static final j8 a = new j8();
    public static final List b = sy.d0.o(new String[]{"id", "comments", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        e8 e8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                e8Var = (e8) aa.c.c(i8.a, false).a(eVar, wVar);
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
        if (e8Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new f8(str, e8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f8 f8Var = (f8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f8Var.a);
        fVar.z0("comments");
        aa.c.c(i8.a, false).b(fVar, wVar, f8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, f8Var.c);
    }
}
