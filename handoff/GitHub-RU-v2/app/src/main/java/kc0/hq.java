package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hq {
    public final String a;
    public final rq b;
    public final String c;
    public final String d;
    public final String e;
    public final qq f;

    public hq(String str, rq rqVar, String str2, String str3, String str4, qq qqVar) {
        this.a = str;
        this.b = rqVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = qqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq)) {
            return false;
        }
        hq hqVar = (hq) obj;
        return k71.k.b(this.a, hqVar.a) && k71.k.b(this.b, hqVar.b) && k71.k.b(this.c, hqVar.c) && k71.k.b(this.d, hqVar.d) && k71.k.b(this.e, hqVar.e) && k71.k.b(this.f, hqVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), this.e, 31);
        qq qqVar = this.f;
        return i + (qqVar != null ? qqVar.hashCode() : 0);
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
