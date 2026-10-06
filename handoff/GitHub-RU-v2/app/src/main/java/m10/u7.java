package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u7 {
    public final cr a;

    public u7(cr crVar) {
        v7 v7Var = w7.Companion;
        this.a = crVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7) || this.a != ((u7) obj).a) {
            return false;
        }
        v7 v7Var = w7.Companion;
        return true;
    }

    public final int hashCode() {
        return w7.r.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopilotAgentTaskOrder(direction=" + this.a + ", field=" + w7.r + ")";
    }
}
