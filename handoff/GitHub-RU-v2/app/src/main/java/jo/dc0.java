package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dc0 {
    public ac0 a;

    public dc0(ac0 ac0Var) {
        this.a = ac0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc0) && k71.k.b(this.a, ((dc0) obj).a);
    }

    public final int hashCode() {
        ac0 ac0Var = this.a;
        if (ac0Var == null) {
            return 0;
        }
        return ac0Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussionComment(comment=" + this.a + ")";
    }
}
