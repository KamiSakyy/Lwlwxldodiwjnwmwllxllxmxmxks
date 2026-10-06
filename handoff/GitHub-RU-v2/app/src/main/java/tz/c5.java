package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c5 implements aa.a {
    public static final c5 a = new c5();
    public static final List b = sy.d0Shadow.o("nameWithOwner", "id", "__typename");

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
            k41.b.B(eVar, "nameWithOwner");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new w4(str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w4 w4Var = (w4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w4Var, "value");
        fVar.z0("nameWithOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w4Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, w4Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, w4Var.c);
    }
}
