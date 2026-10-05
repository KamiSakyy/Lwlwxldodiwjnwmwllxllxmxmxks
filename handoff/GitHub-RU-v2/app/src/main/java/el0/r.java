package el0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = sy.d0.o(new String[]{"id", "commit", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        dl0.s sVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                sVar = (dl0.s) aa.c.c(m.a, false).a(eVar, wVar);
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
        if (sVar == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str2 != null) {
            return new dl0.y(str, sVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dl0.y yVar = (dl0.y) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, yVar.a);
        fVar.z0("commit");
        aa.c.c(m.a, false).b(fVar, wVar, yVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, yVar.c);
    }
}
