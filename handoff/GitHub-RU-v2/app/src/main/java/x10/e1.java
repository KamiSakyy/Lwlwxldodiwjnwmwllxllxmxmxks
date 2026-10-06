package x10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 implements aa.a {
    public static final e1 a = new e1();
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
            return new xShadow(str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xShadow xVar = (xShadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xVar, "value");
        fVar.z0("nameWithOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, xVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xVar.c);
    }
}
