package cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import sy.d0;
import v71.v;
import v71.z;
import y71.m1;
import yz0.s7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public static final j Companion = new j();
    public final z a;
    public final v b;
    public final com.github.rudroid.common.e c;
    public final m1 d;
    public final ConcurrentHashMap e;
    public final LinkedHashMap f;
    public final CopyOnWriteArrayList g;

    public s(z zVar, v vVar, qe.a aVar) {
        k71.k.g(zVar, "applicationScope");
        k71.k.g(vVar, "dispatcher");
        k71.k.g(aVar, "crashLogger");
        this.a = zVar;
        this.b = vVar;
        this.c = aVar;
        this.d = w8.s.j();
        this.e = new ConcurrentHashMap();
        this.f = new LinkedHashMap();
        this.g = new CopyOnWriteArrayList();
    }

    public static String d(String str, int i, String str2) {
        return str + "/" + str2 + "/" + i;
    }

    public final void a(String str, s7 s7Var) {
        k71.k.g(str, "parentId");
        k71.k.g(s7Var, "item");
        b(str, d0.n(s7Var));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    public final void b(String str, List list) {
        k71.k.g(str, "parentId");
        k71.k.g(list, "items");
        String str2 = (String) this.f.get(str);
        if (str2 != null) {
            ConcurrentHashMap concurrentHashMap = this.e;
            h hVar = (h) concurrentHashMap.get(str2);
            if (hVar != null) {
                concurrentHashMap.put(str2, new h(hVar.a, x61.m.l0((Collection) hVar.b, list)));
            }
            c(str2);
        }
    }

    public final void c(String str) {
        rb.b.b(this.a, this.b, this.c, "TimelineStore", new androidx.lifecycle.n(this, str, (a71.c) null, 6), 10);
    }

    public final void e(String str, String str2, int i, h01.q qVar) {
        k71.k.g(qVar, "timeLine");
        String d = d(str, i, str2);
        if (this.g.contains(d)) {
            this.f.put(qVar.a, d);
            this.e.put(d, new h(qVar, x61.r.r));
            c(d);
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.lang.Object] */
    public final void f(j71.c cVar, j71.c cVar2) {
        Object obj;
        Object obj2;
        Object obj3;
        Iterator it = this.e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            h hVar = (h) ((Map.Entry) obj).getValue();
            Iterator it2 = hVar.a.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (((Boolean) cVar.k(obj2)).booleanValue()) {
                        break;
                    }
                }
            }
            if (obj2 != null) {
                break;
            }
            Iterator it3 = hVar.b.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it3.next();
                    if (((Boolean) cVar.k(obj3)).booleanValue()) {
                        break;
                    }
                }
            }
            if (obj3 != null) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        String str = entry != null ? (String) entry.getKey() : null;
        if (str != null) {
            h(cVar2, str);
        }
    }

    public final k g(j71.c cVar, String str) {
        k71.k.g(str, "parentId");
        String str2 = (String) this.f.get(str);
        if (str2 != null) {
            return h(cVar, str2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final k h(j71.c cVar, String str) {
        k kVar;
        ConcurrentHashMap concurrentHashMap = this.e;
        h hVar = (h) concurrentHashMap.get(str);
        if (hVar != null) {
            h01.q qVar = hVar.a;
            java.util.List r1 = (java.util.List) (hVar.b);
            List list = qVar.c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object k = cVar.k(it.next());
                if (k != null) {
                    arrayList.add(k);
                }
            }
            h01.q a = h01.q.a(qVar, arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = r1.iterator();
            while (it2.hasNext()) {
                Object k2 = cVar.k(it2.next());
                if (k2 != null) {
                    arrayList2.add(k2);
                }
            }
            concurrentHashMap.put(str, new h(a, arrayList2));
            kVar = new k(this, str, qVar, r1);
        } else {
            kVar = null;
        }
        c(str);
        return kVar;
    }
}
