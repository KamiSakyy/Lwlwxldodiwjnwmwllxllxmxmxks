package xt0;

import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u3 implements aa.h0 {
    public final String a;
    public final gu b;
    public final String c;

    public u3(String str, gu guVar, String str2) {
        this.a = str;
        this.b = guVar;
        this.c = str2;
    }

    public static u3 a(u3 u3Var, gu guVar) {
        String str = u3Var.a;
        String str2 = u3Var.c;
        u3Var.getClass();
        return new u3(str, guVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return k71.k.b(this.a, u3Var.a) && this.b == u3Var.b && k71.k.b(this.c, u3Var.c);
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
