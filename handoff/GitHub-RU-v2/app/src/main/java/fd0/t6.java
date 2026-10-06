package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t6 implements aaShadow.a {
    public static final t6 a = new t6();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "replyTo", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.ha haVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                haVar = (kc0.ha) aa.c.b(aa.c.c(w6.a, false)).a(eVar, wVar);
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
            return new kc0.da(str, haVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.da daVar = (kc0.da) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(daVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, daVar.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(w6.a, false)).b(fVar, wVar, daVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, daVar.c);
    }
}
