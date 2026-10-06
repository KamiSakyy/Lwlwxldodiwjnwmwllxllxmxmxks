package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j4 implements aaShadow.a {
    public static final j4 a = new j4();
    public static final List b = sy.d0Shadow.o("id", "name", "owner", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        u10.q6 q6Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                q6Var = (u10.q6) aa.c.c(h4.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (q6Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new u10.s6(str, str2, q6Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.s6 s6Var = (u10.s6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s6Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, s6Var.b);
        fVar.z0("owner");
        aa.c.c(h4.a, false).b(fVar, wVar, s6Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, s6Var.d);
    }
}
