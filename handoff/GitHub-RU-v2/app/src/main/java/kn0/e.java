package kn0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final String a;
    public final String b;
    public final ZonedDateTime c;
    public final String d;
    public final a e;
    public final i f;
    public final ArrayList g;
    public final String h;

    public e(String str, String str2, ZonedDateTime zonedDateTime, String str3, a aVar, i iVar, ArrayList arrayList, String str4) {
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = str3;
        this.e = aVar;
        this.f = iVar;
        this.g = arrayList;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c) && this.d.equals(eVar.d) && this.e.equals(eVar.e) && k71.k.b(this.f, eVar.f) && this.g.equals(eVar.g) && this.h.equals(eVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + h1.i(m0.a(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31)) * 31;
        i iVar = this.f;
        return this.h.hashCode() + no.a.b(this.g, (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(id=", this.a, ", localizedDescription=", this.b, ", unlockedAt=");
        f4.A(", url=", this.d, ", achievable=", o, this.c);
        o.append(this.e);
        o.append(", tier=");
        o.append(this.f);
        o.append(", tiers=");
        o.append(this.g);
        o.append(", __typename=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
