package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nj0 {
    public final m10.ry a;
    public final m10.py b;
    public final boolean c;

    public nj0(m10.ry ryVar, m10.py pyVar, boolean z) {
        this.a = ryVar;
        this.b = pyVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj0)) {
            return false;
        }
        nj0 nj0Var = (nj0) obj;
        return this.a == nj0Var.a && this.b == nj0Var.b && this.c == nj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergeMethod(allowableStatus=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", isDefault=");
        return f4.s(sb, this.c, ")");
    }
}
