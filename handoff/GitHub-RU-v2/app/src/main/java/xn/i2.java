package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i2 extends sy.s {
    public String a;
    public y2 b;

    public i2(String str, y2 y2Var) {
        this.a = str;
        this.b = y2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return k71.k.b(this.a, i2Var.a) && k71.k.b(this.b, i2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // sy.s
    public final String j() {
        return this.a;
    }

    public final String toString() {
        return "PermissionPrompt(requestId=" + this.a + ", permissionInfo=" + this.b + ")";
    }
}
