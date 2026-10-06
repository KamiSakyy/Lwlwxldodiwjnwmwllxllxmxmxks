package t71;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f32132a;

    /* renamed from: b, reason: collision with root package name */
    public final q71.g f32133b;

    public j(String str, q71.g gVar) {
        this.f32132a = str;
        this.f32133b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.f32132a, jVar.f32132a) && k71.k.b(this.f32133b, jVar.f32133b);
    }

    public final int hashCode() {
        return this.f32133b.hashCode() + (this.f32132a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f32132a + ", range=" + this.f32133b + ')';
    }
    public Object i0(Object p1, Object p2) { return null; }
    public Object l0(Object p1) { return null; }
    public Object a = null;
    public Object b = null;
}
