package jo;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gu {
    public final String a;
    public final String b;
    public final String c;
    public final ou d;
    public final String e;
    public final String f;
    public final ZonedDateTime g;

    public gu(String str, String str2, String str3, ou ouVar, String str4, String str5, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ouVar;
        this.e = str4;
        this.f = str5;
        this.g = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj;
        return k71.k.b(this.a, guVar.a) && k71.k.b(this.b, guVar.b) && k71.k.b(this.c, guVar.c) && k71.k.b(this.d, guVar.d) && k71.k.b(this.e, guVar.e) && k71.k.b(this.f, guVar.f) && k71.k.b(this.g, guVar.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        ou ouVar = this.d;
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((i + (ouVar == null ? 0 : Boolean.hashCode(ouVar.a))) * 31, this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnCommit(id=", this.a, ", oid=", this.b, ", abbreviatedOid=");
        o.append(this.c);
        o.append(", signature=");
        o.append(this.d);
        o.append(", message=");
        f1.e.x(o, this.e, ", messageBodyHTML=", this.f, ", authoredDate=");
        return com.github.rudroid.copilot.h1.q(o, this.g, ")");
    }

    public Object e;
    public Object c = null;
}
