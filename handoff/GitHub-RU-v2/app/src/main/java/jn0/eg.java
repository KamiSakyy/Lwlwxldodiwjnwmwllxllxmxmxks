package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eg implements aa.v0 {
    public final ig a;
    public final String b;
    public final String c;

    public eg(ig igVar, String str, String str2) {
        this.a = igVar;
        this.b = str;
        this.c = str2;
    }

    public static eg a(eg egVar, ig igVar) {
        String str = egVar.b;
        String str2 = egVar.c;
        egVar.getClass();
        return new eg(igVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg)) {
            return false;
        }
        eg egVar = (eg) obj;
        return k71.k.b(this.a, egVar.a) && k71.k.b(this.b, egVar.b) && k71.k.b(this.c, egVar.c);
    }

    public final int hashCode() {
        ig igVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((igVar == null ? 0 : igVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
