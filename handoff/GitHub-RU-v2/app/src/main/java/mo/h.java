package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final String a;
    public final y b;
    public final int c;
    public final String d;

    public h(String str, y yVar, int i, String str2) {
        this.a = str;
        this.b = yVar;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && this.c == hVar.c && k71.k.b(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnIssue(url=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", number=");
        return com.github.rudroid.m0.c(this.c, ", id=", this.d, ")", sb);
    }
}
