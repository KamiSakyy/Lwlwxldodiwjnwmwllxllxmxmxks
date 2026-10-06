package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 {
    public String a;

    public h1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && k71.k.b(this.a, ((h1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnMannequin(id=", this.a, ")");
    }
}
