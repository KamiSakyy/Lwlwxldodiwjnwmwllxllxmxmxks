package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c7 implements aa.m0 {
    public final b7 a;

    public c7(b7 b7Var) {
        this.a = b7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7) && k71.k.b(this.a, ((c7) obj).a);
    }

    public final int hashCode() {
        b7 b7Var = this.a;
        if (b7Var == null) {
            return 0;
        }
        return b7Var.hashCode();
    }

    public final String toString() {
        return "Data(createDiscussion=" + this.a + ")";
    }
}
