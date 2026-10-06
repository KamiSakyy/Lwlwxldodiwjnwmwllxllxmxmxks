package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jx {
    public final String a;

    public jx(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx) && k71.k.b(this.a, ((jx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Submodule(gitUrl=", this.a, ")");
    }
}
