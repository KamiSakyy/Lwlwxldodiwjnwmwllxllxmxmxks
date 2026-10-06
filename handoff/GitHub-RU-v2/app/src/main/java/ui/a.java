package ui;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public on.f a;
    public on.m b;

    public a(on.f fVar, on.m mVar) {
        k71.k.g(fVar, "codingAgentsPaged");
        k71.k.g(mVar, "subagentsPaged");
        this.a = fVar;
        this.b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CombinedAgentsPaged(codingAgentsPaged=" + this.a + ", subagentsPaged=" + this.b + ")";
    }
}
