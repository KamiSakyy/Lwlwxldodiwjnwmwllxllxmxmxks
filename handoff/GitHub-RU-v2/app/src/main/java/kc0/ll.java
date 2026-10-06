package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ll {
    public final String a;

    public ll(String str) {
        k71.k.g(str, "id");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ll) && k71.k.b(this.a, ((ll) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
