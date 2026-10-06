package fd0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ad implements aaShadow.a {
    public static final ad a = new ad();
    public static final List b = sy.d0.o(new String[]{"id", "pullRequestState", "isDraft", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        gn0.hn hnVar = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                gn0.hn.Companion.getClass();
                Iterator it = gn0.hn.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gn0.hn) obj).r.equals(u)) {
                        break;
                    }
                }
                gn0.hn hnVar2 = (gn0.hn) obj;
                hnVar = hnVar2 == null ? gn0.hn.v : hnVar2;
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (hnVar == null) {
            k41.b.B(eVar, "pullRequestState");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "isDraft");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new kc0.qj(str, hnVar, booleanValue, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.qj qjVar = (kc0.qj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qjVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qjVar.a);
        fVar.z0("pullRequestState");
        fVar.I(qjVar.b.r);
        fVar.z0("isDraft");
        jo.f4.C(qjVar.c, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, qjVar.d);
    }
}
