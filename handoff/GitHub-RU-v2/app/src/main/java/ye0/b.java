package ye0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import gn0.xc;
import gn0.zc;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final xc a;
    public final String b;
    public final String c;
    public final int d;
    public final zc e;
    public final String f;

    public b(int i, xc xcVar, zc zcVar, String str, String str2, String str3) {
        this.a = xcVar;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = zcVar;
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
        zc zcVar = this.e;
        return this.f.hashCode() + ((b + (zcVar == null ? 0 : zcVar.hashCode())) * 31);
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
}
