package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class js {
    public final String a;
    public final ts b;
    public final String c;
    public final String d;
    public final String e;
    public final ss f;

    public js(String str, ts tsVar, String str2, String str3, String str4, ss ssVar) {
        this.a = str;
        this.b = tsVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = ssVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js)) {
            return false;
        }
        js jsVar = (js) obj;
        return k71.k.b(this.a, jsVar.a) && k71.k.b(this.b, jsVar.b) && k71.k.b(this.c, jsVar.c) && k71.k.b(this.d, jsVar.d) && k71.k.b(this.e, jsVar.e) && k71.k.b(this.f, jsVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), this.e, 31);
        ss ssVar = this.f;
        return i + (ssVar != null ? ssVar.hashCode() : 0);
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
