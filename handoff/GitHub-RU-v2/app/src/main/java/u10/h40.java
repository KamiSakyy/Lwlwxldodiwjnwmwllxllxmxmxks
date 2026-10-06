package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h40 implements aaShadow.m0 {
    public j40 a;

    public h40(j40 j40Var) {
        this.a = j40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h40) && k71.k.b(this.a, ((h40) obj).a);
    }

    public final int hashCode() {
        j40 j40Var = this.a;
        if (j40Var == null) {
            return 0;
        }
        return j40Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssueComment=" + this.a + ")";
    }
}
