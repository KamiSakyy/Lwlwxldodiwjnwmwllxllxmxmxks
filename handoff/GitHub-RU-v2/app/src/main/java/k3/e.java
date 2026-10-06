package k3;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public z f27669a;

    public e(z zVar) {
        this.f27669a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(this.f27669a, ((e) obj).f27669a);
    }

    public final int hashCode() {
        return this.f27669a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f27669a + ", loaderKey=null)";
    }
}
