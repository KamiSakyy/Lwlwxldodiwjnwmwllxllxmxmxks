package cq;

import java.util.Iterator;
import java.util.List;
import m10.m8;
import m10.ro;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"copilotLicenseType", "icon", "planTitle", "subtitle"});

    public static a3 c(ea.e eVar, aa.w wVar) {
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m8 m8Var = null;
        ro roVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                m8.Companion.getClass();
                Iterator it = m8.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((m8) obj2).r.equals(u)) {
                        break;
                    }
                }
                m8 m8Var2 = (m8) obj2;
                m8Var = m8Var2 == null ? m8.t : m8Var2;
            } else if (r0 == 1) {
                String u2 = eVar.u();
                k71.k.d(u2);
                ro.Companion.getClass();
                Iterator it2 = ro.v.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((ro) obj).r.equals(u2)) {
                        break;
                    }
                }
                ro roVar2 = (ro) obj;
                roVar = roVar2 == null ? ro.t : roVar2;
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (m8Var == null) {
            k41.b.B(eVar, "copilotLicenseType");
            throw null;
        }
        if (roVar == null) {
            k41.b.B(eVar, "icon");
            throw null;
        }
        if (str != null) {
            return new a3(m8Var, roVar, str, str2);
        }
        k41.b.B(eVar, "planTitle");
        throw null;
    }
}
