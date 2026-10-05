package hp;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements h0 {
    public final String a;
    public final b00 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;
    public final b h;
    public final String i;
    public final int j;
    public final int k;
    public final String l;

    public c(String str, b00 b00Var, boolean z, boolean z2, String str2, String str3, int i, b bVar, String str4, int i2, int i3, String str5) {
        this.a = str;
        this.b = b00Var;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = i;
        this.h = bVar;
        this.i = str4;
        this.j = i2;
        this.k = i3;
        this.l = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && k71.k.b(this.e, cVar.e) && k71.k.b(this.f, cVar.f) && this.g == cVar.g && k71.k.b(this.h, cVar.h) && k71.k.b(this.i, cVar.i) && this.j == cVar.j && this.k == cVar.k && k71.k.b(this.l, cVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + s0.b(this.k, s0.b(this.j, h1.i((this.h.hashCode() + s0.b(this.g, h1.i(h1.i(x.i.e(x.i.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), this.e, 31), this.f, 31), 31)) * 31, this.i, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgentPullRequestResourceFragment(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", isDraft=");
        m0.A(sb, this.c, ", isInMergeQueue=", this.d, ", title=");
        f1.e.x(sb, this.e, ", titleHTMLString=", this.f, ", number=");
        sb.append(this.g);
        sb.append(", repository=");
        sb.append(this.h);
        sb.append(", url=");
        s0.w(this.j, this.i, ", additions=", ", deletions=", sb);
        return m0.c(this.k, ", __typename=", this.l, ")", sb);
    }
}
