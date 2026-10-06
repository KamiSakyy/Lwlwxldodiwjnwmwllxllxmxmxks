package o01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public b(String str, String str2, String str3, String str4, String str5) {
        k.g(str3, "size");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ReleaseAsset(id=", this.a, ", name=", this.b, ", size=");
        f1.e.x(o, this.c, ", downloadUrl=", this.d, ", contentType=");
        return h1.p(o, this.e, ")");
    }
}
