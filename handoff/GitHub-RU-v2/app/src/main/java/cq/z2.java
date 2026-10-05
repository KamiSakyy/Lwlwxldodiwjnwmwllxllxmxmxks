package cq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m10.m8;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"copilotLicenseType", "title", "subtitle", "featuresHeader", "features"});

    public static x2 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m8 m8Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                m8.Companion.getClass();
                Iterator it = m8.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((m8) obj).r.equals(u)) {
                        break;
                    }
                }
                m8 m8Var2 = (m8) obj;
                m8Var = m8Var2 == null ? m8.t : m8Var2;
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                arrayList = aa.c.a(aa.c.c(y2.a, false)).c(eVar, wVar);
            }
        }
        if (m8Var == null) {
            k41.b.B(eVar, "copilotLicenseType");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "featuresHeader");
            throw null;
        }
        if (arrayList != null) {
            return new x2(m8Var, str, str2, str3, arrayList);
        }
        k41.b.B(eVar, "features");
        throw null;
    }
}
