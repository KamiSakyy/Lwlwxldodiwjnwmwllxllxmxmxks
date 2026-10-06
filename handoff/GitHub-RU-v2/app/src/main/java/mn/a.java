package mn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public k a;
    public String b;
    public String c;
    public String d;
    public CheckStatusState e;
    public CheckConclusionState f;
    public String g;
    public String h;
    public int i;
    public String j;
    public ZonedDateTime k;
    public ZonedDateTime l;
    public String m;
    public Boolean n;

    public a(k kVar, String str, String str2, String str3, CheckStatusState checkStatusState, CheckConclusionState checkConclusionState, String str4, String str5, int i, String str6, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str7, Boolean bool) {
        k71.k.g(str, "id");
        k71.k.g(str3, "name");
        k71.k.g(checkStatusState, "status");
        this.a = kVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = checkStatusState;
        this.f = checkConclusionState;
        this.g = str4;
        this.h = str5;
        this.i = i;
        this.j = str6;
        this.k = zonedDateTime;
        this.l = zonedDateTime2;
        this.m = str7;
        this.n = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && k71.k.b(this.b, aVar.b) && k71.k.b(this.c, aVar.c) && k71.k.b(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && k71.k.b(this.g, aVar.g) && k71.k.b(this.h, aVar.h) && this.i == aVar.i && k71.k.b(this.j, aVar.j) && k71.k.b(this.k, aVar.k) && k71.k.b(this.l, aVar.l) && k71.k.b(this.m, aVar.m) && k71.k.b(this.n, aVar.n);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int hashCode = (this.e.hashCode() + h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31)) * 31;
        CheckConclusionState checkConclusionState = this.f;
        int hashCode2 = (hashCode + (checkConclusionState == null ? 0 : checkConclusionState.hashCode())) * 31;
        String str2 = this.g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int b = s0.b(this.i, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.j;
        int hashCode4 = (b + (str4 == null ? 0 : str4.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.k;
        int hashCode5 = (hashCode4 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.l;
        int hashCode6 = (hashCode5 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        String str5 = this.m;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.n;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionCheckRun(type=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", fullDatabaseId=");
        f1.e.x(sb, this.c, ", name=", this.d, ", status=");
        sb.append(this.e);
        sb.append(", conclusion=");
        sb.append(this.f);
        sb.append(", title=");
        f1.e.x(sb, this.g, ", workflowTitle=", this.h, ", duration=");
        x.i.r(this.i, ", summary=", this.j, ", startedAt=", sb);
        h1.B(sb, this.k, ", completedAt=", this.l, ", permalink=");
        sb.append(this.m);
        sb.append(", isRequired=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }

    public Object i;
}
