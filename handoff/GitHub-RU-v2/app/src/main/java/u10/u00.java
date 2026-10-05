package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u00 {
    public final String a;

    public u00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u00) && k71.k.b(this.a, ((u00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
