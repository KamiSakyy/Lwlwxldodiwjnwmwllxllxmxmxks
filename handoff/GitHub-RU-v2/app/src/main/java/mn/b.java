package mn;

import a0.s0;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public String a;
    public CheckConclusionState b;
    public CheckStatusState c;
    public ZonedDateTime d;
    public ZonedDateTime e;
    public Integer f;
    public int g;
    public int h;

    public b(String str, CheckConclusionState checkConclusionState, CheckStatusState checkStatusState, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, Integer num, int i, int i2) {
        k71.k.g(checkStatusState, "status");
        this.a = str;
        this.b = checkConclusionState;
        this.c = checkStatusState;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = num;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && k71.k.b(this.d, bVar.d) && k71.k.b(this.e, bVar.e) && k71.k.b(this.f, bVar.f) && this.g == bVar.g && this.h == bVar.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CheckConclusionState checkConclusionState = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (checkConclusionState == null ? 0 : checkConclusionState.hashCode())) * 31)) * 31;
        ZonedDateTime zonedDateTime = this.d;
        int hashCode3 = (hashCode2 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.e;
        int hashCode4 = (hashCode3 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        Integer num = this.f;
        return Integer.hashCode(this.h) + s0.b(this.g, (hashCode4 + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "ActionCheckRunStep(name=" + this.a + ", conclusion=" + this.b + ", status=" + this.c + ", startedAt=" + this.d + ", completedAt=" + this.e + ", secondsToCompletion=" + this.f + ", duration=" + this.g + ", number=" + this.h + ")";
    }
}
