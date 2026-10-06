package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hk {
    public String a;

    public hk(String str) {
        k71.k.g(str, "id");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk) && k71.k.b(this.a, ((hk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
