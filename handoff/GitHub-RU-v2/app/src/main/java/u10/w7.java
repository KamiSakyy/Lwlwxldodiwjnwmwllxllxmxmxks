package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w7 implements aaShadow.m0 {
    public x7 a;

    public w7(x7 x7Var) {
        this.a = x7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7) && k71.k.b(this.a, ((w7) obj).a);
    }

    public final int hashCode() {
        x7 x7Var = this.a;
        if (x7Var == null) {
            return 0;
        }
        return x7Var.a.hashCode();
    }

    public final String toString() {
        return "Data(deleteIssueComment=" + this.a + ")";
    }
}
