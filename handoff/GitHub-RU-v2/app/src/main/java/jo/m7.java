package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m7 implements aaShadow.m0 {
    public final l7 a;

    public m7(l7 l7Var) {
        this.a = l7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7) && k71.k.b(this.a, ((m7) obj).a);
    }

    public final int hashCode() {
        l7 l7Var = this.a;
        if (l7Var == null) {
            return 0;
        }
        return l7Var.hashCode();
    }

    public final String toString() {
        return "Data(createCopilotAgentTask=" + this.a + ")";
    }
}
