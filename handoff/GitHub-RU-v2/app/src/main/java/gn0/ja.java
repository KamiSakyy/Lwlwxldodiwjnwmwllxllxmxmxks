package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ja {
    public final String a;

    public ja(String str) {
        k71.k.g(str, "path");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja) && k71.k.b(this.a, ((ja) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("FileDeletion(path=", this.a, ")");
    }
}
