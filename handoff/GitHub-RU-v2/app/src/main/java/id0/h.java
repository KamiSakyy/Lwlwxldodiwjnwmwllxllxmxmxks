package id0;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;
    public int b;

    public h(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && this.b == hVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return m0.b(this.b, "OrgDiscussionCommentsQueryParameters(repositoryOwner=", this.a, ", discussionNumber=", ")");
    }
}
