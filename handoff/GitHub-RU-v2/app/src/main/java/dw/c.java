package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.h0 {
    public final String a;
    public final b b;
    public final String c;

    public c(String str, b bVar, String str2) {
        this.a = str;
        this.b = bVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return this.c.hashCode() + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssueProjectV2ItemsFragment(id=");
        sb.append(this.a);
        sb.append(", projectItems=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
