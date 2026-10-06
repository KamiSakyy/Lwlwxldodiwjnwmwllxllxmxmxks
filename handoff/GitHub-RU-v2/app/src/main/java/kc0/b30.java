package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b30 implements aaShadow.v0 {
    public final f30 a;

    public b30(f30 f30Var) {
        this.a = f30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b30) && k71.k.b(this.a, ((b30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
