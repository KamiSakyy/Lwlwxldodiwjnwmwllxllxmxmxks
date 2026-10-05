package or;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements h0 {
    public final String a;
    public final String b;
    public final a c;
    public final b d;
    public final ZonedDateTime e;
    public final String f;

    public c(String str, String str2, a aVar, b bVar, ZonedDateTime zonedDateTime, String str3) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = bVar;
        this.e = zonedDateTime;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e) && k.b(this.f, cVar.f);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        int hashCode = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.d;
        int a = m0.a(this.e, (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        String str = this.f;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("CopilotWorkFinishedFailureFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", agent=");
        o.append(this.d);
        o.append(", createdAt=");
        return i.h(", failureMessage=", this.f, ")", o, this.e);
    }
}
