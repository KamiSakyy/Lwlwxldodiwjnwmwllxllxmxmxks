package tz0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final String a;
    public final String b;
    public final Integer c;
    public final ZonedDateTime d;
    public final boolean e;
    public final String f;
    public final d g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public c(String str, String str2, Integer num, ZonedDateTime zonedDateTime, boolean z, String str3, d dVar, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = zonedDateTime;
        this.e = z;
        this.f = str3;
        this.g = dVar;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && this.e == cVar.e && k.b(this.f, cVar.f) && this.g == cVar.g && k.b(this.h, cVar.h) && k.b(this.i, cVar.i) && k.b(this.j, cVar.j) && k.b(this.k, cVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.d;
        int hashCode4 = (this.g.hashCode() + h1.i(i.e((hashCode3 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31, this.e), this.f, 31)) * 31;
        String str2 = this.h;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("StatusCheck(id=", this.a, ", description=", this.b, ", durationInSeconds=");
        o.append(this.c);
        o.append(", stateChangedAt=");
        o.append(this.d);
        o.append(", isRequired=");
        m0.z(o, this.e, ", displayName=", this.f, ", state=");
        o.append(this.g);
        o.append(", targetUrl=");
        o.append(this.h);
        o.append(", avatarUrl=");
        f1.e.x(o, this.i, ", additionalContext=", this.j, ", underlyingContextId=");
        return h1.p(o, this.k, ")");
    }
}
