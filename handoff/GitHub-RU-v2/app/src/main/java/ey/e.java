package ey;

/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    public String a;
    public f b;

    public e(String str, f fVar) {
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        return hashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "OnPullRequest(id=" + this.a + ", pullRequestStatus=" + this.b + ")";
    }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
