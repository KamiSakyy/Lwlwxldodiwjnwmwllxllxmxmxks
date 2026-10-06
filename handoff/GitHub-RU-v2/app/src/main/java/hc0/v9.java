package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v9 {
    public String a;

    public v9(String str) {
        k71.k.g(str, "path");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9) && k71.k.b(this.a, ((v9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("FileDeletion(path=", this.a, ")");
    }
}
