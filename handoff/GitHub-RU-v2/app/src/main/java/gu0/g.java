package gu0;

import aa.w;
import java.util.List;
import jo.f4;
import k71.k;
import pz0.bv;
import pz0.cv;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0.o(new String[]{"__typename", "viewerHasReacted", "reactors", "content"});

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        b bVar = null;
        cv cvVar = null;
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
                cv.Companion.getClass();
                cvVar = bv.a(u);
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
        if (cvVar != null) {
            return new a(str, booleanValue, bVar, cvVar);
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
        f4.C(aVar.b, aa.c.f, fVar, wVar, "reactors");
        aa.c.c(h.a, false).b(fVar, wVar, aVar.c);
        fVar.z0("content");
        fVar.I(aVar.d.r);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
