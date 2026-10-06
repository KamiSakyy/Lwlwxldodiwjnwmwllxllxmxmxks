package aj0;

import aa.w;
import gn0.ao;
import gn0.bo;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0Shadow.o(new String[]{"__typename", "viewerHasReacted", "reactors", "content"});

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        b bVar = null;
        bo boVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bVar = (b) aa.c.c(h.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                String u = eVar.u();
                k.d(u);
                bo.Companion.getClass();
                boVar = ao.a(u);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "viewerHasReacted");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bVar == null) {
            k41.b.B(eVar, "reactors");
            throw null;
        }
        if (boVar != null) {
            return new a(str, booleanValue, bVar, boVar);
        }
        k41.b.B(eVar, "content");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        a aVar = (a) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, aVar.a);
        fVar.z0("viewerHasReacted");
        f4Shadow.C(aVar.b, aa.c.f, fVar, wVar, "reactors");
        aa.c.c(h.a, false).b(fVar, wVar, aVar.c);
        fVar.z0("content");
        fVar.I(aVar.d.r);
    }

}
