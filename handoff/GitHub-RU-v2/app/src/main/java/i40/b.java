package i40;

import a0.s0;
import com.github.rudroid.copilot.h1;
import hc0.jc;
import hc0.lc;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public jc a;
    public String b;
    public String c;
    public int d;
    public lc e;
    public String f;

    public b(int i, jc jcVar, lc lcVar, String str, String str2, String str3) {
        this.a = jcVar;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = lcVar;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && k.b(this.f, bVar.f);
    }

    public final int hashCode() {
        int b = s0.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
        lc lcVar = this.e;
        return this.f.hashCode() + ((b + (lcVar == null ? 0 : lcVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnIssue(issueState=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", url=");
        s0.w(this.d, this.c, ", number=", ", stateReason=", sb);
        sb.append(this.e);
        sb.append(", id=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
