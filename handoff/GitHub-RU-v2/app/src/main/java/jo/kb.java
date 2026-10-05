package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kb implements aa.v0 {
    public final ob a;
    public final String b;
    public final String c;

    public kb(ob obVar, String str, String str2) {
        this.a = obVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        return k71.k.b(this.a, kbVar.a) && k71.k.b(this.b, kbVar.b) && k71.k.b(this.c, kbVar.c);
    }

    public final int hashCode() {
        ob obVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((obVar == null ? 0 : obVar.hashCode()) * 31, this.b, 31);
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
