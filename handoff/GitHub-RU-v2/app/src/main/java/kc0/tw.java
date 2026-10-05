package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tw {
    public final String a;
    public final qw b;
    public final String c;

    public tw(String str, qw qwVar, String str2) {
        this.a = str;
        this.b = qwVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw)) {
            return false;
        }
        tw twVar = (tw) obj;
        return k71.k.b(this.a, twVar.a) && k71.k.b(this.b, twVar.b) && k71.k.b(this.c, twVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qw qwVar = this.b;
        return this.c.hashCode() + ((hashCode + (qwVar == null ? 0 : qwVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", labels=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
