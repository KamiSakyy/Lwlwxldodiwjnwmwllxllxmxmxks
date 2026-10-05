package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ct {
    public final String a;
    public final String b;
    public final dt c;

    public ct(String str, String str2, dt dtVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = dtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        return k71.k.b(this.a, ctVar.a) && k71.k.b(this.b, ctVar.b) && k71.k.b(this.c, ctVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        dt dtVar = this.c;
        return i + (dtVar == null ? 0 : dtVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onReactable=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }









}
