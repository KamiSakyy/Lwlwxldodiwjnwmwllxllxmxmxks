package u81;

/* loaded from: /home/user/work/p/classes5.dex */
public final class q {
    public r a;
    public r b;
    public Throwable c;

    public /* synthetic */ q(r rVar, Throwable th, int i) {
        this(rVar, (c) null, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r rVar = this.b;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Throwable th = this.c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public q(r rVar, c cVar, Throwable th) {
        this.a = rVar;
        this.b = cVar;
        this.c = th;
    }
}
