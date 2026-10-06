package lv0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements h0 {
    public String a;
    public String b;
    public i c;
    public k d;
    public ZonedDateTime e;

    public l(String str, String str2, i iVar, k kVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = iVar;
        this.d = kVar;
        this.e = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c) && k71.k.b(this.d, lVar.d) && k71.k.b(this.e, lVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        i iVar = this.c;
        int hashCode = (i + (iVar == null ? 0 : iVar.hashCode())) * 31;
        k kVar = this.d;
        return this.e.hashCode() + ((hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("SubIssueRemovedEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", subIssue=");
        o.append(this.d);
        o.append(", createdAt=");
        return h1.q(o, this.e, ")");
    }
}
