package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dh {
    public String a;

    public dh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh) && k71.k.b(this.a, ((dh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
