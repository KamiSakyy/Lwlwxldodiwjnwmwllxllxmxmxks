package mo0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, w wVar) {
        lo0.g gVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
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
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"DraftIssue"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            gVar = f.c(eVar, wVar);
        } else {
            gVar = null;
        }
        if (str2 != null) {
            return new lo0.f(str, str2, gVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lo0.f fVar2 = (lo0.f) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fVar2.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, fVar2.b);
        lo0.g gVar = fVar2.c;
        if (gVar != null) {
            f.d(fVar, wVar, gVar);
        }
    }
}
