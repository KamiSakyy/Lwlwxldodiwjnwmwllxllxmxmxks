package vz0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k71.k;
import sy.d0Shadow;
import sy.f0;
import x61.m;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public class e {
    public static final d Companion = new d();
    public static final Set e = f0.r("MobileAuthRequests");
    public String a;
    public long b;
    public c c;
    public ConcurrentHashMap d;

    public e(String str, long j, c cVar) {
        k.g(cVar, "loopAction");
        this.a = str;
        this.b = j;
        this.c = cVar;
        this.d = new ConcurrentHashMap();
    }

    public final void a(Set set) {
        ConcurrentHashMap concurrentHashMap;
        k.g(set, "eventKeys");
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = f0.l(set, e).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = this.d;
            if (!hasNext) {
                break;
            }
            String str = (String) it.next();
            Collection collection = (List) concurrentHashMap.get(str);
            if (collection == null) {
                collection = rShadow.r;
            }
            concurrentHashMap.put(str, m.m0(collection, Long.valueOf(currentTimeMillis)));
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            long j = this.b;
            int i = 0;
            if (list == null || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((Number) it2.next()).longValue() > currentTimeMillis - j && (i = i + 1) < 0) {
                        d0Shadow.w();
                        throw null;
                    }
                }
            }
            if (i > 15) {
                concurrentHashMap.remove(str2);
                this.c.n(Integer.valueOf(i), Long.valueOf(j), str2, this.a);
            } else if (i == 0) {
                concurrentHashMap.remove(str2);
            }
        }
    }
}
