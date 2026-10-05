package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mg {
    public final String a;

    public mg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mg) && k71.k.b(this.a, ((mg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("File(name=", this.a, ")");
    }
}
