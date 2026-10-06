package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f10 {
    public String a;
    public int b;
    public int c;
    public int d;
    public i10 e;
    public String f;

    public f10(String str, int i, int i2, int i3, i10 i10Var, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i10Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f10)) {
            return false;
        }
        f10 f10Var = (f10) obj;
        return k71.k.b(this.a, f10Var.a) && this.b == f10Var.b && this.c == f10Var.c && this.d == f10Var.d && k71.k.b(this.e, f10Var.e) && k71.k.b(this.f, f10Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + a0.s0.b(this.d, a0.s0.b(this.c, a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Compare(id=", this.a, ", additions=", ", deletions=");
        a0.s0.z(n, this.c, ", changedFiles=", this.d, ", latestCommit=");
        n.append(this.e);
        n.append(", __typename=");
        n.append(this.f);
        n.append(")");
        return n.toString();
    }
}
