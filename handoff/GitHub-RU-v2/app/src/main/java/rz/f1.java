package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1Shadow {
    public e1 a;

    public f1(e1 e1Var) {
        this.a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1Shadow) && k71.k.b(this.a, ((f1Shadow) obj).a);
    }

    public final int hashCode() {
        e1 e1Var = this.a;
        if (e1Var == null) {
            return 0;
        }
        return e1Var.hashCode();
    }

    public final String toString() {
        return "UpdateProjectV2ItemFieldValue(projectV2Item=" + this.a + ")";
    }
}
