package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wz implements aaShadow.v0 {
    public final a00 a;

    public wz(a00 a00Var) {
        this.a = a00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz) && k71.k.b(this.a, ((wz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(search=" + this.a + ")";
    }
}
