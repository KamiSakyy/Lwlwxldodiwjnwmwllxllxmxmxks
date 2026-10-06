package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wf {
    public final int a;
    public final List b;

    public wf(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return this.a == wfVar.a && k71.k.b(this.b, wfVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "Issues(issueCount=", ", nodes=", ")", this.b);
    }
}
