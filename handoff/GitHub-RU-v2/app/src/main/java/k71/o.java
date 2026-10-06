package k71;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements d {
    public final Class a;

    public o(Class cls) {
        k.g(cls, "jClass");
        this.a = cls;
    }

    @Override // k71.d
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return k.b(this.a, ((o) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
