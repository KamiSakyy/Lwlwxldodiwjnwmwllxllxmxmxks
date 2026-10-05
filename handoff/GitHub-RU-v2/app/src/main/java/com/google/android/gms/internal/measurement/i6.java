package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i6 extends AbstractMap {
    public Object[] r;
    public int s;
    public Map t;
    public boolean u;
    public volatile androidx.datastore.preferences.protobuf.y0 v;
    public Map w;

    public i6() {
        Map map = Collections.EMPTY_MAP;
        this.t = map;
        this.w = map;
    }

    public final j6 a(int i) {
        if (i < this.s) {
            return (j6) this.r[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.t.isEmpty() ? Collections.EMPTY_SET : this.t.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int e = e(comparable);
        if (e >= 0) {
            return ((j6) this.r[e]).setValue(obj);
        }
        f();
        if (this.r == null) {
            this.r = new Object[16];
        }
        int i = -(e + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.s == 16) {
            j6 j6Var = (j6) this.r[15];
            this.s = 15;
            g().put(j6Var.r, j6Var.s);
        }
        Object[] objArr = this.r;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.r[i] = new j6(this, comparable, obj);
        this.s++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.s != 0) {
            this.r = null;
            this.s = 0;
        }
        if (this.t.isEmpty()) {
            return;
        }
        this.t.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.t.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.r;
        Object obj = ((j6) objArr[i]).s;
        System.arraycopy(objArr, i + 1, objArr, i, (this.s - i) - 1);
        this.s--;
        if (!this.t.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.r;
            int i2 = this.s;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new j6(this, (Comparable) entry.getKey(), entry.getValue());
            this.s++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.s;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((j6) this.r[i2]).r);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((j6) this.r[i4]).r);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.v == null) {
            this.v = new androidx.datastore.preferences.protobuf.y0(1, this);
        }
        return this.v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return super.equals(obj);
        }
        i6 i6Var = (i6) obj;
        int size = size();
        if (size == i6Var.size()) {
            int i = this.s;
            if (i != i6Var.s) {
                return entrySet().equals(i6Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (a(i2).equals(i6Var.a(i2))) {
                }
            }
            if (i != size) {
                return this.t.equals(i6Var.t);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.u) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.t.isEmpty() && !(this.t instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.t = treeMap;
            this.w = treeMap.descendingMap();
        }
        return (SortedMap) this.t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        return e >= 0 ? ((j6) this.r[e]).s : this.t.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.s;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.r[i3].hashCode();
        }
        return this.t.size() > 0 ? this.t.hashCode() + i2 : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return d(e);
        }
        if (this.t.isEmpty()) {
            return null;
        }
        return this.t.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.t.size() + this.s;
    }
}
