package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jj {
    public int a;
    public kj b;
    public String c;
    public String d;

    public jj(int i, kj kjVar, String str, String str2) {
        this.a = i;
        this.b = kjVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj;
        return this.a == jjVar.a && k71.k.b(this.b, jjVar.b) && k71.k.b(this.c, jjVar.c) && k71.k.b(this.d, jjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(number=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
