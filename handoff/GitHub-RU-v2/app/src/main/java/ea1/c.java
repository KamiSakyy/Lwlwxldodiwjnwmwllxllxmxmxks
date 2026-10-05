package ea1;

import java.util.Arrays;
import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends d {
    public c(n... nVarArr) {
        List asList = Arrays.asList(nVarArr);
        if (this.c > 1) {
            this.a.add(new b(asList));
        } else {
            this.a.addAll(asList);
        }
        c();
    }

    public final String toString() {
        return ba1.h.i(", ", this.a);
    }
}
