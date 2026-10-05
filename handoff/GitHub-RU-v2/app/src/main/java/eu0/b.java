package eu0;

import aa.c;
import aa.o0;
import aa.w;
import ea.e;
import ea.f;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"startLine", "endLine", "startLineType", "endLineType", "id", "__typename"});

    public static a c(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            nn.a aVar = ro0.a.a;
            if (r0 == 0) {
                num = (Integer) c.b(aVar).a(eVar, wVar);
            } else if (r0 == 1) {
                num2 = (Integer) c.b(aVar).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                str2 = (String) c.i.a(eVar, wVar);
            } else if (r0 == 4) {
                str3 = (String) c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str4 = (String) c.a.a(eVar, wVar);
            }
        }
        if (str3 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str4 != null) {
            return new a(num, num2, str, str2, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("startLine");
        nn.a aVar2 = ro0.a.a;
        c.b(aVar2).b(fVar, wVar, aVar.a);
        fVar.z0("endLine");
        c.b(aVar2).b(fVar, wVar, aVar.b);
        fVar.z0("startLineType");
        o0 o0Var = c.i;
        o0Var.b(fVar, wVar, aVar.c);
        fVar.z0("endLineType");
        o0Var.b(fVar, wVar, aVar.d);
        fVar.z0("id");
        aa.b bVar = c.a;
        bVar.b(fVar, wVar, aVar.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, aVar.f);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
