package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f8 implements aa.a {
    public static final f8 a = new f8();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.gc gcVar;
        ms.d0 d0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
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
        if (m71.a.v(m71.a.O(new String[]{"DiscussionComment"}), set2, str, set)) {
            eVar.s0();
            gcVar = g8.c(eVar, wVar);
        } else {
            gcVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DiscussionComment"}), set2, str, set)) {
            eVar.s0();
            d0Var = ms.e0.c(eVar, wVar);
        } else {
            d0Var = null;
        }
        if (str2 != null) {
            return new jo.fc(str, str2, gcVar, d0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.fc fcVar = (jo.fc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fcVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fcVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, fcVar.b);
        jo.gc gcVar = fcVar.c;
        if (gcVar != null) {
            g8.d(fVar, wVar, gcVar);
        }
        ms.d0 d0Var = fcVar.d;
        if (d0Var != null) {
            ms.e0.d(fVar, wVar, d0Var);
        }
    }
}
