package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j8 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "file"});

    public static u10.oc c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.mc mcVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                mcVar = (u10.mc) aa.c.b(aa.c.c(h8.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new u10.oc(str, mcVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.oc ocVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ocVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, ocVar.a);
        fVar.z0("file");
        aa.c.b(aa.c.c(h8.a, false)).b(fVar, wVar, ocVar.b);
    }
}
