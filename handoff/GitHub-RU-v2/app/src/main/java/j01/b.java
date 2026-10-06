package j01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;
import f1.e;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public Avatar f;

    public b(int i, int i2, Avatar avatar, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = avatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e) && k.b(this.f, bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + h1.i(h1.i(h1.i(s0.b(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder m = i.m(this.a, this.b, "RepoFilter(unreadCount=", ", count=", ", id=");
        e.x(m, this.c, ", nameWithOwner=", this.d, ", owner=");
        m.append(this.e);
        m.append(", avatar=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
