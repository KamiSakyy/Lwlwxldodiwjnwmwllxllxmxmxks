package gt;

import aa.c;
import aa.w;
import ea.e;
import ea.f;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import k71.k;
import m10.mj;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"id", "name", "description", "isEnabled", "color", "__typename"});

    public static a c(e eVar, w wVar) {
        Boolean bool;
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        mj mjVar = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                str3 = (String) c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                bool2 = (Boolean) c.f.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                String u = eVar.u();
                k.d(u);
                mj.Companion.getClass();
                Iterator it = mj.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((mj) obj).r.equals(u)) {
                        break;
                    }
                }
                mj mjVar2 = (mj) obj;
                mjVar = mjVar2 == null ? mj.t : mjVar2;
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                str4 = (String) c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isEnabled");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (mjVar == null) {
            k41.b.B(eVar, "color");
            throw null;
        }
        if (str4 != null) {
            return new a(str, str2, str3, booleanValue, mjVar, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("id");
        aa.b bVar = c.a;
        bVar.b(fVar, wVar, aVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, aVar.b);
        fVar.z0("description");
        c.i.b(fVar, wVar, aVar.c);
        fVar.z0("isEnabled");
        f4.C(aVar.d, c.f, fVar, wVar, "color");
        fVar.I(aVar.e.r);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, aVar.f);
    }

}
