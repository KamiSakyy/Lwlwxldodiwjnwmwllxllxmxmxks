package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mf {
    public String a;

    public mf(String str) {
        k71.k.g(str, "path");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf) && k71.k.b(this.a, ((mf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("FileDeletion(path=", this.a, ")");
    }
}
