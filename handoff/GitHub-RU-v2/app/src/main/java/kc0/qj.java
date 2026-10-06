package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qj {
    public String a;
    public gn0.hn b;
    public boolean c;
    public String d;

    public qj(String str, gn0.hn hnVar, boolean z, String str2) {
        this.a = str;
        this.b = hnVar;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj)) {
            return false;
        }
        qj qjVar = (qj) obj;
        return k71.k.b(this.a, qjVar.a) && this.b == qjVar.b && this.c == qjVar.c && k71.k.b(this.d, qjVar.d);
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
