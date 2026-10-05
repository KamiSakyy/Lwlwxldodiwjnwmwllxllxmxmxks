package q10;

import aa.m;
import aa.q;
import aa.r;
import aa.t;
import aa.t0;
import aa.u0;
import com.apollographql.apollo.exception.CacheMissException;
import java.util.Iterator;
import java.util.Map;
import k71.k;
import v8.l0;
import w8.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements ha.c {
    public static final a Companion = new a();

    public final ha.b a(Map map, e51.a aVar) {
        String obj;
        k.g(map, "obj");
        Object obj2 = map.get("viewGroupId");
        Object obj3 = map.get("__typename");
        Object obj4 = ((Map) ((y51.c) aVar.t).s).get("query");
        ha.b bVar = null;
        ha.b i = (obj2 == null || obj4 == null || obj3 == null) ? null : y9.a.i(obj3.toString(), obj2.toString(), obj4.toString());
        if (i != null) {
            return i;
        }
        Object obj5 = map.get("id");
        if (obj5 != null && (obj = obj5.toString()) != null) {
            bVar = new ha.b(obj);
        }
        return bVar == null ? ha.g.a.a(map, aVar) : bVar;
    }

    public final Object b(m mVar, y51.c cVar, Map map, String str) {
        Object obj;
        k.g(map, "parent");
        k.g(str, "parentId");
        s sVar = mVar.b;
        if (sVar instanceof r) {
            sVar = ((r) sVar).a;
        }
        if ((sVar instanceof q) && l0.A((q) sVar)) {
            Map map2 = (Map) cVar.s;
            Iterator it = mVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((aa.k) obj).a.s.equals("id")) {
                    break;
                }
            }
            aa.k kVar = (aa.k) obj;
            u0 u0Var = t0.d;
            if (kVar != null) {
                Object obj2 = kVar.b.d;
                if (obj2 instanceof t) {
                    String str2 = ((t) obj2).a;
                    if (map2.containsKey(str2)) {
                        u0Var = new u0(map2.get(str2));
                    }
                } else {
                    u0Var = new u0(l0.I(obj2, cVar));
                }
            }
            u0 u0Var2 = u0Var instanceof u0 ? u0Var : null;
            String str3 = (String) (u0Var2 != null ? u0Var2.d : null);
            ha.b bVar = str3 != null ? new ha.b(str3) : null;
            if (bVar != null) {
                return bVar;
            }
        }
        String b = mVar.b(cVar);
        if (map.containsKey(b)) {
            return map.get(b);
        }
        throw new CacheMissException(str, b);
    }
}
