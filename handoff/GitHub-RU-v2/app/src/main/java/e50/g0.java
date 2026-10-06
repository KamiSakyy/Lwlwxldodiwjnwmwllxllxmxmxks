package e50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public String a;

    public g0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && k71.k.b(this.a, ((g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
