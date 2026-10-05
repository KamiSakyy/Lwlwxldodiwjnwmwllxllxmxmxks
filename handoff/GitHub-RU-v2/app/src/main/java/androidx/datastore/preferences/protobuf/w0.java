package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class w0 implements Map.Entry, Comparable {

    /* renamed from: r, reason: collision with root package name */
    public final Comparable f2391r;

    /* renamed from: s, reason: collision with root package name */
    public Object f2392s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v0 f2393t;

    public w0(v0 v0Var, Comparable comparable, Object obj) {
        this.f2393t = v0Var;
        this.f2391r = comparable;
        this.f2392s = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2391r.compareTo(((w0) obj).f2391r);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f2391r;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f2392s;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2391r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2392s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2391r;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2392s;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2393t.b();
        Object obj2 = this.f2392s;
        this.f2392s = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2391r + "=" + this.f2392s;
    }
}
