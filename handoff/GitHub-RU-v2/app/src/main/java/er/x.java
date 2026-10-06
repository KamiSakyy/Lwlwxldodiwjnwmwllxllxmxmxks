package er;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x {
    public final String a;

    public x(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && k71.k.b(this.a, ((x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Submodule(gitUrl=", this.a, ")");
    }
}
