package d3;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f21421a;

    /* renamed from: b, reason: collision with root package name */
    public final j71.a f21422b;

    public f(String str, j71.a aVar) {
        this.f21421a = str;
        this.f21422b = aVar;
    }

    public final String a() {
        return this.f21421a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.f21421a, fVar.f21421a) && this.f21422b == fVar.f21422b;
    }

    public final int hashCode() {
        return this.f21422b.hashCode() + (this.f21421a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f21421a + ", action=" + this.f21422b + ')';
    }
}
