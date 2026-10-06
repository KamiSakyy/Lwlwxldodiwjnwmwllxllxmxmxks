package s5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import w61.k;
import x61.m;
import x61.n;
import x61.x;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public LinkedHashMap f31714a;

    /* renamed from: b, reason: collision with root package name */
    public p5.a f31715b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f31714a = linkedHashMap;
        this.f31715b = new p5.a(z10);
    }

    public final Map a() {
        k kVar;
        Set<Map.Entry> entrySet = this.f31714a.entrySet();
        int s2 = x.s(n.F(entrySet, 10));
        if (s2 < 16) {
            s2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s2);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                k71.k.f(copyOf, "copyOf(...)");
                kVar = new k(key, copyOf);
            } else {
                kVar = new k(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(kVar.r, kVar.s);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k71.k.f(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    public final void b() {
        if (this.f31715b.f30361a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c() {
        b();
        this.f31714a.clear();
    }

    public final Object d(e eVar) {
        k71.k.g(eVar, "key");
        Object obj = this.f31714a.get(eVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        k71.k.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final void e(e eVar) {
        k71.k.g(eVar, "key");
        b();
        this.f31714a.remove(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof b) {
            LinkedHashMap linkedHashMap = ((b) obj).f31714a;
            LinkedHashMap linkedHashMap2 = this.f31714a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z10 = k71.k.b(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z10 = true;
                                }
                                if (z10) {
                                }
                            }
                            z10 = false;
                            if (z10) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(e eVar, Object obj) {
        k71.k.g(eVar, "key");
        g(eVar, obj);
    }

    public final void g(e eVar, Object obj) {
        k71.k.g(eVar, "key");
        b();
        if (obj == null) {
            e(eVar);
            return;
        }
        boolean z10 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f31714a;
        if (z10) {
            Set unmodifiableSet = Collections.unmodifiableSet(m.K0((Set) obj));
            k71.k.f(unmodifiableSet, "unmodifiableSet(...)");
            linkedHashMap.put(eVar, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(eVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            k71.k.f(copyOf, "copyOf(...)");
            linkedHashMap.put(eVar, copyOf);
        }
    }

    public final b h() {
        return new b(x.C(a()), false);
    }

    public final int hashCode() {
        Iterator it = this.f31714a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final b i() {
        return new b(x.C(a()), true);
    }

    public final String toString() {
        return m.c0(this.f31714a.entrySet(), ",\n", "{\n", "\n}", 0, new a(0), 24);
    }

    public /* synthetic */ b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
