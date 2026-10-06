package bb0;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.issueorpullrequest.IssueType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sy.oShadow;
import t.q;
import x61.n;
import x61.rShadow;
import yz0.b2;
import yz0.g5;
import yz0.h5;
import yz0.i5;
import yz0.j5;
import yz0.n5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements n5 {
    public static final Parcelable.Creator<j> CREATOR = new a21.g(11);
    public ArrayList r;
    public ArrayList s;
    public i5 t;
    public boolean u;
    public boolean v;
    public String w;
    public ArrayList x;

    public j(ArrayList arrayList, ArrayList arrayList2, i5 i5Var, boolean z, boolean z2, String str, ArrayList arrayList3) {
        k71.k.g(str, "repoId");
        this.r = arrayList;
        this.s = arrayList2;
        this.t = i5Var;
        this.u = z;
        this.v = z2;
        this.w = str;
        this.x = arrayList3;
    }

    public final boolean D() {
        return this.u;
    }

    public final i5 F() {
        return this.t;
    }

    public final List I() {
        return this.s;
    }

    public final boolean R() {
        return this.v;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.r, jVar.r) && k71.k.b(this.s, jVar.s) && k71.k.b(this.t, jVar.t) && this.u == jVar.u && this.v == jVar.v && k71.k.b(this.w, jVar.w) && k71.k.b(this.x, jVar.x);
    }

    public final int hashCode() {
        int b = no.a.b(this.s, this.r.hashCode() * 31, 31);
        i5 i5Var = this.t;
        return this.x.hashCode() + h1.i(x.i.e(x.i.e((b + (i5Var == null ? 0 : i5Var.s.hashCode())) * 31, 31, this.u), 31, this.v), this.w, 31);
    }

    public final List n() {
        return this.x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApolloTemplateModel(templates=");
        sb.append(this.r);
        sb.append(", contactLinks=");
        sb.append(this.s);
        sb.append(", securityPolicy=");
        sb.append(this.t);
        sb.append(", isBlankIssuesEnabled=");
        sb.append(this.u);
        sb.append(", isSecurityPolicyEnabled=");
        m0.z(sb, this.v, ", repoId=", this.w, ", issueFormLinks=");
        return m0.j(")", sb, this.x);
    }

    public final List w() {
        return this.r;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        ArrayList arrayList = this.r;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            parcel.writeParcelable((Parcelable) obj, i);
        }
        ArrayList arrayList2 = this.s;
        parcel.writeInt(arrayList2.size());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            parcel.writeParcelable((Parcelable) obj2, i);
        }
        parcel.writeParcelable(this.t, i);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeString(this.w);
        ArrayList arrayList3 = this.x;
        parcel.writeInt(arrayList3.size());
        int size3 = arrayList3.size();
        while (i2 < size3) {
            Object obj3 = arrayList3.get(i2);
            i2++;
            parcel.writeParcelable((Parcelable) obj3, i);
        }
    }

    public final String x() {
        return this.w;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(w80.h hVar) {
        this(r5, r6, r2, r8, r9, r10, r11);
        Boolean bool;
        r rVar;
        r rVar2;
        List<w80.f> list;
        List<w80.g> list2;
        b2 b2Var;
        r rVar3 = hVar != null ? hVar.a : null;
        r<w80.c> rVar4 = r.r;
        rVar3 = rVar3 == null ? rVar4 : rVar3;
        ArrayList arrayList = new ArrayList(n.F(rVar3, 10));
        Iterator it = rVar3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            w80.d dVar = (w80.d) it.next();
            String str = dVar.a;
            String str2 = dVar.b;
            String str3 = dVar.c;
            String str4 = dVar.d;
            String str5 = dVar.e;
            w80.a aVar = dVar.f;
            if (aVar == null || (list2 = aVar.a) == null) {
                rVar = null;
            } else {
                rVar = new ArrayList();
                for (w80.g gVar : list2) {
                    if (gVar != null) {
                        String str6 = gVar.d;
                        Avatar q = q.q(gVar.e);
                        String str7 = gVar.b;
                        String str8 = gVar.c;
                        b2Var = new b2(str6, q, str7, str8 == null ? "" : str8, false, false, 112);
                    } else {
                        b2Var = null;
                    }
                    if (b2Var != null) {
                        rVar.add(b2Var);
                    }
                }
            }
            rVar = rVar == null ? rVar4 : rVar;
            w80.e eVar = dVar.g;
            if (eVar == null || (list = eVar.a) == null) {
                rVar2 = null;
            } else {
                rVar2 = new ArrayList();
                for (w80.f fVar : list) {
                    f l = fVar != null ? o.l(fVar.c) : null;
                    if (l != null) {
                        rVar2.add(l);
                    }
                }
            }
            arrayList.add(new j5(str, str2, str3, str4, str5, rVar, rVar2 == null ? rVar4 : rVar2, (IssueType) null));
        }
        r<w80.b> rVar5 = hVar != null ? hVar.b : null;
        rVar5 = rVar5 == null ? rVar4 : rVar5;
        ArrayList arrayList2 = new ArrayList(n.F(rVar5, 10));
        for (w80.b bVar : rVar5) {
            arrayList2.add(new g5(bVar.a, bVar.b, bVar.c));
        }
        String str9 = hVar != null ? hVar.f : null;
        i5 i5Var = str9 != null ? new i5(str9) : null;
        boolean z = false;
        boolean z2 = hVar != null ? hVar.d : false;
        if (hVar != null && (bool = hVar.e) != null) {
            z = bool.booleanValue();
        }
        boolean z3 = z;
        String str10 = hVar != null ? hVar.g : "";
        r rVar6 = hVar != null ? hVar.c : null;
        rVar4 = rVar6 != null ? rVar6 : rVar4;
        ArrayList arrayList3 = new ArrayList(n.F(rVar4, 10));
        for (w80.c cVar : rVar4) {
            arrayList3.add(new h5(cVar.b, cVar.a, cVar.c));
        }
    }
}
