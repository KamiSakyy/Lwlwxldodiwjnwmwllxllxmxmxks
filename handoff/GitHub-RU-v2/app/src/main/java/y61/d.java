package y61;

import java.util.ConcurrentModificationException;
import java.util.Map;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements Map.Entry, l71.d {
    public e r;
    public int s;
    public int t;

    public d(e eVar, int i) {
        k.g(eVar, "map");
        this.r = eVar;
        this.s = i;
        this.t = eVar.y;
    }

    public final void a() {
        if (this.r.y != this.t) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return k.b(entry.getKey(), getKey()) && k.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.r.r[this.s];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.r.s;
        k.d(objArr);
        return objArr[this.s];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        e eVar = this.r;
        eVar.c();
        Object[] objArr = eVar.s;
        if (objArr == null) {
            int length = eVar.r.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            eVar.s = objArr;
        }
        int i = this.s;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
