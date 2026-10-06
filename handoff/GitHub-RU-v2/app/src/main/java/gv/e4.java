package gv;

import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e4 implements aa.h0 {
    public String a;
    public b00 b;
    public String c;

    public e4(String str, b00 b00Var, String str2) {
        this.a = str;
        this.b = b00Var;
        this.c = str2;
    }

    public static e4 a(e4 e4Var, b00 b00Var) {
        String str = e4Var.a;
        String str2 = e4Var.c;
        e4Var.getClass();
        return new e4(str, b00Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return k71.k.b(this.a, e4Var.a) && this.b == e4Var.b && k71.k.b(this.c, e4Var.c);
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
