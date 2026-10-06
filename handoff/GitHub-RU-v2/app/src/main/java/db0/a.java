package db0;

import java.util.ArrayList;
import java.util.List;
import x01.i;
import yz0.e;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements e {
    public int a;
    public ArrayList b;
    public i c;

    public a(int i, ArrayList arrayList, i iVar) {
        this.a = i;
        this.b = arrayList;
        this.c = iVar;
    }

    public final int a() {
        return this.a;
    }

    public final i b() {
        return this.c;
    }

    public final List c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "RepositoryAssignableActors(planLimit=" + this.a + ", assignees=" + this.b + ", pageInfo=" + this.c + ")";
    }
}
