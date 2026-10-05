package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class v0 extends AbstractMap {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f2383w = 0;

    /* renamed from: r, reason: collision with root package name */
    public List f2384r;

    /* renamed from: s, reason: collision with root package name */
    public Map f2385s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2386t;

    /* renamed from: u, reason: collision with root package name */
    public volatile y0 f2387u;

    /* renamed from: v, reason: collision with root package name */
    public Map f2388v;

    public static v0 f() {
        v0 v0Var = new v0();
        v0Var.f2384r = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        v0Var.f2385s = map;
        v0Var.f2388v = map;
        return v0Var;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.f2384r.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((w0) this.f2384r.get(i10)).f2391r);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((w0) this.f2384r.get(i12)).f2391r);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        i = i11 + 1;
        return -i;
    }

    public final void b() {
        if (this.f2386t) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f2384r.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2384r.isEmpty()) {
            this.f2384r.clear();
        }
        if (this.f2385s.isEmpty()) {
            return;
        }
        this.f2385s.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2385s.containsKey(comparable);
    }

    public final Set d() {
        return this.f2385s.isEmpty() ? Collections.EMPTY_SET : this.f2385s.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f2385s.isEmpty() && !(this.f2385s instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2385s = treeMap;
            this.f2388v = treeMap.descendingMap();
        }
        return (SortedMap) this.f2385s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2387u == null) {
            this.f2387u = new y0(0, this);
        }
        return this.f2387u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return super.equals(obj);
        }
        v0 v0Var = (v0) obj;
        int size = size();
        if (size == v0Var.size()) {
            int size2 = this.f2384r.size();
            if (size2 != v0Var.f2384r.size()) {
                return ((AbstractSet) entrySet()).equals(v0Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(v0Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.f2385s.equals(v0Var.f2385s);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a10 = a(comparable);
        if (a10 >= 0) {
            return ((w0) this.f2384r.get(a10)).setValue(obj);
        }
        b();
        if (this.f2384r.isEmpty() && !(this.f2384r instanceof ArrayList)) {
            this.f2384r = new ArrayList(16);
        }
        int i = -(a10 + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f2384r.size() == 16) {
            w0 w0Var = (w0) this.f2384r.remove(15);
            e().put(w0Var.f2391r, w0Var.f2392s);
        }
        this.f2384r.add(i, new w0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        return a10 >= 0 ? ((w0) this.f2384r.get(a10)).f2392s : this.f2385s.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((w0) this.f2384r.remove(i)).f2392s;
        if (!this.f2385s.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f2384r;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new w0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2384r.size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i += ((w0) this.f2384r.get(i10)).hashCode();
        }
        return this.f2385s.size() > 0 ? this.f2385s.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return h(a10);
        }
        if (this.f2385s.isEmpty()) {
            return null;
        }
        return this.f2385s.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2385s.size() + this.f2384r.size();
    }
}
