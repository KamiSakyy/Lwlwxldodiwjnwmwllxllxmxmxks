package yz0;

import com.github.service.models.response.Entry$EntryType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1 {
    public String a;
    public String b;
    public int c;
    public String d;
    public final Entry$EntryType e;
    public boolean f;

    public f1(int i, String str, String str2, String str3) {
        Entry$EntryType entry$EntryType;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        int hashCode = str2.hashCode();
        if (hashCode == -1354815177) {
            if (str2.equals("commit")) {
                entry$EntryType = Entry$EntryType.COMMIT;
            }
            entry$EntryType = Entry$EntryType.UNKNOWN;
        } else if (hashCode != 3026845) {
            if (hashCode == 3568542 && str2.equals("tree")) {
                entry$EntryType = Entry$EntryType.TREE;
            }
            entry$EntryType = Entry$EntryType.UNKNOWN;
        } else {
            if (str2.equals("blob")) {
                entry$EntryType = Entry$EntryType.BLOB;
            }
            entry$EntryType = Entry$EntryType.UNKNOWN;
        }
        this.e = entry$EntryType;
        this.f = (i & 40960) == 40960;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return k71.k.b(this.a, f1Var.a) && k71.k.b(this.b, f1Var.b) && this.c == f1Var.c && k71.k.b(this.d, f1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return com.github.rudroid.m0.c(this.c, ", repoUrl=", this.d, ")", a0.s0.o("Entry(name=", this.a, ", entryType=", this.b, ", entryMode="));
    }
}
