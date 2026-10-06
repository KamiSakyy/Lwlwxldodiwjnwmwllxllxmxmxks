package s;

import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements Map.Entry {

    /* renamed from: r, reason: collision with root package name */
    public final Object f31374r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f31375s;

    /* renamed from: t, reason: collision with root package name */
    public c f31376t;

    /* renamed from: u, reason: collision with root package name */
    public c f31377u;

    public c(Object obj, Object obj2) {
        this.f31374r = obj;
        this.f31375s = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f31374r.equals(cVar.f31374r) && this.f31375s.equals(cVar.f31375s);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f31374r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f31375s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f31374r.hashCode() ^ this.f31375s.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f31374r + "=" + this.f31375s;
    }
}
