package ep;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bf implements aaShadow.a {
    public static final bf a = new bf();
    public static final List b = sy.d0Shadow.o("id", "pullRequestState", "isDraft", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        m10.b00 b00Var = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                m10.b00.Companion.getClass();
                Iterator it = m10.b00.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((m10.b00) obj).r.equals(u)) {
                        break;
                    }
                }
                m10.b00 b00Var2 = (m10.b00) obj;
                b00Var = b00Var2 == null ? m10.b00.v : b00Var2;
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
        if (b00Var == null) {
            k41.b.B(eVar, "pullRequestState");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "isDraft");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new jo.mm(str, b00Var, booleanValue, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.mm mmVar = (jo.mm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mmVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mmVar.a);
        fVar.z0("pullRequestState");
        fVar.I(mmVar.b.r);
        fVar.z0("isDraft");
        jo.f4Shadow.C(mmVar.c, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, mmVar.d);
    }
}
