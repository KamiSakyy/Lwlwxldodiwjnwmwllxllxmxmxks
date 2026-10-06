package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l5 {
    public String a;
    public String b;
    public String c;
    public ud0.c d;

    public l5(String str, String str2, String str3, ud0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj;
        return k71.k.b(this.a, l5Var.a) && k71.k.b(this.b, l5Var.b) && k71.k.b(this.c, l5Var.c) && k71.k.b(this.d, l5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnUser(__typename=", this.a, ", id=", this.b, ", login=");
        o.append(this.c);
        o.append(", avatarFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
