package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dp {
    public final String a;
    public final np b;
    public final String c;
    public final String d;
    public final String e;
    public final mp f;

    public dp(String str, np npVar, String str2, String str3, String str4, mp mpVar) {
        this.a = str;
        this.b = npVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = mpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        return k71.k.b(this.a, dpVar.a) && k71.k.b(this.b, dpVar.b) && k71.k.b(this.c, dpVar.c) && k71.k.b(this.d, dpVar.d) && k71.k.b(this.e, dpVar.e) && k71.k.b(this.f, dpVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), this.e, 31);
        mp mpVar = this.f;
        return i + (mpVar != null ? mpVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnTag(id=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", message=");
        f1.e.x(sb, this.c, ", name=", this.d, ", commitUrl=");
        sb.append(this.e);
        sb.append(", tagger=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
