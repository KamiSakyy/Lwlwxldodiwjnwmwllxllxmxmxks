package jo;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xn {
    public String a;
    public String b;
    public ArrayList c;
    public m10.vy d;

    public xn(String str, String str2, ArrayList arrayList, m10.vy vyVar) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = vyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn)) {
            return false;
        }
        xn xnVar = (xn) obj;
        return k71.k.b(this.a, xnVar.a) && k71.k.b(this.b, xnVar.b) && this.c.equals(xnVar.c) && this.d == xnVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + no.a.b(this.c, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("MergeRequirements(commitMessageBody=", this.a, ", commitMessageHeadline=", this.b, ", possibleCommitAuthorEmails=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
