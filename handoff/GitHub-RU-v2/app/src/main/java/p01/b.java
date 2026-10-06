package p01;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;

    public b(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c) && this.d == bVar.d && k71.k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + s0.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("PullRequestCreation(pullRequestId=", this.a, ", repositoryOwner=", this.b, ", repositoryName=");
        s0.w(this.d, this.c, ", pullRequestNumber=", ", title=", o);
        return h1.p(o, this.e, ")");
    }
}
