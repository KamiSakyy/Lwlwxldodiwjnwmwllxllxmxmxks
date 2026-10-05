package a50;

import aa.c;
import aa.w;
import ea.e;
import ea.f;
import hc0.g8;
import java.util.Iterator;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"type", "html", "left", "right", "text", "isMissingNewlineAtEnd"});

    public static a c(e eVar, w wVar) {
        Boolean bool;
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        g8 g8Var = null;
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
                g8.Companion.getClass();
                Iterator it = g8.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((g8) obj).r.equals(u)) {
                        break;
                    }
                }
                g8 g8Var2 = (g8) obj;
                g8Var = g8Var2 == null ? g8.u : g8Var2;
            } else if (r0 != 1) {
                nn.a aVar = y20.a.a;
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
        if (g8Var == null) {
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
            return new a(g8Var, str, num, num2, str2, bool3.booleanValue());
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
        nn.a aVar2 = y20.a.a;
        c.b(aVar2).b(fVar, wVar, aVar.c);
        fVar.z0("right");
        c.b(aVar2).b(fVar, wVar, aVar.d);
        fVar.z0("text");
        bVar.b(fVar, wVar, aVar.e);
        fVar.z0("isMissingNewlineAtEnd");
        c.f.b(fVar, wVar, Boolean.valueOf(aVar.f));
    }
}
