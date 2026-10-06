package mf0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements h0 {
    public String a;
    public String b;
    public a c;
    public ZonedDateTime d;
    public c e;
    public d f;

    public e(String str, String str2, a aVar, ZonedDateTime zonedDateTime, c cVar, d dVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = zonedDateTime;
        this.e = cVar;
        this.f = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b) && k.b(this.c, eVar.c) && k.b(this.d, eVar.d) && k.b(this.e, eVar.e) && k.b(this.f, eVar.f);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + m0.a(this.d, (i + (aVar == null ? 0 : aVar.hashCode())) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DeployEnvChangedEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", deploymentStatus=");
        o.append(this.e);
        o.append(", pullRequest=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
