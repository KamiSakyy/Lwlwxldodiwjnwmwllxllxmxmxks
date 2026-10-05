package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b2 implements aa.a {
    public static final b2 a = new b2();
    public static final List b = sy.d0.o(new String[]{"viewer", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.s3 s3Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                s3Var = (jn0.s3) aa.c.c(f2.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (s3Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.o3(s3Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.o3 o3Var = (jn0.o3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o3Var, "value");
        fVar.z0("viewer");
        aa.c.c(f2.a, false).b(fVar, wVar, o3Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o3Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, o3Var.c);
    }
}
