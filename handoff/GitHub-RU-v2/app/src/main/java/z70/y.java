package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.a {
    public static final y a = new y();
    public static final List b = sy.d0.o("id", "headRefOid", "reviewThreads", "__typename");

    public static v c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        u uVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                uVar = (u) aa.c.c(c0.a, false).a(eVar, wVar);
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
            k41.b.B(eVar, "headRefOid");
            throw null;
        }
        if (uVar == null) {
            k41.b.B(eVar, "reviewThreads");
            throw null;
        }
        if (str3 != null) {
            return new v(str, str2, uVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, v vVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vVar.a);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, vVar.b);
        fVar.z0("reviewThreads");
        aa.c.c(c0.a, false).b(fVar, wVar, vVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, vVar.d);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (v) obj);
    }
}
