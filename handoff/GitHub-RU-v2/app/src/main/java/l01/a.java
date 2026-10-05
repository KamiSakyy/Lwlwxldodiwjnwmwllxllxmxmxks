package l01;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements u {
    public final String a;
    public final String b;
    public final ZonedDateTime c;

    public a(String str, String str2, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
    }

    @Override // l01.u
    public final ZonedDateTime c() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && k71.k.b(this.c, aVar.c);
    }

    @Override // l01.u
    public final String getId() {
        return this.a;
    }

    @Override // l01.u
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.q(a0.s0.o("DraftIssueProjectContent(id=", this.a, ", title=", this.b, ", lastUpdatedAt="), this.c, ")");
    }
}
