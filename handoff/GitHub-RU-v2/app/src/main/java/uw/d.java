package uw;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import k71.k;
import m10.v90;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements h0 {
    public final String a;
    public final String b;
    public final int c;
    public final ZonedDateTime d;
    public final boolean e;
    public final String f;
    public final v90 g;
    public final String h;
    public final String i;
    public final String j;
    public final c k;
    public final String l;

    public d(String str, String str2, int i, ZonedDateTime zonedDateTime, boolean z, String str3, v90 v90Var, String str4, String str5, String str6, c cVar, String str7) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = zonedDateTime;
        this.e = z;
        this.f = str3;
        this.g = v90Var;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = cVar;
        this.l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && this.c == dVar.c && k.b(this.d, dVar.d) && this.e == dVar.e && k.b(this.f, dVar.f) && this.g == dVar.g && k.b(this.h, dVar.h) && k.b(this.i, dVar.i) && k.b(this.j, dVar.j) && k.b(this.k, dVar.k) && k.b(this.l, dVar.l);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.g.hashCode() + h1.i(i.e(m0.a(this.d, s0.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.e), this.f, 31)) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int i = h1.i((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, this.j, 31);
        c cVar = this.k;
        return this.l.hashCode() + ((i + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("StatusCheckFragment(id=", this.a, ", description=", this.b, ", durationInSeconds=");
        o.append(this.c);
        o.append(", stateChangedAt=");
        o.append(this.d);
        o.append(", isRequired=");
        m0.z(o, this.e, ", displayName=", this.f, ", state=");
        o.append(this.g);
        o.append(", targetUrl=");
        o.append(this.h);
        o.append(", avatarUrl=");
        f1.e.x(o, this.i, ", additionalContext=", this.j, ", underlyingContext=");
        o.append(this.k);
        o.append(", __typename=");
        o.append(this.l);
        o.append(")");
        return o.toString();
    }
}
