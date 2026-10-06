package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x90 implements aaShadow.m0 {
    public final z90 a;

    public x90(z90 z90Var) {
        this.a = z90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x90) && k71.k.b(this.a, ((x90) obj).a);
    }

    public final int hashCode() {
        z90 z90Var = this.a;
        if (z90Var == null) {
            return 0;
        }
        return z90Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }
}
