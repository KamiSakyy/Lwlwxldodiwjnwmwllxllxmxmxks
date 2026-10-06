package fd0;

import java.util.List;
import kc0.dz;
import kc0.ez;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fo implements aaShadow.a {
    public static final fo a = new fo();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "name", "id", "pinnedIssues"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        dz dzVar = null;
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
                dzVar = (dz) aa.c.b(aa.c.c(eo.a, false)).a(eVar, wVar);
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
            return new ez(str, str2, str3, dzVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ez ezVar = (ez) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ezVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ezVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, ezVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, ezVar.c);
        fVar.z0("pinnedIssues");
        aa.c.b(aa.c.c(eo.a, false)).b(fVar, wVar, ezVar.d);
    }
}
