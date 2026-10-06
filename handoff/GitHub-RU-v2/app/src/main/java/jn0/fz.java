package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fz {
    public String a;
    public int b;
    public int c;
    public int d;
    public iz e;
    public String f;

    public fz(String str, int i, int i2, int i3, iz izVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = izVar;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz)) {
            return false;
        }
        fz fzVar = (fz) obj;
        return k71.k.b(this.a, fzVar.a) && this.b == fzVar.b && this.c == fzVar.c && this.d == fzVar.d && k71.k.b(this.e, fzVar.e) && k71.k.b(this.f, fzVar.f);
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
