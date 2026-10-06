package hp;

import a0.s0;
import aa.h0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import m10.o7;
import m10.y7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements h0 {
    public final String a;
    public final String b;
    public final o7 c;
    public final y7 d;
    public final ZonedDateTime e;
    public final m f;
    public final ArrayList g;
    public final String h;

    public o(String str, String str2, o7 o7Var, y7 y7Var, ZonedDateTime zonedDateTime, m mVar, ArrayList arrayList, String str3) {
        this.a = str;
        this.b = str2;
        this.c = o7Var;
        this.d = y7Var;
        this.e = zonedDateTime;
        this.f = mVar;
        this.g = arrayList;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a.equals(oVar.a) && k71.k.b(this.b, oVar.b) && this.c == oVar.c && this.d == oVar.d && k71.k.b(this.e, oVar.e) && k71.k.b(this.f, oVar.f) && this.g.equals(oVar.g) && this.h.equals(oVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        ZonedDateTime zonedDateTime = this.e;
        int hashCode3 = (hashCode2 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        m mVar = this.f;
        return this.h.hashCode() + no.a.b(this.g, (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("CopilotAgentTaskFragment(taskId=", this.a, ", title=", this.b, ", state=");
        o.append(this.c);
        o.append(", type=");
        o.append(this.d);
        o.append(", lastUpdatedAt=");
        o.append(this.e);
        o.append(", repository=");
        o.append(this.f);
        o.append(", resources=");
        o.append(this.g);
        o.append(", __typename=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
