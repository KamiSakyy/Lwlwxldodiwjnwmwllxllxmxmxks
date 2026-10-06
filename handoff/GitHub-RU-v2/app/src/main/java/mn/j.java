package mn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public final String a;
    public final String b;
    public final ZonedDateTime c;
    public final ZonedDateTime d;
    public final int e;
    public final Integer f;
    public final String g;
    public final String h;

    public j(String str, String str2, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, int i, Integer num, String str3, String str4) {
        k71.k.g(str, "workflowRunId");
        k71.k.g(str2, "workflowName");
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(zonedDateTime2, "updatedAt");
        k71.k.g(str3, "resourcePath");
        k71.k.g(str4, "url");
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = zonedDateTime2;
        this.e = i;
        this.f = num;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d) && this.e == jVar.e && k71.k.b(this.f, jVar.f) && k71.k.b(this.g, jVar.g) && k71.k.b(this.h, jVar.h);
    }

    public final int hashCode() {
        int b = s0.b(this.e, m0.a(this.d, m0.a(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31), 31);
        Integer num = this.f;
        return this.h.hashCode() + h1.i((b + (num == null ? 0 : num.hashCode())) * 31, this.g, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ActionWorkflowRun(workflowRunId=", this.a, ", workflowName=", this.b, ", createdAt=");
        h1.B(o, this.c, ", updatedAt=", this.d, ", runNumber=");
        o.append(this.e);
        o.append(", billableTimeInSeconds=");
        o.append(this.f);
        o.append(", resourcePath=");
        return x.i.k(o, this.g, ", url=", this.h, ")");
    }
}
