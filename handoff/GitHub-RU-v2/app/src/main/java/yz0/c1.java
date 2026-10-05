package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 {
    public final v5 a;
    public final boolean b;
    public final boolean c;

    public c1(v5 v5Var, boolean z, boolean z2) {
        this.a = v5Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return k71.k.b(this.a, c1Var.a) && this.b == c1Var.b && this.c == c1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisableAutoMergeResponse(disabledAutoMergeEvent=");
        sb.append(this.a);
        sb.append(", viewerCanEnableAutoMerge=");
        sb.append(this.b);
        sb.append(", viewerCanDisableAutoMerge=");
        return jo.f4.s(sb, this.c, ")");
    }
}
