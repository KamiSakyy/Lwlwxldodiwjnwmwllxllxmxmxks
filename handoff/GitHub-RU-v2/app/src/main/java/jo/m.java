package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public String a;
    public q b;
    public String c;
    public ms.i d;

    public m(String str, q qVar, String str2, ms.i iVar) {
        this.a = str;
        this.b = qVar;
        this.c = str2;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c) && k71.k.b(this.d, mVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q qVar = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        return "Comment(__typename=" + this.a + ", discussion=" + this.b + ", id=" + this.c + ", discussionCommentFragment=" + this.d + ")";
    }
}
