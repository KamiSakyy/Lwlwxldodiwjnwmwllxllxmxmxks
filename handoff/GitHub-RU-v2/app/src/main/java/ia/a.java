package ia;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k71.k;
import sy.d0;
import x61.m;
import x61.n;
import x61.x;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f26146a;

    public a(Map map) {
        k.g(map, "data");
        this.f26146a = map;
    }

    public final Object a(Object obj, List list) {
        if (obj instanceof ha.b) {
            return a(this.f26146a.get(list), list);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(n.F(iterable, 10));
            int i = 0;
            for (Object obj2 : iterable) {
                int i10 = i + 1;
                if (i < 0) {
                    d0.x();
                    throw null;
                }
                arrayList.add(a(obj2, m.m0(list, Integer.valueOf(i))));
                i = i10;
            }
            return arrayList;
        }
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object key2 = entry.getKey();
            k.e(key2, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put(key, a(value, m.m0(list, (String) key2)));
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k.b(this.f26146a, ((a) obj).f26146a);
    }

    public final int hashCode() {
        return this.f26146a.hashCode();
    }

    public final String toString() {
        return "CacheBatchReaderData(data=" + this.f26146a + ')';
    }
}
