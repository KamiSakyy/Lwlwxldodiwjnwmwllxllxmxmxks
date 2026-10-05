package np;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements s01.m {
    public final String a;
    public final int b;

    public i(String str, int i) {
        k71.k.g(str, "owner");
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && this.b == iVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return m0.b(this.b, "OrgDiscussionCommentsQueryParameters(owner=", this.a, ", discussionNumber=", ")");
    }
}
