package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y80 {
    public final String a;

    public y80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y80) && k71.k.b(this.a, ((y80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
