package mn;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public String a;
    public int b;

    public r(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && this.b == rVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return m0.b(this.b, "MatchingPullRequestInfo(id=", this.a, ", number=", ")");
    }
}
