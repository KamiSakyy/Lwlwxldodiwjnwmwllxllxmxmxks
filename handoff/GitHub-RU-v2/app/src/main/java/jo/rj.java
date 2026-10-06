package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rj {
    public String a;
    public pj b;
    public qj c;
    public tj d;

    public rj(String str, pj pjVar, qj qjVar, tj tjVar) {
        this.a = str;
        this.b = pjVar;
        this.c = qjVar;
        this.d = tjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj)) {
            return false;
        }
        rj rjVar = (rj) obj;
        return k71.k.b(this.a, rjVar.a) && k71.k.b(this.b, rjVar.b) && k71.k.b(this.c, rjVar.c) && k71.k.b(this.d, rjVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        pj pjVar = this.b;
        int hashCode2 = (hashCode + (pjVar == null ? 0 : pjVar.hashCode())) * 31;
        qj qjVar = this.c;
        int hashCode3 = (hashCode2 + (qjVar == null ? 0 : qjVar.hashCode())) * 31;
        tj tjVar = this.d;
        return hashCode3 + (tjVar != null ? tjVar.hashCode() : 0);
    }

    public final String toString() {
        return "CreateGoogleIapSubscription(clientMutationId=" + this.a + ", copilot=" + this.b + ", copilotProPlus=" + this.c + ", viewer=" + this.d + ")";
    }
}
