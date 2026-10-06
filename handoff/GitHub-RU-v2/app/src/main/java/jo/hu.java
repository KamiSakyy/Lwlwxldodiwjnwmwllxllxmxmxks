package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hu {
    public String a;
    public ru b;
    public String c;
    public String d;
    public String e;
    public qu f;

    public hu(String str, ru ruVar, String str2, String str3, String str4, qu quVar) {
        this.a = str;
        this.b = ruVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = quVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu)) {
            return false;
        }
        hu huVar = (hu) obj;
        return k71.k.b(this.a, huVar.a) && k71.k.b(this.b, huVar.b) && k71.k.b(this.c, huVar.c) && k71.k.b(this.d, huVar.d) && k71.k.b(this.e, huVar.e) && k71.k.b(this.f, huVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), this.e, 31);
        qu quVar = this.f;
        return i + (quVar != null ? quVar.hashCode() : 0);
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
