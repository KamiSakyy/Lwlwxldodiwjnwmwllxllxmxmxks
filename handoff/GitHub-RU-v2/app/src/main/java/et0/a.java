package et0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements h0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;

    public a(int i, String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && this.c == aVar.c && k.b(this.d, aVar.d) && this.e == aVar.e && k.b(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + i.e(h1.i(s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder o = s0.o("NotificationListItem(id=", this.a, ", name=", this.b, ", unreadCount=");
        i.r(this.c, ", queryString=", this.d, ", isDefaultFilter=", o);
        return m0.l(o, this.e, ", __typename=", this.f, ")");
    }
}
