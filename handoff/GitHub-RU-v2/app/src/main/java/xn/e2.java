package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e2 extends sy.s {
    public final String a;
    public final y1 b;

    public e2(String str, y1 y1Var) {
        this.a = str;
        this.b = y1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return k71.k.b(this.a, e2Var.a) && k71.k.b(this.b, e2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // sy.s
    public final String j() {
        return this.a;
    }

    public final String toString() {
        return "ElicitationPrompt(requestId=" + this.a + ", elicitationInfo=" + this.b + ")";
    }
}
