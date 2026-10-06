package e20;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, w wVar) {
        d20.i iVar;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
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
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            iVar = f.c(eVar, wVar);
        } else {
            iVar = null;
        }
        if (str2 != null) {
            return new d20.h(str, str2, iVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        d20.h hVar = (d20.h) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(hVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, hVar.b);
        d20.i iVar = hVar.c;
        if (iVar != null) {
            f.d(fVar, wVar, iVar);
        }
    }

}
