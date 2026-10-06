package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ak {
    public final String a;
    public final String b;
    public final ck c;
    public final dk d;
    public final bk e;

    public ak(String str, String str2, ck ckVar, dk dkVar, bk bkVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = ckVar;
        this.d = dkVar;
        this.e = bkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return k71.k.b(this.a, akVar.a) && k71.k.b(this.b, akVar.b) && k71.k.b(this.c, akVar.c) && k71.k.b(this.d, akVar.d) && k71.k.b(this.e, akVar.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ck ckVar = this.c;
        int hashCode = (i + (ckVar == null ? 0 : ckVar.hashCode())) * 31;
        dk dkVar = this.d;
        int hashCode2 = (hashCode + (dkVar == null ? 0 : dkVar.hashCode())) * 31;
        bk bkVar = this.e;
        return hashCode2 + (bkVar != null ? bkVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onIssue=");
        o.append(this.c);
        o.append(", onPullRequest=");
        o.append(this.d);
        o.append(", onDiscussion=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
