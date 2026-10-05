package we0;

import gn0.yv;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 implements aa.a {
    public static final z0 a = new z0();
    public static final List b = sy.d0.o(new String[]{"id", "state", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        yv yvVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                yv.Companion.getClass();
                Iterator it = yv.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((yv) obj).r.equals(u)) {
                        break;
                    }
                }
                yv yvVar2 = (yv) obj;
                yvVar = yvVar2 == null ? yv.t : yvVar2;
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (yvVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str2 != null) {
            return new w(yvVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w wVar2 = (w) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wVar2.a);
        fVar.z0("state");
        fVar.I(wVar2.b.r);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, wVar2.c);
    }
}
