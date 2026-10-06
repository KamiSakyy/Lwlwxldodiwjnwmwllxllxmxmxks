package j01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public String a;
    public String b;
    public String c;
    public int d;
    public boolean e;

    public a(int i, String str, String str2, String str3, boolean z) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(str3, "queryString");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + s0.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("CustomFilter(id=", this.a, ", name=", this.b, ", queryString=");
        s0.w(this.d, this.c, ", unreadCount=", ", isDefault=", o);
        return f4.s(o, this.e, ")");
    }
}
