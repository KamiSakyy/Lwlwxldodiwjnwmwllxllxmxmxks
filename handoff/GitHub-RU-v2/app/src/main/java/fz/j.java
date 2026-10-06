package fz;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.z3;
import dw.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w8.s;
import x61.n;
import x61.r;
import yz0.b2;
import yz0.g5;
import yz0.h5;
import yz0.i5;
import yz0.j5;
import yz0.n5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements n5 {
    public static final Parcelable.Creator<j> CREATOR = new f8.a(22);
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
    public j(o oVar) {
        this(r5, r6, r2, r8, r9, r10, r11);
        Boolean bool;
        r rVar;
        r rVar2;
        List<dw.l> list;
        List<dw.m> list2;
        b2 b2Var;
        r rVar3 = oVar != null ? oVar.a : null;
        r<dw.i> rVar4 = r.r;
        rVar3 = rVar3 == null ? rVar4 : rVar3;
        ArrayList arrayList = new ArrayList(n.F(rVar3, 10));
        Iterator it = rVar3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dw.j jVar = (dw.j) it.next();
            String str = jVar.a;
            String str2 = jVar.b;
            String str3 = jVar.c;
            String str4 = jVar.d;
            String str5 = jVar.e;
            dw.g gVar = jVar.f;
            if (gVar == null || (list2 = gVar.a) == null) {
                rVar = null;
            } else {
                rVar = new ArrayList();
                for (dw.m mVar : list2) {
                    if (mVar != null) {
                        String str6 = mVar.d;
                        Avatar A = s.A(mVar.e);
                        String str7 = mVar.b;
                        String str8 = mVar.c;
                        b2Var = new b2(str6, A, str7, str8 == null ? "" : str8, false, false, 112);
                    } else {
                        b2Var = null;
                    }
                    if (b2Var != null) {
                        rVar.add(b2Var);
                    }
                }
            }
            rVar = rVar == null ? rVar4 : rVar;
            dw.k kVar = jVar.g;
            if (kVar == null || (list = kVar.a) == null) {
                rVar2 = null;
            } else {
                rVar2 = new ArrayList();
                for (dw.l lVar : list) {
                    f p0 = lVar != null ? b4.p0(lVar.c) : null;
                    if (p0 != null) {
                        rVar2.add(p0);
                    }
                }
            }
            r rVar5 = rVar2 == null ? rVar4 : rVar2;
            dw.n nVar = jVar.h;
            arrayList.add(new j5(str, str2, str3, str4, str5, rVar, rVar5, nVar != null ? z3.f(nVar.c) : null));
        }
        r<dw.h> rVar6 = oVar != null ? oVar.b : null;
        rVar6 = rVar6 == null ? rVar4 : rVar6;
        ArrayList arrayList2 = new ArrayList(n.F(rVar6, 10));
        for (dw.h hVar : rVar6) {
            arrayList2.add(new g5(hVar.a, hVar.b, hVar.c));
        }
        String str9 = oVar != null ? oVar.f : null;
        i5 i5Var = str9 != null ? new i5(str9) : null;
        boolean z = false;
        boolean z2 = oVar != null ? oVar.d : false;
        if (oVar != null && (bool = oVar.e) != null) {
            z = bool.booleanValue();
        }
        boolean z3 = z;
        String str10 = oVar != null ? oVar.g : "";
        r rVar7 = oVar != null ? oVar.c : null;
        rVar4 = rVar7 != null ? rVar7 : rVar4;
        ArrayList arrayList3 = new ArrayList(n.F(rVar4, 10));
        for (dw.i iVar : rVar4) {
            arrayList3.add(new h5(iVar.b, iVar.a, iVar.c));
        }
    }
}
