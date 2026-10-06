package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lb0 {
    public String a;

    public lb0(String str) {
        k71.k.g(str, "id");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lb0) && k71.k.b(this.a, ((lb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
