package y41;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 extends x1 {
    public final String a;
    public final String b;
    public final List c;
    public final x1 d;
    public final int e;

    public t0(String str, String str2, List list, x1 x1Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = x1Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        x1 x1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            t0 t0Var = (t0) ((x1) obj);
            x1 x1Var2 = t0Var.d;
            String str2 = t0Var.b;
            if (this.a.equals(t0Var.a) && ((str = this.b) != null ? str.equals(str2) : str2 == null) && this.c.equals(t0Var.c) && ((x1Var = this.d) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && this.e == t0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        x1 x1Var = this.d;
        return ((hashCode2 ^ (x1Var != null ? x1Var.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return a0.s0.l(sb, this.e, "}");
    }
}
