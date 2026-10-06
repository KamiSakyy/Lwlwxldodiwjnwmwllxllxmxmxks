package yg0;

import aa.h0;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements h0 {
    public String a;
    public d b;
    public a c;
    public String d;

    public e(String str, d dVar, a aVar, String str2) {
        this.a = str;
        this.b = dVar;
        this.c = aVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c) && k71.k.b(this.d, eVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d dVar = this.b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LinkedIssues(id=" + this.a + ", userLinkedOnlyClosingIssueReferences=" + this.b + ", allClosingIssueReferences=" + this.c + ", __typename=" + this.d + ")";
    }
    public Object s0 = null;
}
