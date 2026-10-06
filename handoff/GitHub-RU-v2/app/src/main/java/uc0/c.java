package uc0;

import aa.w;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c implements aa.a {
    public static final List a = l.r(new String[]{"id", "oid", "updatesChannel"});

    public static tc0.d c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new tc0.d(str, str2, str3);
        }
        k41.b.B(eVar, "oid");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, tc0.d dVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("oid");
        bVar.b(fVar, wVar, dVar.b);
        fVar.z0("updatesChannel");
        aa.c.i.b(fVar, wVar, dVar.c);
    }
    public Object b(Object p1) { return null; }
    public static final Object i = null;
}
