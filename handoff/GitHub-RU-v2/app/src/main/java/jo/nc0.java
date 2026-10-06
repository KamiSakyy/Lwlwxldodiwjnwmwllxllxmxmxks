package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nc0 {
    public mc0 a;

    public nc0(mc0 mc0Var) {
        this.a = mc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc0) && k71.k.b(this.a, ((nc0) obj).a);
    }

    public final int hashCode() {
        mc0 mc0Var = this.a;
        if (mc0Var == null) {
            return 0;
        }
        return mc0Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
