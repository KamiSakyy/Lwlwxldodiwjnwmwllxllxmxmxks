package on;

import a0.s0;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final String a;
    public final String b;
    public final c c;
    public final ZonedDateTime d;
    public final String e;
    public final String f;
    public final i g;
    public final xn.f h;

    public b(String str, String str2, c cVar, ZonedDateTime zonedDateTime, String str3, String str4, i iVar, xn.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
        this.d = zonedDateTime;
        this.e = str3;
        this.f = str4;
        this.g = iVar;
        this.h = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && this.c == bVar.c && k71.k.b(this.d, bVar.d) && k71.k.b(this.e, bVar.e) && k71.k.b(this.f, bVar.f) && k71.k.b(this.g, bVar.g) && this.h == bVar.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        ZonedDateTime zonedDateTime = this.d;
        int hashCode3 = (hashCode2 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        i iVar = this.g;
        return this.h.hashCode() + ((hashCode5 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("AgentTask(taskId=", this.a, ", title=", this.b, ", state=");
        o.append(this.c);
        o.append(", lastUpdatedAt=");
        o.append(this.d);
        o.append(", repositoryOwner=");
        f1.e.x(o, this.e, ", repositoryName=", this.f, ", resource=");
        o.append(this.g);
        o.append(", agentType=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
