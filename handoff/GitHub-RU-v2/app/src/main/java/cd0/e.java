package cd0;

import k71.k;
import s01.m;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements m {
    public String a;
    public String b;

    public e(String str, String str2) {
        k.g(str, "owner");
        k.g(str2, "repositoryName");
        this.a = str;
        this.b = str2;
    }

    @Override // s01.m
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return i.g("WorkflowsByRepositoryInfoParameters(owner=", this.a, ", repositoryName=", this.b, ")");
    }
}
