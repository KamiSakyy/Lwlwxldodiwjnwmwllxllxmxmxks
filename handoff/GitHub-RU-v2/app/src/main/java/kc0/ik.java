package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ik {
    public String a;
    public String b;
    public String c;
    public String d;
    public ud0.c e;

    public ik(String str, String str2, String str3, String str4, ud0.c cVar) {
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
        if (!(obj instanceof ik)) {
            return false;
        }
        ik ikVar = (ik) obj;
        return k71.k.b(this.a, ikVar.a) && k71.k.b(this.b, ikVar.b) && k71.k.b(this.c, ikVar.c) && k71.k.b(this.d, ikVar.d) && k71.k.b(this.e, ikVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", name=", this.b, ", login=");
        f1.e.x(o, this.c, ", id=", this.d, ", avatarFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
