package eo0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fe implements aaShadow.a {
    public static final fe a = new fe();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "pullRequestState", "isDraft", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        pz0.gu guVar = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                pz0.gu.Companion.getClass();
                Iterator it = pz0.gu.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((pz0.gu) obj).r.equals(u)) {
                        break;
                    }
                }
                pz0.gu guVar2 = (pz0.gu) obj;
                guVar = guVar2 == null ? pz0.gu.v : guVar2;
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
        if (guVar == null) {
            k41.b.B(eVar, "pullRequestState");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "isDraft");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new jn0.hl(str, guVar, booleanValue, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.hl hlVar = (jn0.hl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hlVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hlVar.a);
        fVar.z0("pullRequestState");
        fVar.I(hlVar.b.r);
        fVar.z0("isDraft");
        jo.f4Shadow.C(hlVar.c, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, hlVar.d);
    }
}
