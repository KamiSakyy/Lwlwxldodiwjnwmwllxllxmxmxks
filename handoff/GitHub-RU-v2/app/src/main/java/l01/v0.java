package l01;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 implements u {
    public final String a;
    public final String b = "";

    public v0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a.equals(v0Var.a) && this.b.equals(v0Var.b);
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
        return h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return x.i.g("RedactedItemProjectContent(id=", this.a, ", title=", this.b, ", lastUpdatedAt=null)");
    }
}
