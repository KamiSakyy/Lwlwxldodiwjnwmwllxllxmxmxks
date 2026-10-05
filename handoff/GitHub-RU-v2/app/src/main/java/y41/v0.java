package y41;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 extends a2 {
    public final String a;
    public final int b;
    public final List c;

    public v0(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            v0 v0Var = (v0) ((a2) obj);
            if (this.a.equals(v0Var.a) && this.b == v0Var.b && this.c.equals(v0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        return x.i.l(sb, this.c, "}");
    }
}
