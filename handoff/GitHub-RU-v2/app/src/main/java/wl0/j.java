package wl0;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l7.c0;
import x61.n;
import x61.r;
import yz0.b2;
import yz0.g5;
import yz0.h5;
import yz0.i5;
import yz0.j5;
import yz0.n5;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements n5 {
    public static final Parcelable.Creator<j> CREATOR = new c0(15);
    public final ArrayList r;
    public final ArrayList s;
    public final i5 t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final ArrayList x;

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

    @Override // yz0.n5
    public final boolean D() {
        return this.u;
    }

    @Override // yz0.n5
    public final i5 F() {
        return this.t;
    }

    @Override // yz0.n5
    public final List I() {
        return this.s;
    }

    @Override // yz0.n5
    public final boolean R() {
        return this.v;
    }

    @Override // android.os.Parcelable
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

    @Override // yz0.n5
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

    @Override // yz0.n5
    public final List w() {
        return this.r;
    }

    @Override // android.os.Parcelable
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

    @Override // yz0.n5
    public final String x() {
        return this.w;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(oj0.h hVar) {
        this(r5, r6, r2, r8, r9, r10, r11);
        Boolean bool;
        ?? r14;
        ArrayList arrayList;
        List<oj0.f> list;
        List<oj0.g> list2;
        b2 b2Var;
        List list3 = hVar != null ? hVar.a : null;
        List<oj0.c> list4 = r.r;
        list3 = list3 == null ? list4 : list3;
        ArrayList arrayList2 = new ArrayList(n.F(list3, 10));
        Iterator it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            oj0.d dVar = (oj0.d) it.next();
            String str = dVar.a;
            String str2 = dVar.b;
            String str3 = dVar.c;
            String str4 = dVar.d;
            String str5 = dVar.e;
            oj0.a aVar = dVar.f;
            if (aVar == null || (list2 = aVar.a) == null) {
                r14 = 0;
            } else {
                r14 = new ArrayList();
                for (oj0.g gVar : list2) {
                    if (gVar != null) {
                        String str6 = gVar.d;
                        Avatar O = b41.b.O(gVar.e);
                        String str7 = gVar.b;
                        String str8 = gVar.c;
                        b2Var = new b2(str6, O, str7, str8 == null ? "" : str8, false, false, 112);
                    } else {
                        b2Var = null;
                    }
                    if (b2Var != null) {
                        r14.add(b2Var);
                    }
                }
            }
            r14 = r14 == 0 ? list4 : r14;
            oj0.e eVar = dVar.g;
            if (eVar == null || (list = eVar.a) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (oj0.f fVar : list) {
                    f i0 = fVar != null ? b31.b.i0(fVar.c) : null;
                    if (i0 != null) {
                        arrayList.add(i0);
                    }
                }
            }
            arrayList2.add(new j5(str, str2, str3, str4, str5, r14, arrayList == null ? list4 : arrayList, null));
        }
        List<oj0.b> list5 = hVar != null ? hVar.b : null;
        list5 = list5 == null ? list4 : list5;
        ArrayList arrayList3 = new ArrayList(n.F(list5, 10));
        for (oj0.b bVar : list5) {
            arrayList3.add(new g5(bVar.a, bVar.b, bVar.c));
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
        List list6 = hVar != null ? hVar.c : null;
        list4 = list6 != null ? list6 : list4;
        ArrayList arrayList4 = new ArrayList(n.F(list4, 10));
        for (oj0.c cVar : list4) {
            arrayList4.add(new h5(cVar.b, cVar.a, cVar.c));
        }
    }
}
