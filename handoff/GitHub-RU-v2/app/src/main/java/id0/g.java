package id0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public String a;
    public String b;
    public int c;

    public g(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && this.c == gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return s0.l(s0.o("DiscussionCommentsQueryParameters(repositoryOwner=", this.a, ", repositoryName=", this.b, ", discussionNumber="), this.c, ")");
    }
}
