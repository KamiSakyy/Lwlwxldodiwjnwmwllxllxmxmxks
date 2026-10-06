package h01;

import com.github.rudroid.m0;
import com.github.service.models.response.type.MergeStateStatus;
import com.github.service.models.response.type.PullRequestMergeMethod;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public MergeStateStatus a;
    public List b;
    public boolean c;
    public PullRequestMergeMethod d;
    public String e;
    public List f;
    public yz0.i g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public ZonedDateTime m;
    public i01.b n;
    public i01.a o;

    public h(MergeStateStatus mergeStateStatus, List list, boolean z, PullRequestMergeMethod pullRequestMergeMethod, String str, List list2, yz0.i iVar, boolean z2, boolean z3, boolean z4, String str2, String str3, ZonedDateTime zonedDateTime, i01.b bVar, i01.a aVar) {
        k71.k.g(mergeStateStatus, "mergeState");
        k71.k.g(list, "availableMergeTypes");
        k71.k.g(pullRequestMergeMethod, "defaultMergeMethod");
        this.a = mergeStateStatus;
        this.b = list;
        this.c = z;
        this.d = pullRequestMergeMethod;
        this.e = str;
        this.f = list2;
        this.g = iVar;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = str2;
        this.l = str3;
        this.m = zonedDateTime;
        this.n = bVar;
        this.o = aVar;
    }

    public final boolean equals(Object obj) {
        boolean b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a != hVar.a || !k71.k.b(this.b, hVar.b) || this.c != hVar.c || this.d != hVar.d || !k71.k.b(this.e, hVar.e) || !k71.k.b(this.f, hVar.f) || !k71.k.b(this.g, hVar.g) || this.h != hVar.h || this.i != hVar.i || this.j != hVar.j || !k71.k.b(this.k, hVar.k)) {
            return false;
        }
        String str = hVar.l;
        String str2 = this.l;
        if (str2 == null) {
            if (str == null) {
                b = true;
            }
            b = false;
        } else {
            if (str != null) {
                b = k71.k.b(str2, str);
            }
            b = false;
        }
        return b && k71.k.b(this.m, hVar.m) && k71.k.b(this.n, hVar.n) && k71.k.b(this.o, hVar.o);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + x.i.e(f1.e.c(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        yz0.i iVar = this.g;
        int e = x.i.e(x.i.e(x.i.e((hashCode3 + (iVar == null ? 0 : iVar.a.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        String str2 = this.k;
        int hashCode4 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.m;
        int hashCode6 = (hashCode5 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        i01.b bVar = this.n;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        i01.a aVar = this.o;
        return hashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.l;
        String a = str == null ? "null" : qb.b.a(str);
        StringBuilder sb = new StringBuilder("MergeOverview(mergeState=");
        sb.append(this.a);
        sb.append(", availableMergeTypes=");
        sb.append(this.b);
        sb.append(", restrictsPushes=");
        sb.append(this.c);
        sb.append(", defaultMergeMethod=");
        sb.append(this.d);
        sb.append(", defaultCommitEmail=");
        sb.append(this.e);
        sb.append(", possibleCommitEmails=");
        sb.append(this.f);
        sb.append(", autoMerge=");
        sb.append(this.g);
        sb.append(", viewerCanEnableAutoMerge=");
        sb.append(this.h);
        sb.append(", viewerCanDisableAutoMerge=");
        m0.A(sb, this.i, ", canMergeAsAdmin=", this.j, ", mergedByLogin=");
        f1.e.x(sb, this.k, ", mergedCommitAbbreviatedOid=", a, ", mergedCommittedDate=");
        sb.append(this.m);
        sb.append(", mergeQueueEntry=");
        sb.append(this.n);
        sb.append(", mergeQueue=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
