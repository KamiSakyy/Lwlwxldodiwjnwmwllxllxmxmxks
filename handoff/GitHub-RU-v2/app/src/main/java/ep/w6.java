package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w6 implements aaShadow.a {
    public static final w6 a = new w6();
    public static final List b = sy.d0.o("id", "pullRequest", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.ja jaVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                jaVar = (jo.ja) aa.c.c(v6.a, true).a(eVar, wVar);
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
        if (jaVar == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new jo.ka(str, jaVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ka kaVar = (jo.ka) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kaVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kaVar.a);
        fVar.z0("pullRequest");
        aa.c.c(v6.a, true).b(fVar, wVar, kaVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, kaVar.c);
    }
}
