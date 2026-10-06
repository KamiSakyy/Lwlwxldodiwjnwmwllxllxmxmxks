package uf0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.h0 {
    public String a;
    public ZonedDateTime b;
    public b c;
    public a d;
    public String e;

    public d(String str, ZonedDateTime zonedDateTime, b bVar, a aVar, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = bVar;
        this.d = aVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c) && k71.k.b(this.d, dVar.d) && k71.k.b(this.e, dVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        b bVar = this.c;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.d;
        return this.e.hashCode() + ((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = com.github.rudroid.copilot.h1.s("DiscussionAnswerIdFragment(id=", this.a, ", answerChosenAt=", ", answerChosenBy=", this.b);
        s.append(this.c);
        s.append(", answer=");
        s.append(this.d);
        s.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(s, this.e, ")");
    }
}
