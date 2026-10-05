package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h9 implements aa.a {
    public static final h9 a = new h9();
    public static final List b = sy.d0.o(new String[]{"topic", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.be beVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                beVar = (jn0.be) aa.c.b(aa.c.c(k9.a, false)).a(eVar, wVar);
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
            return new jn0.yd(beVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.yd ydVar = (jn0.yd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ydVar, "value");
        fVar.z0("topic");
        aa.c.b(aa.c.c(k9.a, false)).b(fVar, wVar, ydVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ydVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ydVar.c);
    }
}
