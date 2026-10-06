package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a10 implements aaShadow.v0 {
    public e10 a;

    public a10(e10 e10Var) {
        this.a = e10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a10) && k71.k.b(this.a, ((a10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
