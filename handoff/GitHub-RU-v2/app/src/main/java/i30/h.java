package i30;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public String a;
    public String b;
    public String c;
    public String d;
    public e30.c e;

    public h(String str, String str2, String str3, String str4, e30.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d) && k71.k.b(this.e, hVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.e.hashCode() + h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", name=");
        f1.e.x(o, this.c, ", login=", this.d, ", avatarFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
