package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sh {
    public int a;
    public th b;
    public String c;
    public String d;

    public sh(int i, th thVar, String str, String str2) {
        this.a = i;
        this.b = thVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj;
        return this.a == shVar.a && k71.k.b(this.b, shVar.b) && k71.k.b(this.c, shVar.c) && k71.k.b(this.d, shVar.d);
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
