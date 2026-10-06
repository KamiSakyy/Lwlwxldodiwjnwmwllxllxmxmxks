package a01;

import com.github.service.models.response.CheckStatusState;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public CheckStatusState a;

    public b(CheckStatusState checkStatusState) {
        k.g(checkStatusState, "status");
        this.a = checkStatusState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CheckRunStep(status=" + this.a + ")";
    }
}
