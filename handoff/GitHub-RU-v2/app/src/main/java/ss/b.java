package ss;

import aa.c;
import aa.w;
import ea.e;
import ea.f;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import m10.ka;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"name", "isEnabled", "filterGroup"});

    public static a c(e eVar, w wVar) {
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        ka kaVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                String u = eVar.u();
                k.d(u);
                ka.Companion.getClass();
                Iterator it = ka.D.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ka) obj).r.equals(u)) {
                        break;
                    }
                }
                ka kaVar2 = (ka) obj;
                kaVar = kaVar2 == null ? ka.B : kaVar2;
            }
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "isEnabled");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (kaVar != null) {
            return new a(str, booleanValue, kaVar);
        }
        k41.b.B(eVar, "filterGroup");
        throw null;
    }

    public static void d(f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("name");
        c.a.b(fVar, wVar, aVar.a);
        fVar.z0("isEnabled");
        f4Shadow.C(aVar.b, c.f, fVar, wVar, "filterGroup");
        fVar.I(aVar.c.r);
    }
}
