package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jk implements aaShadow.a {
    public static final jk a = new jk();
    public static final List b = sy.d0.o(new String[]{"id", "entriesCount", "entries", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.pt ptVar = null;
        kc0.ot otVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                ptVar = (kc0.pt) aa.c.b(aa.c.c(ik.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                otVar = (kc0.ot) aa.c.b(aa.c.c(hk.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new kc0.qt(str, ptVar, otVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.qt qtVar = (kc0.qt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qtVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qtVar.a);
        fVar.z0("entriesCount");
        aa.c.b(aa.c.c(ik.a, false)).b(fVar, wVar, qtVar.b);
        fVar.z0("entries");
        aa.c.b(aa.c.c(hk.a, false)).b(fVar, wVar, qtVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, qtVar.d);
    }
}
