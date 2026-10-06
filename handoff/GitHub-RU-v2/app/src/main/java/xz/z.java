package xz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements aa.a {
    public static final z a = new z();
    public static final List b = sy.d0Shadow.o("__typename", "viewGroupId", "items");

    public static v c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        u uVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                uVar = (u) aa.c.c(y.a, true).a(eVar, wVar);
            }
        }
        eVar.s0();
        f c = k.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (uVar != null) {
            return new v(str, str2, uVar, c);
        }
        k41.b.B(eVar, "items");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, v vVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, vVar.a);
        fVar.z0("viewGroupId");
        aa.c.i.b(fVar, wVar, vVar.b);
        fVar.z0("items");
        aa.c.c(y.a, true).b(fVar, wVar, vVar.c);
        List list = k.a;
        k.d(fVar, wVar, vVar.d);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (v) obj);
    }
}
