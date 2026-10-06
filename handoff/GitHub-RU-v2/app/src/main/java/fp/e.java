package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final String a;
    public final hp.c b;

    public e(String str, hp.c cVar) {
        this.a = str;
        this.b = cVar;
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
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPullRequest(__typename=" + this.a + ", agentPullRequestResourceFragment=" + this.b + ")";
    }
    public Object c(Object p1) { return null; }
    public Object e(Object p1) { return null; }
}
