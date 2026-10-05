package qf0;

import aa.c;
import aa.w;
import ea.e;
import ea.f;
import gn0.s8;
import java.util.Iterator;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"type", "html", "left", "right", "text", "isMissingNewlineAtEnd"});

    public static a c(e eVar, w wVar) {
        Boolean bool;
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        s8 s8Var = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                String u = eVar.u();
                k.d(u);
                s8.Companion.getClass();
                Iterator it = s8.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((s8) obj).r.equals(u)) {
                        break;
                    }
                }
                s8 s8Var2 = (s8) obj;
                s8Var = s8Var2 == null ? s8.u : s8Var2;
            } else if (r0 != 1) {
                nn.a aVar = od0.b.a;
                if (r0 == 2) {
                    bool = bool2;
                    num = (Integer) c.b(aVar).a(eVar, wVar);
                } else if (r0 == 3) {
                    bool = bool2;
                    num2 = (Integer) c.b(aVar).a(eVar, wVar);
                } else if (r0 == 4) {
                    bool = bool2;
                    str2 = (String) c.a.a(eVar, wVar);
                } else {
                    if (r0 != 5) {
                        break;
                    }
                    bool2 = (Boolean) c.f.a(eVar, wVar);
                }
            } else {
                bool = bool2;
                str = (String) c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (s8Var == null) {
            k41.b.B(eVar, "type");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "html");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "text");
            throw null;
        }
        if (bool3 != null) {
            return new a(s8Var, str, num, num2, str2, bool3.booleanValue());
        }
        k41.b.B(eVar, "isMissingNewlineAtEnd");
        throw null;
    }

    public static void d(f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("type");
        fVar.I(aVar.a.r);
        fVar.z0("html");
        aa.b bVar = c.a;
        bVar.b(fVar, wVar, aVar.b);
        fVar.z0("left");
        nn.a aVar2 = od0.b.a;
        c.b(aVar2).b(fVar, wVar, aVar.c);
        fVar.z0("right");
        c.b(aVar2).b(fVar, wVar, aVar.d);
        fVar.z0("text");
        bVar.b(fVar, wVar, aVar.e);
        fVar.z0("isMissingNewlineAtEnd");
        c.f.b(fVar, wVar, Boolean.valueOf(aVar.f));
    }
}
