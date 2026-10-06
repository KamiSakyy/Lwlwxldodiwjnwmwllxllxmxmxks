package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oe implements aaShadow.a {
    public static final oe a = new oe();
    public static final List b = sy.d0Shadow.o(new String[]{"notificationSettings", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.tl tlVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                tlVar = (kc0.tl) aa.c.b(aa.c.c(ne.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
        if (str2 != null) {
            return new kc0.ul(tlVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ul ulVar = (kc0.ul) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ulVar, "value");
        fVar.z0("notificationSettings");
        aa.c.b(aa.c.c(ne.a, false)).b(fVar, wVar, ulVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ulVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ulVar.c);
    }
}
