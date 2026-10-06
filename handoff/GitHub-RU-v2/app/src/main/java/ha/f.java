package ha;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import k71.k;
import x61.m;
import x61.n;
import x61.x;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements Map, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public String f25581r;

    /* renamed from: s, reason: collision with root package name */
    public Map f25582s;

    /* renamed from: t, reason: collision with root package name */
    public UUID f25583t;

    /* renamed from: u, reason: collision with root package name */
    public LinkedHashMap f25584u;

    public f(String str, Map map, UUID uuid) {
        k.g(str, "key");
        k.g(map, "fields");
        this.f25581r = str;
        this.f25582s = map;
        this.f25583t = uuid;
    }

    public final Set a() {
        Set keySet = this.f25582s.keySet();
        ArrayList arrayList = new ArrayList(n.F(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f25581r + '.' + ((String) it.next()));
        }
        return m.K0(arrayList);
    }

    public final w61.k b(f fVar) {
        k.g(fVar, "newRecord");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map map = this.f25582s;
        LinkedHashMap C = x.C(map);
        LinkedHashMap linkedHashMap = this.f25584u;
        LinkedHashMap C2 = linkedHashMap != null ? x.C(linkedHashMap) : new LinkedHashMap();
        Iterator it = fVar.f25582s.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = this.f25581r;
            if (!hasNext) {
                UUID uuid = fVar.f25583t;
                k.g(str, "key");
                f fVar2 = new f(str, C, uuid);
                fVar2.f25584u = C2;
                return new w61.k(fVar2, linkedHashSet);
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            boolean containsKey = map.containsKey(str2);
            Object obj = map.get(str2);
            if (!containsKey || !k.b(obj, value)) {
                C.put(str2, value);
                linkedHashSet.add(str + '.' + str2);
            }
        }
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        ArrayList H0 = m.H0(this.f25582s.values());
        while (!H0.isEmpty()) {
            Object remove = H0.remove(H0.size() - 1);
            if (remove instanceof b) {
                arrayList.add(remove);
            } else if (remove instanceof Map) {
                H0.addAll(((Map) remove).values());
            } else if (remove instanceof List) {
                H0.addAll((Collection) remove);
            }
        }
        return arrayList;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f25582s.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f25582s.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f25582s.entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f25582s.get((String) obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f25582s.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f25582s.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f25582s.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f25582s.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
