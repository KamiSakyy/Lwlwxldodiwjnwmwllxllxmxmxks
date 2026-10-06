package yz0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 {
    public final Object a;
    public final x01.i b;

    public w0(List list, x01.i iVar) {
        this.a = list;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a.equals(w0Var.a) && this.b.equals(w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommitsPaged(commits=" + this.a + ", page=" + this.b + ")";
    }
}
