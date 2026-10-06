package f00;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements aa.h0 {
    public String a;
    public String b;
    public a c;
    public g1 d;

    public e(String str, String str2, a aVar, g1 g1Var) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c) && k71.k.b(this.d, eVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        return this.d.hashCode() + ((i + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2BoardItemFragment(__typename=", this.a, ", id=", this.b, ", content=");
        o.append(this.c);
        o.append(", projectV2ViewItemFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
