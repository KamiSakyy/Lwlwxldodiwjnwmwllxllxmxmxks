package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l7 {
    public n7 a;

    public l7(n7 n7Var) {
        this.a = n7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7) && k71.k.b(this.a, ((l7) obj).a);
    }

    public final int hashCode() {
        n7 n7Var = this.a;
        if (n7Var == null) {
            return 0;
        }
        return n7Var.hashCode();
    }

    public final String toString() {
        return "CreateCopilotAgentTask(task=" + this.a + ")";
    }
}
