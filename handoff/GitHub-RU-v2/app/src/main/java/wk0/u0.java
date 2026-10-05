package wk0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 implements aa.h0 {
    public final ArrayList a;
    public final String b;
    public final String c;

    public u0(String str, String str2, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a.equals(u0Var.a) && this.b.equals(u0Var.b) && this.c.equals(u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopContributorsFragment(topContributors=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
