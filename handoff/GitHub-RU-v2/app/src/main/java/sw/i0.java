package sw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"name", "id"});

    public static o c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str2 != null) {
            return new o(str, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, oVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, oVar.b);
    }
}
