package gb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "permalink"});

    public static fb0.s c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
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
            return new fb0.s(str, str2);
        }
        k41.b.B(eVar, "permalink");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, fb0.s sVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, sVar.a);
        fVar.z0("permalink");
        bVar.b(fVar, wVar, sVar.b);
    }
}
