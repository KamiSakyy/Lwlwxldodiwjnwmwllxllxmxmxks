package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wq {
    public final String a;
    public final vq b;
    public final String c;

    public wq(String str, vq vqVar, String str2) {
        this.a = str;
        this.b = vqVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq)) {
            return false;
        }
        wq wqVar = (wq) obj;
        return k71.k.b(this.a, wqVar.a) && k71.k.b(this.b, wqVar.b) && k71.k.b(this.c, wqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", pinnedDiscussions=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }



}
