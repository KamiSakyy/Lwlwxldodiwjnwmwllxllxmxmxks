package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k2 extends sy.s {
    public String a;
    public f4 b;

    public k2(String str, f4 f4Var) {
        this.a = str;
        this.b = f4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return k71.k.b(this.a, k2Var.a) && k71.k.b(this.b, k2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // sy.s
    public final String j() {
        return this.a;
    }

    public final String toString() {
        return "UserInputPrompt(requestId=" + this.a + ", userInputInfo=" + this.b + ")";
    }
}
