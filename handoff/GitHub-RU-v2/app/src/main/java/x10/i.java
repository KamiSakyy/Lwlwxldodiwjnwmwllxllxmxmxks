package x10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public String a;
    public y b;
    public b c;
    public String d;

    public i(String str, y yVar, b bVar, String str2) {
        this.a = str;
        this.b = yVar;
        this.c = bVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c) && k71.k.b(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OnIssueComment(url=" + this.a + ", repository=" + this.b + ", issue=" + this.c + ", id=" + this.d + ")";
    }
}
