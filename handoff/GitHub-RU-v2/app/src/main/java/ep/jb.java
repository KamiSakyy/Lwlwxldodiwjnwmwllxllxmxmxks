package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class jb implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "history"});

    public static jo.wg c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.ug ugVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                ugVar = (jo.ug) aa.c.c(hb.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (ugVar != null) {
            return new jo.wg(str, ugVar);
        }
        k41.b.B(eVar, "history");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.wg wgVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wgVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, wgVar.a);
        fVar.z0("history");
        aa.c.c(hb.a, false).b(fVar, wVar, wgVar.b);
    }
}
