package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hl {
    public String a;
    public pz0.gu b;
    public boolean c;
    public String d;

    public hl(String str, pz0.gu guVar, boolean z, String str2) {
        this.a = str;
        this.b = guVar;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl)) {
            return false;
        }
        hl hlVar = (hl) obj;
        return k71.k.b(this.a, hlVar.a) && this.b == hlVar.b && this.c == hlVar.c && k71.k.b(this.d, hlVar.d);
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
