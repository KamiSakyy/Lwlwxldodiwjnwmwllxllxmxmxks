package gs;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public b00 a;
    public boolean b;
    public String c;
    public String d;
    public int e;
    public boolean f;
    public String g;

    public c(int i, String str, String str2, String str3, b00 b00Var, boolean z, boolean z2) {
        this.a = b00Var;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = z2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && k.b(this.g, cVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + x.i.e(s0.b(this.e, h1.i(h1.i(x.i.e(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnPullRequest(pullRequestState=");
        sb.append(this.a);
        sb.append(", isDraft=");
        sb.append(this.b);
        sb.append(", title=");
        f1.e.x(sb, this.c, ", url=", this.d, ", number=");
        m0.w(sb, this.e, ", isInMergeQueue=", this.f, ", id=");
        return h1.p(sb, this.g, ")");
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
}
