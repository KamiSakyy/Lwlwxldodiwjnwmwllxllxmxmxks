package p20;

import java.util.List;
import u10.ex;
import u10.fx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class um implements aaShadow.a {
    public static final um a = new um();
    public static final List b = sy.d0Shadow.o("__typename", "name", "id", "pinnedIssues");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        ex exVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                exVar = (ex) aa.c.b(aa.c.c(tm.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str3 != null) {
            return new fx(str, str2, str3, exVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fx fxVar = (fx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fxVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fxVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, fxVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, fxVar.c);
        fVar.z0("pinnedIssues");
        aa.c.b(aa.c.c(tm.a, false)).b(fVar, wVar, fxVar.d);
    }
}
