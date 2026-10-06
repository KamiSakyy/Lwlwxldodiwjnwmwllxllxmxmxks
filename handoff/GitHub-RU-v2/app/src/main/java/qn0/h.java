package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;
    public c b;
    public m c;
    public vn0.s1 d;

    public h(String str, c cVar, m mVar, vn0.s1 s1Var) {
        this.a = str;
        this.b = cVar;
        this.c = mVar;
        this.d = s1Var;
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
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        m mVar = this.c;
        return this.d.hashCode() + ((hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31);
    }

    public final String toString() {
        return "OnCheckRun(__typename=" + this.a + ", checkSuite=" + this.b + ", steps=" + this.c + ", workFlowCheckRunFragment=" + this.d + ")";
    }
}
