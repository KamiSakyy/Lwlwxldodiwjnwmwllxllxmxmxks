package kotlinx.serialization.json;

import g81.e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import k71.k;
import l81.t;
import x61.m;

@e(with = t.class)
/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends b implements Map<String, b>, l71.a {
    public static final JsonObject$Companion Companion = new JsonObject$Companion();
    public final Map r;

    public c(Map map) {
        k.g(map, "content");
        this.r = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b compute(String str, BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b computeIfAbsent(String str, Function<? super String, ? extends b> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b computeIfPresent(String str, BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.r.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.r.containsValue((b) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, b>> entrySet() {
        return this.r.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return k.b(this.r, obj);
    }

    @Override // java.util.Map
    public final b get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (b) this.r.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.r.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.r.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.r.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b merge(String str, b bVar, BiFunction<? super b, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b put(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends b> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b putIfAbsent(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final b remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b replace(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.r.size();
    }

    public final String toString() {
        return m.c0(this.r.entrySet(), ",", "{", "}", 0, new jy.b(22), 24);
    }

    @Override // java.util.Map
    public final Collection<b> values() {
        return this.r.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, b bVar, b bVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
