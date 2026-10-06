package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hc {
    public String a;

    public hc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc) && k71.k.b(this.a, ((hc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Owner(id=", this.a, ")");
    }
}
