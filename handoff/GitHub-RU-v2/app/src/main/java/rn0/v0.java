package rn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 implements aa.a {
    public static final v0 a = new v0();
    public static final List b = sy.d0.o(new String[]{"id", "name", "logoUrl", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
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
        if (str3 == null) {
            k41.b.B(eVar, "logoUrl");
            throw null;
        }
        if (str4 != null) {
            return new qn0.h1(str, str2, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qn0.h1 h1Var = (qn0.h1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h1Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, h1Var.b);
        fVar.z0("logoUrl");
        bVar.b(fVar, wVar, h1Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h1Var.d);
    }
}
