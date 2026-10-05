package aa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f682a;

    public u(r9.o oVar) {
        this.f682a = x61.x.C(oVar.f31324r);
    }

    public static String e(int i, String str, int i10) {
        return i + '-' + i10 + '-' + str;
    }

    public void a(k71.e eVar, j71.c cVar) {
        LinkedHashMap linkedHashMap = this.f682a;
        if (!linkedHashMap.containsKey(eVar)) {
            linkedHashMap.put(eVar, new t6.e(eVar, cVar));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + eVar.b() + '.').toString());
    }

    public void b(p7.a aVar) {
        k71.k.g(aVar, "migration");
        int i = aVar.f30409a;
        int i10 = aVar.f30410b;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f682a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            Objects.toString(treeMap.get(Integer.valueOf(i10)));
            aVar.toString();
        }
        treeMap.put(Integer.valueOf(i10), aVar);
    }

    public w c() {
        return new w(this.f682a, null, null);
    }

    public l61.d d() {
        Collection values = this.f682a.values();
        k71.k.g(values, "initializers");
        t6.e[] eVarArr = (t6.e[]) values.toArray(new t6.e[0]);
        return new l61.d((t6.e[]) Arrays.copyOf(eVarArr, eVarArr.length));
    }

    public List f(String str) {
        k71.k.g(str, "workSpecId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f682a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (k71.k.b(((d9.i) entry.getKey()).f21696a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((d9.i) it.next());
        }
        return x61.m.F0(linkedHashMap.values());
    }

    public w8.g g(d9.i iVar) {
        k71.k.g(iVar, "id");
        return (w8.g) this.f682a.remove(iVar);
    }

    public w8.g h(d9.i iVar) {
        LinkedHashMap linkedHashMap = this.f682a;
        Object obj = linkedHashMap.get(iVar);
        if (obj == null) {
            obj = new w8.g(iVar);
            linkedHashMap.put(iVar, obj);
        }
        return (w8.g) obj;
    }

    public u(int i) {
        switch (i) {
            case 1:
                this.f682a = new LinkedHashMap();
                break;
            case 2:
                this.f682a = new LinkedHashMap();
                break;
            case 3:
            default:
                this.f682a = new LinkedHashMap();
                break;
            case 4:
                this.f682a = new LinkedHashMap();
                break;
            case 5:
                this.f682a = new LinkedHashMap();
                break;
            case 6:
                this.f682a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

}
