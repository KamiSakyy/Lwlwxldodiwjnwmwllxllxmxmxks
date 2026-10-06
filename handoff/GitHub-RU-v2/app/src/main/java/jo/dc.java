package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dc implements aaShadow.v0 {
    public final fc a;
    public final String b;
    public final String c;

    public dc(fc fcVar, String str, String str2) {
        this.a = fcVar;
        this.b = str;
        this.c = str2;
    }

    public static dc a(dc dcVar, fc fcVar) {
        String str = dcVar.b;
        String str2 = dcVar.c;
        dcVar.getClass();
        return new dc(fcVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return k71.k.b(this.a, dcVar.a) && k71.k.b(this.b, dcVar.b) && k71.k.b(this.c, dcVar.c);
    }

    public final int hashCode() {
        fc fcVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((fcVar == null ? 0 : fcVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
