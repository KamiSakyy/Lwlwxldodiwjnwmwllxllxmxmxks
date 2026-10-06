package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mm {
    public String a;
    public m10.b00 b;
    public boolean c;
    public String d;

    public mm(String str, m10.b00 b00Var, boolean z, String str2) {
        this.a = str;
        this.b = b00Var;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        return k71.k.b(this.a, mmVar.a) && this.b == mmVar.b && this.c == mmVar.c && k71.k.b(this.d, mmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x.i.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(id=");
        sb.append(this.a);
        sb.append(", pullRequestState=");
        sb.append(this.b);
        sb.append(", isDraft=");
        return com.github.rudroid.m0.l(sb, this.c, ", __typename=", this.d, ")");
    }
}
