package fd0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f8 implements aa.a {
    public static final f8 a = new f8();
    public static final List b = sy.d0.o(new String[]{"link", "linkType"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        gn0.qw qwVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                gn0.qw.Companion.getClass();
                Iterator it = gn0.qw.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gn0.qw) obj).r.equals(u)) {
                        break;
                    }
                }
                gn0.qw qwVar2 = (gn0.qw) obj;
                qwVar = qwVar2 == null ? gn0.qw.u : qwVar2;
            }
        }
        if (str == null) {
            k41.b.B(eVar, "link");
            throw null;
        }
        if (qwVar != null) {
            return new kc0.ic(str, qwVar);
        }
        k41.b.B(eVar, "linkType");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ic icVar = (kc0.ic) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(icVar, "value");
        fVar.z0("link");
        aa.c.a.b(fVar, wVar, icVar.a);
        fVar.z0("linkType");
        fVar.I(icVar.b.r);
    }
}
