package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r9 implements aaShadow.m0 {
    public final s9 a;

    public r9(s9 s9Var) {
        this.a = s9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9) && k71.k.b(this.a, ((r9) obj).a);
    }

    public final int hashCode() {
        s9 s9Var = this.a;
        if (s9Var == null) {
            return 0;
        }
        return s9Var.a.hashCode();
    }

    public final String toString() {
        return "Data(deleteDiscussion=" + this.a + ")";
    }
}
