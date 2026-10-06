package k81;

import java.util.Map;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t0 implements Map.Entry, l71.a {
    public Object r;
    public Object s;

    public t0(Object obj, Object obj2) {
        this.r = obj;
        this.s = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.r, t0Var.r) && k71.k.b(this.s, t0Var.s);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.r;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.s;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.r + ", value=" + this.s + ')';
    }
}
