package i40;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import hc0.fm;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final fm a;
    public final boolean b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    public c(int i, fm fmVar, String str, String str2, String str3, boolean z) {
        this.a = fmVar;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && this.e == cVar.e && k.b(this.f, cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + s0.b(this.e, h1.i(h1.i(x.i.e(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnPullRequest(pullRequestState=");
        sb.append(this.a);
        sb.append(", isDraft=");
        sb.append(this.b);
        sb.append(", title=");
        f1.e.x(sb, this.c, ", url=", this.d, ", number=");
        return m0.c(this.e, ", id=", this.f, ")", sb);
    }
}
