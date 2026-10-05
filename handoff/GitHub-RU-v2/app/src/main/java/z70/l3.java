package z70;

import hc0.fm;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l3 implements aa.h0 {
    public final String a;
    public final fm b;
    public final String c;

    public l3(String str, fm fmVar, String str2) {
        this.a = str;
        this.b = fmVar;
        this.c = str2;
    }

    public static l3 a(l3 l3Var, fm fmVar) {
        String str = l3Var.a;
        String str2 = l3Var.c;
        l3Var.getClass();
        return new l3(str, fmVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return k71.k.b(this.a, l3Var.a) && this.b == l3Var.b && k71.k.b(this.c, l3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequestStateFragment(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
