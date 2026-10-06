package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o2 extends p2 {
    public String a;
    public List b;

    public o2(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return k71.k.b(this.a, o2Var.a) && k71.k.b(this.b, o2Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return jo.f4Shadow.o("ComparisonSubsection(title=", this.a, ", planRows=", ")", this.b);
    }
}
