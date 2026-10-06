package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y7 {
    public final String a;
    public final v7 b;
    public final x7 c;
    public final w7 d;
    public final a8 e;

    public y7(String str, v7 v7Var, x7 x7Var, w7 w7Var, a8 a8Var) {
        this.a = str;
        this.b = v7Var;
        this.c = x7Var;
        this.d = w7Var;
        this.e = a8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        return k71.k.b(this.a, y7Var.a) && k71.k.b(this.b, y7Var.b) && k71.k.b(this.c, y7Var.c) && k71.k.b(this.d, y7Var.d) && k71.k.b(this.e, y7Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        v7 v7Var = this.b;
        int hashCode2 = (hashCode + (v7Var == null ? 0 : v7Var.hashCode())) * 31;
        x7 x7Var = this.c;
        int hashCode3 = (hashCode2 + (x7Var == null ? 0 : x7Var.hashCode())) * 31;
        w7 w7Var = this.d;
        int hashCode4 = (hashCode3 + (w7Var == null ? 0 : w7Var.hashCode())) * 31;
        a8 a8Var = this.e;
        return hashCode4 + (a8Var != null ? a8Var.hashCode() : 0);
    }

    public final String toString() {
        return "CreateGoogleIapSubscription(clientMutationId=" + this.a + ", copilot=" + this.b + ", copilotProPlus=" + this.c + ", copilotMax=" + this.d + ", viewer=" + this.e + ")";
    }
}
