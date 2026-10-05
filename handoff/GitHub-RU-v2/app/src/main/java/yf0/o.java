package yf0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements aa.h0 {
    public final String a;
    public final n b;
    public final String c;

    public o(String str, n nVar, String str2) {
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = nVar;
        this.c = str2;
    }

    public static o a(o oVar, n nVar) {
        String str = oVar.a;
        String str2 = oVar.c;
        k71.k.g(str2, "__typename");
        return new o(str, nVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && k71.k.b(this.c, oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionCommentRepliesFragment(id=");
        sb.append(this.a);
        sb.append(", replies=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
