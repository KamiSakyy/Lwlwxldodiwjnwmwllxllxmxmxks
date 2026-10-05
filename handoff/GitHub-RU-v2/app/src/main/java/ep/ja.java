package ep;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ja implements aa.a {
    public static final ja a = new ja();
    public static final List b = sy.d0.o("isEnabled", "filterGroup");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        m10.ka kaVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                m10.ka.Companion.getClass();
                Iterator it = m10.ka.D.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((m10.ka) obj).r.equals(u)) {
                        break;
                    }
                }
                m10.ka kaVar2 = (m10.ka) obj;
                kaVar = kaVar2 == null ? m10.ka.B : kaVar2;
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "isEnabled");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (kaVar != null) {
            return new jo.mf(booleanValue, kaVar);
        }
        k41.b.B(eVar, "filterGroup");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.mf mfVar = (jo.mf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mfVar, "value");
        fVar.z0("isEnabled");
        jo.f4.C(mfVar.a, aa.c.f, fVar, wVar, "filterGroup");
        fVar.I(mfVar.b.r);
    }
}
