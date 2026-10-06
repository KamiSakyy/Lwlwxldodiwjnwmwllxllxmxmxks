package jk;

import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public String a;
    public d b;
    public String c;

    public b(String str, d dVar, String str2) {
        this.a = str;
        this.b = dVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionAnswerData(answerId=");
        sb.append(this.a);
        sb.append(", comment=");
        sb.append(this.b);
        sb.append(", answerParentCommentId=");
        return h1.p(sb, this.c, ")");
    }
}
