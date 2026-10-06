package da1;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g0 implements Cloneable {
    public String r;
    public String s;
    public String t;
    public int u = 0;

    public g0(String str, String str2, String str3) {
        this.s = str;
        this.t = str2;
        this.r = str3;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g0 clone() {
        try {
            return (g0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean b(int i) {
        return (i & this.u) != 0;
    }

    public final boolean c() {
        int i = this.u;
        return ((i & 16) == 0 && (i & 2) == 0) ? false : true;
    }

    public final void d(int i) {
        this.u = i | this.u | 1;
    }

    public final l3 e() {
        if (b(128)) {
            return l3.t;
        }
        if (b(256)) {
            return l3.v;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Objects.equals(this.s, g0Var.s) && Objects.equals(this.r, g0Var.r) && Objects.equals(this.t, g0Var.t) && this.u == g0Var.u;
    }

    public final int hashCode() {
        return Objects.hash(this.s, this.r);
    }

    public final String toString() {
        return this.s;
    }
}
