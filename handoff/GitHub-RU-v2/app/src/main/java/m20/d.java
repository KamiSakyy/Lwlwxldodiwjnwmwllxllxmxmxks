package m20;

import k71.k;
import s01.m;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements m {
    public String a;
    public String b;

    public d(String str, String str2) {
        k.g(str, "owner");
        k.g(str2, "repositoryName");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return i.g("WorkflowsByRepositoryInfoParameters(owner=", this.a, ", repositoryName=", this.b, ")");
    }
}
