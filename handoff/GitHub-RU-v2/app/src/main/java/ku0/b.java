package ku0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public String a;
    public String b;
    public e c;
    public String d;

    public b(String str, String str2, e eVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = eVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c) && k71.k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        e eVar = this.c;
        return this.d.hashCode() + ((i + (eVar == null ? 0 : eVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Commit(__typename=", this.a, ", id=", this.b, ", status=");
        o.append(this.c);
        o.append(", messageHeadline=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
