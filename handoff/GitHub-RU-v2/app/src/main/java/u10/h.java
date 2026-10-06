package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final String a;
    public final l b;
    public final String c;
    public final i50.h d;

    public h(String str, l lVar, String str2, i50.h hVar) {
        this.a = str;
        this.b = lVar;
        this.c = str2;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l lVar = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        return "Comment(__typename=" + this.a + ", discussion=" + this.b + ", id=" + this.c + ", discussionCommentFragment=" + this.d + ")";
    }
}
