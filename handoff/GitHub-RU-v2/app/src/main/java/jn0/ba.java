package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ba {
    public final z9 a;
    public final String b;
    public final String c;
    public final String d;

    public ba(z9 z9Var, String str, String str2, String str3) {
        this.a = z9Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return k71.k.b(this.a, baVar.a) && k71.k.b(this.b, baVar.b) && k71.k.b(this.c, baVar.c) && k71.k.b(this.d, baVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(owner=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
