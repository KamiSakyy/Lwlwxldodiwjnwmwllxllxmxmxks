package d9;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f21679a;

    /* renamed from: b, reason: collision with root package name */
    public Long f21680b;

    public c(String str, Long l) {
        this.f21679a = str;
        this.f21680b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.f21679a, cVar.f21679a) && k71.k.b(this.f21680b, cVar.f21680b);
    }

    public final int hashCode() {
        int hashCode = this.f21679a.hashCode() * 31;
        Long l = this.f21680b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f21679a + ", value=" + this.f21680b + ')';
    }
    public Object a = null;
    public Object b = null;
}
