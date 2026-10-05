package b01;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final String a;
    public final g b;
    public final String c;

    public c(String str, g gVar, String str2) {
        this.a = str;
        this.b = gVar;
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
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionAnswer(answerId=");
        sb.append(this.a);
        sb.append(", comment=");
        sb.append(this.b);
        sb.append(", answerParentCommentId=");
        return h1.p(sb, this.c, ")");
    }
}
